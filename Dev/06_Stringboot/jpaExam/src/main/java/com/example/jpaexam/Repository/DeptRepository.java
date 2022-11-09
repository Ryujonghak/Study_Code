package com.example.jpaexam.Repository;

import com.example.jpaexam.Model.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName : com.example.jpaexam.Repository
 * fileName : DeptRepository
 * author : ryujonghak
 * date : 2022/10/20
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/20         ryujonghak          최초 생성
 */
@Repository
public interface DeptRepository extends JpaRepository<Dept, Integer> {

}
