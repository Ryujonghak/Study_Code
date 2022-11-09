package com.example.controllerexam.controller.exam09;

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
 * packageName : com.example.controllerexam.controller.exam09
 * fileName : ResponseEntity2Controller
 * author : ryujonghak
 * date : 2022/10/14
 * description : try ~ catch 함께 사용
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/14         ryujonghak          최초 생성
 */
@RestController
@RequestMapping("/exam09")
public class ResponseEntity2Controller {
    @PostMapping("/getObjectBody")
    public ResponseEntity<Object> getObjectBody(@RequestBody Member member) {
        try {
            List<Member> list = new ArrayList<Member>();
            list.add(member);

            if(member != null) {
//                성공 시 클라이언트에게 메세지 전송 (OK = 200)
                return new ResponseEntity<Object>(list, HttpStatus.OK);
            } else {
//               실패 시 (NO_CONTENT = 204)
                return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
//            프로그램 에러 발생시 (BAD_REQUEST = 400)
//            웹프로그래밍 시 400번대 메세지 -> 주로 서버 에러
            return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
        }
    }

}
