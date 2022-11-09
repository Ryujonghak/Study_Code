package com.example.jpacustomexam.service.exam01;

import com.example.jpacustomexam.model.Emp;
import com.example.jpacustomexam.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    //    1) 전체 사원 조회 함수
    public List<Emp> findAll() {
        List<Emp> list = empRepository.findAll();

        return list;
    }

    //   2) 전체 사원 조회 함수
    public List<Emp> findAllByOrderByEnoDesc() {
        List<Emp> list = empRepository.findAllByOrderByEnoDesc();

        return list;
    }

    //  3)  전체 사원 조회 함수
    public List<Emp> findAllByEnameContainingOrderByEnameDesc(String ename) {
        List<Emp> list = empRepository.findAllByEnameContainingOrderByEnameDesc(ename);

        return list;
    }

    //  4)  전체 사원 조회 함수
    public List<Emp> findAllByJobContainingOrderByJobDesc(String ename) {
        List<Emp> list = empRepository.findAllByJobContainingOrderByJobDesc(ename);

        return list;
    }

    //  5)  전체 사원 조회 함수
    public List<Emp> findAllByJobAndDno(String job, int dno) {
        List<Emp> list = empRepository.findAllByJobAndDno(job, dno);

        return list;
    }

    //  6)
    public List<Emp> findAllBySalaryBetweenOrderByEname(int first, int last) {
        List<Emp> list = empRepository.findAllBySalaryBetweenOrderByEname(first, last);

        return list;
    }

    //  7)
    public List<Emp> findAllByJobIgnoreCase(String job) {
        List<Emp> list = empRepository.findAllByJobIgnoreCase(job);

        return list;
    }

    //    8)
    public List<Emp> findAllByCommissionIsNotNull() {
        List<Emp> list = empRepository.findAllByCommissionIsNotNull();

        return list;
    }

    //  9)
    public List<Emp> findAllByOrderBySalaryDescEnameAsc() {
        List<Emp> list = empRepository.findAllByOrderBySalaryDescEnameAsc();

        return list;
    }

    //    10)
    public List<Emp> findAllBySalaryLessThanOrSalaryGreaterThanOrderByEname(int first, int last) {
        List<Emp> list = empRepository.findAllBySalaryLessThanOrSalaryGreaterThanOrderByEname(first, last);

        return list;
    }

    public List<Emp> findAllByCommissionIn(int[] arrays) {
        List<Emp> list = empRepository.findAllByCommissionIn(arrays);

        return list;
    }

}
