package com.example.controllerexam.controller.exam04;

import com.example.controllerexam.model.Dept;
import com.example.controllerexam.model.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : com.example.controllerexam.controller.exam04
 * fileName : ObjectParamController
 * author : ryujonghak
 * date : 2022/10/14
 * description : @ModelAtribute 객체형태로 변환하는 어노테이션
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/14         ryujonghak          최초 생성
 */
@Controller // 뷰와 서비스를 연결하는 클래스, 뷰와 연결을 위한 다양한 기능을 제공받을수 있음.
@RequestMapping("/exam04") // 공통 url을 함수에서 빼서 정의할 수 있음.
public class ObjectParamController {
    @GetMapping("/object-param")
    public String getObjectParam(@ModelAttribute Member member) {
//        @ModelAttribute: URL 매개변수의 값을 이름이 일치하는 클래스의 속성에 저장함, 자동으로 Model 객체에 담아서 뷰로 정보를 전송함(Key == 객체명).
        return "exam04/object-param.html";
    }

//    연습문제 1) 모델에 부서 클래스를 만들어서 어노테이션을 이용하여 전달하고 전달 받은 값을 화면에 출력해보시오.
//    연습문제 2) 위의 부서 클래스를 사용해서 데이터를 추가해서 아래의 결과가 출력되게 해보세요.
    @GetMapping("/object-dept")
    public String getDept(@ModelAttribute Dept dept, Model model) {
        List<Dept> list = new ArrayList<Dept>();
        list.add(dept);
        Dept dept1 = new Dept(20,"Sales","Seoul");
        Dept dept2 = new Dept(30,"Production","Pusan");
        list.add(dept1);
        list.add(dept2);
        model.addAttribute("list", list);

        return "exam04/object-dept.html";
    }
}
