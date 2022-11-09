package com.example.jpacustomexam.service.exam07;

import com.example.jpacustomexam.dto.DeptEmpDto;
import com.example.jpacustomexam.dto.querydsl.EmpGroupQDto;
import com.example.jpacustomexam.model.exam04.Employee;
import com.example.jpacustomexam.repository.exam04.Emp04Repository;
import com.example.jpacustomexam.repository.exam07.Emp07Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName : com.example.jpaexam.service.exam01
 * fileName : EmpService
 * author : ds
 * date : 2022-10-20
 * description : Emp 서비스 클래스 ( 업무 로직 짜는 클래스 )
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-20         ds          최초 생성
 */
@Service
public class Emp07Service {

    @Autowired
    Emp07Repository empRepository;

    //    1)
    public List<Employee> querydslByeName(String ename) {
        List<Employee> list = empRepository.querydslByeName(ename);

        return list;
    }

    public List<Employee> querydslByeNameAndJob(String ename, String job) {
        List<Employee> list = empRepository.querydslByeNameAndJob(ename, job);

        return list;
    }

    public List<EmpGroupQDto> querydslByGroupFunc() {
        List<EmpGroupQDto> list = empRepository.querydslByGroupFunc();

        return list;
    }

    public List<Employee> querydslbyCommision() {
        List<Employee> list = empRepository.querydslbyCommision();

        return list;
    }

    public List<Employee> querydslbyHiredateBetween() {
        List<Employee> list = empRepository.querydslbyHiredateBetween();

        return list;
    }

    public List<EmpGroupQDto> querydslByGroupFunc2() {
        List<EmpGroupQDto> list = empRepository.querydslByGroupFunc2();

        return list;
    }

    public List<Employee> querydslByDynamicEnameJob(String ename, String job) {
        List<Employee> list = empRepository.querydslByDynamicEnameJob(ename, job);

        return list;
    }

    public List<Employee> LastQuerydsl(int num1, int num2) {
        List<Employee> list = empRepository.LastQuerydsl(num1, num2);

        return list;
    }
}











