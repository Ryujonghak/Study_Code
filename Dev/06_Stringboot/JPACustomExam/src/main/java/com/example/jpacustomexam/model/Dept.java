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
 * fileName : Dept
 * author : ryujonghak
 * date : 2022/10/19
 * description : 부서 모델(JPA: Entity)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/19         ryujonghak          최초 생성
 */

// JPA 매커니즘 : 클래스를 대상으로 테이블 자동 생성,
//          기본 제공하는 함수들은 자동으로 CRUD sql문을 만들어줌
//    sql문 작성에 필요한 노력을 절약함,
//    개발자는 제공하는 함수만 호출 -> sql 문 JPA 라이브러리가 알아서 생성해줌
// @Entity : 대상 클래스을 참고하여 DB에 물리 테이블을 생성함
// @Table(name = "테이블명") : 자동 생성 시 물리 테이블명으로 생성됨
// @SequenceGenerator(각종 속성) : Oracle DB 시퀀스 생성시 사용할 속성들
// @DynamicInsert : insert 시 null 인 컬럼 제외해서 sql 문 자동 생성함
// @DynamicUpdate : update 시 null 인 컬럼 제외해서 sql 문 자동 생성
// @Id : 기본키가 지정될 속성 -> DB에 기본키를 자동으로 만들어줌
// @Column(columnDefinition = "컬럼타입(개수)") : DB에 자동 생성될 테이블의 컬럼정보 직접 지정


@Entity // 대상 클래스를 참고하여 DB에 물리 테이블을 생성함.
@Table(name = "TB_DEPT") // 테이블명을 지정.
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "SQ_DEPT_GENERATOR", sequenceName = "SQ_DEPT", initialValue = 1, allocationSize = 1)
// null인 데이터를 무시해주는 어노테이션
@DynamicInsert
@DynamicUpdate
public class Dept extends BaseTimeEntity {
    //    부서번호(dno), 부서명(dname), 위치(loc)
    @Id // 기본키 지정.
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DEPT_GENERATOR") // Oracle 시퀀스 사용
    private Integer dno;
    @Column(columnDefinition = "VARCHAR2(255)") // 칼럼 데이터 타입 지정.
    private String dname;
    @Column(columnDefinition = "VARCHAR2(255)") // 칼럼 데이터 타입 지정.
    private String loc;
}
