--  TODO: VIEW: 하나 이상의 테이블이나 다른 VIEW를 이용해서 생성하는 가상 테이블
-- 연습문제: JOB이  SALESMAN인 뷰를 생성하세요.
-- VIEW는 생성권한을 받아야 만들수 있음 : 관리자(GRANT CREATE VIEW TO SCOTT95;)
-- 장점 1) VIEW를 통해 미리 만들어 놓으면 여러번 찾을 필요가 없이 미리 정의되어 있음(SQL 코딩 효율화).
-- 장점 2) 보안을 적용하기 쉬움(민감한 정보를 뺴고 만들 수 있음).
-- TODO: CREATE OR REPLACE VIEW 뷰테이블명 AS ... : 뷰 생성
CREATE OR REPLACE VIEW V_EMP_JOB(
    사번,
    사원이름,
    부서번호,
    담당업무
) AS
    SELECT
        ENO,
        ENAME,
        DNO,
        JOB
    FROM
        EMPLOYEE
    WHERE
        JOB LIKE 'SALESMAN%';

-- TODO: VIEW(가상테이블) 조회
SELECT
    *
FROM
    V_EMP_JOB;

-- TODO: VIEW(가상테이블) 삭제
DROP VIEW V_EMP_JOB;

-- TODO: VIEW(가상테이블) 데이터 삽입(INSERT)
INSERT INTO V_EMP_JOB VALUES(
    8000,
    '류종학',
    30,
    'SALESMAN'
);

-- 부서 테이블과 사원 테이블을 조인한 결과를 VIEW로 만들어서 출력하세요.
CREATE OR REPLACE VIEW V_EMP_COMPLEX AS
    SELECT
        EMPLOYEE.*,
        LOC,
        DNAME
    FROM
        EMPLOYEE,
        DEPARTMENT
    WHERE
        EMPLOYEE.DNO = DEPARTMENT.DNO;

-- VIEW(가상테이블) 조회
SELECT
    *
FROM
    V_EMP_COMPLEX;

-- VIEW(가상테이블) 삭제
DROP VIEW V_EMP_COMPLEX;

-- 데이터 사전: USER_VIEWS, USER_TABLES, USER_CONSTRAINTS 조회
SELECT
    *
FROM
    USER_VIEWS;

-- 뷰에 그룹함수 써서 만들기
-- 연습문제: 부서별 급여합계, 급여평균을 출력하는 SQL문을 뷰로 만드세요.
CREATE OR REPLACE VIEW V_EMP_SALARY AS
    SELECT
        DNO,
        SUM(SALARY)        AS "급여합계",
        ROUND(AVG(SALARY)) AS "급여평균"
    FROM
        EMPLOYEE
    GROUP BY
        DNO;

-- VIEW(가상테이블) 조회
SELECT
    *
FROM
    V_EMP_SALARY;

-- VIEW(가상테이블) 삭제
DROP VIEW V_EMP_SALARY;

-- TODO: VIEW에 데이터 INSERT 막기 (WITH READ ONLY 옵션)
CREATE OR REPLACE VIEW V_EMP_JOB_READONLY AS
    SELECT
        ENO,
        ENAME,
        DNO,
        JOB
    FROM
        EMPLOYEE
    WHERE
        JOB LIKE "MANAGER" WITH READ ONLY;

-- VIEW(가상테이블) 조회
SELECT
    *
FROM
    V_EMP_JOB_READONLY;

-- VIEW(가상테이블) 삭제
DROP VIEW V_EMP_JOB_READONLY;