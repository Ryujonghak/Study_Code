package com.example.controllerexam.controller.exam06;

import com.example.controllerexam.model.Board;
import com.example.controllerexam.model.Dept;
import com.example.controllerexam.model.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName : com.example.controllerexam.controller.exam06
 * fileName : MultiPathRestController
 * author : ryujonghak
 * date : 2022/10/14
 * description : @RestController, @Pathvariable
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/14         ryujonghak          최초 생성
 */
@RestController /// 뷰와 서비스를 연결하는 콘트롤러인데, 결과를 JSON 객체 형태로 리턴함(데이터만 전송).
// Rest Application: Vue <-> Springboot 데이터만 통신(Axios)로 주고 받음.(CSR)
@RequestMapping("/exam06")
public class MultiPathRestController {
//    파라메터 방식: {} 매개변수 전달(함수의 매개변수 값)
    @GetMapping("/multipath-rest/id/{id}/name/{name}")
    public Member getMultiRest(@PathVariable String id, @PathVariable String name) {
        Member member = new Member(id, name);

        return member;
    }

//    연습문제 3) 부모 클래스의 속성에 아래와 같이 데이터를 저장하여 REST 클라이언트 출력
    @GetMapping("/restexample01/dNo/{dNo}/dName/{dName}/loc/{loc}")
    public Dept RestExample01(@PathVariable int dNo, @PathVariable String dName, @PathVariable String loc) {
        Dept dept = new Dept(dNo, dName, loc);

        return dept;
    }

//    연습문제 4) 게시판(Board) 모델 클래스를 만들어서 아래와 같이 출력되도록
    @GetMapping("/restexample02/no/{no}/title/{title}/content/{content}/count/{count}")
    public Board RestExample02(@PathVariable int no, @PathVariable String title,
                               @PathVariable String content, @PathVariable int count) {
        Board board = new Board(no, title, content, count);

        return board;
    }
}
