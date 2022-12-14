-- TODO: SEQUENCE 생성: CREATE SEQUENCE 이름 INCREMENT BY 증가값 START WITH 시작값 MINVALUE 최소값 MAXVALUE 최대값;
-- 채번: 1 ~ N, 증가하는 숫자
-- 시작값이 1이고 10씩 증가하는 SEQUENCE SAMPLE_SEQ 생성하기
CREATE SEQUENCE SAMPLE_SEQ INCREMENT BY 10 START WITH 1;

-- TODO: 데이터 사전: USER_SEQUENCES(시퀀스 조회)
SELECT
    SEQUENCE_NAME,
    MIN_VALUE,
    MAX_VALUE,
    INCREMENT_BY
FROM
    USER_SEQUENCES;

-- TODO: 시퀀스 삭제
DROP SEQUENCE SAMPLE_SEQ;

-- TODO: SEQUENCE.NEXTVAL: SEQUENCE 증가 시키기(값이 호출할 때 마다 증가함.)
SELECT
    SAMPLE_SEQ.NEXTVAL
FROM
    DUAL;

-- TODO: SEQUENCE.CURRVAL: 현재 SEQUENCE에 값을 보기, 최초 생성 이후 한번은 실행을 하여 데이터 값이 변경되어야 조회가 가능.
SELECT
    SAMPLE_SEQ.CURRVAL
FROM
    DUAL;

-- 임시테이블에 SEQUENCE INSERT
CREATE TABLE DEPT_TEMP AS
    SELECT
        *
    FROM
        DEPARTMENT
    WHERE
        1 = 0;

INSERT INTO DEPT_TEMP VALUES(
    SAMPLE_SEQ.NEXTVAL,
    'ACCOUNTING',
    'NEW YORK'
);

SELECT
    *
FROM
    DEPT_TEMP;

DROP TABLE DEPT_TEMP;