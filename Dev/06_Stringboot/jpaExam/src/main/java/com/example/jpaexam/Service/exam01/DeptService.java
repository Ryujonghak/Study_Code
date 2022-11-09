package com.example.jpaexam.Service.exam01;

import com.example.jpaexam.Model.Dept;
import com.example.jpaexam.Repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName : com.example.jpaexam.Service.exam01
 * fileName : DeptService
 * author : ryujonghak
 * date : 2022/10/20
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/20         ryujonghak          최초 생성
 */
@Service
public class DeptService {
    @Autowired
    DeptRepository deptRepository;

    //    전체 조회 함수
    public List<Dept> findAll() {
        List<Dept> list = deptRepository.findAll();

        return list;
    }
}
