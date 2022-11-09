
package com.example.jpacustomexam.controller.exam07;

import com.example.jpacustomexam.dto.DeptEmpDto;
import com.example.jpacustomexam.dto.querydsl.EmpGroupQDto;
import com.example.jpacustomexam.model.exam04.Employee;
import com.example.jpacustomexam.service.exam04.Emp04Service;
import com.example.jpacustomexam.service.exam07.Emp07Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * packageName : com.example.jpaexam.controller.exam07
 * fileName : Emp07Controller
 * author : ds
 * date : 2022-10-21
 * description : Emp Rest 컨트롤러
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-21         ds          최초 생성
 */
@Slf4j
@RestController
@RequestMapping("/exam07")
public class Emp07Controller {

    //    스프링부트 : DI(의존성 주입) ( @Autowired )
    @Autowired
    Emp07Service empService; // @Autowired : 스프링부트가 가동될때 생성된 객체를 하나 받아오기

    //  1)
    @GetMapping("/emp/querydslByeName/{ename}")
    public ResponseEntity<Object> querydslByeName(@PathVariable String ename) {

        try {
            List<Employee> list = empService.querydslByeName(ename);

            if (list.isEmpty() == false) {
//                데이터 + 성공 메세지 전송
                return new ResponseEntity<>(list, HttpStatus.OK);
            } else {
//                데이터 없음 메세지 전송(클라이언트)
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

        } catch (Exception e) {
            log.debug(e.getMessage());
            // 서버에러 발생 메세지 전송(클라이언트)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/emp/querydslByeNameAndJob/{ename}/{job}")
    public ResponseEntity<Object> querydslByeNameAndJob(@PathVariable String ename, @PathVariable String job) {

        try {
            List<Employee> list = empService.querydslByeNameAndJob(ename, job);

            if (list.isEmpty() == false) {
//                데이터 + 성공 메세지 전송
                return new ResponseEntity<>(list, HttpStatus.OK);
            } else {
//                데이터 없음 메세지 전송(클라이언트)
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

        } catch (Exception e) {
            log.debug(e.getMessage());
            // 서버에러 발생 메세지 전송(클라이언트)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/emp/querydslByGroupFunc")
    public ResponseEntity<Object> querydslByGroupFunc() {

        try {
            List<EmpGroupQDto> list = empService.querydslByGroupFunc();

            if (list.isEmpty() == false) {
//                데이터 + 성공 메세지 전송
                return new ResponseEntity<>(list, HttpStatus.OK);
            } else {
//                데이터 없음 메세지 전송(클라이언트)
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

        } catch (Exception e) {
            log.debug(e.getMessage());
            // 서버에러 발생 메세지 전송(클라이언트)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/emp/querydslbyCommision")
    public ResponseEntity<Object> querydslbyCommision() {

        try {
            List<Employee> list = empService.querydslbyCommision();

            if (list.isEmpty() == false) {
//                데이터 + 성공 메세지 전송
                return new ResponseEntity<>(list, HttpStatus.OK);
            } else {
//                데이터 없음 메세지 전송(클라이언트)
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

        } catch (Exception e) {
            log.debug(e.getMessage());
            // 서버에러 발생 메세지 전송(클라이언트)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/emp/querydslbyHiredateBetween")
    public ResponseEntity<Object> querydslbyHiredateBetween() {

        try {
            List<Employee> list = empService.querydslbyHiredateBetween();

            if (list.isEmpty() == false) {
//                데이터 + 성공 메세지 전송
                return new ResponseEntity<>(list, HttpStatus.OK);
            } else {
//                데이터 없음 메세지 전송(클라이언트)
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

        } catch (Exception e) {
            log.debug(e.getMessage());
            // 서버에러 발생 메세지 전송(클라이언트)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/emp/querydslByGroupFunc2")
    public ResponseEntity<Object> querydslByGroupFunc2() {

        try {
            List<EmpGroupQDto> list = empService.querydslByGroupFunc2();

            if (list.isEmpty() == false) {
//                데이터 + 성공 메세지 전송
                return new ResponseEntity<>(list, HttpStatus.OK);
            } else {
//                데이터 없음 메세지 전송(클라이언트)
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

        } catch (Exception e) {
            log.debug(e.getMessage());
            // 서버에러 발생 메세지 전송(클라이언트)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/emp/querydslByDynamicEnameJob/{ename}/{job}")
    public ResponseEntity<Object> querydslByDynamicEnameJob(@PathVariable String ename, @PathVariable String job) {

        try {
//            ename = null;
            job = null;
            List<Employee> list = empService.querydslByDynamicEnameJob(ename, job);

            if (list.isEmpty() == false) {
//                데이터 + 성공 메세지 전송
                return new ResponseEntity<>(list, HttpStatus.OK);
            } else {
//                데이터 없음 메세지 전송(클라이언트)
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

        } catch (Exception e) {
            log.debug(e.getMessage());
            // 서버에러 발생 메세지 전송(클라이언트)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/emp/LastQuerydsl/{num1}/{num2}")
    public ResponseEntity<Object> LastQuerydsl(@PathVariable int num1, @PathVariable int num2) {

        try {
            List<Employee> list = empService.LastQuerydsl(num1, num2);

            if (list.isEmpty() == false) {
//                데이터 + 성공 메세지 전송
                return new ResponseEntity<>(list, HttpStatus.OK);
            } else {
//                데이터 없음 메세지 전송(클라이언트)
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

        } catch (Exception e) {
            log.debug(e.getMessage());
            // 서버에러 발생 메세지 전송(클라이언트)
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}











