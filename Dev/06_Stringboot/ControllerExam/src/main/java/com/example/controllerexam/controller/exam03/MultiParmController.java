package com.example.controllerexam.controller.exam03;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : com.example.controllerexam.controller.exam03
 * fileName : MultiParmController
 * author : ryujonghak
 * date : 2022/10/13
 * description : @RequestParam 2개 이상 사용하기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/13         ryujonghak          최초 생성
 */
@Controller
@RequestMapping("/exam03")
public class MultiParmController {
    @GetMapping("/hello_name_id")
    public String HelloNameId(@RequestParam String name, @RequestParam String id,
                              Model model) {
        model.addAttribute("name", name);
        model.addAttribute("id", id);

        return "exam03/hello_name_id.html";
    }

    @GetMapping("/hello-array")
    public String HelloArray(Model model, @RequestParam String name, @RequestParam String id) {
        List<String> list = new ArrayList<>();
        list.add(name);
        list.add(id);

        model.addAttribute("list", list); // 배열 담아서 html로 전송

        return "exam03/hello_array.html";
    }

    //    연습문제 1) URL 매개변수로 dNo = 10, dName = Accounting, loc = Seoul 받았다. 아래 결과를 화면에 출력하시오.
    @GetMapping("/hello-loc")
    public String HelloLoc(Model model, @RequestParam String dName, @RequestParam String loc, @RequestParam int dno) {
        List<String> list = new ArrayList<String>();
        list.add(dName);
        list.add(loc);
        list.add(String.valueOf(dno));

        model.addAttribute("list", list);
        model.addAttribute("dName", "부서명: " + dName);
        model.addAttribute("dNo", "부서번호: " + dno);
        model.addAttribute("loc", "위치: " + loc);

        return "exam03/hello-loc.html";
    }
}
