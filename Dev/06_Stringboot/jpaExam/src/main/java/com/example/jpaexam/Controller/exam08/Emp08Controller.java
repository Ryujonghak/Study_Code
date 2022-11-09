package com.example.jpaexam.Controller.exam08;


import com.example.jpaexam.Model.Emp;
import com.example.jpaexam.Service.exam07.Emp07Service;
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
@RestController
@RequestMapping("/exam08")
public class Emp08Controller {
    @Autowired
    Emp07Service empService;

    @GetMapping("/emp")
    public ResponseEntity<Object> getEmpAll() {
        try {
            List<Emp> list = empService.findAll();
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

    @GetMapping("/emp/{eno}")
    public ResponseEntity<Object> getEmpId(@PathVariable int eno) {
        try {
            Optional<Emp> optionalEmp = empService.findById(eno);
            if (optionalEmp.isPresent()) {
                return new ResponseEntity<>(optionalEmp.get(), HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

