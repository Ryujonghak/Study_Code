package com.example.jpacustomexam.dto;

import lombok.Getter;

/**
 * packageName : com.example.jpacustomexam.dto
 * fileName : DeptGroupDto
 * author : ryujonghak
 * date : 2022/10/24
 * description : 그룹 함수 용도 DTO 인터페이스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/24         ryujonghak          최초 생성
 */
public interface DeptGroupDto {
//    get << getter화를 무조건 시켜줘야 실행이 가능.

    //    sum
    Integer getSumVar();

    //    avg
    Double getAvgVar();

    //    max
    Integer getMaxVar();

    //    min
    Integer getMinVar();

    String getDnoVar();

    String getDnameVar();

    String getLocVar();

    String getTextVar();

    String getUpperVar();

    String getLowerVar();

    Integer getLengthVar();

    String getSubstrvar();

    String getTrimVar();

    String getTruncVar();

    String getIncentiveVar();
}
