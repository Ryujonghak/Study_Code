package com.example.jpacustomexam.controller.exam07;

import com.example.jpacustomexam.dto.DeptEmpCDto;
import com.example.jpacustomexam.dto.querydsl.DeptGroupQDto;
import com.example.jpacustomexam.model.exam04.Department;
import com.example.jpacustomexam.service.exam07.Dept07Service;
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
 * fileName : Dept07Controller
 * author : ds
 * date : 2022-10-21
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-21         ds          최초 생성
 */
// @RestController : return 값이 json 데이터 형태로 출력됨
@Slf4j
@RestController
@RequestMapping("/exam07")
public class Dept07Controller {
    @Autowired
    Dept07Service deptService;

    @GetMapping("/dept/querydslByDname/{dname}")
    public ResponseEntity<Object> querydslByDname(@PathVariable String dname) {
        try {
            List<Department> list = deptService.querydslByDname(dname);

            if (list.isEmpty() == false) {
//                성공
                return new ResponseEntity<>(list, HttpStatus.OK);
            } else {
//                데이터 없음
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
//            서버 에러
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/dept/querydslByDnameAndLoc/{dname}/{loc}")
    public ResponseEntity<Object> querydslByDnameAndLoc(@PathVariable String dname, @PathVariable String loc) {
        try {
            List<Department> list = deptService.querydslByDnameAndLoc(dname, loc);

            if (list.isEmpty() == false) {
//                성공
                return new ResponseEntity<>(list, HttpStatus.OK);
            } else {
//                데이터 없음
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
//            서버 에러
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/dept/querydslByGroupFunc")
    public ResponseEntity<Object> querydslByGroupFunc() {
        try {
            List<DeptGroupQDto> list = deptService.querydslByGroupFunc();

            if (list.isEmpty() == false) {
//                성공
                return new ResponseEntity<>(list, HttpStatus.OK);
            } else {
//                데이터 없음
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
//            서버 에러
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/dept/querydslByDeptGt/{dno}")
    public ResponseEntity<Object> querydslByDeptGt(@PathVariable int dno) {
        try {
            List<Department> list = deptService.querydslByDeptGt(dno);

            if (list.isEmpty() == false) {
//                성공
                return new ResponseEntity<>(list, HttpStatus.OK);
            } else {
//                데이터 없음
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
//            서버 에러
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/dept/querydslByBasicFunc")
    public ResponseEntity<Object> querydslByBasicFunc() {
        try {
            List<DeptGroupQDto> list = deptService.querydslByBasicFunc();

            if (list.isEmpty() == false) {
//                성공
                return new ResponseEntity<>(list, HttpStatus.OK);
            } else {
//                데이터 없음
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
//            서버 에러
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/dept/querydslByCaseWhen")
    public ResponseEntity<Object> querydslByCaseWhen() {
        try {
            List<DeptGroupQDto> list = deptService.querydslByCaseWhen();

            if (list.isEmpty() == false) {
//                성공
                return new ResponseEntity<>(list, HttpStatus.OK);
            } else {
//                데이터 없음
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
//            서버 에러
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/dept/querydslByGroupFunc2/{countDno}")
    public ResponseEntity<Object> querydslByGroupFunc2(@PathVariable long countDno) {
        try {
            List<DeptGroupQDto> list = deptService.querydslByGroupFunc2(countDno);

            if (list.isEmpty() == false) {
//                성공
                return new ResponseEntity<>(list, HttpStatus.OK);
            } else {
//                데이터 없음
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
//            서버 에러
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/dept/querydslByDnameJoin/{dname}")
    public ResponseEntity<Object> querydslByDnameJoin(@PathVariable String dname) {
        try {
            List<DeptEmpCDto> list = deptService.querydslByDnameJoin(dname);

            if (list.isEmpty() == false) {
//                성공
                return new ResponseEntity<>(list, HttpStatus.OK);
            } else {
//                데이터 없음
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
//            서버 에러
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/dept/querydslByDnameJoin2/{dname}")
    public ResponseEntity<Object> querydslByDnameJoin2(@PathVariable String dname) {
        try {
            List<DeptEmpCDto> list = deptService.querydslByDnameJoin2(dname);

            if (list.isEmpty() == false) {
//                성공
                return new ResponseEntity<>(list, HttpStatus.OK);
            } else {
//                데이터 없음
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
//            서버 에러
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/dept/querydslByDnoSub")
    public ResponseEntity<Object> querydslByDnoSub() {
        try {
            List<Department> list = deptService.querydslByDnoSub();

            if (list.isEmpty() == false) {
//                성공
                return new ResponseEntity<>(list, HttpStatus.OK);
            } else {
//                데이터 없음
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
//            서버 에러
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/dept/querydslByDnoSub2/{dno}")
    public ResponseEntity<Object> querydslByDnoSub2(@PathVariable int dno) {
        try {
            List<Department> list = deptService.querydslByDnoSub2(dno);

            if (list.isEmpty() == false) {
//                성공
                return new ResponseEntity<>(list, HttpStatus.OK);
            } else {
//                데이터 없음
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
//            서버 에러
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/dept/querydslByDynamicName/{dname}/{loc}")
    public ResponseEntity<Object> querydslByDynamicName(@PathVariable String dname, @PathVariable String loc) {
        try {
//            다이나믹 테스트
            dname = null;
            loc = null;
            List<Department> list = deptService.querydslByDynamicName(dname, loc);

            if (list.isEmpty() == false) {
//                성공
                return new ResponseEntity<>(list, HttpStatus.OK);
            } else {
//                데이터 없음
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
        } catch (Exception e) {
//            서버 에러
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}










