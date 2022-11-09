-- DML: INSERT, UPDATE, DELETE (CRUD)
-- ACCOUNTING 부서의 정보 입력하기
CREATE TABLE DEPT_COPY AS
    SELECT
        *
    FROM
        DEPARTMENT
    WHERE
        1=2;

-- 확인
SELECT
    *
FROM
    DEPT_COPY;

--  삭제
DROP TABLE DEPT_COPY;

-- INSERT: ACCOUNTING 부서의 정보 입력하기
-- TODO: INSERT INTO 테이블명(컬럼1, ...) VALUES (컬럼 갯수만큼 데이터): 임시로 값을 넣어 데이터를 삽입함. 반영하기 위해서는 COMMIT을 해주어야함.
INSERT INTO DEPT_COPY VALUES(
    10,
    'ACCOUNTING',
    'NEW YORK'
);

-- TODO: COMMIT: 영구반영
COMMIT;

-- TODO: ROLLBACK: 취소(COMMIT 전에 해야함.)
ROLLBACK;

-- 연습문제: RESEARCH 부서의 정보 입력하기, (DNO: 20, DNAME: 'RESEARCH', LOC: 'DALLAS')
INSERT INTO DEPT_COPY VALUES(
    20,
    'RESEARCH',
    'DALLAS'
);

COMMIT;

-- 임시적으로 NULL값을 입력해서 INSERT 하기, 지정하지 않은 컬럼에는 NULL값이 들어감(암시적).
INSERT INTO DEPT_COPY(
    DNO,
    DNAME
) VALUES(
    30,
    'SALES'
);

-- 명시적으로 NULL 값 넣기
INSERT INTO DEPT_COPY(
    DNO,
    DNAME,
    LOC
) VALUES(
    40,
    'OPERATION',
    NULL
);

-- INSERT 작업을 여러하고 마지막에 COMMIT을 해주는 것이 좋음.
COMMIT;

-- 연습문제: DEPT_COPY 테이블에 50, 'COMPUTING', '' INSERT 하시오.
INSERT INTO DEPT_COPY(
    DNO,
    DNAME,
    LOC
) VALUES(
    50,
    'COMPUTING',
    ' '
);

ROLLBACK;

COMMIT;

-- 연습문제: EMPLOYEE 테이블 구조만 카피
CREATE TABLE EMP_COPY AS
    SELECT
        *
    FROM
        EMPLOYEE
    WHERE
        1=2;

-- 연습문제: 날짜 데이터 입력하기(TO_DATE) EMP_COPY 테이블,
-- 입력데이터: (ENO: 7000, ENAME: 'CANDY', JOB: 'MANAGER, HIREDATE: '2012/05/01', DNO: 10)
INSERT INTO EMP_COPY(
    ENO,
    ENAME,
    JOB,
    HIREDATE,
    DNO
) VALUES(
    7000,
    'CANDY2',
    'MANAGER',
    TO_DATE('2012/05/01', 'yyyy-MM-dd'),
    10
);

-- 현재날짜 데이터 넣기(SYSDATE)
INSERT INTO EMP_COPY(
    ENO,
    ENAME,
    JOB,
    HIREDATE,
    DNO
) VALUES(
    7000,
    'CANDY2',
    'MANAGER',
    SYSDATE,
    10
);

COMMIT;

SELECT
    *
FROM
    EMP_COPY;

-- 데이터 조회
SELECT
    *
FROM
    DEPT_COPY;

-- 데이터 삭제
TRUNCATE TABLE DEPT_COPY;

-- TODO: INSERT INTO 테이블명 서브쿼리(SELECT절): 이용 다른 테이블에서 데이터 복사하기
INSERT INTO DEPT_COPY
    SELECT
        *
    FROM
        DEPARTMENT;

COMMIT;

-- TODO: UPDATE 테이블명 SET 바꿀 내용(컬럼명 = 데이터 값), ... WHERE 조건절: 데이터 값을 업데이트 해줌, 조건절 생략시 모든 데이터를 수정함.
SELECT
    *
FROM
    DEPT_COPY;

-- 연습문제: 10번 부서이름 수정하기 : 'PROGRAMMING'
UPDATE DEPT_COPY
SET
    DNAME = 'PROGRAMMING'
WHERE
    DNO = 10;

COMMIT;

UPDATE DEPT_COPY
SET
    DNAME = 'HR'
WHERE
    DNO = 20;

COMMIT;

-- 연습문제 모든 부서의 이름을 'HR'로 수정하기
UPDATE DEPT_COPY
SET
    DNAME = 'HR';

-- 컬럼값을 여러개 한번에 수정하기, 10번 부서의 DNAME을 'PROGRAMMING', LOC를 'SEOUL'로 고치시오.
UPDATE DEPT_COPY
SET
    DNAME = 'PROGRAMMING',
    LOC = 'SEOUL'
WHERE
    DNO = 10;

-- 연습문제: 10번 부서의 지역명을 20번부서의 지역명으로 변경하기(서브쿼리)
UPDATE DEPT_COPY
SET
    LOC = (
        SELECT LOC FROM DEPT_COPY WHERE DNO = 20
    )
WHERE
    DNO = 10;

-- 연습문제: 10번 부서의 부서명과 지역명을 30번 부서의 부서명과 지역명으로 변경하기.
UPDATE DEPT_COPY
SET
    LOC = (
        SELECT LOC FROM DEPT_COPY WHERE DNO = 30
    ),
    DNAME = (
        SELECT DNAME FROM DEPT_COPY WHERE DNO = 30
    )
WHERE
    DNO = 10;

-- TODO: DELETE FROM 테이블명 WHERE 조건절: 데이터 값을 삭제함.(FROM을 생략해도 가능.), WHERE 조건절 없이 실행하면 모든 데이터 삭제.
-- 모두삭제는 DELETE 보다 TRUNCATE를 사용하는 것이 성능적인 부분에서 좋음.
DELETE FROM DEPT_COPY
WHERE
    DNO = 10;

COMMIT;

-- 확인
SELECT
    *
FROM
    DEPT_COPY;

-- 연습문제: 영업부('SALES')에 근무하는 사원 삭제하기
DELETE FROM EMPLOYEE
WHERE
    DNO = (
        SELECT
            DNO
        FROM
            DEPARTMENT
        WHERE
            DNAME = 'SALES'
    );

SELECT
    *
FROM
    EMPLOYEE;

ROLLBACK;

DROP TABLE EMPLOYEE;

DROP TABLE DEPARTMENT;

DROP TABLE SALGRADE;