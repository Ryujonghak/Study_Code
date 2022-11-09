package com.example.jpacustomexam.repository.exam07;

import com.example.jpacustomexam.dto.DeptEmpCDto;
import com.example.jpacustomexam.dto.querydsl.DeptGroupQDto;
import com.example.jpacustomexam.model.QDept;
import com.example.jpacustomexam.model.QEmp;
import com.example.jpacustomexam.model.exam04.Department;
import com.example.jpacustomexam.model.exam04.QDepartment;
import com.example.jpacustomexam.model.exam04.QEmployee;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.CaseBuilder;
import com.querydsl.jpa.JPAExpressions;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * packageName : com.example.jpacustomexam.repository.exam07
 * fileName : Dept07RepositoryCustomImpl
 * author : ryujonghak
 * date : 2022/10/27
 * description : querydsl 구현 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/27         ryujonghak          최초 생성
 */
public class Dept07RepositoryCustomImpl implements Dept07RepositoryCustom {
    //    JPAQueryFactory
    @Autowired
    private JPAQueryFactory jpaQueryFactory;

    //    Querydsl을 위한 Q객체 가져오기(querydsl은 Q객체로 쿼리를 사용)
    private QDepartment department = QDepartment.department;
    private QEmployee employee = QEmployee.employee;

    //    연과관계 X
    private QDept dept = QDept.dept;
    private QEmp emp = QEmp.emp;

    //    1) dname LIKE 검색하는 함수 정의(체이닝 이용)
    @Override
    public List<Department> querydslByDname(String dname) {
        List<Department> list = jpaQueryFactory.selectFrom(department)
                .where(department.dname.contains(dname))
                .fetch(); // 실행 문

        return list;
    }

    @Override
    public List<Department> querydslByDnameAndLoc(String dname, String loc) {
        //        select * from tb_department where dname like '%%' and loc like '%%';
        //        querydsl 사용법 :
        //          queryFactory
        //        .select(DTO(컬럼1, 컬럼2)) == select 컬럼1, 컬럼2...
        //        .selectFrom == select *
        //        .where(조건) == where
        //            조건 -> department.속성.연산자(값)  == where 컬럼 연산자(in, like, = , > 등)
        //            연산자() : in(), gt() : >(크다) , eq() : 같다(==), lt() : < (작다)
        //        .orderBy() : order by
        //        .groupBy() : group by
        //        나머지는 함수들은 구글 검색 참고
        List<Department> list = jpaQueryFactory.selectFrom(department)
                .where(department.dname.contains(dname)
                        .and(department.loc.contains(loc)))
                .fetch(); // 실행 문
        return list;
    }

    @Override
    public List<DeptGroupQDto> querydslByGroupFunc() {
//        DTO 사용목적: 속성 몇개만 출력하고 싶은 경우, 가공된 데이터를 출력하고 싶을 때 사용.
//        1) DTO 생성자를 이용해서 속성에 저장(출력): new 생성자(속성들...) / 2) 있는 속성을 이용해서 출력하는 방법: Projections.fields(DTO객체, 속성들...)
        List<DeptGroupQDto> list = jpaQueryFactory.select(
                        Projections.fields(
                                DeptGroupQDto.class, // < 중요
                                department.dno.count().as("countVar"),
                                department.dno.sum().as("sumVar"),
                                department.dno.avg().as("avgVar"),
                                department.dno.max().as("maxVar"),
                                department.dno.min().as("minVar")
                        )
                )
                .from(department)
                .groupBy(department.dno)
                .fetch();

        return list;
    }

    @Override
    public List<Department> querydslByDeptGt(int dno) {
        List<Department> list = jpaQueryFactory.selectFrom(department)
                .where(
                        department.dno.gt(dno))
                .fetch();

        return list;
    }

    @Override
    public List<DeptGroupQDto> querydslByBasicFunc() {
        List<DeptGroupQDto> list = jpaQueryFactory.select(
                        Projections.fields(
                                DeptGroupQDto.class,
                                department.dname.upper().as("upperVar"),
                                department.dname.lower().as("lowerVar"),
//                                Substr(인덱스 번호, 길이)
//                                SubString(시작 인덱스 번호, 끝 인덱스 번호)
                                department.dname.substring(1, 2).as("SubstrVar")
                        )
                ).from(department)
                .fetch();

        return list;
    }

    @Override
    public List<DeptGroupQDto> querydslByCaseWhen() {
        List<DeptGroupQDto> list = jpaQueryFactory.select(
                        Projections.fields(
                                DeptGroupQDto.class,
                                //                           Case When 부분 작성 : new CaseBuilder().when(조건식).then(실행)
//                                                                 .when(조건식2).then(실행2)
//                                                                 .otherwise(실행3).as(별칭)

                                new CaseBuilder()
                                        .when(department.dno.lt(20)).then("인센티브 100%")
                                        .when(department.dno.gt(20)).then("인센티브 200%")
                                        .otherwise("인센티브 없음").as("OtherVar")
                        )
                ).from(department)
                .fetch();

        return list;
    }

    @Override
    public List<DeptGroupQDto> querydslByGroupFunc2(long countDno) {
        List<DeptGroupQDto> list = jpaQueryFactory.select(
                        Projections.fields(
                                DeptGroupQDto.class,
                                department.dno.as("dno"),
                                department.dno.count().as("countVar")
                        )
                ).from(department)
                .where(department.dno.in(10, 20))
                .groupBy(department.dno)
                .having(department.dno.count().eq(countDno))
                .fetch();

        return list;
    }

    @Override
    public List<DeptEmpCDto> querydslByDnameJoin(String dname) {
        List<DeptEmpCDto> list = jpaQueryFactory.select(
                        Projections.fields(
                                DeptEmpCDto.class,
                                employee.eno.as("eno"),
                                employee.ename.as("ename"),
                                employee.job.as("job"),
                                employee.salary.as("salary"),
                                employee.commission.as("commission"),
                                employee.hiredate.as("hiredate"),
                                employee.department.dno.as("dno"),
                                employee.department.loc.as("loc"),
                                employee.department.dname.as("dname")
                        )
                ).from(employee)
//                leftJoin(employee의 @ManyToOne 이 달린 속성명, 조인될 객체명)
                .leftJoin(employee.department, department)
                .where(department.dname.contains(dname))
                .fetch();

        return list;
    }

    @Override
    public List<DeptEmpCDto> querydslByDnameJoin2(String dname) {
        List<DeptEmpCDto> list = jpaQueryFactory.select(
                        Projections.fields(
                                DeptEmpCDto.class,
                                emp.eno.as("eno"),
                                emp.ename.as("ename"),
                                emp.job.as("job"),
                                emp.salary.as("salary"),
                                emp.commission.as("commission"),
                                emp.hiredate.as("hiredate"),
                                dept.dno.as("dno"),
                                dept.dname.as("dname"),
                                dept.loc.as("loc")
                        )
                ).from(emp)
//                equal Join.on(조건)
                .join(dept).on(emp.dno.eq(dept.dno))
                .where(dept.dname.contains(dname))
                .fetch();

        return list;
    }

    @Override
    public List<Department> querydslByDnoSub() {
//        subQuery 사용을 위한 Q객체 생성
//        New 연산자 이용 생성, 매개변수를 통해 별명 지정 -> JPAExpressions를 이용하여 새로운 SQL 문 삽입
        QDepartment subDept = new QDepartment("subDept");

        List<Department> list = jpaQueryFactory.selectFrom(department)
                .where(department.dno.loe(JPAExpressions.select(subDept.dno.avg())
                                .from(subDept)
                        )
                )
                .fetch();

        return list;
    }

    //    null 일때 coalesce
//    eq ===
//    ne !==
//    like 'abc'
//    contains '%abc%'
//
//    lt <
//            loe <=
//    gt >
//    goe >=
    @Override
    public List<Department> querydslByDnoSub2(int dno) {
//        subQuery 사용을 위한 Q객체 생성
//        New 연산자 이용 생성, 매개변수를 통해 별명 지정 -> JPAExpressions를 이용하여 새로운 SQL 문 삽입
        QDepartment subDept = new QDepartment("subDept");

        List<Department> list = jpaQueryFactory.selectFrom(department)
                .where(department.dno.in(JPAExpressions.select(subDept.dno)
                                .from(subDept)
                                .where(subDept.dno.goe(dno))
                        )
                )
                .fetch();

        return list;
    }

    //    동적 쿼리(Dynamic Query): querydsl 이용, 조건에 따라 검색을 수정하는 쿼리.
    @Override
    public List<Department> querydslByDynamicName(String dname, String loc) {
//        다이나믹 쿼리 작성방법 1) BooleanBuilder 객체 생성, 동적조건 부분(where)을 객체를 통해 생성
        BooleanBuilder booleanBuilder = new BooleanBuilder();

//    다이나믹 쿼리 작성밥법 2)
//    dname is not null -> where dname LIKE '%:dname%'
        if (dname != null) {
            booleanBuilder.and(department.dname.contains(dname)); // where 조건을 .and()로 연결
        }
        if (loc != null) {
            booleanBuilder.and(department.loc.contains(loc)); // where 조건을 .and()로 연결
        }

        return jpaQueryFactory
                .selectFrom(department)
                .where(booleanBuilder) // 동적조건을 booleanBuilder 객체에 담아 전달.
                .fetch();
    }
}
