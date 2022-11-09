package com.example.jpacustomexam.repository;

import com.example.jpacustomexam.model.Faq;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName : com.example.jpaexam.Repository
 * fileName : FaqRepository
 * author : ryujonghak
 * date : 2022/10/21
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/21         ryujonghak          최초 생성
 */
@Repository
public interface FaqRepository extends JpaRepository<Faq, Integer> {

}
