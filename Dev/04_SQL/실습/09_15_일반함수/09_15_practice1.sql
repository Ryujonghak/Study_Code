-- SQL 주석

-- DataType(형식)
-- 숫자: NUMBER(자리수) ex) 12334 -> NUMBER(5)
-- 문자(열): VARCHAR2(자리수) ex) VARCHAR2(4000): 맥시멈 4000자
-- 참고)  VARCHAR(가변길이 문자(열)), CHAR(고정길이 문자(열))
-- 글자크기: 한글(3byte(UTF-8)), 영어(1byte(UTF-8))

-- 이미지 저장 데이형
-- BLOB: 대용량의 바이너리(이진) 데이터를 저장함(이미지, 동영상 등), 최대 4GB까지 가능.
-- 참고) CLOB: 대용량의 텍스트 데이터를 저장함(파일등).
-- DATE: 날짜 형식을 저장하기 위한 DataType(형식) ex) 2022-09-15 23:18:15 형태로 저장가능.

-- 제약조건: 데이터 입력에 제한조건
-- NOT NULL: 컬럼(속성)에 지정하여 NULL 값이 들어오지 못하게 하는 것. ex) 테이블 key값에 NULL이 들어오면 안되기 때문에 사용.

-- 기본키: 유일한 값(중복 X)만 들어가는 데이터를 대상으로 설정(테이블 생성시 반드시 1개의 기본키를 설정해야함.)
-- 외래키: 테이블간의 관계를 판단해서 설정(부모 자신간의 테이블관계에서 자식에는 부모데이터만 존재하게 만들어주는 것)
-- 외래키 구연방법: 첫번째 테이블 칼럼에 설정, 두번째 코딩으로 구현하는 방법

-- 번외) DBA만 가능
-- DB 종료: shutdown immediate
-- DB 부팅: startup

-- 조회
-- ex) 부서테이블 전체 데이터 조회하기
SELECT
    *
FROM
    DEPARTMENT
 -- 조회 문법: SELECT 컬럼이름 FROM 테이블명;
WHERE
    DNAME = 'SALES'
 -- WHERE 칼럼이름 = '데이터';(조건식으로 동등비교식)
WHERE
    DNAME LIKE 'S%';

-- LIKE(문자열 부분일치 검색) '_문자%' % = 문자% 뒤에 값은 달라도 됨. _ = 찾는 글자앞에 붙어있는 문자열 갯수.

-- 연습문제: DEPARTMENT 테이블에서 컬럼 LOC를 조회하시오.
SELECT
    LOC
FROM
    DEPARTMENT;

-- 응용문제: 출력순서를 DNAME, LOC, DNO로 바꾸어서 조회하시오.
SELECT
    DNAME,
    LOC,
    DNO
FROM
    DEPARTMENT;

-- 'SALES' 부서에 해당하는 자료만 조회하기
SELECT
    *
FROM
    DEPARTMENT
WHERE
    DNAME = 'SALES';

-- 연습문제: 부서테이블에서 부서번호 10 데이터 자료 조회하시오.
SELECT
    *
FROM
    DEPARTMENT
WHERE
    DNO = '10';

-- 연습문제: s로 시작되는 문자열에 해당하는 데이터를 조회하기
SELECT
    *
FROM
    DEPARTMENT
WHERE
    DNAME LIKE 'S%';

-- 연습문제: 부서이름이 중간에 c가 들어가는 문자열에 해당하는 데이터를 조회하시오.
SELECT
    *
FROM
    DEPARTMENT
WHERE
    DNAME LIKE '%C%';

-- SQL 함수
-- TODO: 1) 대문자 바꾸기(UPPER),  소문자 바꾸기(LOWER), 첫글자만 대문자변환(INITCAP)
SELECT
    ENAME,
    JOB
FROM
    EMPLOYEE
WHERE
    JOB = UPPER('manager');

SELECT
    INITCAP('oracle')
FROM
    DUAL;

-- TODO: 2) 데이터 정렬: 오름차순(ASC), 내림차순(DESC) 참고) ORDER BY 사용시 ASC 생략가능, 추가로 데이터베이스 조회속도가 저하됨.
SELECT
    *
FROM
    DEPARTMENT
ORDER BY
    DNAME ASC;

-- TODO: 3) NVL(): NULL값을 바꾸는 함수 NVL(칼럼, 바꿀 값)으로 사용.
SELECT
    ENAME AS "이름",
    (SALARY*12)+NVL(COMMISSION,
    0)    AS "연봉"
FROM
    EMPLOYEE;

-- TODO: 4) DISTINCT: 중복된 칼럼 제외하고 조회함수
SELECT
    DISTINCT DNO
FROM
    EMPLOYEE;

-- TODO: 5) LENGTH(): 문자길이를 반환하는 함수
SELECT
    'ORACLEMANIA',
    LENGTH('ORACLEMANIA'),
    LENGTH('오라클매니아')
FROM
    DUAL;

-- TODO: 6) CONCAT(): 문자열 붙이기 함수, 매개변수를 붙임.
SELECT
    'ORACLE',
    'MANIA',
    CONCAT('ORACLE',
    'MANIA')
FROM
    DUAL;

-- 추가) ||을 이용해서도 문자열을 붙있수 있음.(CONCAT과 결과가 같음.)
SELECT
    'ORACLE',
    'MANIA',
    'ORACLE'||'MANIA'
FROM
    DUAL;

-- TODO: 7) SUBSTR(): 문자열 자르기 함수, SUNSTR 매개변수(문자열, 시작위치(1~N), N개 자를 갯수) 자르고 남은 문자열 반환.
SELECT
    SUBSTR('ORACLEMANIA',
    4,
    3)
FROM
    DUAL;

-- 추가) 위치가 양수면 처음부터 음수면 뒤에서부터 자름.
SELECT
    SUBSTR('ORACLEMANIA',
    -4,
    3)
FROM
    DUAL;

-- TODO: 8) INSTR(): 문자열 위치 찾기 함수, INSTR('문자열', '찾을 문자',시작위치(1~N), N번째)찾은 위치 반환.
SELECT
    INSTR('ORACLE MANIA',
    'A',
    5,
    2)
FROM
    DUAL;

-- TODO: 9) LPAD(), RPAD(): 문자열에 특정기호로 채우기, LPAD(컬럼명, 채울 문자길이, '채울 문자')
SELECT
    LPAD(SALARY,
    10,
    '*')
FROM
    EMPLOYEE;

-- TODO: 10) TRIM(): 공백 없에는 함수,매개변수로 칼럼또는 문자열을 주면 됨, LR을 붙이면 왼쪽 오른쪽 공백만 제거 가능.
SELECT
    ' ORACLE MANIA ',
    TRIM(' ORACLE MANIA ')
FROM
    DUAL;

-- 연습문제: 이름이 N으로 끝나는 사원 출력하기(단, SUBSTR 사용)
SELECT
    ENAME
FROM
    EMPLOYEE
WHERE
    SUBSTR(ENAME,
    -1,
    1) = 'N';

-- 연습문제: 1987년도에 입사한 사원 출력하기(단, SUBSTR 사용)
SELECT
    *
FROM
    EMPLOYEE
WHERE
    SUBSTR(HIREDATE,
    1,
    2) = '87';

-- 참고) 한글(3byte) 자르기: 영어와 같이 글자 개수되로 잘림.
SELECT
    SUBSTR('오라클매니아',
    3,
    4)
FROM
    DUAL;

-- 연습문제: 문자 위치 찾기(INSTR)
SELECT
    INSTR('ORACLE MANIA',
    'A')
FROM
    DUAL;

-- 위의 경우 두번째나 세번째 'A'를 어떻게 찾을까
SELECT
    INSTR('ORACLE MANIA',
    'A',
    5,
    2)
FROM
    DUAL;

-- 연습문제: 왼쪽자리를 특정기호로 채우기
SELECT
    LPAD(SALARY,
    10,
    '*')
FROM
    EMPLOYEE;

-- 연습문제: 한쪽 공백 제거하기 함수
SELECT
    ' ORACLE MANIA ',
    TRIM(' ORACLE MANIA ')
FROM
    DUAL;

-- 산술연산자 : +, -, *, /
-- ex) 각 사원(EMPLOYEE)의 급여(SALARY)에 산술연산자를 전부 300해서 조회하세요.
SELECT
    SALARY+300,
    SALARY-300,
    SALARY*300,
    SALARY/300,
    SALARY
FROM
    EMPLOYEE;

-- 응용문제: 회계부에서 사원의 연보을 조회할려고 합니다. 어떻게 쿼리를 짜야할까요?(사원명, 연봉)
-- as: 별명 별칭으로 칼럼 as "별명"으로 사용가능.
SELECT
    ENAME     AS "이름",
    SALARY*12 AS "연봉"
FROM
    EMPLOYEE;

-- 응용문제2: 커미션 포함.
-- NULL과 사칙연산이 들어가면 NULL이 됨.
SELECT
    ENAME AS "이름",
    (SALARY*12)+ NVL(COMMISSION,
    0)    AS "연봉"
FROM
    EMPLOYEE;

-- 연습문제: EMPLOYEE 테이블에서 JOB이 'MANAGER'인 사람의 데이터를 대상으로 직원이름을 오름차순으로 정렬하시오.
SELECT
    *
FROM
    EMPLOYEE
WHERE
    JOB = UPPER('manager')
ORDER BY
    ENAME ASC;

-- 도전과제: EMPLOYEE 테이블에서 JOB이 'CLERK' 사람의 데이터를 뽑아서 ENAME 내림차순, ENO는 오름차순.
SELECT
    *
FROM
    EMPLOYEE
WHERE
    JOB = UPPER('clerk')
ORDER BY
    ENAME DESC,
    ENO ASC;

-- 중복된 데이터는 제외하고 출력하기.
SELECT
    DISTINCT DNO
FROM
    EMPLOYEE;

-- 테스트용 간이 테이블: 간단한 산술계산, 문자 찍어보기 등
SELECT
    33*3
FROM
    DUAL;

-- 오늘날짜 출력
SELECT
    SYSDATE
FROM
    DUAL;

-- 연습문제: 급여가 1500이상인 사원 출력하기
SELECT
    ENAME
FROM
    EMPLOYEE
WHERE
    SALARY >= 1500;

-- 연습문제: 날짜 칼럼(DATE) 조회하시오. (조건: 입사일이 1981년 1월 1일 이전에 입사한 사원), 날짜는 문자열로 표현
SELECT
    *
FROM
    EMPLOYEE
WHERE
    HIREDATE <= '1981/01/01';

-- 논리 연산자: AND, OR, NOT
-- 연습문제: 부서번호가 10이고 직급이 'MANAGER'인 사람 출력
SELECT
    *
FROM
    EMPLOYEE
WHERE
    DNO =10
    AND JOB = 'MANAGER';

-- 연습문제: 부서번호가 10이거나 직급이 'MANAGER'인 사람 출력
SELECT
    *
FROM
    EMPLOYEE
WHERE
    DNO =10
    OR JOB = 'MANAGER';

-- 연습문제: 부서번호가 10이 아닌 사람만 출력
SELECT
    *
FROM
    EMPLOYEE
WHERE
    NOT DNO =10;

-- 연습문제: 급여가 1000에서 1500 사이인 사람(이상, 이하) 사원 출력
SELECT
    ENAME
FROM
    EMPLOYEE
WHERE
    SALARY >= 1000
    AND SALARY <= 1500;

-- 연습문제: 급여가 1000미만이거나 1500 이상인 사람(이상, 이하) 사원 출력
SELECT
    ENAME
FROM
    EMPLOYEE
WHERE
    SALARY < 1000
    OR SALARY > 1500;

-- 연습문제: 커미션 300이거나 500이거나 1400인 사원 출력
SELECT
    ENAME
FROM
    EMPLOYEE
WHERE
    COMMISSION = 300
    OR COMMISSION = 500
    OR COMMISSION = 1400;

-- 비교연산자와 비슷한 BETWEEN 연산자: BETWEEN 시작값 AND 종료값
-- 연습문제: 급여가 1000에서 1500 사이인 사람(이상, 이하) 사원 출력
SELECT
    ENAME
FROM
    EMPLOYEE
WHERE
    SALARY BETWEEN 1000
    AND 1500;

-- 연습문제: 급여가 1000에서 1500 사이가 아닌사원 출력
SELECT
    ENAME
FROM
    EMPLOYEE
WHERE
    SALARY NOT BETWEEN 1000
    AND 1500;

-- 연습문제: BETWEEN AND 사용하여 1982년에 입사한 사원 출력
SELECT
    ENAME
FROM
    EMPLOYEE
WHERE
    HIREDATE BETWEEN '1982/01/01'
    AND '1982/12/31';

-- IN 연산자 (OR을 사용하지 않고 식들간 연결가능)
-- 연습문제: 커미션 300이거나 500이거나 1400인 사원 출력
SELECT
    ENAME
FROM
    EMPLOYEE
WHERE
    COMMISSION IN(300,
    500,
    1400);

-- 연습문제: 커미션 300이거나 500이거나 1400인 아닌 사원 출력
SELECT
    ENAME
FROM
    EMPLOYEE
WHERE
    COMMISSION NOT IN(300,
    500,
    1400);

-- LIKE 연산자 : 문자가 포함된 문자열 검색에 사용하는 연산자
SELECT
    ENAME
FROM
    EMPLOYEE
WHERE
    ENAME LIKE '_A%';

-- 연습문제: 이름의 3번쨰 글짜가 'A'인 사원 조회하기.
SELECT
    ENAME
FROM
    EMPLOYEE
WHERE
    ENAME LIKE '__A%';

-- 연습문제: 이름에 'A'가 안들어가는 사원 조회
SELECT
    ENAME
FROM
    EMPLOYEE
WHERE
    ENAME NOT LIKE '%A%';

-- 연습문제: 컬럼에 NULL이 포함된 데이터 조회하기(null은 산술, 비교 연산사용 불가)
-- NULL을 사용하기 위해서 IS 연산자를 사용하여 NULL 데이터 조회.
SELECT
    *
FROM
    EMPLOYEE
WHERE
    COMMISSION IS NULL;

SELECT
    *
FROM
    EMPLOYEE
WHERE
    COMMISSION IS NOT NULL;