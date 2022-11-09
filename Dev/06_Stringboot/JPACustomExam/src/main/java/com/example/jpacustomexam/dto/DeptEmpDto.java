package com.example.jpacustomexam.dto;

/**
 * packageName : com.example.jpacustomexam.dto
 * fileName : DeptEmpDto
 * author : ryujonghak
 * date : 2022/10/27
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/27         ryujonghak          최초 생성
 */
public interface DeptEmpDto {
     //    부서
     Integer getDno();
     String getDname();
     String getLoc();

     //    사원
     Integer getEno();
     String getEname();
     Integer getSalary();
}
