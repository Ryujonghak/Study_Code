package com.example.jpaexam.Service.quiz;

import com.example.jpaexam.Model.Faq;
import com.example.jpaexam.Repository.FaqRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName : com.example.jpaexam.Service.examLast
 * fileName : FaqLastService
 * author : ryujonghak
 * date : 2022/10/21
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/21         ryujonghak          최초 생성
 */
@Service
public class FaqLastService {

    @Autowired
    FaqRepository faqRepository;

    public List<Faq> findAll() {
        List<Faq> list = faqRepository.findAll();

        return list;
    }

    public Optional<Faq> findById(int no) {
        Optional<Faq> optionalFaq = faqRepository.findById(no);

        return optionalFaq;
    }

    public Faq save(Faq faq) {
        return faqRepository.save(faq);
    }

    public boolean removeById(int no) {
        if(faqRepository.existsById(no)) {
            return true;
        } else {
            return false;
        }
    }
}
