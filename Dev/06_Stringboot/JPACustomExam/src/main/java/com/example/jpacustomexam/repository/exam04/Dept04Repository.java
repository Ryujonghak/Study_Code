package com.example.jpacustomexam.repository.exam04;

import com.example.jpacustomexam.dto.DeptEmpCDto;
import com.example.jpacustomexam.dto.DeptEmpDto;
import com.example.jpacustomexam.model.exam04.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * packageName : com.example.jpaexam.repository
 * fileName : DeptRepository
 * author : ds
 * date : 2022-10-20
 * description : JPA 페이징 처리 함수 만들기
 * 페이징 처리 ? 한번에 화면에 보여줄 개수 를 1페이지로 정해서 프로그램에서 나타내는 것
 * page : 현재 페이지 번호
 * size : 전체 페이지 수
 * currentpage : 현재 페이지 번호
 * totalItems : 전체 데이터 총건수
 * totalpages : 전체 페이지 수
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-20         ds          최초 생성
 */
@Repository
public interface Dept04Repository extends JpaRepository<Department, Integer> {
    //    연습문제 1) 부서와 사원 테이블 join해서 보여주기(DTO 필요)
    //    1) 일반 SQL
    @Query(value = "SELECT D .*, " +
            "E.ENO, " +
            "E.ENAME, " +
            "E.SALARY " +
            "FROM  TB_DEPARTMENT D, TB_EMPLOYEE E " +
            "WHERE " +
            "D.DNO =E.DNO", nativeQuery = true)
    List<DeptEmpDto> selectNativeJoin();

    //   2) 객체 쿼리(nativeQuery = false, 생략: 객체 쿼리(JPQL query)
    //    DTO 사용: 클래스 사용.
//    @Query(value = "SELECT  " +
//            " NEW com.example.jpacustomexam.dto.DeptEmpCDto(d.dno, d.dname, d.loc, e.eno, e.ename, e.salary) " +
//            "FROM Employee e INNER JOIN e.department d")
//    List<DeptEmpCDto> selectJoin();

    //    참고 2) 관계 설정 없이 객체 쿼리로 조인 사용
    @Query(value = "SELECT  " +
            " NEW com.example.jpacustomexam.dto.DeptEmpCDto(d.dno, d.dname, d.loc, e.eno, e.ename, e.salary) " +
            "FROM Emp e INNER JOIN Dept d On e.dno = d.dno")
    List<DeptEmpCDto> selectJoin();
}