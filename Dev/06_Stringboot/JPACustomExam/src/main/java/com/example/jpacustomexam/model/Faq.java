package com.example.jpacustomexam.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * packageName : com.example.jpaexam.Model
 * fileName : Faq
 * author : ryujonghak
 * date : 2022/10/21
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/21         ryujonghak          최초 생성
 */
@Entity
@Table(name = "TB_FAQ")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "SQ_FAQ_GENERATOR",
        sequenceName = "SQ_FAQ,",
        initialValue = 1, allocationSize = 1)
@DynamicInsert
@DynamicUpdate
public class Faq extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "SQ_FAQ_GENERATOR")
    @Column(columnDefinition = "NUMBER")
    private Integer no;
    @Column(columnDefinition = "VARCHAR2(255)")
    private String title;
    @Column(columnDefinition = "VARCHAR2(255)")
    private Integer content;
}
