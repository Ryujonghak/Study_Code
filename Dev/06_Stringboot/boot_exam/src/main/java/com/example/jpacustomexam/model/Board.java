package com.example.jpacustomexam.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * packageName : com.example.jpacustomexam.model
 * fileName : Board
 * author : ryujonghak
 * date : 2022/10/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/28         ryujonghak          최초 생성
 */
@Entity // 대상 클래스를 참고하여 DB에 물리 테이블을 생성함.
@Table(name = "TB_BOARD") // 테이블명을 지정.
@Getter
@Setter
@ToString(exclude = "comment")
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "SQ_BOARD_GENERATOR", sequenceName = "SQ_BOARD", initialValue = 1, allocationSize = 1)
// null인 데이터를 무시해주는 어노테이션
@DynamicInsert
@DynamicUpdate
public class Board extends BaseTimeEntity {
    @Id // 기본키 지정.
    @Column(columnDefinition = "NUMBER")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_BOARD_GENERATOR") // Oracle 시퀀스 사용
    private Integer bid;
    @Column(columnDefinition = "VARCHAR2(256)") // 칼럼 데이터 타입 지정.
    private String board_title;
    @Column(columnDefinition = "VARCHAR2(255)") // 칼럼 데이터 타입 지정.
    private String board_content;
    @Column(columnDefinition = "VARCHAR2(255)") // 칼럼 데이터 타입 지정.
    private String board_writer;
    @Column(columnDefinition = "NUMBER") // 칼럼 데이터 타입 지정.
    private Integer view_cnt;

    @OneToMany(mappedBy = "board") // mappedBy: Join클래스의 @ManyToOne이 달린 속성명)
//    양방향 관계의 경우 Jackson(잭슨) 에러가 빈번하게 발생, @JsonManagedReference 어노테이션 사용
    @JsonManagedReference
//    private List<Employee> employee = new ArrayList<>();
    private Set<Comment> comment = new HashSet<>(); // 중복제거를 원할 경우
}
