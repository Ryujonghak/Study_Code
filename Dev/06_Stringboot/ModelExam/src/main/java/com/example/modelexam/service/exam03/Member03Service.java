package com.example.modelexam.service.exam03;

import com.example.modelexam.dao.MemberDao;
import com.example.modelexam.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class Member03Service {
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
    public List<Member> save(Member member) {
        List<Member> list = memberDao.insert(member);

        return list;
    }
}






