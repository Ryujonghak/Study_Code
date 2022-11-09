-- 종합 연습문제
-- 1) SUBSTR 함수를 사용하여 사원들의 입사한 년도와 입사한 달만 출력하세요.
SELECT
    SUBSTR(HIREDATE,
    8,
    2) AS "입사한 년도",
    SUBSTR(HIREDATE,
    4,
    3) AS "입사한 달"
FROM
    EMPLOYEE;

-- 2) SUBSTR 함수를 사용하여 4월에 입사한 사원을 출력하세요.
-- 참고) 함수는 SELECT절에 사용해야 성능저하가 없음.
SELECT
    *
FROM
    EMPLOYEE
WHERE
    SUBSTR(HIREDATE,
    4,
    3) = 'APR';

-- 3) MOD 함수를 사용하여 사원번호가 짝수인 사람만 출력하세요.
SELECT
    *
FROM
    EMPLOYEE
WHERE
    0 = MOD(ENO,
    2);

-- 4) 입사일 연도는 2자리(YY), 월은 숫자(MON)로 표시하고, 요일은 (DDDY)로 표기하세요.
SELECT
    TO_CHAR(HIREDATE,
    'YY-MON-DD DAY')
FROM
    EMPLOYEE;

-- 5) 올해 며칠이 지났는지 출력하시오. 현재 날짜에서 올해 1월1일을 뺀 결과를 출력하고 TO_DATE 함수를 사용하여 데이터 형을 일치시키세요.
-- 단, 포맷은 'YYYY/MM/DD'
SELECT
    TRUNC(SYSDATE - TO_DATE(20220101,
    'YYYYMMDD'))
FROM
    DUAL;

-- 6) 사원들의 매니저 사번을 출력하되 매니저가 없는 사원에 대해서는 NULL값 대신에 0을 출력하세요.
SELECT
    NVL(MANAGER,
    0)
FROM
    EMPLOYEE;

-- 7) DECODE 함수로 직급에 따라 급여를 인상하도록 하세요.
-- 직급이 'ANALYST' 이면 200, 'SALESMAN' 이면 180, 'MANAGER' 이면 150 'CLERK' 이면 100을 인상하세요.
SELECT
    ENAME,
    JOB,
    SALARY,
    DECODE(JOB,
    'CLERK',
    SALARY+100,
    'SALESMAN',
    SALARY+180,
    'MANAGER',
    SALARY+150,
    'ANALYST',
    SALARY+200,
    SALARY) AS "급여인상(DECODE)"
FROM
    EMPLOYEE;