package com.example.jpacustomexam.dto;

import lombok.*;

import javax.persistence.Column;

/**
 * packageName : com.example.jpacustomexam.dto
 * fileName : DeptEmpCDto
 * author : ryujonghak
 * date : 2022/10/27
 * description : 객체 쿼리(JPQL)의 결과를 저장할 DTO 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/27         ryujonghak          최초 생성
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DeptEmpCDto {
//    부서
    private Integer dno;
    private String dname;
    private String loc;
//    사원
    private Integer eno;
    private String ename;
    private String job;
    private Integer manager;
    private Integer salary;
    private String hiredate;
    private Integer commission;

//    생성자를 이용하여 필요한 속성만 출력
    public DeptEmpCDto(Integer dno, String dname, String loc, Integer eno, String ename, Integer salary) {
        this.dno = dno;
        this.dname = dname;
        this.loc = loc;
        this.eno = eno;
        this.ename = ename;
        this.salary = salary;
    }
}
