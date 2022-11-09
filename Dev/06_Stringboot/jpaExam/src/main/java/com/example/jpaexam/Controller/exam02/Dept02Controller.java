package com.example.jpaexam.Controller.exam02;

import com.example.jpaexam.Model.Dept;
import com.example.jpaexam.Service.exam01.DeptService;
import com.example.jpaexam.Service.exam02.Dept02Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
@RequestMapping("/exam02")
public class Dept02Controller {

    @Autowired
    Dept02Service deptService;

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
}
