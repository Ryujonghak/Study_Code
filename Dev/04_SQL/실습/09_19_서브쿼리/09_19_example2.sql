-- 서브쿼리 종합연습문제
-- 1) 사원번호가 7788인 사원과 담당 업무가 같은 사원을(사원이름,담당업무) 표시하세요.
SELECT
    ENAME,
    JOB,
    ENO
FROM
    EMPLOYEE
WHERE
    JOB = (
        SELECT
            JOB
        FROM
            EMPLOYEE
        WHERE
            ENO = 7788
    )
ORDER BY
    ENAME;

-- 2) 사원번호가 7499인 사원보다 급여가 많은 사원을(사원이름,담당업무) 표시하세요.
SELECT
    ENAME,
    SALARY,
    ENO
FROM
    EMPLOYEE
WHERE
    SALARY > (
        SELECT
            SALARY
        FROM
            EMPLOYEE
        WHERE
            ENO = 7499
    )
ORDER BY
    ENAME;

-- 3) 최소 급여를 받는 사원의 이름, 담당 업무 및 급여를 표시하세요.
-- 힌트 : 그룹함수 사용
SELECT
    ENAME,
    JOB,
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

-- 4) 평균 급여가 가장 적은 사원의 담당 업무를 찾아 직급과 평균 급여를 표시하세요.
--  == 담당 업무별 평균 급여가 가장 적은 사람을 찾아 직급과 평균 급여를 표시하세요.
SELECT
    JOB,
    ROUND(AVG(SALARY),
    1)
FROM
    EMPLOYEE
GROUP BY
    JOB
HAVING
    ROUND(AVG(SALARY),
    1) = (
        SELECT
            MIN(ROUND(AVG(SALARY),
            1))
        FROM
            EMPLOYEE
        GROUP BY
            JOB
    );

-- 5) 각 부서의 최소 급여를 받는 사원의 이름, 급여, 부서번호를 표시하세요.
SELECT
    ENAME,
    SALARY,
    DNO
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
    )
ORDER BY
    DNO;

-- 6) 매니저가 없는 사원의 이름을 표시하세요.
SELECT
    ENAME
FROM
    EMPLOYEE
WHERE
    ENAME = (
        SELECT
            ENAME
        FROM
            EMPLOYEE
        WHERE
            MANAGER IS NULL
    );

-- 7) 매니저가 있는 사원의 이름을 표시하세요.
SELECT
    ENAME
FROM
    EMPLOYEE
WHERE
    ENAME IN (
        SELECT
            ENAME
        FROM
            EMPLOYEE
        WHERE
            MANAGER IS NOT NULL
    );

-- 8) BLAKE와 동일한 부서에 속한 사원의 이름과 입사일을 표시하는 질의를 작성하세요. 단, BLAKE는 제외
SELECT
    ENAME,
    HIREDATE
FROM
    EMPLOYEE
WHERE
    DNO = (
        SELECT
            DNO
        FROM
            EMPLOYEE
        WHERE
            ENAME = 'BLAKE'
    )
 -- AND ENAME != 'BLAKE';
    AND ENAME <> 'BLAKE';

-- 9) 급여가 평균 급여보다 많은 사원들의 사원번호와 이름을 표시하되 결과를 급여에 대해서 오름차순으로 정렬하세요.
SELECT
    ENAME,
    ENO,
    SALARY
FROM
    EMPLOYEE
WHERE
    SALARY > (
        SELECT
            ROUND(AVG(SALARY))
        FROM
            EMPLOYEE
    )
ORDER BY
    SALARY;

-- 10) 이름에 K가 포함된 사원과 같은 부서에서 일하는 사원의 사원번호와 이름을 표시하는
-- 질의를 작성하세요.

SELECT
    ENAME,
    ENO,
    SALARY
FROM
    EMPLOYEE
WHERE
    ENAME IN (
        SELECT
            ENAME
        FROM
            EMPLOYEE
        WHERE
            ENAME LIKE '%K%'
    )
ORDER BY
    ENAME;

-- 11) 부서 위치가 DALLAS인 사원의 이름과 부서번호 및 담당 업무를 표시하세요.
SELECT
    EMPLOYEE.ENAME,
    EMPLOYEE.DNO,
    EMPLOYEE.JOB,
    DEPARTMENT.DNAME,
    DEPARTMENT.LOC
FROM
    EMPLOYEE,
    DEPARTMENT
WHERE
    EMPLOYEE.DNO = DEPARTMENT.DNO
    AND DEPARTMENT.LOC = (
        SELECT
            LOC
        FROM
            DEPARTMENT
        WHERE
            LOC = 'DALLAS'
    )
ORDER BY
    EMPLOYEE.ENAME;

-- 12) KING에게 보고하는 사원의 이름과 급여를 표시하세요.
SELECT
    ENAME,
    SALARY
FROM
    EMPLOYEE
WHERE
    MANAGER = (
        SELECT
            ENO
        FROM
            EMPLOYEE
        WHERE
            ENAME = 'KING'
    );

-- 13) RESEARCH 부서의 사원에 대한 부서번호, 사원이름 및 담당 업무를 표시하세요.

SELECT
    EMPLOYEE.ENAME,
    DNO,
    EMPLOYEE.JOB
FROM
    EMPLOYEE
WHERE
    DNO IN (
        SELECT
            DNO
        FROM
            DEPARTMENT
        WHERE
            DNAME = 'RESEARCH'
    );

-- 14) 평균 급여보다 많은 급여를 받고 이름에 M이 포함된 사원과 같은 부서에서 근무하는
--    사원의 사원번호, 이름, 급여를 표시하세요.
SELECT
    ENO,
    ENAME,
    SALARY
FROM
    EMPLOYEE
WHERE
    SALARY > (
        SELECT
            AVG(SALARY)
        FROM
            EMPLOYEE
    )
    AND DNO IN (
        SELECT
            DNO
        FROM
            EMPLOYEE
        WHERE
            ENAME LIKE '%M%'
    );

-- 15) 평균 급여가 가장 적은 업무를 찾으세요.
SELECT
    JOB,
    AVG(SALARY)
FROM
    EMPLOYEE
GROUP BY
    JOB
HAVING
    AVG(SALARY) = (
        SELECT
            MIN(AVG(SALARY))
        FROM
            EMPLOYEE
        GROUP BY
            JOB
    );