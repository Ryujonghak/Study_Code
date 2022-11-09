package com.example.jpacustomexam.model.exam05;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * packageName : com.example.jpacustomexam.model.exam05
 * fileName : Phone
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
@ToString(exclude = "person") // 양방향 관게시 문제가 발생하기 때문에 옵션 exclude를 사용하여 예외처리해야함.
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "SQ_PHONE_GENERATOR", sequenceName = "SQ_PHONE", initialValue = 1, allocationSize = 1)
// null인 데이터를 무시해주는 어노테이션
@DynamicInsert
@DynamicUpdate
public class Phone {
    @Id // 기본키 지정
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PHONE_GENERATOR") // Oracle 시퀀스 사용
    private Integer pno;
    @Column(columnDefinition = "VARCHAR2(255)")
    private String pname;
    @Column(columnDefinition = "VARCHAR2(255)")
    private String vendor;

//    Phone 클래스가 현재는 1대 1관계이지만 향후 1대 N관계로 변할수 있기 때문에 FK(참조/외래 키)를 생성
    @OneToOne(fetch = FetchType.LAZY) // N+1 문제 해결 옵션(FatchType.LAZY) 추가
    @JoinColumn(name = "no") // Join할 컬럼명
    @JsonBackReference
    private Person person;
}
