-- 종합연습문제 : DML (INSERT/UPDATE/DELETE)
-- 1) EMPLOYEE 테이블의 구조만 복사하여 EMP_INSERT란 이름의 빈 테이블을 만드시오.
CREATE TABLE EMP_INSERT AS
    SELECT
        *
    FROM
        EMPLOYEE
    WHERE
        1=2;

-- 2) 본인을 EMP_INSERT 테이블에 추가하되 SYSDATE를 이용해서 입사일을 오늘로 입력하세요.
INSERT INTO EMP_INSERT(
    ENAME,
    HIREDATE
) VALUES(
    '류종학',
    SYSDATE
);

-- 3) EMP_INSERT 테이블에 옆 사람을 추가하되 TO_DATE 함수를 이용해서 입사일을 어제로 입력하세요.
INSERT INTO EMP_INSERT(
    ENAME,
    HIREDATE
) VALUES(
    '강수빈',
    SYSDATE - 1
);

-- 4) EMPLOYEE 테이블의 구조와 내용을 복사하여 EMP_COPY란 이름의 테이블을 만드세요.
-- DROP TABLE EMP_COPY;
CREATE TABLE EMP_COPY AS
    SELECT
        *
    FROM
        EMPLOYEE;

-- 5) 사원번호가 7788인 사원의 부서번호를 10번으로 수정하세요.( EMP_COPY )
UPDATE EMP_COPY
SET
    DNO = 10
WHERE
    ENO = 7788;

-- 6) 사원번호가 7788의 담당 업무 및 급여를 사원번호 7499의 담당 업무 및 급여와 일치하도록 갱신하세요.( EMP_COPY )
UPDATE EMP_COPY
SET
    JOB = (
        SELECT JOB FROM EMP_COPY WHERE ENO = 7499
    ),
    SALARY = (
        SELECT SALARY FROM EMP_COPY WHERE ENO = 7499
    )
WHERE
    ENO = 7788;

-- 7) 사원번호 7369와 업무가 동일한 모든 사원의 부서번호를 사원 7369의 현재 부서번호로 갱신하세요.
UPDATE EMP_COPY
SET
    DNO = (
        SELECT DNO FROM EMP_COPY WHERE ENO = 7369
    )
WHERE
    JOB = (
        SELECT JOB FROM EMP_COPY WHERE ENO = 7369
    );

-- 8) DEPARTMENT 테이블의 구조와 내용을 복사하여 DEPT_COPY란 이름의 테이블을 만드세요.
DROP TABLE DEPT_COPY;

CREATE TABLE DEPT_COPY AS
    SELECT
        *
    FROM
        DEPARTMENT;

-- 9) DEPT_COPY 테이블에서 부서명이 RESEARCH인 부서를 제거하세요.
SELECT
    *
FROM
    DEPT_COPY;

DELETE FROM DEPT_COPY
WHERE
    DNAME = 'RESEARCH';

-- 10) DEPT_COPY 테이블에서 부서 번호가 10이거나 40인 부서를 제거하세요.
DELETE FROM DEPT_COPY
WHERE
    DNO IN (10,
    40);

COMMIT;

-- 결과 확인
SELECT
    *
FROM
    EMP_INSERT;

SELECT
    *
FROM
    EMP_COPY
ORDER BY
    ENO;

SELECT
    *
FROM
    DEPT_COPY;