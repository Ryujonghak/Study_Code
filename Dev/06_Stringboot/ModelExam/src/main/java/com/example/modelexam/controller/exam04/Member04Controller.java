package com.example.modelexam.controller.exam04;

import com.example.modelexam.model.Member;
import com.example.modelexam.service.exam03.Member03Service;
import com.example.modelexam.service.exam04.Member04Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

/**
 * packageName : com.example.modelexam.controller.exam02
 * fileName : Member02Controller
 * author : ds
 * date : 2022-10-17
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-17         ds          최초 생성
 */
@Controller
@RequestMapping("/exam04")
public class Member04Controller {
//    연습문제 1) 부서클래스를 참고하여
//    MemberService 클래스를 만들고, save() 함수를 정의하세요.
//    MemberController 클래스를 만들고 createMember() 함수를 정의하세요. (/member)
//    html 페이지로 정보 출력 ( RedirectView 이용하세요 )
//    단 사원번호 8000 부터 증가 시키세요 (count + 8000)

    //    @Autowired : 스프링 컨테이너에 생성된 memberService 객체를 하나 받아오기
    @Autowired
    Member04Service memberService;

    @GetMapping("/member")
    public String getMemberAll(Model model) {

        List<Member> list = memberService.findAll(); // 회원 모든 정보 가져오기 함수 호출
        model.addAttribute("list", list); // 회원정보를 모델에 담기 -> 홈페이지로 전송

        return "exam04/member/member_all.html"; // 이동할 홈페이지 : member_all.html
    }

    //    getMemberId() 함수 밑에 추가
    @GetMapping("/member/{eno}")
    public String getMemberId(@PathVariable int eno, Model model) {

        Member member = memberService.findById(eno);
        model.addAttribute("member", member);

        return "exam04/member/member_id.html"; // 이동할 홈페이지 : member_id.html
    }

    //    /exam04/member/addition : 회원 추가 페이지 함수
    @GetMapping("/member/addition")
    public String addMember() {
        return "exam04/member/add_member.html"; // 부서정보 추가 페이지 경로
    }

    //    createMember() 추가
    @PostMapping("/member/add")
    public RedirectView createMember(@ModelAttribute Member member) {

        memberService.save(member);

        return new RedirectView("/exam04/member"); // getMemberAll() 함수 실행
    }

}








