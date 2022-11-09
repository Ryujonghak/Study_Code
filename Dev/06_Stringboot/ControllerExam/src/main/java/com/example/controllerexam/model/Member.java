package com.example.controllerexam.model;

import lombok.*;

/**
 * packageName : com.example.controllerexam.model
 * fileName : Member
 * author : ryujonghak
 * date : 2022/10/14
 * description : 회원정보 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/14         ryujonghak          최초 생성
 */
// Model: Model, Service, DAO, DTO
//    Model: 정보 저장/검색을 위한 클래스, 속성/생성장/Getter/Setter
//    Lombok 라이브러리에서 제공하는 어노테이션(@)
    @Setter
    @Getter
    @ToString // ToString 함수를 자동 재정의, 객체의 메모리주소값이 아닌 속성의 값을 보여줌.
    @AllArgsConstructor // 모든 속성을 매개변수로 하는 생성자 자동 생성
    @NoArgsConstructor // 매개변수가 없는 생성자 자동 생성
public class Member {
//    속성 정의
    private String id;
    private String name;
}
