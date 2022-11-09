package com.example.jpacustomexam.dto;

import javax.persistence.Column;

/**
 * packageName : com.example.jpacustomexam.dto
 * fileName : BoardDto
 * author : ryujonghak
 * date : 2022/10/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/28         ryujonghak          최초 생성
 */
public interface BoardDto {
    Integer getBID();

    String getBOARD_TITLE();

    String getBOARD_CONTENT();

    String getBOARD_WRITER();

    Integer getVIEW_CNT();
}
