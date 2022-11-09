package com.example.jpacustomexam.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * packageName : com.example.jpacustomexam.model
 * fileName : Content
 * author : ryujonghak
 * date : 2022/10/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/28         ryujonghak          최초 생성
 */
@Entity // 대상 클래스를 참고하여 DB에 물리 테이블을 생성함.
@Table(name = "TB_COMMENT") // 테이블명을 지정.
@Getter
@Setter
@ToString(exclude = "board")
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "SQ_COMMENT_GENERATOR", sequenceName = "SQ_COMMENT", initialValue = 1, allocationSize = 1)
// null인 데이터를 무시해주는 어노테이션
@DynamicInsert
@DynamicUpdate
public class Comment {
    @Id // 기본키 지정.
    @Column(columnDefinition = "NUMBER")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_COMMENT_GENERATOR")
    private Integer cid;
    @Column(columnDefinition = "VARCHAR2(3000)")
    private String comment_content;
    @Column(columnDefinition = "VARCHAR2(256)")
    private String comment_writer;
//    private Integer BID;

    @ManyToOne(fetch = FetchType.LAZY)
//    1) @ManyToOne을 옵션없이 사용 시 성능저하 발생: N+1 쿼리문제 발생(기본적으로 Eager로 설정이 되어있기 때문)
//    - N + 1 문제: 1st 쿼리 하나당 2nd 쿼리가 또 실행되어 성능이 대폭 저하되는 문제, join해서 쿼리해야 성능기 개선되지만, JPA 엔진이 해석을 못하는 문제.
//    - 일반적으로 쿼리(SQL)가 1개가 실행되야 하지만 JPA는 1개 쿼리(SQL문) 실행시 N개 SQL문이 추가로 실행됨.(오류)
//    추가) Eager(즉시 로딩): SQL문 1개식 실행할때마다 DB로 요청을 날림, LAZY(지연 로딩): SQL문 #N 마지막번째까지 실행 후 마지막에 Commit 시점에 한방에 DB로 날림.
//    2) 스프링에서 객체를 Json 데이터로 자동변환해서 클라이언트에 전송(REST API, @RESTController)해주는 기능 -> Jackson(잭슨)
//    - Jackson(잭슨)이 가진 문제: @ManyToOne 관계설정 시 변환에러가 발생함 -> 해결방법 어노테이션 사용) @JsonIgnore, @JsonBackreference
    @JoinColumn(name = "bid")
    @JsonBackReference
    private Board board;
}
