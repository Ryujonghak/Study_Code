package com.example.simpledms.model;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;

/**
 * packageName : com.example.simpledms.model
 * fileName : Customer
 * author : ryujonghak
 * date : 2022/11/08
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/11/08         ryujonghak          최초 생성
 */
@Entity
@Table(name = "TB_CUSTOMER")
@SequenceGenerator(
        name = "SQ_CUSTOMER_GENERATOR"
        , sequenceName = "SQ_CUSTOMER"
        , initialValue = 1
        , allocationSize = 1
)
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
@Where(clause = "DELETE_YN = 'N'")
@SQLDelete(sql = "UPDATE TB_CUSTOMER SET DELETE_YN = 'Y', DELETE_TIME = TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS') WHERE CID = ?")
public class Customer extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE
            , generator = "SQ_CUSTOMER_GENERATOR"
    )
    @Column(columnDefinition = "NUMBER")
    private Integer CID;
    @Column(columnDefinition = "VARCHAR2(255)")
    private String FIRST_NAME;
    @Column(columnDefinition = "VARCHAR2(255)")
    private String LAST_NAME;
    @Column(columnDefinition = "VARCHAR2(255)")
    private String EMAIL;
    @Column(columnDefinition = "VARCHAR2(255)")
    private String PHONE;
}
