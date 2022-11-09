package com.example.modelexam.service.exam01;

import com.example.modelexam.dao.MemberDao;
import com.example.modelexam.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * packageName : com.example.modelexam.service.exam01
 * fileName : MemberService
 * author : ds
 * date : 2022-10-17
 * description : 회원 업무 서비스 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-17         ds          최초 생성
 */
// @Service : 서버 가동시 스프링서버에서 객체를 만들어줌
//  객체를 만들어 주는 어노테이션 종류 : @Repository, @Component
@Service
public class MemberService {

//  @Autowired : 회원 DAO(memberDao) 객체 가져오기(스프링 컨테이너)
    @Autowired
    MemberDao memberDao;

    public List<Member> findAll() {
//         회원 정보 모두 가져오기 함수 실행
        List<Member> list = memberDao.selectAll();

        return list;
    }
}










