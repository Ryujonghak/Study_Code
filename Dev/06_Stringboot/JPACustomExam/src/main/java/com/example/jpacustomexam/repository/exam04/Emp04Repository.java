package com.example.jpacustomexam.repository.exam04;


import com.example.jpacustomexam.dto.DeptEmpDto;
import com.example.jpacustomexam.model.exam04.Employee;
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
public interface Emp04Repository extends JpaRepository<Employee, Integer> {
    //    문제 1) employee 와 department join 후 ename like 검색하는 함수를 작성해주세요.
    @Query(value = "SELECT D .*, " +
            "E.ENO, " +
            "E.ENAME, " +
            "E.SALARY " +
            "FROM  TB_DEPARTMENT D, TB_EMPLOYEE E " +
            "WHERE " +
            "D.DNO =E.DNO " +
            "AND E.ENAME LIKE %:ename%", nativeQuery = true)
    List<DeptEmpDto> selectNativeJoin(@Param("ename") String ename);
}
