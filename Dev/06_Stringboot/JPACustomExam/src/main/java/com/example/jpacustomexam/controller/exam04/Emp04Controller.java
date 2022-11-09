
package com.example.jpacustomexam.controller.exam04;

import com.example.jpacustomexam.dto.DeptEmpDto;
import com.example.jpacustomexam.model.Emp;
import com.example.jpacustomexam.service.exam03.Emp03Service;
import com.example.jpacustomexam.service.exam04.Emp04Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
@RequestMapping("/exam04")
public class Emp04Controller {

    //    스프링부트 : DI(의존성 주입) ( @Autowired )
    @Autowired
    Emp04Service empService; // @Autowired : 스프링부트가 가동될때 생성된 객체를 하나 받아오기

    //  1)
    @GetMapping("/emp/native_join/{ename}")
    public ResponseEntity<Object> selectNativeJoin(@PathVariable String ename) {

        try {
            List<DeptEmpDto> list = empService.selectNativeJoin(ename);

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











