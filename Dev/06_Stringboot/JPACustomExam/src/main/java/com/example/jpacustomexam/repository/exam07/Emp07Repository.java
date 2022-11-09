package com.example.jpacustomexam.repository.exam07;


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
public interface Emp07Repository extends JpaRepository<Employee, Integer>, Emp07RepositoryCustom {

}
