package com.example.jpaexam.Controller.exam08;


import com.example.jpaexam.Model.Dept;
import com.example.jpaexam.Service.exam07.Dept07Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


/**
 * packageName : com.example.jpaexam.controller.exam01
 * fileName : DeptController
 * author : ds
 * date : 2022-10-20
 * description : 부서 컨트롤러
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-20         ds          최초 생성
 */
@Slf4j
@RestController
@RequestMapping("/exam08")
public class Dept08Controller {

    @Autowired // 스프링부트가 가동될 때 생성된 객체를 하나 받아오기.
    Dept07Service deptService;

    @GetMapping("/dept")
    public ResponseEntity<Object> getDeptAll() {
        try {
            List<Dept> list = deptService.findAll();
            if (list.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(list, HttpStatus.OK);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/dept/{dno}")
    public ResponseEntity<Object> getDeptId(@PathVariable int dno) {
        try {
            Optional<Dept> optionalDept = deptService.findById(dno);
            if (optionalDept.isPresent()) {
                return new ResponseEntity<>(optionalDept.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}










