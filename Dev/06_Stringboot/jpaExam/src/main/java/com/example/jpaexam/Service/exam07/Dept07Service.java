package com.example.jpaexam.Service.exam07;

import com.example.jpaexam.Model.Dept;
import com.example.jpaexam.Repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
public class Dept07Service {
    @Autowired
    DeptRepository deptRepository;

    //    전체 조회 함수
    public List<Dept> findAll() {
        List<Dept> list = deptRepository.findAll();

        return list;
    }

    public Optional<Dept> findById(int dno) {
        Optional<Dept> optionalDept = deptRepository.findById(dno);

        return optionalDept;
    }

    //    insert 함수
    public Dept save(Dept dept) {
        //        JPA .save() 함수의 특징
        //        1) 기본키값이(부서번호) 없으면 insert
        //        2) 기본키값이(부서번호) 있으면 update
        Dept dept2 = deptRepository.save(dept); // insert 함수

        return dept2;
    }

    public void removeById(int id) {
        deptRepository.deleteById(id);
    }
}

