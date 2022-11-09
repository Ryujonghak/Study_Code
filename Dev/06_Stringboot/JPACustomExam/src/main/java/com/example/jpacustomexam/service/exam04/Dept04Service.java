package com.example.jpacustomexam.service.exam04;

import com.example.jpacustomexam.dto.DeptEmpCDto;
import com.example.jpacustomexam.dto.DeptEmpDto;
import com.example.jpacustomexam.repository.exam04.Dept04Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * packageName : com.example.jpaexam.service.exam01
 * fileName : DeptService
 * author : ds
 * date : 2022-10-20
 * description : 부서 업무 서비스 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-20         ds          최초 생성
 */
@Service
public class Dept04Service {
    @Autowired
    Dept04Repository deptRepository; // JPA CRUD 함수가 있는 인터페이스
//    Join 결과 쿼리 함수
    public List<DeptEmpDto> selectNativeJoin() {
        List<DeptEmpDto> list = deptRepository.selectNativeJoin();

        return list;
    }

    public List<DeptEmpCDto> selectJoin() {
        List<DeptEmpCDto> list = deptRepository.selectJoin();

        return list;
    }
}









