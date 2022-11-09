-- (조인 적용 X)사원 번호가 7788인 직원의 부서명은?
SELECT
    DNO
FROM
    EMPLOYEE
WHERE
    ENO = 7788;

-- QUERY(질의)를 2번 발생해서 찾아야함.(성능 저하)
SELECT
    DNAME
FROM
    DEPARTMENT
WHERE
    DNO = 20;

-- 조인 적용 조건: 동일한 컬럼이 필요(자료형, 데이터도 비슷해야함.).
-- 기본적으로는 inner join 이며 추가적으로 natural, outer 등이 있다.
SELECT
    ENO,
    DNAME
 -- 테이블명 옆에 바로 별칭을 붙일수 있음: EMPLOYEE Emp
 -- natural join 에서는 별칭 사용 불가: DEP.DNO
FROM
    EMPLOYEE
    NATURAL JOIN DEPARTMENT
 -- ON EMPLOYEE.DNO = DEPARTMENT.DNO
WHERE
    ENO = 7788;

-- 연습문제: 사원번호가 7499 또는 7900인 사원들에 소속된 부서정보를 모두 출력하세요.
SELECT
    *
FROM
    DEPARTMENT
    NATURAL JOIN EMPLOYEE
WHERE
    ENO IN(7499,
    7900);

SELECT
    *
 -- DEPARTMENT.DNO,
 -- DEPARTMENT.DNAME,
 -- DEPARTMENT.LOC
FROM
    DEPARTMENT
    JOIN EMPLOYEE
    ON EMPLOYEE.DNO = DEPARTMENT.DNO
WHERE
    ENO IN(7499, 7900);

-- 연습문제: 사원번호가 7500 ~ 7700 사이에 있는 사원들의 소속된 부서정보를 출력하되 부서이름이 SALES 인 파트만 출력하세요.
SELECT
    *
FROM
    DEPARTMENT
    JOIN EMPLOYEE
    ON EMPLOYEE.DNO = DEPARTMENT.DNO
WHERE
    (ENO BETWEEN 7500
    AND 7700)
    AND (DNAME = 'SALES');

-- TODO: 1)Equal join: 같은 데이터를 연결하는 조인
SELECT
    *
FROM
    EMPLOYEE,
    DEPARTMENT
WHERE
    EMPLOYEE.DNO = DEPARTMENT.DNO
    AND ENO BETWEEN 7500
    AND 7700
    AND DNAME = 'SALES';

-- TODO: 2)범위조인: 특정 범위내에 있는것을 대상으로 조인.
-- 연습문제: 사원별로 급여 등급 출력하기
SELECT
    ENAME,
    SALARY,
    GRADE
FROM
    EMPLOYEE,
    SALGRADE
WHERE
    EMPLOYEE.SALARY BETWEEN SALGRADE.LOSAL
    AND SALGRADE.HISAL;

-- TODO: 3)Self join: 자기 자신과 다시 조인을 하는 것을 의미
-- 연습문제: 사원테이블에는 MANAGER 컬럼이 있는데 사번으로 되어있습니다. 사원의 매니저 이름을 출력하고 싶습니다.
SELECT
    EMPLOYEE.ENAME AS "사원이름",
    MANAGER.ENAME  AS "직속상관이름"
FROM
    EMPLOYEE,
    EMPLOYEE MANAGER
WHERE
    EMPLOYEE.MANAGER = MANAGER.ENO;

-- 이퀄조인 시 조인하는 테이블간에 NULL값이 있으면 NULL값을 제외하고 조인함.
-- TODO: 4) Outer join: NULL 값이 포함된 행도 출력되게 조인하는 방법(NULL값이 있는 테이블 이름 끝에 (+)기호를 붙임.)
-- 연습문제: 사원테이블에 아우터 조인하여 매니저가 없는 사원의 이름도 출력하세요.
SELECT
 -- EMPLOYEE.ENAME AS "사원이름",
 -- MANAGER.ENAME  AS "직속상관이름"
    EMPLOYEE.ENAME || ' 의 지속 상관은 ' || MANAGER.ENAME
FROM
    EMPLOYEE,
    EMPLOYEE MANAGER
WHERE
    EMPLOYEE.MANAGER = MANAGER.ENO(+);