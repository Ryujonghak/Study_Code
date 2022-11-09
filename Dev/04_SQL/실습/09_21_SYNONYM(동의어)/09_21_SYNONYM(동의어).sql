-- TODO: SYNONYM(동의어): 다른 데이터 베이스의 객체(테이블, 인덱스 등)에 대한 별칭(별명).
-- 연습문제: 시스템계정으로 테이블 만들기
CREATE TABLE SAMPLETBL(
    MEMO VARCHAR2(50)
);

INSERT INTO SAMPLETBL VALUES(
    '오월은 푸르구나'
);

INSERT INTO SAMPLETBL VALUES(
    '최선을 다합시다'
);

COMMIT;

DROP TABLE SAMPLETBL;

-- TODO: SELECT 권한 -> GRANT SELECT ON 테이블명 TO 계정명;(시스템에 있는 테이블을 볼 수 있다.)

SELECT
    *
FROM
    SYSTEM.SAMPLETBL;

-- TODO: 테이블을 간략하게 조회하고 싶을 때 사용하는 것이 SYNONYM(동의어).
CREATE SYNONYM PRIV_SAMPLETBL FOR SYSTEM.SAMPLETBL;

-- TODO: 삭제
DROP SYNONYM PRIV_SAMPLETBL;