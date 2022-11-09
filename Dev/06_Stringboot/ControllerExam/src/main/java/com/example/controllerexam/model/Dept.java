package com.example.controllerexam.model;

import lombok.*;

/**
 * packageName : com.example.controllerexam.model
 * fileName : Department
 * author : ryujonghak
 * date : 2022/10/14
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/14         ryujonghak          최초 생성
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    Integer dNo;
    String dName;
    String loc;
}
