package com.example.jpaexam.Controller.exam04;

import com.example.jpaexam.Model.Dept;
import com.example.jpaexam.Service.exam03.Dept03Service;
import com.example.jpaexam.Service.exam04.Dept04Service;
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
 * fileName : DeptController
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
@RequestMapping("/exam04")
public class Dept04Controller {

    @Autowired
    Dept04Service deptService;

    @GetMapping("/dept")
    public String getDeptAll(Model model) {
        List<Dept> list = deptService.findAll();
        model.addAttribute("list", list);

        log.debug(list.toString());
        return "exam01/dept_all.html";
    }

    @GetMapping("/dept/{dno}")
    public String getDeptById(@PathVariable int dno, Model model) {
        Optional<Dept> optionalDept = deptService.findById(dno);
        model.addAttribute("dept", optionalDept.get());

        log.debug(optionalDept.toString());
        return "exam02/dept_id.html";
    }

    @GetMapping("/dept/addition")
    public String addDept() {
        return "exam04/add_dept.html";
    }

    //    insert 컨트콜러 함수
//    @ResponseBody : return 값이 json 데이터 값나오는 어노테이션, 주로 함수위에 정의
    @PostMapping("/dept/add")
    public RedirectView createDept(@ModelAttribute Dept dept) {
        try {
            deptService.save(dept); // insert 문 실행

        } catch (Exception e) {
            log.debug(e.getMessage()); // 에러로그 콘솔 출력
        }

        return new RedirectView("/exam04/dept");
    }
}

