-- TODO: 테이블 생성(Create), 수정(Update), 삭제(Delete), 삽입(Insert): DDL 명령어(데이터 정의어)

-- TODO: ALTER: 테이블 구조 변경하기, ALTER TABLE 명 ADD(컬럼명 타입), 추가한 컬럼은 NULL값의 데이터가 기본으로 들어감.
SELECT
    *
FROM
    DEPT20;

ALTER TABLE DEPT20 ADD (BIRTH DATE);

-- 연습문제: 사원 테이블에 날짜 칼럼을 가지는 INSERT_CREATE, UPDATE_CREATE, DELETE_CREATE 컬럼 추가하기
ALTER TABLE DEPT20 ADD (INSERT_CREATE DATE);

ALTER TABLE DEPT20 ADD (UPDATE_CREATE DATE);

ALTER TABLE DEPT20 ADD (DELETE_CREATE DATE);

-- TODO: DESC(DESCRIBE): 테이블 구조 보기
DESC DEPT20;

-- TODO: ALTER MODIFY: 컬럼변경
-- 연습문제: 사원 이름 컬럼 크기 변경하기
ALTER TABLE DEPT20 MODIFY ENAME VARCHAR2(30);

-- 연습문제: JOB 칼럼 크기 VARCHAR2(30)으로 변경
ALTER TABLE DEPT20 MODIFY JOB VARCHAR2(30);

-- TODO: ALTER DROP: 컬럼삭제
ALTER TABLE DEPT20 DROP COLUMN ENAME;

-- 연습문제: DEPT20 테이블에서 BIRTH 컬럼 삭제
ALTER TABLE DEPT20 DROP COLUMN BIRTH;

-- TODO: RENAME: 테이블명 변경
RENAME DEPT20 TO EMP20;

-- TODO: RENAME: 컬럼명 변경
ALTER TABLE 테이블명 RENAME COLUMN 컬럼명 TO 바꿀 컬럼명;

-- TODO: DROP: 테이블 삭제
DROP TABLE DEPT20;

-- TODO: DROP 명령어에 CASCADE 옵션을 추가하여 삭제가 가능.
-- 기본키 / 외래키 설정: 외래키가 설정된 테이블의 경우 삭제가 안되지만 관계인 테이블까지 같이 날리는 옵션을 사용하여 삭제가 가능.
DROP TABLE DEPT20 CASCADE;

-- TODO: 테이블의 모든 데이터 삭제
TRUNCATE TABLE DEPT_SECOND;

-- TODO: 데이터 사전(오라클 데이터 베이스 테이블의 기본정보 또는 유저정보, 자원, 권한등의 내용을 조회하기 위한 시스템 테이블)
-- USER_식별자: 자신의 계정이 소유한 객체(테이블, 인덱스 등)에 관한 정보 조회.
-- ALL_식별자: 자신 계정 소유 또는 권한을 부여 받은 다른계정 소유까지 포함에서 정보 조회.
-- DBA_식별자: 데이터베이스 관리자만 접근 가능한 객체(테이블, 인덱스 등) 정보 조회.
-- 자신의 테이블 정보 조회
SELECT
    TABLE_NAME
FROM
    USER_TABLES;

-- 참고: 권한을 부여받은 모든 정보 조회
SELECT
    TABLE_NAME
FROM
    ALL_TABLES;

-- TODO: 테이블 주석(COMMENT ON TABLE 테이블명 IS '설명') / 컬럼 주석(COMMENT ON COLUMN 테이블명.컬럼명 IS '설명')
-- DEPT_SECOND 주석 붙이기
COMMENT ON TABLE DEPT_SECOND IS '부서정보';
COMMENT ON COLUMN DEPT_SECOND.DNAME IS '부서이름';

-- 연습문제: SALGRADE 테이블 / 칼럼에 주석달기
COMMENT ON TABLE SALGRADE IS '월급정보';
COMMENT ON COLUMN SALGRADE.GRADE IS '등급';
COMMENT ON COLUMN SALGRADE.LOSAL IS '최저월급';
COMMENT ON COLUMN SALGRADE.HISAL IS '최고월급';