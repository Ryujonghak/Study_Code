package com.example.controllerexam.controller.exam08;

import com.example.controllerexam.model.Member;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : com.example.controllerexam.controller.exam08
 * fileName : RequestEntityController
 * author : ryujonghak
 * date : 2022/10/14
 * description :ResponseEntityController 클래스 적용, @RequestBody/ @PostMapping
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/14         ryujonghak          최초 생성
 */
@RestController
@RequestMapping("/exam08")
public class ResponseEntityController {
    @PostMapping("/object-body")
    public ResponseEntity<Object> getObjectBody(
            @RequestBody Member member
    ) {
        List<Member> list = new ArrayList<Member>();
        list.add(member);

        return new ResponseEntity<Object>(list, HttpStatus.OK);
    }

    //    연습문제 1) 멤버 클래스의 배열 아래 결과를 추가해서 출력해보세요. (상태메세지는 FOUND)
    @PostMapping("/example01")
    public ResponseEntity<Object> example01(
            @RequestBody Member member
    ) {
        List<Member> list = new ArrayList<Member>();
        list.add(member);
        list.add(new Member("HONG", "홍길동"));
        list.add(new Member("KIM", "김유신"));

        return new ResponseEntity<Object>(list, HttpStatus.FOUND);
    }
}
