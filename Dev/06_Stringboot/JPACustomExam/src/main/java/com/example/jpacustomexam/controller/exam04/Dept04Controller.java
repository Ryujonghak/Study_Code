package com.example.jpacustomexam.controller.exam04;

import com.example.jpacustomexam.dto.DeptEmpCDto;
import com.example.jpacustomexam.dto.DeptEmpDto;

import com.example.jpacustomexam.service.exam04.Dept04Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

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
 * fileName : Dept07Controller
 * author : ds
 * date : 2022-10-21
 * description : 부서 컨트롤러 쿼리 메소드
 * 요약 :
 *     사용자 정의(Custom) 함수 : sql문 직접 개발자 작성하는 것 핵심
 *     1) 쿼리 메소드 : 자동으로 사용자 정의 sql문을 생성해주는 함수
 *          목적 : 기본 함수보다 다양한 sql문을 작성하기 위해 사용
 *         사용법 : 함수이름으로 sql 문장을 작성함 ( Repository 안에 함수명만 작성 )
 *         ex) JPA 클래스 == 대상 테이블
 *             find == select
 *             all  == *
 *             by   == from
 *             속성  == where 컬럼
 *          orderBy == order by
 *          속성 desc == 컬럼 desc
 *    2) @Query(value=쿼리문)함수명() : 쿼리문에 해당되는 부분을 직접 개발자가 작성 , 함수명() 중요하지 않음
 *       쿼리문의 매개변수 전달 -> select * from tb_dept where dno = :변수명
 *                             List<Dept> selectAll(@Param(변수명) 타입 변수명)
 *          2-1) nativeQuery = true : 일반 sql문으로 작성
 *          2-2) nativeQuery = false, 생략 :  객체 쿼리
 *                     ( 테이블명 , 컬럼명 대신 클래스명, 속성(필드)명 사용 )
 *    3) 페이징 처리 함수
 *       목적 : 전체 데이터를 화면에 출력하면 성능과 가독성이 떨어지므로 , 몇건씩 끊어서 보여주는것이
 *          목적
 *       속성 : page = 현재페이지, size = 1 페이지 당 보여줄 데이터 수 ( url 매개변수 전달 )
 *       페이징 객체 : 1) 매개변수 페이징 객체 : Pageable
 *                   2) 리턴될 페이징 객체 : Page<객체자료형>
 *       클라이언트로 전송할 데이터 : Map 자료구조 이용
 *          1) 데이터 : 부서, 사원 등
 *          2) currentPage : 현재 페이지 수
 *          3) totalItems : 전체 데이터 수
 *          4) totalPages : 전체 페이지 수
 *
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-21         ds          최초 생성
 */
// @RestController : return 값이 json 데이터 형태로 출력됨
@Slf4j
@RestController
@RequestMapping("/exam04")
public class Dept04Controller {
    @Autowired
    Dept04Service deptService;

    @GetMapping("/dept/native_join")
    public ResponseEntity<Object> selectNativeJoin() {
        try {
            List<DeptEmpDto> list = deptService.selectNativeJoin();

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

//    객체쿼리용 함수
    @GetMapping("/dept/join")
    public ResponseEntity<Object> selectJoin() {
        try {
            List<DeptEmpCDto> list = deptService.selectJoin();

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










