package com.example.simpledms.repository;

import com.example.simpledms.model.Dept;
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
 * fileName : DeptRepositoryTest
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
class DeptRepositoryTest {

    @Autowired
    private DeptRepository deptRepository;

    @Test
    void findAllByDnameContaining() {
        //가짜 데이터 생성
        Optional<Dept> ooptionalDept = Optional.ofNullable(Dept.builder()
                .dno(10)
                .dname("SALES")
                .loc("SEOUL")
                .build());

        //가짜 데이터를 insert
        Dept dept2 = deptRepository.save(ooptionalDept.get());

        //test 실행

        List<Dept> list = deptRepository.findAllByDnameContaining("SALES");

        //테스트 검증
        assertThat(list.get(0).getDname()).isEqualTo("SALES");
    }

    @Test
    void save() {
        Optional<Dept> ooptionalDept = Optional.ofNullable(Dept.builder()
                .dno(10)
                .dname("SALES")
                .loc("SEOUL")
                .build());

        //가짜 데이터를 insert
        Dept dept2 = deptRepository.save(ooptionalDept.get());


        //테스트 검증
        assertThat(dept2.getDname()).isEqualTo("SALES");
    }

    @Test
    void deleteAll() {
        Optional<Dept> ooptionalDept = Optional.ofNullable(Dept.builder()
                .dno(10)
                .dname("SALES")
                .loc("SEOUL")
                .build());

        //가짜 데이터를 insert
        Dept dept2 = deptRepository.save(ooptionalDept.get());

//        가짜 데이터 모두 삭제
        deptRepository.deleteAll();

        //테스트 검증
        assertThat(deptRepository.findAll()).isEqualTo(Collections.emptyList());
    }
}
