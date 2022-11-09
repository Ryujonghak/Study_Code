package com.example.jpacustomexam.model.exam05;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * packageName : com.example.jpacustomexam.model.exam05
 * fileName : Person
 * author : ryujonghak
 * date : 2022/10/27
 * description : @OneToOne 관계 설정을 위한 클래스 (한사람당 한개의 핸드폰 관계)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/27         ryujonghak          최초 생성
 */
@Entity // 대상 클래스를 참고하여 DB에 물리 테이블을 생성함.
@Table(name = "TB_PERSON") // 테이블명을 지정.
@Getter
@Setter
@ToString(exclude = "phone") // 양방향 관게시 문제가 발생하기 때문에 옵션 exclude를 사용하여 예외처리해야함.
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "SQ_PERSON_GENERATOR", sequenceName = "SQ_PERSON", initialValue = 1, allocationSize = 1)
// null인 데이터를 무시해주는 어노테이션
@DynamicInsert
@DynamicUpdate
public class Person {
    @Id // 기본키 지정
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PERSON_GENERATOR") // Oracle 시퀀스 사용
    private Integer no;
    @Column(columnDefinition = "VARCHAR2(255)")
    private String name;
    @Column(columnDefinition = "VARCHAR2(255)")
    private String job;

//    OneToOne 양방향 관계
    @OneToOne(mappedBy = "person")
    @JsonManagedReference
    private Phone phone;
}
