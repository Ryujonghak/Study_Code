package com.example.modelexam.controller.exam01;

import com.example.modelexam.model.Dept;
import com.example.modelexam.service.exam01.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * packageName : com.example.modelexam.controller
 * fileName : DeptController
 * author : ds
 * date : 2022-10-17
 * description : 부서 컨트롤러 findAll() 함수, @Slf4j
 *  요약 :
 *     @Slf4j : 로깅 라이브러리 어노테이션 (롬북) , 인터페이스 <- Logback / log4j2 (구현 클래스 로깅)
 *    사용법  ex) 1) @Slf4j 클래스 위에 달고
 *               2) 로깅을 하고 싶은 라인에서 log.debug(변수.toString());
 *     설치된 로깅 라이브러리 : Logback 설치파일 2개 복사, build.gradle 라이브러리 추가 (4개)
 *    @Service : 클래스 위에 달고, @Service 달린 클래스는 스프링부트에서 서버 기동시 자동 객체를 생성함
 *              생성된 객체는 스프링 컨테이너에서 관리됨(생성된 객체 : 싱글톤(공유객체))
 *      유사 어노테이션 : @Repository, @Component 등
 *    @Autowired : 위에서 생성된 객체가 필요하면 @Audowired 를 변수위에 달면 생성된 객체를 1개 받을 수 있음
 *    @GetMapping : Get 방식으로 오는 요청에 대해 실행되는 어노테이션, 주로 함수위에 달며,
 *              Get + URL 일치여부를 확인후 @달린 함수가 실행됨 ( Select 문 실행 )
 *    @PostMapping : Post 방식으로 오는 요청에 대해 실행되는 어노테이션, 주로 함수위에 달며,
 *              Post + URL 일치여부를 확인후 @달린 함수가 실행됨 ( insert 문 실행 )
 *    @PutMapping : Put 방식으로 오는 요청에 대해 실행되는 어노테이션, 주로 함수위에 달며,
 *              Put + URL 일치여부를 확인후 @달린 함수가 실행됨  ( update 문 실행 )
 *    @DeleteMapping : Delete 방식으로 오는 요청에 대해 실행되는 어노테이션, 주로 함수위에 달며,
 *              Delete + URL 일치여부를 확인후 @달린 함수가 실행됨  ( delete 문 실행 )
 *              *    @Controller : return 값이 이동할 "html 페이지 경로" , SSR(Server Side Rendering) 프로그램 사용
 *                ex) JSP/thymeleaf + Springboot 통합 프로그램
 *    @RestController(*) : return 값이 json 데이터로 클라이언트에 전송됨, CSR(Client Side Rendering)
 *                ex) Vue/React + Springboot 연동 프로그램
 *    ResponseEntity : 객체 + 상태메세지 함께 클라이언트에 전송함, 프로그램 품질 향상을 사용
 *       1) 생성자 : return new ResponseEntity(객체 , 상태메세지 )
 *                  return new ResponseEntity( 상태메세지 )
 *       2) 함수(builder) 이용
 *       상태 메세지 : HttpStatus.OK (성공 : 200)
 *                   HttpStatus.NO_CONTENT (데이터없음 : 204)
 *                   HttpStatus.NOT_FOUND (데이터없음 : 404)
 *                   HttpStatus.INTERNAL_SERVER_ERROR (서버에러 : 400)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-17         ds          최초 생성
 */
// 로깅 라이브러리 : log4j (결함 발생) -> log4j2 -> logback
@Slf4j
@Controller
// @RequestMapping(공통 url)
@RequestMapping("/exam01")
public class DeptController {

//    컨트롤러 역할 : 서비스 와 웹브라우저의 중간 역할
    @Autowired
    DeptService deptService; // 스프링부트 컨테이너의 deptService 객체 하나 받아오기

    @GetMapping("/dept")
    public String getDeptAll(Model model) {

        List<Dept> list = deptService.findAll(); // 모든 부서 정보를 배열에 저장
        model.addAttribute("list", list);

//       (정보가 제일 많음) trace > debug > info > warn > error (정보가 제일 작음) : 로깅 레벨
        log.debug(list.toString()); // list 에 무슨 값이 있을까?

        return "exam01/dept_all.html"; // dept_all.html 홈페이지로 이동
    }
}











