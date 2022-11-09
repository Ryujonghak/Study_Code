package com.example.controllerexam.model;

import lombok.*;

/**
 * packageName : com.example.controllerexam.model
 * fileName : Board
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
public class Board {
    private Integer no;
    private String title;
    private String content;
    private Integer count;
}
