package com.example.simpledms.controller;

import com.example.simpledms.model.Dept;
import com.example.simpledms.service.DeptService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * packageName : com.example.simpledms.controller
 * fileName : DeptControllerTest
 * author : ryujonghak
 * date : 2022/11/03
 * description : Controller Test -> JUnit 으로 진행, Springboot 에서 기본으로 제공.
 * MVC 디자인 패턴 안에서 테스팅
 * 1) Controller Test : 서비스 객체역할을 대신해주는 객체(Mocking)를 생성 및 불러 테스트.
 * 2) Service Test
 * 3) Repository Test
 * MVC: 서로 역활을 분리해서 코딩(의존관계 제거, 가짜 객체(Mocking)이용), 테스팅: MVC 클래스간에 의존관계를 제거 후 독립적으로 테스트.
 *     @WebMvcTest(controllers = 대상_컨트롤러명.class) :
 *      @ExtendWith(SpringExtension.class 또는 가짜_객체.class) :
 *           테스팅할 때 스프링부트 기능 이용할 것인지를 정의 ( SpringExtension.class )
 *      MockMvc : 가짜 객체 클래스명 , @Autowired 로 객체를 하나 받아와야함
 *      @MockBean : 대상 변수에 가짜 객체를 넣어줌
 *   2) 테스트 절차 :
 *      1) 전제( given ) : 테스트에 대한 사전 조건 정의(결과 기대값 정의)
 *         given(함수()).willReturn(기댓값)
 *      2) 실행( when, perform() ) : 실제 테스트가 진행됨(테스트 함수 실행)
 *         perform(get(url)) : get 방식 테스트 실행
 *         perform(post(url).contentType(MediaType.APPLICATION_JSON).content(json데이터))
 *                      : post 방식 테스트 실행
 *         perform(put(url).contentType(MediaType.APPLICATION_JSON).content(json데이터))
 *                      : put 방식 테스트 실행
 *         perform(delete(url)) : delete 방식 테스트 실행
 *      3) 결과점검(then, andExpect(점검함수들()) ) : 테스트 결과를 알려줌, 테스팅 결과 점검
 *         점검함수 종류 :
 *           status().isOK() : 상태 메세지가 OK 로 나오는가?
 *           jsonPath(json_객체_경로).value(값) : json 객체 경로에 그 값이 있는가?
 *           그 외 기타 등등 : header(), cookie(), view(), model() 등등
 *         참고) jsonPath() : json 객체의 경로를 탐색하는 라이브러리 함수
 *              $ : json 루트 경로
 *              .(닷) : 속성명을 접근하는 접근자
 *              ex) {
 *                    "dname": "SALES",
 *                    "loc": "SEOUL"
 *                  }
 *                  => jsonPath($.dname).value("SALES") == "SALES"
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/11/03         ryujonghak          최초 생성
 */
@ExtendWith(SpringExtension.class) // Controller Test를 위한 어노테이션, URL 관련된 기능들을 사용할 수 있도록 함.
@WebMvcTest(controllers = DeptController.class)
class DeptControllerTest {

    //    가짜 객체 받기
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private DeptService deptService; // 서비스에 가짜 객체 넣기.

//    잭슨 가져오기
    ObjectMapper objectMapper = new ObjectMapper();

    @DisplayName("find(): 부서 정보 조회 함수")
    @Test
    void find() throws Exception {
//        1) 가짜 데이터 설정
        List<Dept> list = new ArrayList<Dept>();
//        Builder 디자인 패턴: 생성자를 대신해서 객체를 생성하는 기능
//        장범: 생성자보다 사용하기 편함, Lombok에서 지원함(@Builder).
//        모델.Builder().속성().속성()...build();
        list.add(Dept.builder().dno(10).dname("SALES").loc("SEOUL").build());
        list.add(Dept.builder().dno(20).dname("ACCOUNTING").loc("BUSAN").build());
//        2) given 설정: 가짜 데이터를 결과로 미리 예측
        given(deptService.findAll())
                .willReturn(list); //가짜로 만들어놓은 list가  return될것임을 예측
//        3) when 설정: 테스팅 실행 -> 결과 확인 -> 예측한 결과와 도출 결과가 같은지 확인(같으면 통관, 틀리면 실패)
        mockMvc.perform(get("/api/dept")) // URL 점검
                .andExpect(status().isOk()) // 실행 후 메세지 점검
                .andExpect(content().contentType(MediaType.APPLICATION_JSON)) // 데이터 타입이 맞는지 점검
                .andExpect(jsonPath("$.[0].dname").value("SALES")) // 데이터 내용 점검
                .andExpect(jsonPath("$.[1].dname").value("ACCOUNTING"))
                .andDo(print());
    }

    @Test
    void deleteAll() throws Exception {
        willDoNothing().given(deptService).deleteAll();
//        3) when 설정: 테스팅 실행 -> 결과 확인 -> 예측한 결과와 도출 결과가 같은지 확인(같으면 통관, 틀리면 실패)
        mockMvc.perform(delete("/api/dept/all"))
                .andExpect(status().isOk()) // 실행 후 메세지 점검
                .andDo(print());
    }

    @DisplayName("부서 생성함수 테스트")
    @Test
    void createDept() throws Exception {

        Dept dept = Dept.builder().dno(10).dname("SALES").loc("SEOUL").build();
//        2) given 설정: 가짜 데이터를 결과로 미리 예측
        given(deptService.save(any()))
                .willReturn(dept);
//        3) when 설정: 테스팅 실행 -> 결과 확인 -> 예측한 결과와 도출 결과가 같은지 확인(같으면 통관, 틀리면 실패)
        mockMvc.perform(post("/api/dept")
                        .contentType(MediaType.APPLICATION_JSON)
                                .content(objectMapper.writeValueAsString(dept)))
//                                .objectMapper.writeValueAsString(객체): 객체 To JSON 변환 -> 문자열로 또 다시 변환
//                        .content("{ \"dno\" : 10, \"dname\" : \"SALES\", \"loc\": \"SEOUL\"}")) // JSON 형태
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.dname").value("SALES"))
                .andDo(print());
    }

    @DisplayName("findById 테스트")
    @Test
    void findById() throws Exception {
//        1) 가짜 데이터 설정
        Optional<Dept> optionalDept = Optional.of(Dept.builder().dno(10).dname("SALES").loc("SEOUL").build());
//        2) given 설정: 가짜 데이터를 결과로 미리 예측
        given(deptService.findById(anyInt()))
                .willReturn(optionalDept); //가짜로 만들어놓은 list가  return될것임을 예측
//        3) when 설정: 테스팅 실행 -> 결과 확인 -> 예측한 결과와 도출 결과가 같은지 확인(같으면 통관, 틀리면 실패)
        mockMvc.perform(get("/api/dept/10")) // URL 점검
                .andExpect(status().isOk()) // 실행 후 메세지 점검
                .andExpect(content().contentType(MediaType.APPLICATION_JSON)) // 데이터 타입이 맞는지 점검
                .andExpect(jsonPath("$.dname").value("SALES")) // 데이터 내용 점검
                .andDo(print());
    }

    @Test
    void updateDept() throws Exception {
        Dept dept = Dept.builder().dno(30).dname("SALES").loc("SEOUL").build();
//        2) given 설정: 가짜 데이터를 결과로 미리 예측
        given(deptService.save(any()))
                .willReturn(dept);
//        3) when 설정: 테스팅 실행 -> 결과 확인 -> 예측한 결과와 도출 결과가 같은지 확인(같으면 통관, 틀리면 실패)
        mockMvc.perform(put("/api/dept/10")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{ \"dno\" : 30, \"dname\" : \"SALES\", \"loc\": \"SEOUL\"}")) // JSON 형태
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.dname").value("SALES"))
                .andDo(print());
    }

    @DisplayName("부서번호 삭제 함수 테스트")
    @Test
    void deleteById() throws Exception {
//        2) given 설정: 가짜 데이터를 결과로 미리 예측
        given(deptService.deleteById(anyInt()))
                .willReturn(true); //가짜로 만들어놓은 list가  return될것임을 예측
//        3) when 설정: 테스팅 실행 -> 결과 확인 -> 예측한 결과와 도출 결과가 같은지 확인(같으면 통관, 틀리면 실패)
        mockMvc.perform(delete("/api/dept/deletion/10") // URL 점검
                        .contentType(MediaType.APPLICATION_JSON)) // 데이터 타입이 맞는지 점검
                .andExpect(status().isOk()) // 실행 후 메세지 점검
                .andDo(print());
    }
}