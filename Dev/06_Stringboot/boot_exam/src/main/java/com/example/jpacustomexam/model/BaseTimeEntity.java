package com.example.jpacustomexam.model;

import lombok.Getter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * packageName : com.example.jpaexam.Model
 * fileName : BaseTimeEntity
 * author : ryujonghak
 * date : 2022/10/20
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/20         ryujonghak          최초 생성
 */
@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity  {
    private String insertTime;
    private String updateTime;

    //    감시 함수
    @PrePersist
    void onPrePersist() {
        this.insertTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    //    대상모델을 수정하기전 실행되는 함수
    @PreUpdate
    void onPreUpdate() {
        this.updateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        this.insertTime = this.updateTime;
    }
}
