-- TODO: 1) 그룹함수: 그룹의 칼럼들이 합산되서 결과가 나오기 떄문.
-- 사원들의 급여 총액, 평균액, 최고액, 최소액 출력
SELECT
    SUM(SALARY) AS "SUM",
    AVG(SALARY) AS "AVG",
    MAX(SALARY) AS "MAX",
    MIN(SALARY) AS "MIN"
FROM
    EMPLOYEE;

-- 연습문제: 최근에 입사한 사원과 가장 오래전에 입사한 사원의 입사일 출력하기
SELECT
    MAX(HIREDATE) AS "최근",
    MIN(HIREDATE) AS "오래전"
FROM
    EMPLOYEE;

-- 연습문제: 사원들의 커미션(COMMISSION) 총액 출력하기
-- 그룹함수를 사용하면 NULL값을 제외하고 계산이 들어감.
SELECT
    SUM(COMMISSION) AS "커미션"
FROM
    EMPLOYEE;

-- 데이터의 건수를 세는 그룹함수
SELECT
    COUNT(*) AS "사원의 수"
FROM
    EMPLOYEE;

-- 연습문제: 커미션받는 사원의 수
-- 1) 풀이
SELECT
    COUNT(COMMISSION) AS "사원의 수"
FROM
    EMPLOYEE;

-- 2) 풀이
SELECT
    COUNT(*) AS "사원의 수"
FROM
    EMPLOYEE
WHERE
    COMMISSION IS NOT NULL;

-- 연습문제: 사원 테이블에서 직위의 종류 건수를 출력해 주세요.
-- 참고) 중복제거(DISTINCT)
SELECT
    COUNT(DISTINCT(JOB))
FROM
    EMPLOYEE;

-- 참고) 그룹함수를 사용할 경우 옆에 일반 컬럼을 쓰리면 에러가 남.

-- TODO: 2) 데이터 그룹: GROUP BY 절
-- 소속 부서별 평균 급여를 부서번호와 함께 출력하기
-- GROUP BY 컬럼명: 그룹핑할 컬럼명
SELECT
    DNO                AS "부서번호",
    TRUNC(AVG(SALARY)) AS "평균 급여"
FROM
    EMPLOYEE
GROUP BY -- 부서별로 그룹핑.
    DNO
ORDER BY
    DNO;

-- 연습문제: 부서번호, 직위별로 데이터 건수 및 총액 구하기
SELECT
    DNO,
    JOB,
    COUNT(*) AS "데이터 건수",
    SUM(SALARY)
FROM
    EMPLOYEE
GROUP BY
    DNO,
    JOB
ORDER BY
    DNO;

-- TODO: HAVIING 절 : GROUP BY 사용시 조건

-- 연습문제: 부서별로 급여 총액이 3000이상인 부서의 번호와 부서별 급여 총액 구하기
SELECT
    DNO,
    MAX(SALARY)
FROM
    EMPLOYEE
GROUP BY
    DNO
HAVING -- 그룹핑한 상태에서 조건을 걸고 싶을 때 사용하는 HAVING절
    MAX(SALARY) >= 3000;

-- 연습문제: 매니저를 제외하고 급여 총액이 5000이상인 직급별 총액 구하기.
SELECT
    JOB,
    COUNT(*),
    SUM(SALARY)
FROM
    EMPLOYEE
WHERE -- 일반 조건절
    JOB NOT LIKE '%MANAGER%'
GROUP BY
    JOB
HAVING -- 그룹핑 결과에 대한 조건절
    SUM(SALARY) >= 5000;