package com.example.jpacustomexam.repository.exam07;

import com.example.jpacustomexam.dto.querydsl.EmpGroupQDto;
import com.example.jpacustomexam.model.exam04.Department;
import com.example.jpacustomexam.model.exam04.Employee;

import java.util.List;

/**
 * packageName : com.example.jpacustomexam.repository.exam07
 * fileName : Emp07RepositoryCustom
 * author : ryujonghak
 * date : 2022/10/27
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/27         ryujonghak          최초 생성
 */
public interface Emp07RepositoryCustom {
    List<Employee> querydslByeName(String ename);
    List<Employee> querydslByeNameAndJob(String ename, String job);

    List<EmpGroupQDto> querydslByGroupFunc();

    List<Employee> querydslbyCommision();
    List<Employee> querydslbyHiredateBetween();

    List<EmpGroupQDto> querydslByGroupFunc2();

    List<Employee> querydslByDynamicEnameJob(String ename, String job);

    List<Employee> LastQuerydsl(int num1, int num2);
}
