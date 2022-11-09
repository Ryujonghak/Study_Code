package com.example.simpledms.service;

import com.example.simpledms.model.Dept;
import com.example.simpledms.repository.DeptRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * packageName : com.example.simpledms.service
 * fileName : DeptServiceTest
 * author : ryujonghak
 * date : 2022/11/04
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/11/04         ryujonghak          최초 생성
 */
@ExtendWith(MockitoExtension.class)
class DeptServiceTest {

    @Mock
    private DeptRepository deptRepository; //@Mock 에 붙이는 가짜 레파지토리

    @InjectMocks
    private DeptService deptService; // @InjectMocks : 가짜 레파지토리를 사용해서 서비스를 쓸수있게 만듦

    @DisplayName("findall() method")
    @Test
    void findAll() {
        List<Dept> list = new ArrayList<>();

        list.add(Dept.builder()
                .dno(10)
                .dname("SALES")
                .loc("SEOUL")
                .build() // .build() 마지막에 무조건 호출해서 객체가 생성됨
        );
        list.add(Dept.builder()
                .dno(20)
                .dname("ACCOUNTING")
                .loc("BUSAN")
                .build());

        //1) given() : 기대값을 설정함
        given(deptRepository.findAll()).willReturn(list);

        //2) 테스트 실행
        List<Dept> list2 = deptService.findAll();

        //3) 결과 검증(검토) : assert(), assertThat()
        assertThat(list2.get(0).getDname()).isEqualTo(list.get(0).getDname());
//        assertThat(테스트 실행 값).비교함수(equal 등): 일치하면 통과 아니면 실패
    }

    @DisplayName("deleteAll() method")
    @Test
    void deleteAll() {
//        1) 테스트 실행
        deptService.deleteAll();
//        2) 함수가 몇 번 실행되었는지 확인
        verify(deptRepository, times(1)).deleteAll();
//        verify(Repository객체 , times(횟수)).함수();
    }

    @DisplayName("save() method")
    @Test
    void save() {
        Dept dept = Dept.builder().dno(10).dname("SALES").loc("SEOUL").build(); // 테스트 기대 값 설정
        given(deptService.save(any())).willReturn(dept);

        Dept dept2 = deptService.save(dept); // 함수 실행

        assertThat(dept2.getDname()).isEqualTo(dept.getDname()); // 테스트 결과 점검
    }


    @Test
    void findById() {
        Optional<Dept> optionalDept = Optional.ofNullable(Dept.builder()
                .dno(10).build());

        given(deptRepository.findById(anyInt())).willReturn(optionalDept);
        Optional<Dept> optionalDept2 = deptService.findById(anyInt());

        assertThat(optionalDept2.get().getDname()).isEqualTo(optionalDept.get().getDname()); //
    }

    @Test
    void deleteById() {
        given(deptRepository.existsById(anyInt())).willReturn(true);

        boolean bSuccess = deptService.deleteById(anyInt());

        verify(deptRepository, times(1)).deleteById(anyInt());
        assertThat(bSuccess).isEqualTo(true);
    }

    @Test
    void findAllByDnameContaining() {
//                1) 기댓값 설정,
        List<Dept> list = new ArrayList<>();

        list.add(Dept.builder().dno(10)
                .dname("SALES")
                .loc("SEOUL")
                .build()
        );

        list.add(Dept.builder().dno(20)
                .dname("ACCOUNTING")
                .loc("PUSAN")
                .build()
        );

        given(deptRepository.findAllByDnameContaining(any())).willReturn(list);

//        2) 테스트 실행
        List<Dept> list2 = deptService.findAllByDnameContaining(any());

//        3) 테스트 검증
        assertThat(list2.get(0).getDname()).isEqualTo("SALES");
        assertThat(list2.get(1).getDname()).isEqualTo("ACCOUNTING");
    }
}