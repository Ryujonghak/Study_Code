-- 서브쿼리
-- 서브쿼리를 왜 사용하는가 : 밑의 상황과 같이 쿼리를 2번 필요하면 성능이 저하 -> 서브쿼리를 이용하여 1번으로 가능
-- 연습문제: SCOTT 보다 급여를 많이 받는 사원을 찾기 위한 쿼리문을 작성해야합니다.
SELECT
    ENAME,
    SALARY
FROM
    EMPLOYEE
WHERE
    ENAME = 'SCOTT';

-- 추가) 급여 3000보다 많이 받는 사원 검색
SELECT
    ENAME,
    SALARY
FROM
    EMPLOYEE
WHERE
    SALARY > 3000;

-- TODO: 서브쿼리란) 쿼리안에 쿼리가 있는것
-- TODO: 단일행 서브쿼리(1개의 행만 사용하는 것)
SELECT
    ENAME,
    SALARY
FROM
    EMPLOYEE
WHERE
    SALARY > (
        SELECT
            SALARY
        FROM
            EMPLOYEE
        WHERE
            ENAME = 'SCOTT'
    );

-- 연습문제: SCOTT와 동일한 부서에서 근무하는 사원 출력
SELECT
    ENAME,
    DNO
FROM
    EMPLOYEE
WHERE
    DNO = (
        SELECT
            DNO
        FROM
            EMPLOYEE
        WHERE
            ENAME = 'SCOTT'
    )
ORDER BY
    ENAME;

-- 연습문제: 최소급여를 받는 사원의 이름, 담당 업무, 급여 출력하기
SELECT
    ENAME,
    DNO,
    SALARY
FROM
    EMPLOYEE
WHERE
    SALARY = (
        SELECT
            MIN(SALARY)
        FROM
            EMPLOYEE
    )
ORDER BY
    ENAME;

-- 연습문제: 30번 부서에서 최소 급여를 구한 후 부서별 최소 급여가 구한 최소 급여보다 큰 부서만 출력하기
SELECT
    DNO,
    MIN(SALARY)
FROM
    EMPLOYEE
GROUP BY
    DNO
HAVING
    MIN(SALARY) > (
        SELECT
            MIN(SALARY)
        FROM
            EMPLOYEE
        WHERE
            DNO = 30
    );

-- 다중행 서브쿼리
-- 연습문제: 부서별 최소급여를 받는 사원의 사원번호와 이름을 출력하는 쿼리문을 작성하세요.
-- TODO: 여러개의 결과값이 나올경우 IN을 사용하여 해결가능.
SELECT
    ENO,
    ENAME,
    SALARY
FROM
    EMPLOYEE
WHERE
    SALARY IN (
        SELECT
            MIN(SALARY)
        FROM
            EMPLOYEE
        GROUP BY
            DNO
    );