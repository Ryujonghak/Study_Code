-- 연습문제 1번 : 뷰(VIEW) 실습
-- 1) 20번 부서에 소속된 사원의 사원번호와 이름과 부서번호를 출력하는 VIEW를 정의하시오.
CREATE VIEW V_EMP_DNO AS
    SELECT
        ENO,
        ENAME,
        DNO
    FROM
        EMPLOYEE
    WHERE
        DNO = 20;

-- VIEW 조회
SELECT
    *
FROM
    V_EMP_DNO;

-- 2) 이미 생성되어 있는 상기 뷰에 대해 급여 역시 출력하도록 수정하시오.
CREATE OR REPLACE VIEW V_EMP_DNO AS

SELECT
    ENO,
    ENAME,
    DNO,
    SALARY
FROM
    EMPLOYEE
WHERE
    DNO = 20;

-- VIEW 조회
SELECT
    *
FROM
    V_EMP_DNO;

-- 3) 생성된 뷰를 제거하세요(VW_EMP_DNO)
DROP VIEW V_EMP_DNO;