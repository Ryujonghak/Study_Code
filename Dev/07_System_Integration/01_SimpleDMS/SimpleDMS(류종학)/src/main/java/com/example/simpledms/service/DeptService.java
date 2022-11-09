package com.example.simpledms.service;

import com.example.simpledms.model.Dept;
import com.example.simpledms.repository.DeptRepository;
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
public class DeptService {
    @Autowired
    DeptRepository deptRepository;

    public List<Dept> findAll() {
        List<Dept> list = deptRepository.findAll();

        return list;
    }

    public void deleteAll() {
        deptRepository.deleteAll();
    }

    //    부서정보 저장,수정 함수
    public Dept save(Dept dept) {
        Dept dept2 = deptRepository.save(dept);

        return dept2;
    }

    //    부서 번호로 조회하는 함수
    public Optional<Dept> findById(int dno) {
        Optional<Dept> optionalDept = deptRepository.findById(dno);

        Dept dept = optionalDept.get();
        dept.setDno(dept.getDno() + 100);

        return optionalDept;
    }

    //    부서번호로 삭제하는 함수
    public boolean deleteById(int dno) {
        if (deptRepository.existsById(dno)) { // DNO가 존재하는 확인
            deptRepository.deleteById(dno);
            return true; // DNO가 존재하여 삭제 후 true 리턴
        }
//        DNO가 존재하지않으면 false 리턴
        return false;
    }

    public List<Dept> findAllByDnameContaining(String dname) {
        List<Dept> list = deptRepository.findAllByDnameContaining(dname);

        return list;
    }
}

