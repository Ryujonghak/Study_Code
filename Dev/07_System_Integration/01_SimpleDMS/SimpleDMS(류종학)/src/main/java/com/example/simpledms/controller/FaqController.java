package com.example.simpledms.controller;

import com.example.simpledms.model.Faq;
import com.example.simpledms.service.FaqService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * packageName : com.example.simpledms.controller
 * fileName : FaqController
 * author : ryujonghak
 * date : 2022/11/03
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/11/03         ryujonghak          최초 생성
 */
@Slf4j
@CrossOrigin(origins = "http://localhost:8080") // CORS(Web 포트 변경 불가) 법칙을 풀어줌
@RestController
@RequestMapping("/api")
public class FaqController {
    @Autowired
    FaqService faqService;

    @GetMapping("/faq")
    public ResponseEntity<Object> find(@RequestParam(required = false) String title) {
        try {
            List<Faq> list = Collections.emptyList();
            if (title == null) {
                list = faqService.findAll();
            } else {
                title = title.toUpperCase();
                list = faqService.findAllByTitleContaining(title);
            }
            if (list.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(list, HttpStatus.OK);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/faq/all")
    public ResponseEntity<Object> deleteAll() {
        try {
            faqService.deleteAll();
//            삭제가 잘 진행되면 OK 메세지가 전송
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/faq")
    public ResponseEntity<Object> createEmp(@RequestBody Faq faq) {
        try {
            Faq faq2 = faqService.save(faq);
            return new ResponseEntity<>(faq2, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/faq/{no}")
    public ResponseEntity<Object> findById(@PathVariable int no) {
        try {
            Optional<Faq> optionalFaq = faqService.findById(no);
            if (optionalFaq.isPresent()) {
                return new ResponseEntity<>(optionalFaq, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/faq/{no}")
    public ResponseEntity<Object> updateEmp(@PathVariable int no, @RequestBody Faq faq) {
        try {
            Faq faq2 = faqService.save(faq);
            return new ResponseEntity<>(faq2, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/faq/deletion/{no}")
    public ResponseEntity<Object> deleteById(@PathVariable int no) {
        try {
            boolean delif = faqService.deleteById(no);
            if (delif) {
                return new ResponseEntity<>(HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
