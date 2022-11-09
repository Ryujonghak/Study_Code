package com.example.jpaexam.Controller.exam03;

import com.example.jpaexam.Model.Dept;
import com.example.jpaexam.Service.exam02.Dept02Service;
import com.example.jpaexam.Service.exam03.Dept03Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/exam03")
public class Dept03Controller {

    @Autowired
    Dept03Service deptService;

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

    //    insert 컨트콜러 함수
//    @ResponseBody : return 값이 json 데이터 값나오는 어노테이션, 주로 함수위에 정의
    @PostMapping("/dept")
    @ResponseBody
    public Dept createDept(@RequestBody Dept dept) {

        Dept dept2 = null;
        try {
            dept2 = deptService.save(dept); // insert 문 실행

        } catch (Exception e) {
            log.debug(e.getMessage()); // 에러로그 콘솔 출력
        }

        return dept2;
    }
}

