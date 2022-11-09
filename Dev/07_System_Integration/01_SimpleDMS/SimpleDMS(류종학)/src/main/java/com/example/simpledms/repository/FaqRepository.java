package com.example.simpledms.repository;

import com.example.simpledms.model.Faq;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * packageName : com.example.simpledms.repository
 * fileName : FaqRepository
 * author : ryujonghak
 * date : 2022/11/03
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/11/03         ryujonghak          최초 생성
 */
public interface FaqRepository extends JpaRepository<Faq, Integer> {
    List<Faq> findAllByTitleContaining(String title);
}
