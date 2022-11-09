package com.example.jpacustomexam.repository;

import com.example.jpacustomexam.dto.DeptGroupDto;
import com.example.jpacustomexam.model.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * packageName : com.example.jpaexam.Repository
 * fileName : DeptRepository
 * author : ryujonghak
 * date : 2022/10/20
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/20         ryujonghak          최초 생성
 */
@Repository
public interface DeptRepository extends JpaRepository<Dept, Integer> {
    //    1) 쿼리 메서드
    List<Dept> findAllByOrderByDnoDesc(); // 전체조회 DNO 내림차순 정렬
    // sql 문  find: 검색, All: 전체, By: 고정, OrderBy: 정렬, Dno: 속성명, Desc: 내림차순

    List<Dept> findAllByOrderByDnameDesc(); // 전체조회 DNAME 내림차순 정렬

    List<Dept> findAllByDnameContaining(String dName);

    //    2) @Query 어노테이션
    //    @Query(): 2가지 1) 객체 쿼리
    //                   2) Native 쿼리(SQL문 작성)

    //    연습문제 1) 부서명(dname) like 검색하고 부서명으로 내림차순 조회
//    @Query(value = "select * from tb_dept td where td.dname like %:dname%", nativeQuery = true)
//    List<Dept> selectByDanme(@Param("dname") String dname);

    //    객체 쿼리: select 테이블명 from 객체명 where 객체.속성
//    특징: 1) from 다음에 나오는 대상 : 객체명(클래스명)
//         2) 객체명 또는 객체의 별명 / * << 사용못함
//         3) 컬럼명 -> 속성명
//         4) 대소문자 구별
//    장점: DB에 종속적이지 않음. (어느 DB든 붙여서 사용이 가능)
//    참고) 복잡 엄무 시스템: 분석함수 SQL문(Connect by, RANK 등)
    @Query(value = "select d"
            + " from Dept d"
            + " where d.dname like %:dname%")
    List<Dept> selectByDanme(@Param("dname") String dname);

    //    연습문제 2) 부서명(dname), 위치(loc)를 매개변수로 받아서 부서 정보를 조회하는 함수
    @Query(value = "select d "
            + " from Dept d"
            + " where d.dname LIKE %:dname% and d.loc LIKE %:loc% ")
    List<Dept> selectByDnameAndLoc(@Param("dname") String dname, @Param("loc") String loc);

    //    연습문제 3) 부서 테이블의 부서 번호를 SUM, AVG, MAX, MIN 값을 출력하는 함수를 작성하세요.
//    그룹함수 객체를 저장할 객체(클래스): DTO(Data Transfer Object) 클래스
//    NativeQuery 사용 시 DTO 인터페이스(Getter만 정의)  프로젝션 생성
//    객체Query 사용 시 DTO 클래스 생성
//    @Query(value = "SELECT SUM(d.dno) AS sumVar, " +
//            "AVG(d.dno) AS avgVar, " +
//            "MAX(d.dno) AS maxVar, " +
//            "MIN(d.dno) AS minVar " +
//            "FROM tb_dept d", nativeQuery = true)
//    List<DeptGroupDto> selectByGroupFunc();

    @Query(value = "SELECT SUM(d.dno) AS sumVar, " +
            "AVG(d.dno) AS avgVar, " +
            "MAX(d.dno) AS maxVar, " +
            "MIN(d.dno) AS minVar " +
            "FROM Dept d")
    List<DeptGroupDto> selectByGroupFunc();

    @Query(value = "SELECT CONCAT('부서번호는 ', d.dno) AS dnoVar " +
            ", CONCAT('부서명은 ', d.dname) AS dnameVar " +
            ", CONCAT('부서위치는 ', d.loc) AS locVar " +
            ", CONCAT('모든 부서정보를 출력했습니다.', '') AS textVar " +
            "FROM tb_dept d", nativeQuery = true)
    List<DeptGroupDto> selectByGroupFunc2();

    //    연습문제 4) SQL 기본 내장 함수를 사용하는 쿼리를 작성하고ㅛ 함수로 정의하세요.
    @Query(value = "SELECT UPPER(d.dname) AS UpperVar " +
            ",LOWER(d.dname) AS LowerVar " +
            ",Length(d.dname) AS LengthVar " +
            ",TRIM(' ORACLE Mania ') AS TrimVar " +
            ",Trunc(98.123) AS TruncVar " +
            ",Substr(d.dname, 1, 2) AS SubstrVar " +
            "FROM tb_dept d", nativeQuery = true)
    List<DeptGroupDto> selectByGroupFunc4();

//    연습문제 5) Case When / 부선번호가 20보다 같거나 작으면 '연말 보너스 100%' 출력 / 20보다 크면 '연말보너스 200%' 출력 / 둘다 아니면 '연말 보너스 없음'

    @Query(value ="SELECT D.DNO" +
            ", CASE WHEN D.DNO < 20 THEN '연말보너스: 100%' " +
            "WHEN D.DNO > 20 THEN '연말보너스: 200%' " +
            "else '연말보너스: 없음' " +
            "END AS IncentiveVar " +
            "FROM tb_dept D", nativeQuery = true)
    List<DeptGroupDto> searchDepCase();
}