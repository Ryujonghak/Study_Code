package com.example.controllerexam.controller.exam10;

import com.example.controllerexam.model.Member;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : com.example.controllerexam.controller.exam10
 * fileName : ResponseEnitity2Controller
 * author : ryujonghak
 * date : 2022/10/17
 * description : ResponseEntity 의 함수 호출 예제
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/17         ryujonghak          최초 생성
 */
@RestController // 함수의 리턴 값이 json 데이터로 주고 받음.
@RequestMapping("/exam10")
public class ResponseEntity3Controller {
    @PostMapping("/object-body") // 클라이언트쪽에서 객체를 전송
    public ResponseEntity<List<Member>> getObject(@RequestBody Member member) {
        List<Member> list = new ArrayList<Member>();

        try {
            list.add(member);
            if(list != null) {
//                데이터가 있으면 성공 메세지 전송
                return ResponseEntity.ok().body(list);
            } else {
//                데이터가 없을 시 보내는 메세지.
//                빌더 패턴: .build() 함수 붙음.(생성자를 대신하여 객체를 생성할 때 사용)
//                자기가 사용하고 싶은 매개변수만 조합해서 사용이 가능: 매개변수 .a().c().build(); << 방식으로 사용가능.
                return ResponseEntity.noContent().build();
            }
        } catch (Exception e) {
//            에러발생한 경우(상태정보를 보내줌)
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}