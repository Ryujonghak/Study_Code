package com.example.simpledms.model;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

/**
 * packageName : com.example.jpaexam.Model
 * fileName : Emp
 * author : ryujonghak
 * date : 2022/10/20
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/20         ryujonghak          최초 생성
 */
@Entity
@Table(name = "TB_EMP")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "SQ_EMP_GENERATOR", sequenceName = "SQ_EMP", initialValue = 1, allocationSize = 1)
@DynamicInsert
@DynamicUpdate
// soft delete: 삭제하는 척만 하기(화면에서는 안보이고, DB는 데이터를 삭제하지 않음.)
// 법정 의무 보관 기간을 위해 실제 데이터를 삭제하지 않음
// 사용법 1) @SQLDelete(sql="update문") : delete 문이 실행되지 않고, 매개변수의 update 문이 실행되게함
//       2) @Where(clause="강제조건") : 대상클래스에 @붙이면 sql문 실행 시 강제 조건이 붙어 실행됨
@Where(clause = "DELETE_YN = 'N'")
@SQLDelete(sql="UPDATE TB_EMP SET DELETE_YN = 'Y', DELETE_TIME = TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') WHERE ENO = ?")
public class Emp extends BaseTimeEntity {
    @Id
    @Column(columnDefinition = "NUMBER")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_EMP_GENERATOR")
    private Integer eno;
    @Column(columnDefinition = "VARCHAR2(255)")
    private String ename;
    @Column(columnDefinition = "VARCHAR2(255)")
    private String job;
    @Column(columnDefinition = "NUMBER")
    private Integer manager;
    @Column(columnDefinition = "NUMBER")
    private Integer salary;
    @Column(columnDefinition = "VARCHAR2(255)")
    private String hiredate;
    @Column(columnDefinition = "NUMBER")
    private Integer commission;
    @Column(columnDefinition = "NUMBER")
    private Integer dno;

}
