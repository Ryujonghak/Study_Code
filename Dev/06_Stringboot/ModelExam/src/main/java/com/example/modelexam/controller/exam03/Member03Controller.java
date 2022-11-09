package com.example.modelexam.controller.exam03;

import com.example.modelexam.model.Member;
import com.example.modelexam.service.exam02.Member02Service;
import com.example.modelexam.service.exam03.Member03Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/exam03")
public class Member03Controller {
//    연습문제 1) 부서클래스를 참고하여
//    MemberService 클래스를 만들고, save() 함수를 정의하세요.
//    MemberController 클래스를 만들고 createMember() 함수를 정의하세요. (/member)
//    createMember() 함수의 결과는 콘솔 출력(Rest Client 이용)

    //    @Autowired : 스프링 컨테이너에 생성된 memberService 객체를 하나 받아오기
    @Autowired
    Member03Service memberService;

    @GetMapping("/member")
    public String getMemberAll(Model model) {

        List<Member> list = memberService.findAll(); // 회원 모든 정보 가져오기 함수 호출
        model.addAttribute("list", list); // 회원정보를 모델에 담기 -> 홈페이지로 전송

        return "exam03/member/member_all.html"; // 이동할 홈페이지 : member_all.html
    }

//    getMemberId() 함수 밑에 추가
    @GetMapping("/member/{eno}")
    public String getMemberId(@PathVariable int eno, Model model) {

        Member member = memberService.findById(eno);
        model.addAttribute("member", member);

        return "exam03/member/member_id.html"; // 이동할 홈페이지 : member_id.html
    }

//    createMember() 추가
    @PostMapping("/member")
    @ResponseBody
    public List<Member> createMember(@RequestBody Member member) {
        List<Member> list = memberService.save(member);

        return list;
    }
}








