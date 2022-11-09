package com.example.modelexam.controller.exam05;

import com.example.modelexam.model.Dept;
import com.example.modelexam.model.Member;
import com.example.modelexam.service.exam04.Member04Service;
import com.example.modelexam.service.exam05.Member05Service;
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
@RequestMapping("/exam05")
public class Member05Controller {
//    연습문제 1) 부서클래스를 참고하여
//    MemberService 클래스를 만들고, save() 함수에 update 로직 추가하세요.
//    MemberController 클래스를 만들고 editMember(), updateMember() 함수를 정의하세요.
//    수정 페이지 url : exam05/member/update_member.html
//    html 페이지로 정보 출력 ( RedirectView 이용하세요 )

    //    @Autowired : 스프링 컨테이너에 생성된 memberService 객체를 하나 받아오기
    @Autowired
    Member05Service memberService;

    @GetMapping("/member")
    public String getMemberAll(Model model) {

        List<Member> list = memberService.findAll(); // 회원 모든 정보 가져오기 함수 호출
        model.addAttribute("list", list); // 회원정보를 모델에 담기 -> 홈페이지로 전송

        return "exam05/member/member_all.html"; // 이동할 홈페이지 : member_all.html
    }

    //    getMemberId() 함수 밑에 추가
    @GetMapping("/member/{eno}")
    public String getMemberId(@PathVariable int eno, Model model) {

        Member member = memberService.findById(eno);
        model.addAttribute("member", member);

        return "exam05/member/member_id.html"; // 이동할 홈페이지 : member_id.html
    }

    //    /exam05/member/addition : 회원 추가 페이지 함수
    @GetMapping("/member/addition")
    public String addMember() {
        return "exam05/member/add_member.html"; // 부서정보 추가 페이지 경로
    }

    //    createMember() 추가
    @PostMapping("/member/add")
    public RedirectView createMember(@ModelAttribute Member member) {

        memberService.save(member);

        return new RedirectView("/exam05/member"); // getMemberAll() 함수 실행
    }

//    수정 부분
//    수정 페이지 열기 함수
@GetMapping("/member/edition/{eno}")
public String editMember(@PathVariable long eno, Model model) {
    // 부서번호(dno) 에 해당하는 정보 요청
    Member member = memberService.findById(eno);
    model.addAttribute("member", member);

    return "exam05/member/update_member.html";
}

    //    수정페이지에서 제출(submit)버튼을 눌렀을 때 실행되는 함수
//    @PutMapping(url) : Update 문이 실행될때 사용하는 어노테이션
//    클라이언트 쪽에서 키값 + 객체를 모두 전송함
    @PutMapping("/member/edit/{eno}")
    public RedirectView updateMember(@PathVariable long eno, @ModelAttribute Member member) {
        memberService.save(member);

        return new RedirectView("/exam05/member"); // 부서정보 첫페이지 강제 이동
    }
}








