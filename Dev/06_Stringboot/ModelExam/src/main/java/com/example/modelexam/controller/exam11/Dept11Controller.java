package com.example.modelexam.controller.exam11;

import com.example.modelexam.model.Dept;
import com.example.modelexam.service.exam10.Dept10Service;
import com.example.modelexam.service.exam11.Dept11Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * packageName : com.example.modelexam.controller.exam07
 * fileName : Dept07Controller
 * author : ds
 * date : 2022-10-18
 * description : @RestController 이용 , ResponseEntity, getDeptAll()
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-18         ds          최초 생성
 */
// @RestController : Vue + Springboot 연동 프로그램에서 사용
//    특징 : return 값 json 데이터임
// 참고) Slf4j : ( Simple Logging facade for java ) , facade 디자인 패턴이용해서 제작됨
@Slf4j
@RestController
@RequestMapping("/exam11")
public class Dept11Controller {

    @Autowired
    Dept11Service deptService; // 스프링에서 생성된 객체 받아오기 ( @Autowired )

    @GetMapping("/dept")
    public ResponseEntity<Object> getDeptAll() {

        try {
            List<Dept> list = deptService.findAll(); // 전체 부서 정보 조회

            if (list.isEmpty() == false) {
//                성공 메세지 + 객체 전송
                return new ResponseEntity<>(list, HttpStatus.OK);
            } else {
//                데이터가 없음
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            log.info(e.getMessage()); // 에러 로그 찍기
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //    부서번호(dno)로 조회하기 함수
    @GetMapping("/dept/{dno}")
    public ResponseEntity<Object> getDeptId(@PathVariable long dno) {

        try {
            Optional<Dept> optionalDept = deptService.findById(dno); // 전체 부서 정보 조회

            if (optionalDept.isPresent() == true) {
//                성공 메세지 + 객체 전송
//                옵셔널객체.get() : 옵셔널 객체안에 들어있는 부서객체가 나옴
                return new ResponseEntity<>(optionalDept.get(), HttpStatus.OK);
            } else {
//                데이터가 없음
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            log.info(e.getMessage()); // 에러 로그 찍기
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //  새로운 부서 정보 생성 함수 : insert 함수 ( @PostMapping )
//    @RequestBody : 클라이언트 쪽에서 전송한 객체정보를(json 데이터) 함수 매개변수로(부서객체) 전달
    @PostMapping("/dept")
    public ResponseEntity<Object> createDept(@RequestBody Dept dept) {

        try {
//            .save(객체) : 객체에 키가(부서번호) 없으면 insert , 있으면 update 로직이 있음
            List<Dept> list = deptService.save(dept);

            return new ResponseEntity<>(list, HttpStatus.CREATED);

        } catch (Exception e) {
            log.info(e.getMessage()); // 에러발생시 에러 메세지 콘솔 출력
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // 서버 에러 메세지전송
        }
    }

    //    부서번호에 해당하는 부서를 수정하는 함수
    //    클라이언트에서 전송할 데이터: 부서번호, 수정될 객체
    //    @PathVariable: 1개의 변수 값을 받는 어노테이션
    @PutMapping("/dept/edit/{dno}")
    public ResponseEntity<Object> updateDept(@PathVariable int dno, @RequestBody Dept dept) {
        try {
            //    서비스 클래스의 .save(): 매개변수의 키값(dno)가 없으면 insert 문 실행 있으면 update 문 실행
            List<Dept> list = deptService.save(dept);

            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            log.info(e.getMessage()); // 에러발생시 에러 메세지 콘솔 출력
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // 서버 에러 메세지전송
        }
    }

    //    부서번호에 해당하는 부서정보 삭제 함수: delete 함수
    @DeleteMapping("/dept/delete/{dno}")
    public ResponseEntity<Object> deleteDept(@PathVariable int dno) {
        try {
            //    서비스 클래스의 .save(): 매개변수의 키값(dno)가 없으면 insert 문 실행 있으면 update 문 실행
            boolean bSuccess = deptService.removeById(dno);
            if (bSuccess) {
//                delete문이 성공했을 경우
                return new ResponseEntity<>(HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
            log.info(e.getMessage()); // 에러발생시 에러 메세지 콘솔 출력
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); // 서버 에러 메세지전송
        }
    }
}









