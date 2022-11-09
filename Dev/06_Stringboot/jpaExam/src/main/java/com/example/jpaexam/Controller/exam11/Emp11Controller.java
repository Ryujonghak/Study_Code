package com.example.jpaexam.Controller.exam11;


import com.example.jpaexam.Model.Emp;
import com.example.jpaexam.Service.exam07.Emp07Service;
import com.example.jpaexam.Service.examLast.EmpLastService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("/exam11")
public class Emp11Controller {
    @Autowired
    EmpLastService empService;

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

    @PostMapping("/emp")
    public ResponseEntity<Emp> createEmp(@RequestBody Emp emp) {
        try {
            return new ResponseEntity<>(empService.save(emp), HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/emp/edit/{eno}")
    public ResponseEntity<Emp> updateEmp(@PathVariable int eno, @RequestBody Emp emp) {
        try {
            return new ResponseEntity<>(empService.save(emp), HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<Emp> deleteEmp(@PathVariable int eno) {
        boolean success = empService.removeById(eno);
        try {
            if (success) {
                return new ResponseEntity<>(HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}