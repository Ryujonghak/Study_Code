package com.example.jpacustomexam.configuration;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * packageName : com.example.jpacustomexam.configuration
 * fileName : QuerydslConfig
 * author : ryujonghak
 * date : 2022/10/27
 * description : Querydsl을 위한 설정 파일
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/27         ryujonghak          최초 생성
 */
//@Configuration: 자바 클래스가 .properties 파일 같은 설정파일 용도로 사용.
@Configuration
public class QuerydslConfig {
    //    JPA 영속성 컨텍스트(관리 공간)
    @PersistenceContext
    private EntityManager entityManager;
//    @Service, @Repository, @Component 처럼 아래 @Bean을 달면 서버 기동시 객체로 생성.
    @Bean
//    주로 @Configuration 클래스에서 사용
    public JPAQueryFactory jpaQueryFactory() {
        return new JPAQueryFactory(entityManager);
    }
}
