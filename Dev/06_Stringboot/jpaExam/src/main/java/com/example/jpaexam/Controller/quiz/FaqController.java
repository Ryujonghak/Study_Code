package com.example.jpaexam.Controller.quiz;

import com.example.jpaexam.Model.Faq;
import com.example.jpaexam.Service.quiz.FaqLastService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * packageName : com.example.jpaexam.Controller.quiz
 * fileName : FaqController
 * author : ryujonghak
 * date : 2022/10/21
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/21         ryujonghak          최초 생성
 */
@Slf4j
@RestController
@RequestMapping("/quiz")
public class FaqController {
    @Autowired
    FaqLastService faqLastService;

    @GetMapping("/faq")
    public ResponseEntity<Object> getFaqAll() {
        try {
            List<Faq> list = faqLastService.findAll();
            if(list.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(list, HttpStatus.OK);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //ID로 조회하는 함수
    @GetMapping("/faq/{no}")
    public ResponseEntity<Object> getFaqId(@PathVariable int no) {

        try {
            Optional<Faq> OptionalFaq = faqLastService.findById(no);
            //데이터 + 성공 메세지 전송
            if (OptionalFaq.isPresent() == true) {
                return new ResponseEntity<>(OptionalFaq.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT); //데이터 없음 메세지 전송
            }

        } catch (Exception e) {
            log.debug(e.getMessage());
            //서버 에러 발생시 메세지 전송 -클라이언트

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }


    @PostMapping("/faq")
    public ResponseEntity<Object> createFaq(@RequestBody Faq faq) {
        try {
            return new ResponseEntity<>(faqLastService.save(faq), HttpStatus.CREATED);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // 수정 실행
    @PutMapping("/faq/edit/{no}")
    public ResponseEntity<Object> updateFaq(@PathVariable int no,@RequestBody Faq faq){
        try {
            Faq faq2 = faqLastService.save(faq);
            return new ResponseEntity<>(faqLastService.save(faq), HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/faq/delete/{no}")
    public ResponseEntity<Object> deleteFaq(@PathVariable int no) {
        try{
            boolean bSuccess = faqLastService.removeById(no); //update문 호출
            if(bSuccess == true){
                //성공메세지 전송함
                return new ResponseEntity<>(HttpStatus.OK);
            }else{
                //실패했을 경우- 아이디값이 존재하지 않을때
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        }catch(Exception e){
            log.debug(e.getMessage());

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
