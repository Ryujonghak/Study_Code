package com.example.jpacustomexam.service.exam07;

import com.example.jpacustomexam.dto.DeptEmpCDto;
import com.example.jpacustomexam.dto.DeptEmpDto;
import com.example.jpacustomexam.dto.querydsl.DeptGroupQDto;
import com.example.jpacustomexam.model.exam04.Department;
import com.example.jpacustomexam.repository.exam04.Dept04Repository;
import com.example.jpacustomexam.repository.exam07.Dept07Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
public class Dept07Service {
    @Autowired
    Dept07Repository deptRepository; // JPA CRUD 함수가 있는 인터페이스

    //    Join 결과 쿼리 함수
    public List<Department> querydslByDname(String dname) {
        List<Department> list = deptRepository.querydslByDname(dname);

        return list;
    }

    public List<Department> querydslByDnameAndLoc(String dname, String loc) {
        List<Department> list = deptRepository.querydslByDnameAndLoc(dname, loc);

        return list;
    }

    public List<DeptGroupQDto> querydslByGroupFunc() {
        List<DeptGroupQDto> list = deptRepository.querydslByGroupFunc();

        return list;
    }

    public List<Department> querydslByDeptGt(int dno) {
        List<Department> list = deptRepository.querydslByDeptGt(dno);

        return list;
    }

    public List<DeptGroupQDto> querydslByBasicFunc() {
        List<DeptGroupQDto> list = deptRepository.querydslByBasicFunc();

        return list;
    }

    public List<DeptGroupQDto> querydslByCaseWhen() {
        List<DeptGroupQDto> list = deptRepository.querydslByCaseWhen();

        return list;
    }

    @Transactional
    public List<DeptGroupQDto> querydslByGroupFunc2(long countDno) {
        List<DeptGroupQDto> list = deptRepository.querydslByGroupFunc2(countDno);

        return list;
    }

    @Transactional  //    DB 트랜잭션: 함수안에 CRUD 여러개가 섞여 있는 경우 모든 SQL문이 작동되고나서 마지막에 COMMIT 하는 방식
    public List<DeptEmpCDto> querydslByDnameJoin(String dname) {
        List<DeptEmpCDto> list = deptRepository.querydslByDnameJoin(dname);

        return list;
    }

    @Transactional //    DB 트랜잭션: 함수안에 CRUD 여러개가 섞여 있는 경우 모든 SQL문이 작동되고나서 마지막에 COMMIT 하는 방식
    public List<DeptEmpCDto> querydslByDnameJoin2(String dname) {
        List<DeptEmpCDto> list = deptRepository.querydslByDnameJoin2(dname);

        return list;
    }

    @Transactional //    DB 트랜잭션: 함수안에 CRUD 여러개가 섞여 있는 경우 모든 SQL문이 작동되고나서 마지막에 COMMIT 하는 방식
    public List<Department> querydslByDnoSub() {
        List<Department> list = deptRepository.querydslByDnoSub();

        return list;
    }

    @Transactional //    DB 트랜잭션: 함수안에 CRUD 여러개가 섞여 있는 경우 모든 SQL문이 작동되고나서 마지막에 COMMIT 하는 방식
    public List<Department> querydslByDnoSub2(int dno) {
        List<Department> list = deptRepository.querydslByDnoSub2(dno);

        return list;
    }

    @Transactional //    DB 트랜잭션: 함수안에 CRUD 여러개가 섞여 있는 경우 모든 SQL문이 작동되고나서 마지막에 COMMIT 하는 방식
    public List<Department> querydslByDynamicName(String dname, String loc) {
        List<Department> list = deptRepository.querydslByDynamicName(dname, loc);

        return list;
    }
}









