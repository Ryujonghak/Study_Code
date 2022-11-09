package com.example.jpacustomexam.dto.querydsl;

import lombok.*;

/**
 * packageName : com.example.jpacustomexam.dto.querydsl
 * fileName : DeptGroupQDto
 * author : ryujonghak
 * date : 2022/10/28
 * description : Querydsl에서 사용하는 DTO(Data Transfer Object)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/28         ryujonghak          최초 생성
 */
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class EmpGroupQDto {
//    Sum, Avg, Max, Min
    Integer sumVar, maxVar, minVar, dno;
    Double avgVar;
    Long countVar; // Querydsl에서는 long을 사용
    String job;
}
