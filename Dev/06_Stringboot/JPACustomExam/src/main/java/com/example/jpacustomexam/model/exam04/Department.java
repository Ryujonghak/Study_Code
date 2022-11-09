package com.example.jpacustomexam.model.exam04;

import com.example.jpacustomexam.model.BaseTimeEntity;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * packageName : com.example.jpacustomexam.model.exam04
 * fileName : Department
 * author : ryujonghak
 * date : 2022/10/27
 * description : join 실습을 위한 부서 클래스, 관계맺기 @ManyToOne , @OneToMany
 * @ManyToOne: 단방향 join: (추천) -> 1인 부서테이블에 @OneToMany를 사용하지 않음, 사원테이블에만 @ManyToOne을 사용.
 *             양방향 join: (꼭 필요하다면 사용) -> 부서테이블에 @OneToMany를 사용, 사원테이블에도 @ManyToOne을 사용.
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/27         ryujonghak          최초 생성
 */
@Entity // 대상 클래스를 참고하여 DB에 물리 테이블을 생성함.
@Table(name = "TB_DEPARTMENT") // 테이블명을 지정.
@Getter
@Setter
@ToString(exclude = "employee") // 양방향 관게시 문제가 발생하기 때문에 옵션 exclude를 사용하여 예외처리해야함.
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name = "SQ_DEPARTMENT_GENERATOR", sequenceName = "SQ_DEPARTMENT", initialValue = 1, allocationSize = 1)
// null인 데이터를 무시해주는 어노테이션
@DynamicInsert
@DynamicUpdate
public class Department extends BaseTimeEntity {
    //    부서번호(dno), 부서명(dname), 위치(loc)
    @Id // 기본키 지정.
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DEPARTMENT_GENERATOR") // Oracle 시퀀스 사용
    private Integer dno;
    @Column(columnDefinition = "VARCHAR2(255)") // 칼럼 데이터 타입 지정.
    private String dname;
    @Column(columnDefinition = "VARCHAR2(255)") // 칼럼 데이터 타입 지정.
    private String loc;

//    양방향 관계를 위한 설정 추가
//    양방향 관계 특징:
//          1) Many 쪽 클래스 기본키 값이 있는 속성에 @ManyToOne 어노테이션 추가, FK 생성 및 관리.
//          2) One 쪽 클래스 추가할 테이블 배열에 @ONeToMany 어노테이션 추가
    @OneToMany(mappedBy = "department") // mappedBy: Join클래스의 @ManyToOne이 달린 속성명)
//    양방향 관계의 경우 Jackson(잭슨) 에러가 빈번하게 발생, @JsonManagedReference 어노테이션 사용
    @JsonManagedReference
//    private List<Employee> employee = new ArrayList<>();
    private Set<Employee> employee = new HashSet<>(); // 중복제거를 원할 경우
}
