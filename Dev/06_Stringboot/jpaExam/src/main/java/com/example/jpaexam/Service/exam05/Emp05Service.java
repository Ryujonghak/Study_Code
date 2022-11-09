package com.example.jpaexam.Service.exam05;

import com.example.jpaexam.Model.Emp;
import com.example.jpaexam.Repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName : com.example.jpaexam.Service.exam01
 * fileName : EmpService
 * author : ryujonghak
 * date : 2022/10/20
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/20         ryujonghak          최초 생성
 */
@Service
public class Emp05Service {
    @Autowired
    EmpRepository empRepository;

    public List<Emp> findAll() {
        List<Emp> list = empRepository.findAll();

        return list;
    }

    public Optional<Emp> findById(int eno) {
        Optional<Emp> optionalEmp = empRepository.findById(eno);

        return optionalEmp;
    }

    public Emp save(Emp emp) {
        Emp emp2 = empRepository.save(emp);

        return emp2;
    }
}
