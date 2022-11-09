package com.example.simpledms.service;

import com.example.simpledms.model.Emp;
import com.example.simpledms.repository.EmpRepository;
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
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

/**
 * packageName : com.example.simpledms.service
 * fileName : EmpServiceTest
 * author : ryujonghak
 * date : 2022/11/04
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/11/04         ryujonghak          최초 생성
 */
@ExtendWith(MockitoExtension.class)
class EmpServiceTest {
    @Mock
    private EmpRepository empRepository;

    @InjectMocks
    private EmpService empService;

    @DisplayName("findAll() test")
    @Test
    void findAll() {
        List<Emp> list = new ArrayList<>();

        list.add(Emp.builder().eno(7788).build());
        given(empRepository.findAll()).willReturn(list);

        List<Emp> list2 = empService.findAll();

        assertThat(list2.get(0).getEno()).isEqualTo(list.get(0).getEno());
    }

    @Test
    void deleteAll() {
        empService.deleteAll();

        verify(empRepository, times(1)).deleteAll();
    }

    @Test
    void save() {
        Emp emp = Emp.builder().eno(7788).build();
        given(empService.save(any())).willReturn(emp);

        Emp emp2 = empService.save(emp);
        assertThat(emp2.getEno()).isEqualTo(emp.getEno());
    }

    @Test
    void findById() {
        Optional<Emp> optionalEmp = Optional.ofNullable(Emp.builder()
                .eno(7788).build());
        given(empService.findById(anyInt())).willReturn(optionalEmp);
        Optional<Emp> optionalEmp2 = empService.findById(anyInt());

        assertThat(optionalEmp2.get().getEno()).isEqualTo(optionalEmp.get().getEno());
    }

    @Test
    void deleteById() {
        given(empRepository.existsById(anyInt())).willReturn(true);
        boolean bSuccess = empService.deleteById(anyInt());

        verify(empRepository, times(1)).deleteById(anyInt());
        assertThat(bSuccess).isEqualTo(true);
    }

    @Test
    void findAllByEnameContaining() {
        List<Emp> list = new ArrayList<>();
        list.add(Emp.builder().eno(7788).build());

        given(empRepository.findAllByEnameContaining(any())).willReturn(list);

        List<Emp> list2 = empService.findAllByEnameContaining(any());

        assertThat(list2.get(0).getEno()).isEqualTo(list.get(0).getEno());
    }
}