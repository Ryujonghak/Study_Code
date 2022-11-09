package com.example.controllerexam.controller.exam07;

import com.example.controllerexam.model.Member;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : com.example.controllerexam.controller.exam07
 * fileName : ObjectController
 * author : ryujonghak
 * date : 2022/10/14
 * description : @RequestBody Post 방식 JSON 데이터를 전달.
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/14         ryujonghak          최초 생성
 */
@RestController // JSON 데이터를 주고받는 컨트롤러
@RequestMapping("/exam07")
public class ObjectController {
//    Post: HTML -> 헤더(문서정보, 상태 등등), 바디(본문, 실질적인 데이터, json 데이터)
//    웹브라우저 URL(주소창)을 이용하지 않고, 내부적으로 바디에 json 데이터를 저장해서 전송하는 방식
//    클라이언트(Vue)에서 json 데이터를 전송함.
//    서버(Springboot) 에서 json 데이터를 전송받음.
//    @RequestBody: json 데이터를 Springboot 클래스로 변환해서 저장.
//    클라이어트(json 속성) == 서버쪽 클래스 속성이 일치해야함.
    @PostMapping("/object-variable")
    public List<Member> getObject(
            @RequestBody Member member
    ) {
        List<Member> list = new ArrayList<Member>();
        list.add(member);
        list.add(new Member("HONG","홍길동"));
        list.add(new Member("KIM","김유신"));

        return list;
    }

//    연습문제 1) 위의 예제에서 아래 데이터를 추가해서 REST 클라이언트에서 출력해보세요.

}
