package com.example.simpledms.service;

import com.example.simpledms.model.Faq;
import com.example.simpledms.repository.FaqRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName : com.example.simpledms.service
 * fileName : FaqService
 * author : ryujonghak
 * date : 2022/11/03
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/11/03         ryujonghak          최초 생성
 */
@Service
public class FaqService {
    @Autowired
    FaqRepository faqRepository;

    public List<Faq> findAll() {
        List<Faq> list = faqRepository.findAll();

        return list;
    }

    public void deleteAll() {
        faqRepository.deleteAll();
    }

    public Faq save(Faq faq) {
        Faq faq2 = faqRepository.save(faq);

        return faq2;
    }

    public Optional<Faq> findById(int no) {
        Optional<Faq> optionalFaq = faqRepository.findById(no);

        return optionalFaq;
    }

    public boolean deleteById(int no) {
        if(faqRepository.existsById(no)) {
            faqRepository.deleteById(no);

            return true;
        }

        return false;
    }

    public List<Faq> findAllByTitleContaining(String title) {
        List<Faq> list = faqRepository.findAllByTitleContaining(title);

        return list;
    }
}
