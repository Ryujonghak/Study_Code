package com.example.modelexam.service.exam04;

import com.example.modelexam.dao.MemberDao;
import com.example.modelexam.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * packageName : com.example.modelexam.service.exam02
 * fileName : Member02Service
 * author : ds
 * date : 2022-10-17
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-17         ds          최초 생성
 */
@Service
public class Member04Service {
    //  @Autowired : 회원 DAO(memberDao) 객체 가져오기(스프링 컨테이너)
    @Autowired
    MemberDao memberDao;

    public List<Member> findAll() {
//         회원 정보 모두 가져오기 함수 실행
        List<Member> list = memberDao.selectAll();

        return list;
    }

//    findById() 함수를 밑에 추가
//    eno 로 조회하는 함수
    public Member findById(long eno) {
        Member member = memberDao.selectById(eno);

        return member;
    }

//    save() 함수 추가
//    1) 사원 번호 자동 생성
//    2) 생성 날짜 추가
    public List<Member> save(Member member) {

        List<Member> list = null;

//        사원번호가 없으면 insert 문 실행
        if(member.getEno() == null) {
//            1) 사원 번호 자동 생성 : 8000 + count(현재 사원정보의 총건수)
            int count = memberDao.selectAll().size(); // 전체 건수
            int newEno = count + 8000; // 새로운 사원번호(8004)
            member.setEno(newEno); // 새로운 사원번호를 Member 객체의 eno 속성에 저장

//            2) 생성일자(등록일자) 추가
//            날짜 포맷 : yyyy-MM-dd HH:mm:ss
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            member.setInsertTime(LocalDateTime.now().format(dtf)); // 오늘 날짜(시간) 저장

            list = memberDao.insert(member); // DB 반영
        }

        return list;
    }

//
}






