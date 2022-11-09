-- PL/SQL: 프로시저(Procedure) / 함수() -> 패키지
-- 오라클에서 지원하는 프로그래밍 언어의 특성을 수용하여 SQL에서 사용할 수 없는 절차적 프로그래밍을 할 수 있도록 만든 것.
-- 조건문(IF/ELSE), 반복문(LOOP, FOR), 변수 선언
-- 사용시 장점: SQL문보다 DB 자체 내에서 실행되기 때문에 성능향상 및 네트워크 트래픽 등 경제적으로 이득.

-- TODO: 프로시저 정의
-- DECLARE: 선언부 (변수 선언, 변수 값 할당 등)
-- BEGIN: 실행부 (SQL 또는 조건/ 반복문 코딩)
-- EXCEPTION: 예외처리(에러시 처리)
-- END

SET SERVEROUTPUT ON;

-- 1번)
ACCEPT P_NUM1 PROMPT '첫번째 숫자를 입력하세요.';

ACCEPT P_NUM2 PROMPT '두번째 숫자를 입력하세요.';

-- 선언부
DECLARE
    V_SUM NUMBER(10);
 -- 실행부
BEGIN
    V_SUM := &P_NUM1 + &P_NUM2;
 -- 문자열 붙이기: 문자열 || 문자열 또는 숫자
    DBMS_OUTPUT.PUT_LINE('총 합은: '
        || V_SUM);
END;
/

-- 2번)
ACCEPT P_EMPNO PROMPT '사원번호를 입력하세요.';

-- 선언부
DECLARE
    V_SAL NUMBER(10);
 -- 실행부
BEGIN
    SELECT
 -- INTO 변수안의 SELECT로 찾은 값이 들어감.
        SALARY INTO V_SAL
    FROM
        EMPLOYEE
    WHERE
        ENO = &P_EMPNO;
    DBMS_OUTPUT.PUT_LINE('해당사원의 월급은: '
        || V_SAL);
 -- 끝
END;
/

-- TODO: 3번) 조건문 (IF / ELSIF / ELSE / END IF)
ACCEPT P_NUM PROMPT '숫자를 입력하세요.';

-- DECLARE(조건부) 생략 가능
-- 실행부
BEGIN
    IF MOD(&P_NUM, 2) = 0 THEN
        DBMS_OUTPUT.PUT_LINE('짝수입니다.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('홀수입니다.');
    END IF;
 -- 끝
END;
/

-- TODO: 4번) 조건문 (IF / ELSIF / ELSE / END IF)
ACCEPT P_ENAME PROMPT '사원 이름을 입력하세요'

DECLARE
 -- emp.ename%type : emp 테이블의 ename 컬럼의 데이터타입을 가져옴.
    V_ENAME EMP.ENAME%TYPE := UPPER('&p_ename');
    V_SAL   EMP.SAL%TYPE;
BEGIN
 -- select 컬럼 into 변수 : 컬럼값 -> 변수
    SELECT
        SAL INTO V_SAL
    FROM
        EMP
    WHERE
        ENAME = V_ENAME;
    IF V_SAL >= 3000 THEN
        DBMS_OUTPUT.PUT_LINE('고소득자입니다.');
    ELSIF V_SAL >= 2000 THEN
        DBMS_OUTPUT.PUT_LINE('중간 소득자입니다.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('저소득자입니다.');
    END IF;
END;
/

-- 5번) 반복문 커서(여러 데이터를 가지고 있는 SELECT 문)
ACCEPT P_DEPTNO PROMPT '부서번호를 입력하세요.'

DECLARE
 -- 커서정의 (배열과 비슷하다.)
    CURSOR EMP_CURSOR IS
        SELECT
            ENAME,
            SAL,
            DEPTNO
        FROM
            EMP
        WHERE
            DEPTNO = &P_DEPTNO;
BEGIN
    FOR EMP_RECORD IN EMP_CURSOR LOOP
        DBMS_OUTPUT.PUT_LINE(EMP_RECORD.ENAME
            || ' '
            || EMP_RECORD.SAL
            || ' '
            || EMP_RECORD.DEPTNO);
    END LOOP;
END;
/

-- TODO: 명시적으로 PROCEDURE(프로시저)만들기
-- (매개변수명 IN(입력), OUT(출력) 데이터 타입)
CREATE OR REPLACE PROCEDURE PRO_ENAME_SAL(
    P_ENAME IN EMP.ENAME%TYPE
) IS
 -- DECLARE 생략
    V_SAL EMP.SAL%TYPE;
BEGIN
    SELECT
        SAL INTO V_SAL
    FROM
        EMP
    WHERE
        ENAME = P_ENAME;
    DBMS_OUTPUT.PUT_LINE(V_SAL
        || '입니다.');
END;
/

-- TODO: PROCEDURE(프로시저) 실행방법
EXEC PRO_ENAME_SAL('SCOTT');

CALL PRO_ENAME_SAL('SCOTT');

-- TODO: FUNCTION(함수) 만들기
-- (매개변수명 IN(입력), OUT(출력) 데이터 타입)
CREATE OR REPLACE FUNCTION FN_ENAME_SAL(
    P_DEPTNO IN DEPT.DEPTNO%TYPE
) RETURN DEPT.LOC%TYPE IS
    V_LOC DEPT.LOC%TYPE;
BEGIN
    SELECT
        LOC INTO V_LOC
    FROM
        DEPT
    WHERE
        DEPTNO = P_DEPTNO;
    RETURN V_LOC;
END;
/

-- TODO: FUNCTION(함수) 실행
SELECT
    FN_ENAME_SAL(10)
FROM
    DUAL;

-- 스크립트
-- alter session set nls_date_format='RR/MM/DD';

-- drop table emp;
-- drop table dept;

-- CREATE TABLE DEPT
--        (DEPTNO number(10),
--         DNAME VARCHAR2(14),
--         LOC VARCHAR2(13) );

-- INSERT INTO DEPT VALUES (10, 'ACCOUNTING', 'NEW YORK');
-- INSERT INTO DEPT VALUES (20, 'RESEARCH',   'DALLAS');
-- INSERT INTO DEPT VALUES (30, 'SALES',      'CHICAGO');
-- INSERT INTO DEPT VALUES (40, 'OPERATIONS', 'BOSTON');

-- CREATE TABLE EMP (
--  EMPNO               NUMBER(4) NOT NULL,
--  ENAME               VARCHAR2(10),
--  JOB                 VARCHAR2(9),
--  MGR                 NUMBER(4) ,
--  HIREDATE            DATE,
--  SAL                 NUMBER(7,2),
--  COMM                NUMBER(7,2),
--  DEPTNO              NUMBER(2) );

-- INSERT INTO EMP VALUES (7839,'KING','PRESIDENT',NULL,'81-11-17',5000,NULL,10);
-- INSERT INTO EMP VALUES (7698,'BLAKE','MANAGER',7839,'81-05-01',2850,NULL,30);
-- INSERT INTO EMP VALUES (7782,'CLARK','MANAGER',7839,'81-05-09',2450,NULL,10);
-- INSERT INTO EMP VALUES (7566,'JONES','MANAGER',7839,'81-04-01',2975,NULL,20);
-- INSERT INTO EMP VALUES (7654,'MARTIN','SALESMAN',7698,'81-09-10',1250,1400,30);
-- INSERT INTO EMP VALUES (7499,'ALLEN','SALESMAN',7698,'81-02-11',1600,300,30);
-- INSERT INTO EMP VALUES (7844,'TURNER','SALESMAN',7698,'81-08-21',1500,0,30);
-- INSERT INTO EMP VALUES (7900,'JAMES','CLERK',7698,'81-12-11',950,NULL,30);
-- INSERT INTO EMP VALUES (7521,'WARD','SALESMAN',7698,'81-02-23',1250,500,30);
-- INSERT INTO EMP VALUES (7902,'FORD','ANALYST',7566,'81-12-11',3000,NULL,20);
-- INSERT INTO EMP VALUES (7369,'SMITH','CLERK',7902,'80-12-11',800,NULL,20);
-- INSERT INTO EMP VALUES (7788,'SCOTT','ANALYST',7566,'82-12-22',3000,NULL,20);
-- INSERT INTO EMP VALUES (7876,'ADAMS','CLERK',7788,'83-01-15',1100,NULL,20);
-- INSERT INTO EMP VALUES (7934,'MILLER','CLERK',7782,'82-01-11',1300,NULL,10);

-- commit;

-- drop  table  salgrade;

-- create table salgrade
-- ( grade   number(10),
--   losal   number(10),
--   hisal   number(10) );

-- insert into salgrade  values(1,700,1200);
-- insert into salgrade  values(2,1201,1400);
-- insert into salgrade  values(3,1401,2000);
-- insert into salgrade  values(4,2001,3000);
-- insert into salgrade  values(5,3001,9999);

-- commit;