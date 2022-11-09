package com.example.jpacustomexam.controller.exam01;


import com.example.jpacustomexam.model.Dept;
import com.example.jpacustomexam.service.exam01.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


/**
 * packageName : com.example.jpaexam.controller.exam01
 * fileName : DeptController
 * author : ds
 * date : 2022-10-20
 * description : 부서 컨트롤러
 * 요약 :
 *      쿼리메서드: 자동으로 사용자 정의 SQL문을 생성해주는 함수
 *          목적: 기본 함수보다 다양한 SQL문을 작성하기 위해 사용
 *         사용법: 함수이름으로 SQL문을 작성함.
 *        ex) JPA 클래스 == 대상 테이블
 *            find == select
 *            all  == *
 *            by   == from
 *            속성  == where 컬럼
 *         orderBy == order by
 *         속성 desc == 컬럼 desc
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-20         ds          최초 생성
 */
@Slf4j
@RestController
@RequestMapping("/exam01")
public class DeptController {

    @Autowired // 스프링부트가 가동될 때 생성된 객체를 하나 받아오기.
    DeptService deptService;

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

    @PostMapping("/dept")
    public ResponseEntity<Object> createDept(@RequestBody Dept dept) {
        try {
            return new ResponseEntity<>(deptService.save(dept), HttpStatus.CREATED);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/dept/edit/{dno}")
    public ResponseEntity<Object> updateDept(@PathVariable int dno, @RequestBody Dept dept) {
        try {
            return new ResponseEntity<>(deptService.save(dept), HttpStatus.OK);
        } catch (Exception e) {
            log.debug(e.getMessage());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/dept/delete/{dno}")
    public ResponseEntity<Object> deleteDept(@PathVariable int dno) {
        try {
            boolean success = deptService.removeById(dno);
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

//    1) 쿼리 메서드 연습
    @GetMapping("/dept/desc")
    public ResponseEntity<Object> getDeptAllDesc() {
        try {
            List<Dept> list = deptService.findAllDesc();
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

    @GetMapping("/dept/desc2")
    public ResponseEntity<Object> getDeptAllDesc2() {
        try {
            List<Dept> list = deptService.findAllDesc2();
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

    @GetMapping("/dept/desc3/{dName}")
    public ResponseEntity<Object> getDeptAllDesc3(@PathVariable String dName) {
        try {
            List<Dept> list = deptService.findAllDesc3(dName);
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
}










