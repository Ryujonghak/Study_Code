package com.example.simpledms.repository;

import com.example.simpledms.model.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

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
    //    부서명으(dName)로 조회하는 LIKE 검색 함수
    //    1) 쿼리 메서드 방식으로 함수 정의
    List<Dept> findAllByDnameContaining(String dname);
}