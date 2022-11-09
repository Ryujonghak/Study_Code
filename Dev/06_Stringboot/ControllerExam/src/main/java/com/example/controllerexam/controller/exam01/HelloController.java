package com.example.controllerexam.controller.exam01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * packageName : com.example.controllerexam.controller.exam01
 * fileName : HelloController
 * author : ryujonghak
 * date : 2022/10/13
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/13         ryujonghak          최초 생성
 */
// MVC: Model(순수 자바 클래스 정보를 저장/검색하는 용도, 속성/생성자/Getter/Setter)
// Controller(뷰(Vue, React, 타임리프, HTML)와 모델(Service: 업무 로직이 포함된 함수들이 있는 클래스)을 연결하는 클래스)
@Controller //Controller Class 임을 알리는 어노테이션
public class HelloController {
    //    스프링부트 기본 URL: http://localhost:8080/ + @GetMapping 을 이용하여 사용.
    //    Hello(매개변수) {} (*): @GetMapping(매개변수) 함수 위에 붙어 있으면
    //                 어노테이션의 매개변수와 웹브라우저 URL 과 비교해서 일치하면 아래 함수가 실행됨
    //    @GetMapping : @XXXMapping 어노테이션들은 GET(검색) / POST(추가) / PUT(수정) / DELETE(삭제)
    //    종합 : 1) url 비교  + 2) GET/POST/PUT/DELETE 방식(Method) => 아래 함수 실행
    //    매개변수 Model 클래스 : @Controller 에서 사용하는
    //                  스프링부트와 타임리프간의 데이터 전송을 위한 클래스
    //          HashMap 유사한 구조 (키, 값)
    //    함수의 return 값 : 이동할 홈페이지명 (기본경로 : templates/ )
    @GetMapping("/exam01/hello")
    public String Hello(Model model) {
        model.addAttribute("greeting", "안녕 Springboot");
        model.addAttribute("greeting2", "Springboot 처음이지");
        model.addAttribute("greeting3", "수고해");

        return "exam01/hello.html";
    }

//    연습문제 1) 웹브라우저 url = exam01/hello2.html 에 출력 안녕 hello2 페이지2
    @GetMapping("/exam01/hello2")
    public String Hello2(Model model) {
        model.addAttribute("text1","Hello Page2");

        return "exam01/hello2.html";
    }

//    연습문제 4)
    @GetMapping("/exam01/hello4")
    public String Hello4(Model model) {
        boolean test = true;
        int test1 = 10;
        long test2 = 15;
        double test3 = 20.2;

        model.addAttribute("text1",test);
        model.addAttribute("text2",test1);
        model.addAttribute("text3",test2);
        model.addAttribute("text4",test3);

        return "exam01/hello4.html";
    }

}
