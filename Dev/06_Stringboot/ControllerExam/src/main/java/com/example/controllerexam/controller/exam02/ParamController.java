package com.example.controllerexam.controller.exam02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * packageName : com.example.controllerexam.controller.exam02
 * fileName : ParamController
 * author : ryujonghak
 * date : 2022/10/13
 * description : @RequestMapping, @ResponseParam
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/13         ryujonghak          최초 생성
 */
@Controller
// @RequestMapping(value): 클래스 위에 정의해서 공통 URL을 적용할 수 있음.
@RequestMapping("/exam02")
public class ParamController {
    @GetMapping("/hello-name")
    public String HelloName(Model model,
//                            쿼리 스트링: @RequestParam 객체타입 매개변수명 = URL 주소(?매개변수명 = 값)에서 변수에 값을 일치시켜줌.
                            @RequestParam String name) {
        model.addAttribute("greeting", "안녕하세요." + name);

        return "exam02/hello.html";
    }

    //    연습문제 1) 숫자로 url 매개변수를 전달해서 화면에 출력해 보세요.
    @GetMapping("/hello-name2")
    public String HelloNum2(Model model,
//                            쿼리 스트링: @RequestParam 객체타입 매개변수명 = URL 주소(?매개변수명 = 값)에서 변수에 값을 일치시켜줌.
                            @RequestParam int num) {
        model.addAttribute("greeting", "매개변수는 " + num);

        return "exam02/hello.html";
    }
}
