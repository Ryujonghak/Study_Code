package com.example.controllerexam.controller.exam06;

import com.example.controllerexam.model.Dept;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : com.example.controllerexam.controller.exam06
 * fileName : MultiPathController
 * author : ryujonghak
 * date : 2022/10/14
 * description : 2개 이상 @PathVariable 사용하기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/14         ryujonghak          최초 생성
 */
@Controller
@RequestMapping("/exam06")
public class MultiPathController {
    @GetMapping("/multi-var/id/{id}/name/{name}")
    public String getMultiPath(@PathVariable String id,
                               @PathVariable String name,
                               Model model) {
        model.addAttribute("id", id);
        model.addAttribute("name", name);

        return "exam06/multi-var.html";
    }

//    @GetMapping("/example01/dNo/{dNo}/dName/{dName}/loc/{loc}")
//    public String example01(@PathVariable int dNo,
//                            @PathVariable String dName,
//                            @PathVariable String loc,
//                            Model model) {
//        List<Dept> list = new ArrayList<>();
//        list.add(new Dept(dNo, dName, loc));
//        list.add(new Dept(20, "Accounting", "Seoul"));
//        list.add(new Dept(30, "Production", "Daegu"));
//
//
//        model.addAttribute("list", list);
//
//
//        return "exam06/example01.html";
//    }

    @GetMapping("/example02/dNo/{dNo}/dName/{dName}/loc/{loc}")
    public String example02(@PathVariable int dNo,
                            @PathVariable String dName,
                            @PathVariable String loc,
                            Model model) {
        List<Dept> list = new ArrayList<>();
        list.add(new Dept(dNo, dName, loc));
        list.add(new Dept(20, "Accounting", "Seoul"));
        list.add(new Dept(30, "Production", "Daegu"));


        model.addAttribute("list", list);


        return "exam06/example01.html";
    }
}
