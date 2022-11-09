package com.example.simpledms.repository;


import com.example.simpledms.model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
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
    List<Emp> findAllByEnameContaining(String ename);
}
