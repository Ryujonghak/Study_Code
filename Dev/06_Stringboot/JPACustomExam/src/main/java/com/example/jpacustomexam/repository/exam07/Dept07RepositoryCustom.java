package com.example.jpacustomexam.repository.exam07;

import com.example.jpacustomexam.dto.DeptEmpCDto;
import com.example.jpacustomexam.dto.querydsl.DeptGroupQDto;
import com.example.jpacustomexam.model.Dept;
import com.example.jpacustomexam.model.exam04.Department;

import java.util.List;

/**
 * packageName : com.example.jpacustomexam.repository.exam07
 * fileName : Dept07RepositoryCustom
 * author : ryujonghak
 * date : 2022/10/27
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/27         ryujonghak          최초 생성
 */
public interface Dept07RepositoryCustom {
    List<Department> querydslByDname(String dname);

    List<Department> querydslByDnameAndLoc(String dname, String loc);

    List<DeptGroupQDto> querydslByGroupFunc();
    List<Department> querydslByDeptGt(int dno);

    List<DeptGroupQDto> querydslByBasicFunc();

    List<DeptGroupQDto> querydslByCaseWhen();

//    예제 7) 그룹 함수
    List<DeptGroupQDto> querydslByGroupFunc2(long countDno);

    List<DeptEmpCDto> querydslByDnameJoin(String dname);
    List<DeptEmpCDto> querydslByDnameJoin2(String dname);

    List<Department> querydslByDnoSub();
    List<Department> querydslByDnoSub2(int dno);
    List<Department> querydslByDynamicName(String dname, String loc);

}
