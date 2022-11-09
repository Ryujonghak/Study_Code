package com.example.modelexam.controller.exam09;

import com.example.modelexam.model.Member;
import com.example.modelexam.service.exam09.Member09Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * packageName : com.example.modelexam.controller.exam07
 * fileName : Member07Controller
 * author : ds
 * date : 2022-10-18
 * description : @RestController 이용 , ResponseEntity, getDeptAll()
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-18         ds          최초 생성
 */
@Slf4j
@RestController
@RequestMapping("/exam09")
public class Member09Controller {

//    1) 연습문제 : 부서클래스를 참고하여
//         Member08Service 클래스에 findById() 함수를 수정하세요( Optional 이용 )
//         Member08Controller 클래스에 getMemberId() 함수를 추가하세요 ( Optional 이용 )
//    단, Rest Client 이용한 출력을 하세요( REST API 프로그램 )

    @Autowired
    Member09Service memberService;

    @GetMapping("/member")
    public ResponseEntity<Object> getMemberAll() {

        try {
            List<Member> list = memberService.findAll(); // 전체 부서 정보 조회

            if(list.isEmpty() == false) {
//                성공 메세지 + 객체 전송
                return new ResponseEntity<>(list, HttpStatus.OK);
            } else {
//                데이터가 없음
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            log.info(e.getMessage()); // 에러 로그 찍기
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/member/{eno}")
    public ResponseEntity<Object> getMemberId(@PathVariable long eno) {

        try {
            Optional<Member> optionalMember = memberService.findById(eno); // dno로 부서 정보 조회

            if(optionalMember.isPresent() == true) {
//                성공 메세지 + 객체 전송
                return new ResponseEntity<>(optionalMember.get(), HttpStatus.OK);
            } else {
//                데이터가 없음
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            log.info(e.getMessage()); // 에러 로그 찍기
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //  새로운 부서 정보 생성 함수 : insert 함수 ( @PostMapping )
//    @RequestBody : 클라이언트 쪽에서 전송한 객체정보를(json 데이터) 함수 매개변수로(부서객체) 전달
    @PostMapping("/member")
    public ResponseEntity<Object> createDept(@RequestBody Member member) {

        try {
//            .save(객체) : 객체에 키가(부서번호) 없으면 insert , 있으면 update 로직이 있음
            List<Member> list = memberService.save(member);

            return new ResponseEntity<>(list, HttpStatus.CREATED);

        } catch( Exception e) {
            log.info(e.getMessage()); // 에러발생시 에러 메세지 콘솔 출력
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // 서버 에러 메세지전송
        }
    }
}










