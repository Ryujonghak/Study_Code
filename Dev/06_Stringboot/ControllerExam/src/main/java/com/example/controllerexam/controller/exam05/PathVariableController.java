package com.example.controllerexam.controller.exam05;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * packageName : com.example.controllerexam.controller.exam05
 * fileName : PathVariableController
 * author : ryujonghak
 * date : 2022/10/14
 * description : @PathVariable: @RequestParam과 유사함.
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/14         ryujonghak          최초 생성
 */
// URL 매개변수 전송방식 :
//        1) 쿼리스트링 방식 : http://localhost:8000/exam5?매개변수=값&매개변수2=값2...
//        2) 파라메터 방식(*) :  http://localhost:8000/exam5/값/값2/...

// REST API 방식 : GET(검색) / POST(생성) / PUT(수정) / DELETE(삭제) 방식 + 파라메터 URL 방식
// REST API 방식을 준수하여 만든 프로그램 : RESTful Application
//  목표 : Vue + Springboot 프로그램 연동 ( REST API 사용 )

@Controller
@RequestMapping("/exam05")
public class PathVariableController {
    @GetMapping("/path-variable/{name}")
    //    @PathVariable(URL매개변수) : 매개변수의 값이 URL 파라메터 방식으로 사용되는 어노테이션
    //    {매개변수명} == 함수의 매개변수명 (일치) : {} 안의 저장된 값이 함수의 매개변수값으로 전송됨
    public String getPathVariable(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "exam05/path-variable.html";
    }

//    연습문제 1) 아래와 같이 URL이 정의 되엉 있다 파라메터방식을 사용하고, 컨트롤러 함수를 작성하세요.
    @GetMapping("/exam01/{num}")
    public String Exam01 (@PathVariable int num,
                          Model model) {

        model.addAttribute("num", String.valueOf(num));
        model.addAttribute("num1", String.valueOf(num+10));
        model.addAttribute("num2", String.valueOf(num+20));
        return "exam05/exam01.html";
    }
}
