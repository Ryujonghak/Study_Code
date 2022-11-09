package com.example.simpledms.model;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

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
@Builder
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "SQ_DEPT_GENERATOR", sequenceName = "SQ_DEPT", initialValue = 1, allocationSize = 1)
// null인 데이터를 무시해주는 어노테이션
@DynamicInsert
@DynamicUpdate
// soft delete: 삭제하는 척만 하기(화면에서는 안보이고, DB는 데이터를 삭제하지 않음.)
// 법정 의무 보관 기간을 위해 실제 데이터를 삭제하지 않음
// 사용법 1) @SQLDelete(sql="update문") : delete 문이 실행되지 않고, 매개변수의 update 문이 실행되게함
//       2) @Where(clause="강제조건") : 대상클래스에 @붙이면 sql문 실행 시 강제 조건이 붙어 실행됨
@Where(clause = "DELETE_YN = 'N'")
@SQLDelete(sql="UPDATE TB_DEPT SET DELETE_YN = 'Y', DELETE_TIME = TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') WHERE DNO = ?")
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
