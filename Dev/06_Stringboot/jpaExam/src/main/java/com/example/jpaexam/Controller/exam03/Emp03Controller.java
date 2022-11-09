package com.example.jpaexam.Controller.exam03;

import com.example.jpaexam.Model.Emp;
import com.example.jpaexam.Service.exam02.Emp02Service;
import com.example.jpaexam.Service.exam03.Emp03Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

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
@RequestMapping("/exam03")
public class Emp03Controller {
    //    1) 연습문제: Emp 클래스 전체 만들기
    @Autowired
    Emp03Service empService;

    @GetMapping("/emp")
    public String getEmpAll(Model model) {
        List<Emp> list = empService.findAll();
        model.addAttribute("list", list);

        log.debug(list.toString());
        return "exam01/emp/emp_all.html";
    }

    @GetMapping("/emp/{eno}")
    public String getEmpById(@PathVariable int eno, Model model) {
        Optional<Emp> optionalEmp = empService.findById(eno);
        model.addAttribute("emp", optionalEmp.get());

        log.debug(optionalEmp.toString());
        return "exam02/emp/emp_id.html";
    }

    public Emp createEmp(@RequestBody Emp emp) {
        Emp emp2 = null;
        try {
            emp2 = empService.save(emp);
        } catch (Exception e) {
            log.debug(e.getMessage());
        }
        return emp2;
    }
}
