-- 연습문제 1번 : 시퀀스 & 인덱스 실습
-- 1) 사원 테이블의 사원번호가 자동으로 생성되도록 시퀀스를 생성하시오.
--  시퀀스 이름 : SQ_EMP , 시작번호 : 1, 증가 : 1, 최대값 : 100000
-- 생성
CREATE SEQUENCE SQ_EMP INCREMENT BY 1 START WITH 1 MAXVALUE 100000;

-- 2) 사원번호를 시퀀스로부터 발급받으시오.
-- 임시 사원 테이블 : EMP01
--                  컬럼명 : EMPNO NUMBER(4) PRIMARY KEY,
--                          ENAME VARCHAR2(10),
--                          HIREDATE DATE
-- INSERT문을 이용해서 EMPNO에 시퀀스값을 추가 하시오.
-- (단, 이름이나 날짜는 임의로 하시오)
-- 생성
CREATE TABLE EMP01(
    EMPNO NUMBER(4) PRIMARY KEY,
    ENAME VARCHAR2(10),
    HIREDATE DATE
);

-- 삽입
INSERT INTO EMP01 VALUES(
    SQ_EMP.NEXTVAL,
    '류종학',
    SYSDATE
);

-- 조회
SELECT
    *
FROM
    EMP01;

-- 3) EMP01 테이블에 이름(ENAME) 컬럼에 INDEX를 생성하시오.(인덱스명: IDX_EMP01_ENAME)
-- 생성
CREATE INDEX IDX_EMP01_ENAME ON EMP01(
    ENAME
);

-- 조회
SELECT
    INDEX_NAME,
    TABLE_NAME,
    COLUMN_NAME
FROM
    USER_IND_COLUMNS
WHERE
    TABLE_NAME = 'EMP01';

COMMIT;