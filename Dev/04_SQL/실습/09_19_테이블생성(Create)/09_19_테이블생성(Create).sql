-- TODO: 테이블 생성(Create), 수정(Update), 삭제(Delete), 삽입(Insert): DDL 명령어(데이터 정의어)

-- 부서 정보를 저장하기위한 테이블 생성하기
-- TODO: TABLE CREATE(테이블 생성) 문법: CREATE TABLE 명( 컬럼명 컬럼타입, ... 추가 );
CREATE TABLE DEPT(
    DNO NUMBER(2),
    DNAME VARCHAR2(14),
    LOC VARCHAR2(13)
);

SELECT
    *
FROM
    DEPT;

-- TODO: 테이블 복사 쿼리: 테이블 생성하면서 데이터 복사하기(AS 문법)
CREATE TABLE DEPT_SECOND AS
    SELECT
        *
    FROM
        DEPARTMENT;

-- TODO: 테이블 복사시에 컬럼의 형태만 가져가고 데이터를 가져오고 싶지 않은 경우(칼럼 구조만 복사)
CREATE TABLE DEPT_SECOND AS
    SELECT
        *
    FROM
        DEPARTMENT
    WHERE
        1=2;

-- 연습문제: 20번 부서 소속사원에 대한 정보를 포함한 DEPT20 테이블을 생성하세요. 단, 데이터를 포함 생성하세요.
CREATE TABLE DEPT20 AS
    SELECT
        *
    FROM
        DEPARTMENT
    WHERE
        DNO = 20;

-- TODO: DROP TABLE(테이블 삭제) 문법 : DROP TABLE 명;
DROP TABLE DEPT20;

-- 연습문제: TB_DEPT의 이름으로 복사하기 (원본: DEPARTMENT), 칼럼 구조만
CREATE TABLE TB_DEPT AS
    SELECT
        *
    FROM
        DEPARTMENT
    WHERE
        1=2;

-- 연습문제 TABLE 삭제하기
DROP TABLE TB_DEPT;