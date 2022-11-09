package com.example.jpacustomexam.repository;

import com.example.jpacustomexam.dto.EmpGroupDto;
import com.example.jpacustomexam.model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * packageName : com.example.jpaexam.Repository
 * fileName : EmpRepository
 * author : ryujonghak
 * date : 2022/10/20
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/20         ryujonghak          최초 생성
 */
@Repository
public interface EmpRepository extends JpaRepository<Emp, Integer> {
    //    JPQl 함수를 사용할 수 있음 : 응용
//    @Query, 쿼리메소드
//    쿼리 메소드 연습문제 :
//    1) Eno 속성(컬럼)에 대해서 내림차순으로 전체 조회
    List<Emp> findAllByOrderByEnoDesc();

    //    2) ename like 검색하여 ename으로 내림차순 조회
//    select * from tb_emp where ename like '%매개변수%' order by ename desc;
    List<Emp> findAllByEnameContainingOrderByEnameDesc(String ename);

    //    3) emp 테이블에서 job 에 like 검색을 추가하고 job 내림차순으로 정렬하는 함수를 작성하세요.
//    select * from tb_emp where job lik '%매개변수%' order by job desc;
    List<Emp> findAllByJobContainingOrderByJobDesc(String job);

    //    4) emp 테이블에서 job 이 manager 이고 매개변수로 부서번호(dno) 를 전달받는 함수를 작성하세요.
//    select * from tb_emp where job = 'MANAGER' and dno = 20;
    List<Emp> findAllByJobAndDno(String job, int dno);

    //    5) Emp 테이블에서 salary 가 1000 ~ 1500 사이의 값을 같는 사원을 조회하려고 합니다.
//    함수를 작성해 주세요. ( Between 사용 )
//    select * from tb_emp where salary between 1000 and 1500;
    List<Emp> findAllBySalaryBetweenOrderByEname(int first, int last);

    //    6) Emp 테이블에서 Job 을 매개변수로 받는 함수를 작성해 주세요 .
//    단, Job 의 매개변수값은 대문자 또는 소문자가 들어올 수 있음
//    select * from tb_emp where job = upper('manager');
    List<Emp> findAllByJobIgnoreCase(String job);

    //    7) COMMISSION 을 받는 사원을 모두 출력하는 함수를 작성해 보세요.
    List<Emp> findAllByCommissionIsNotNull();

    //    8) 급여(Salary) 는 내림차순, 사원명 (Ename) 은 오름차순으로 정렬하는 함수를 작성해 보세요.
    List<Emp> findAllByOrderBySalaryDescEnameAsc();

    //    9)
    List<Emp> findAllBySalaryLessThanOrSalaryGreaterThanOrderByEname(int first, int last);

    //    10)
    List<Emp> findAllByCommissionIn(int[] arrays);

    //    ----------------------------------------------------------------
//    @Query 사용
//    1) ename like 검색하는 함수를 작성
    @Query(value = "select e.* " +
            "from tb_emp e " +
            "where e.ename like %:ename%"
            , nativeQuery = true)
    List<Emp> findEmpLike(@Param("ename") String ename);

    @Query(value = "select e.* " +
            "from tb_emp e " +
            "order by e.salary desc " +
            "       ,e.ename asc"
            , nativeQuery = true)
    List<Emp> findAllByEmpSort();

    @Query(value = "select e.* " +
            "from tb_emp e " +
            "where commission is null " +
            "and salary >= :salary "
            , nativeQuery = true)
    List<Emp> findAllByCommissionIsNullAndSalaryAfter(@Param("salary") int salary);

    @Query(value = "select e.* " +
            "from tb_emp e " +
            "where hiredate like '%1982%' ", nativeQuery = true)
    List<Emp> findAllByHiredate();

    @Query(value = "SELECT e.dno " +
            ", e.job " +
            ", sum(e.salary) AS SumVar " +
            "FROM tb_emp e " +
            "group by e.dno, e.job", nativeQuery = true)
    List<EmpGroupDto> groupfunc();

    //    연습문제: 부서별 평균 월급여를 출력하는 함수, 단 소수점은 절삭
    @Query(value = "SELECT e.dno " +
            ", trunc(AVG(e.salary)) AS AvgVar " +
            "FROM tb_emp e " +
            "group BY e.dno", nativeQuery = true)
    List<EmpGroupDto> groupfunc2();

    //    연습문제: 부서별 최고급여 중에서 3000 이상인 사원만 조회하는 함수, 단 소수점은 절삭
    @Query(value = "SELECT e.ename " +
            ", e.dno " +
            ", trunc(Max(e.salary)) AS MaxVar " +
            "FROM tb_emp e " +
            "group BY e.dno " +
            ", e.ename " +
            "HAVING trunc(Max(e.salary)) >= 3000 "
            , nativeQuery = true)
    List<EmpGroupDto> groupfunc3();

    //    연습문제: job이 'Manager'가 아니고 Job별 월급여 합계가 5000 이상 되는 사원의 정보 출력 함수, 단 월급여 합계로 오름차순 정렬
    @Query(value = "SELECT e.ename " +
            ", e.job " +
            ", trunc(Max(e.salary)) " +
            "FROM tb_emp e " +
            "where e.job != 'MANAGER' " +
            "group BY e.job " +
            ", e.ename " +
            "HAVING trunc(Max(e.salary)) >= 5000 "
            , nativeQuery = true)
    List<EmpGroupDto> groupfunc4();

    //    연습문제: 사원의 총 수와 최고 급여를 출력하세요.
    @Query(value = "SELECT count(*) AS CountVar " +
            ", trunc(Max(e.salary)) AS MaxVar " +
            "FROM tb_emp e "
            , nativeQuery = true)
    List<EmpGroupDto> groupfunc5();

    //    연습문제: 사원 테이블에서 가장 오래된 사원의 입사일 가장 빠른 사원의 입사일을 출력하세요.
    @Query(value = "SELECT MIN(e.hiredate) AS HireMinHVar " +
            ", MAX(e.hiredate) AS HireMaxHVar " +
            "FROM tb_emp e "
            , nativeQuery = true)
    List<EmpGroupDto> groupfunc6();
}
