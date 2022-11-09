package com.example.jpaexam.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

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
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "SQ_EMP_GENERATOR", sequenceName = "SQ_EMP", initialValue = 1, allocationSize = 1)
@DynamicInsert
@DynamicUpdate

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
