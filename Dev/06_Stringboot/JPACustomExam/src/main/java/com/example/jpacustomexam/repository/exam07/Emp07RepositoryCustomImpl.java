package com.example.jpacustomexam.repository.exam07;

import com.example.jpacustomexam.dto.querydsl.EmpGroupQDto;
import com.example.jpacustomexam.model.exam04.Employee;
import com.example.jpacustomexam.model.exam04.QDepartment;
import com.example.jpacustomexam.model.exam04.QEmployee;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * packageName : com.example.jpacustomexam.repository.exam07
 * fileName : Emp07RepositoryCustomImpl
 * author : ryujonghak
 * date : 2022/10/27
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/27         ryujonghak          최초 생성
 */
public class Emp07RepositoryCustomImpl implements Emp07RepositoryCustom {
    @Autowired
    private JPAQueryFactory jpaQueryFactory;

    private QDepartment department = QDepartment.department;
    private QEmployee employee = QEmployee.employee;

    @Override
    public List<Employee> querydslByeName(String ename) {
        List<Employee> list = jpaQueryFactory.selectFrom(employee)
                .where(employee.ename.contains(ename))
                .fetch(); // 실행 문
        return list;
    }

    @Override
    public List<Employee> querydslByeNameAndJob(String ename, String job) {
        List<Employee> list = jpaQueryFactory.selectFrom(employee)
                .where(employee.ename.contains(ename)
                        .and(employee.job.contains(job)))
                .fetch(); // 실행 문
        return list;
    }

    @Override
    public List<EmpGroupQDto> querydslByGroupFunc() {
        List<EmpGroupQDto> list = jpaQueryFactory.select(
                        Projections.fields(
                                EmpGroupQDto.class,
                                employee.salary.count().as("countVar"),
                                employee.salary.sum().as("sumVar"),
                                employee.salary.avg().as("avgVar"),
                                employee.salary.max().as("maxVar"),
                                employee.salary.min().as("minVar")
                        )
                ).from(employee)
                .groupBy(employee.department.dno)
                .fetch();

        return list;
    }

    @Override
    public List<Employee> querydslbyCommision() {
        List<Employee> list = jpaQueryFactory.selectFrom(employee)
                .where(employee.commission.gt(500))
                .fetch();

        return list;
    }

    @Override
    public List<Employee> querydslbyHiredateBetween() {
        List<Employee> list = jpaQueryFactory.selectFrom(employee)
                .where(employee.hiredate.between("1982-01-01", "1982-12-31"))
                .fetch();

        return list;
    }

    @Override
    public List<EmpGroupQDto> querydslByGroupFunc2() {
        List<EmpGroupQDto> list = jpaQueryFactory.select(
                        Projections.fields(
                                EmpGroupQDto.class,
                                employee.job.as("job"),
                                employee.department.dno.as("dno"),
                                employee.salary.sum().as("sumVar")
                        )
                ).from(employee)
                .groupBy(employee.department.dno, employee.job)
                .fetch();

        return list;
    }

    @Override
    public List<Employee> querydslByDynamicEnameJob(String ename, String job) {
        //        다이나믹 쿼리 작성방법 1) BooleanBuilder 객체 생성, 동적조건 부분(where)을 객체를 통해 생성
        BooleanBuilder booleanBuilder = new BooleanBuilder();

//    다이나믹 쿼리 작성밥법 2)
//    dname is not null -> where dname LIKE '%:dname%'
        if (ename != null) {
            booleanBuilder.and(employee.ename.contains(ename)); // where 조건을 .and()로 연결
        } else if (job != null) {
            booleanBuilder.and(employee.job.contains(job)); // where 조건을 .and()로 연결
        } else {
            booleanBuilder.and(employee.ename.contains(ename).and(employee.job.contains(job)));
        }

        return jpaQueryFactory
                .selectFrom(employee)
                .where(booleanBuilder) // 동적조건을 booleanBuilder 객체에 담아 전달.
                .fetch();
    }

    @Override
    public List<Employee> LastQuerydsl(int num1, int num2) {
        List<Employee> list = jpaQueryFactory.selectFrom(employee)
                .where(employee.salary.notBetween(num1, num2))
                .fetch();

        return list;
    }
}
