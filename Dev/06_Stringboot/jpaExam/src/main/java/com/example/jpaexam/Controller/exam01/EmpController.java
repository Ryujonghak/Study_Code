package com.example.jpaexam.Controller.exam01;

import com.example.jpaexam.Model.Emp;
import com.example.jpaexam.Service.exam01.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * packageName : com.example.jpaexam.Controller.exam01
 * fileName : EmpController
 * author : ryujonghak
 * date : 2022/10/20
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/20         ryujonghak          최초 생성
 */

@Slf4j
@Controller
@RequestMapping("/exam01")
public class EmpController {
    //    1) 연습문제: Emp 클래스 전체 만들기
    @Autowired
    EmpService empService;

    @GetMapping("/emp")
    public String getEmpAll(Model model) {
        List<Emp> list = empService.findAll();
        model.addAttribute("list", list);

        log.debug(list.toString());
        return "exam01/emp/emp_all.html";
    }
}
