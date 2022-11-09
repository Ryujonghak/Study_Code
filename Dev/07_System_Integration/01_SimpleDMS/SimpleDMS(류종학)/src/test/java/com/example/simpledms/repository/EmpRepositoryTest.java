package com.example.simpledms.repository;

import com.example.simpledms.model.Dept;
import com.example.simpledms.model.Emp;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * packageName : com.example.simpledms.repository
 * fileName : EmpRepositoryTest
 * author : ryujonghak
 * date : 2022/11/04
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/11/04         ryujonghak          최초 생성
 */
@ExtendWith(SpringExtension.class) // 테스트 시 스프링 함수 또는 기능을 제공해줌.
@DataJpaTest // Repository 테스트를 위한 어노테이션, DB가 필요, 테스트 후 자동으로 롤백시켜줌.
//DB접근을 위한 어노테이션
//H 데이터베이스: 간이 DB(SPRINGBOOT에 있음)
//아래옵션은 외장 DB(ORACLE DB) 로 테스트 진행한다는 옵션
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class EmpRepositoryTest {
    @Autowired
    private EmpRepository empRepository;

    @Test
    void findAllByEnameContaining() {
//                1) 가짜 데이터 설정
        Optional<Emp> empOptional = Optional.ofNullable(Emp.builder()
                .ename("홍길동")
                .job("SALES")
                .manager(8888)
                .hiredate("1982-01-23 00:00:00")
                .salary(1300)
                .build());

//        임시로 가짜 데이터를 insert
        empRepository.save(empOptional.get());

//        2) 테스트 실행
        List<Emp> list = empRepository.findAllByEnameContaining("홍길동");

//        3) 테스트 검증
        assertThat(list.get(0).getEname()).isEqualTo("홍길동");
    }

    @Test
    void save() {
//        1) 가짜 데이터 설정
        Optional<Emp> empOptional = Optional.ofNullable(Emp.builder()
                .ename("홍길동")
                .job("SALES")
                .manager(8888)
                .hiredate("1982-01-23 00:00:00")
                .salary(1300)
                .build());

//        2) 테스트 실행
        Emp emp2 = empRepository.save(empOptional.get());

//        3) 테스트 검증
        assertThat(emp2.getEname()).isEqualTo("홍길동");
    }

    @Test
    void deleteAll() {
//        1) 가짜 데이터 설정
        Optional<Emp> empOptional = Optional.ofNullable(Emp.builder()
                .ename("홍길동")
                .job("SALES")
                .manager(8888)
                .hiredate("1982-01-23 00:00:00")
                .salary(1300)
                .build());

//      가짜 임시 데이터 insert
        empRepository.save(empOptional.get());

//        2) 테스트 실행 : 모두 삭제
        empRepository.deleteAll();

//        3) 테스트 검증
        assertThat(empRepository.findAll()).isEqualTo(Collections.emptyList());
    }

}
