package com.example.simpledms.service;

import com.example.simpledms.model.Emp;
import com.example.simpledms.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName : com.example.jpacustomexam.service.exam01
 * fileName : EmpService
 * author : ryujonghak
 * date : 2022/10/24
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/24         ryujonghak          최초 생성
 */
@Service
public class EmpService {

    @Autowired
    EmpRepository empRepository;

    public List<Emp> findAll() {
        List<Emp> list = empRepository.findAll();

        return list;
    }

    public void deleteAll() {
        empRepository.deleteAll();
    }

    public Emp save(Emp emp) {
        Emp emp2 = empRepository.save(emp);

        return emp2;
    }

    public Optional<Emp> findById(int eno) {
        Optional<Emp> optionalEmp = empRepository.findById(eno);

        return optionalEmp;
    }

    public boolean deleteById(int eno) {
        if(empRepository.existsById(eno)) {
            empRepository.deleteById(eno);

            return true;
        }

        return false;
    }

    public List<Emp> findAllByEnameContaining(String ename) {
        List<Emp> list = empRepository.findAllByEnameContaining(ename);

        return list;
    }
}
