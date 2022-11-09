package com.example.jpacustomexam.dto;

/**
 * packageName : com.example.jpacustomexam.dto
 * fileName : EmpGroupDto
 * author : ryujonghak
 * date : 2022/10/25
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/25         ryujonghak          최초 생성
 */
public interface EmpGroupDto {
    Integer getSumVar();

    //    avg
    Double getAvgVar();

    //    max
    Integer getMaxVar();
    String getHireMaxHVar();

    //    min
    Integer getMinVar();
    String getHireMinHVar();


    Integer getSumSalary();
    Integer getCountVar();

    Integer getDno();

    Integer getEno();

    String getEname();

    String getJob();

    Integer getManager();

    Integer getSalary();

    String getHiredate();

    Integer getCommission();


}
