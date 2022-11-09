package com.example.jpaexam.Repository;

import com.example.jpaexam.Model.Faq;
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
