package com.example.modelexam.controller.exam01;

import com.example.modelexam.model.Member;
import com.example.modelexam.service.exam01.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * packageName : com.example.modelexam.controller
 * fileName : MemberController , getMemberAll() 함수
 * author : ds
 * date : 2022-10-17
 * description : 회원 컨트롤러
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-17         ds          최초 생성
 */
@Controller
@RequestMapping("/exam01")
public class MemberController {
//    연습문제 1) 부서클래스를 참고하여
//    MemberService 클래스를 만들고, findAll() 함수를 정의하세요.
//    MemberController 클래스를 만들고 getMemberAll() 함수를 정의하세요. (/member)
//    결과를 뷰로(exam01/member/member_all.html) 로 전송해 보세요 (테이블 형태로 출력)

//    @Autowired : 스프링 컨테이너에 생성된 memberService 객체를 하나 받아오기
    @Autowired
    MemberService memberService;

    @GetMapping("/member")
    public String getMemberAll(Model model) {

        List<Member> list = memberService.findAll(); // 회원 모든 정보 가져오기 함수 호출
        model.addAttribute("list", list); // 회원정보를 모델에 담기 -> 홈페이지로 전송

        return "exam01/member/member_all.html"; // 이동할 홈페이지 : member_all.html
    }
}










