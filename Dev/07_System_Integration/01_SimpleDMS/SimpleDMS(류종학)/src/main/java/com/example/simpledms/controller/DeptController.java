package com.example.simpledms.controller;


import com.example.simpledms.model.Dept;
import com.example.simpledms.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;


/**
 * packageName : com.example.jpaexam.controller.exam01
 * fileName : DeptController
 * author : ds
 * date : 2022-10-20
 * description : 부서 컨트롤러
 * 요약 :
 * 쿼리메서드: 자동으로 사용자 정의 SQL문을 생성해주는 함수
 * 목적: 기본 함수보다 다양한 SQL문을 작성하기 위해 사용
 * 사용법: 함수이름으로 SQL문을 작성함.
 * ex) JPA 클래스 == 대상 테이블
 * find == select
 * all  == *
 * by   == from
 * 속성  == where 컬럼
 * orderBy == order by
 * 속성 desc == 컬럼 desc
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-20         ds          최초 생성
 */
@Slf4j
@CrossOrigin(origins = "http://localhost:8080") // CORS(Web 포트 변경 불가) 법칙을 풀어줌
@RestController
@RequestMapping("/api")
public class DeptController {

    @Autowired // 스프링부트가 가동될 때 생성된 객체를 하나 받아오기.
    DeptService deptService;

    @GetMapping("/dept")
    public ResponseEntity<Object> find(@RequestParam(required = false) String dname) {
        try {
            List<Dept> list = Collections.emptyList(); // NULL 대신 초기화해주는 객체
//            1) dName == NULL 일 경우 전체 검색
            if (dname == null) {
                list = deptService.findAll(); //
            } else {
//            2) dName != NULL 일 경우 LIKE 검색
                dname = dname.toUpperCase();
                list = deptService.findAllByDnameContaining(dname);
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

    @DeleteMapping("/dept/all")
    public ResponseEntity<Object> deleteAll() {
        try {
            deptService.deleteAll();
//            삭제가 잘 진행되면 OK 메세지가 전송
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/dept")
    public ResponseEntity<Object> createDept(@RequestBody Dept dept) {
        try {
            Dept dept2 = deptService.save(dept);
            return new ResponseEntity<>(dept2, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/dept/{dno}")
    public ResponseEntity<Object> findById(@PathVariable int dno) {
        try {
            Optional<Dept> optionalDept = deptService.findById(dno);
            if (optionalDept.isPresent()) {
                return new ResponseEntity<>(optionalDept, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/dept/{dno}")
    public ResponseEntity<Object> updateDept(@PathVariable int dno, @RequestBody Dept dept) {
        try {
            Dept dept2 = deptService.save(dept);
            return new ResponseEntity<>(dept2, HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/dept/deletion/{dno}")
    public ResponseEntity<Object> deleteById(@PathVariable int dno) {
        try {
            boolean delif = deptService.deleteById(dno);
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