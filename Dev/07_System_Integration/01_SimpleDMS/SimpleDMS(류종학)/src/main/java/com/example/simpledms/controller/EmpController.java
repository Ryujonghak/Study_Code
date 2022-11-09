package com.example.simpledms.controller;

import com.example.simpledms.model.Emp;
import com.example.simpledms.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * packageName : com.example.simpledms.controller
 * fileName : EmpController
 * author : ryujonghak
 * date : 2022/11/02
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/11/02         ryujonghak          최초 생성
 */
@Slf4j
@CrossOrigin(origins = "http://localhost:8080") // CORS(Web 포트 변경 불가) 법칙을 풀어줌
@RestController
@RequestMapping("/api")
public class EmpController {
    @Autowired
    EmpService empService;

    @GetMapping("/emp")
    public ResponseEntity<Object> find(@RequestParam(required = false) String ename) {
        try {
            List<Emp> list = Collections.emptyList();
            if (ename == null) {
                list = empService.findAll();
            } else {
                ename = ename.toUpperCase();
                list = empService.findAllByEnameContaining(ename);
            }
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

    @DeleteMapping("/emp/all")
    public ResponseEntity<Object> deleteAll() {
        try {
            empService.deleteAll();
//            삭제가 잘 진행되면 OK 메세지가 전송
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/emp")
    public ResponseEntity<Object> createEmp(@RequestBody Emp emp) {
        try {
            Emp emp2 = empService.save(emp);
            return new ResponseEntity<>(emp2, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/emp/{eno}")
    public ResponseEntity<Object> findById(@PathVariable int eno) {
        try {
            Optional<Emp> optionalEmp = empService.findById(eno);
            if (optionalEmp.isPresent()) {
                return new ResponseEntity<>(optionalEmp, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/emp/{eno}")
    public ResponseEntity<Object> updateEmp(@PathVariable int eno, @RequestBody Emp emp) {
        try {
            Emp emp2 = empService.save(emp);
            return new ResponseEntity<>(emp2, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/emp/deletion/{eno}")
    public ResponseEntity<Object> deleteById(@PathVariable int eno) {
        try {
            boolean delif = empService.deleteById(eno);
            if (delif) {
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
