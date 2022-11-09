package com.example.jpacustomexam.service.exam02;

import com.example.jpacustomexam.dto.DeptGroupDto;
import com.example.jpacustomexam.model.Dept;
import com.example.jpacustomexam.repository.DeptRepository;
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
public class Dept02Service {
    @Autowired
    DeptRepository deptRepository;

    public List<Dept> selectByDanme(String dName) {
        List<Dept> list = deptRepository.selectByDanme(dName);

        return list;
    }

    public List<Dept> selectByDnameAndLoc(String dName, String loc) {
        List<Dept> list = deptRepository.selectByDnameAndLoc(dName, loc);

        return list;
    }

    public List<DeptGroupDto> selectByGroupFunc() {
        List<DeptGroupDto> list = deptRepository.selectByGroupFunc();

        return list;
    }

    public List<DeptGroupDto> selectByGroupFunc2() {
        List<DeptGroupDto> list = deptRepository.selectByGroupFunc2();

        return list;
    }

    public List<DeptGroupDto> selectByGroupFunc4() {
        List<DeptGroupDto> list = deptRepository.selectByGroupFunc4();

        return list;
    }

    public List<DeptGroupDto> searchDepCase() {
        List<DeptGroupDto> list = deptRepository.searchDepCase();

        return list;
    }
}

