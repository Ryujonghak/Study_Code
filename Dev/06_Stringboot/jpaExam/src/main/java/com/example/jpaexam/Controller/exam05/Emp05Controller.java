package com.example.jpaexam.Controller.exam05;

import com.example.jpaexam.Model.Emp;
import com.example.jpaexam.Service.exam04.Emp04Service;
import com.example.jpaexam.Service.exam05.Emp05Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

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
@RequestMapping("/exam05")
public class Emp05Controller {
    //    1) 연습문제: Emp 클래스 전체 만들기
    @Autowired
    Emp05Service empService;

    @GetMapping("/emp")
    public String getEmpAll(Model model) {
        List<Emp> list = empService.findAll();
        model.addAttribute("list", list);

        log.debug(list.toString());
        return "exam01/emp/emp_all.html";
    }

    @GetMapping("/emp/addition")
    public String addDept() {
        return "exam04/emp/add_emp.html";
    }

    //    insert 컨트콜러 함수
//    @ResponseBody : return 값이 json 데이터 값나오는 어노테이션, 주로 함수위에 정의
    @PostMapping("/emp/add")
    public RedirectView createEmp(@ModelAttribute Emp emp) {
        try {
            empService.save(emp); // insert 문 실행

        } catch (Exception e) {
            log.debug(e.getMessage()); // 에러로그 콘솔 출력
        }

        return new RedirectView("/exam04/emp");
    }

    @GetMapping("/emp/edition/{eno}")
    public String editEmp(@PathVariable int eno, Model model) {
        Optional<Emp> optionalEmp = empService.findById(eno);
        model.addAttribute("emp", optionalEmp.get());

        return "exam05/emp/update_emp.html";
    }

    public RedirectView updateEmp(@PathVariable int eno, @ModelAttribute Emp emp) {
        try {
            empService.save(emp);
        } catch (Exception e) {
            log.debug(e.getMessage());
        }

        return new RedirectView("/exam05/emp");
    }

}
