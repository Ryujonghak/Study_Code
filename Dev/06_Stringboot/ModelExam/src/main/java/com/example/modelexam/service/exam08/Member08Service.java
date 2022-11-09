package com.example.modelexam.service.exam08;

import com.example.modelexam.dao.MemberDao;
import com.example.modelexam.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

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
public class Member08Service {
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
//    Optional 객체 추가
    public Optional<Member> findById(long eno) {
        Member member = memberDao.selectById(eno);

//        Optional 객체 추가
        Optional<Member> optionalMember = Optional.ofNullable(member);

        return optionalMember;
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
        } else {
//            1) 수정 날짜 추가
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

//            dept 객체의 updateTime 속성에 현재 날짜 저장
            member.setUpdateTime(LocalDateTime.now().format(dtf)); // 현재 데이터 생성시간 넣기

            list = memberDao.update(member); // 회원 정보 db 수정
        }

        return list;
    }

//    서비스 회원 삭제 함수
    public boolean removeById(int eno) {
        int iCount = memberDao.deleteById(eno); // 회원번호에 해당하는 데이터 삭제

        return (iCount > 0)? true : false;
    }

}






