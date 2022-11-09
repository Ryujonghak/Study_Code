package com.example.simpledms.controller;

import com.example.simpledms.model.Emp;
import com.example.simpledms.service.EmpService;
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

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * packageName : com.example.simpledms.controller
 * fileName : EmpControllerTest
 * author : ryujonghak
 * date : 2022/11/04
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/11/04         ryujonghak          최초 생성
 */
@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = EmpController.class)
class EmpControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmpService empService;

    ObjectMapper objectMapperper = new ObjectMapper();


    @DisplayName("find() 함수")
    @Test
    void find() throws Exception {
        List<Emp> list = new ArrayList<Emp>();
        list.add(Emp.builder().eno(7788).build());
//                .ename("SCOTT").job("ANALYST")
//                .manager(7566).hiredate("1987-07-13 00:00:00").salary(3000).commission(null).dno(20).build());

        given(empService.findAll()).willReturn(list);

        mockMvc.perform(get("/api/emp")) // 실행
                .andExpect(status().isOk()) // 결과 확인
                .andDo(print()); // 결과 출력
    }

    @DisplayName("deleteall() 함수")
    @Test
    void deleteAll() throws Exception {
        willDoNothing().given(empService).deleteAll();
//        willDoNothing(): 리턴값이 없는 메서드를 테스트 할 때 사용
        mockMvc.perform(delete("/api/emp/all"))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @DisplayName("createEmp() 함수")
    @Test
    void createEmp() throws Exception {
        Emp emp = Emp.builder().eno(7788).build();

        given(empService.save(emp))
                .willReturn(emp);
        mockMvc.perform(post("/api/emp")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapperper.writeValueAsString(emp)))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @DisplayName("findById() 함수")
    @Test
    void findById() throws Exception {
       Optional<Emp> optionalEmp = Optional.of(Emp.builder().eno(7788).build());

        given(empService.findById(anyInt()))
                .willReturn(optionalEmp);
        mockMvc.perform(get("/api/emp/7788"))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @DisplayName("updateEmp() 함수")
    @Test
    void updateEmp() throws Exception {
        Emp emp = Emp.builder().eno(7788).build();

        given(empService.save(emp))
                .willReturn(emp);
        mockMvc.perform(put("/api/emp/7788")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapperper.writeValueAsString(emp)))
                .andExpect(status().isOk())
                .andDo(print());
    }

    @DisplayName("deleteById() 함수")
    @Test
    void deleteById() throws Exception {
        given(empService.deleteById(anyInt()))
                .willReturn(true);
        mockMvc.perform(delete("/api/emp/deletion/7788")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andDo(print());
    }
}