-- 특이조회
-- TODO: inline View: 간이 조회형태로 사용.
SELECT
    *
FROM
    DEPARTMENT,
    EMPLOYEE
WHERE
    DEPARTMENT.DNO = EMPLOYEE.DNO
    AND DEPARTMENT.DNO IN (10,
    20);

-- 위의 쿼리를 inline View를 이용하는 쿼리로 전환(서브쿼리와 형태가 비슷)
SELECT
    *
FROM
    (
        SELECT
            *
        FROM
            DEPARTMENT
        WHERE
            DNO IN (10,
            20)
    ) DEPARTMENT,
    EMPLOYEE
WHERE
    DEPARTMENT.DNO = EMPLOYEE.DNO;

-- TODO: UNION ALL: 합집합
SELECT
    DNO,
    DNAME
FROM
    DEPARTMENT UNION ALL
    SELECT
        DNO,
        DNAME
    FROM
        DEPARTMENT;

-- TODO: UNION: 합집합(데이터 중복 제거), UNION ALL보다 성능이 떨어짐(합치고 중복제거로 추가작업이 있기 떄문.)
SELECT
    DNO,
    DNAME
FROM
    DEPARTMENT UNION
    SELECT
        DNO,
        DNAME
    FROM
        DEPARTMENT;

-- TODO: MINUS: 차집합 개념(데이터를 비교해서 같은 데이터는 제거하고 남는거만 화면에 출력함.)
SELECT
    DNO,
    DNAME
FROM
    DEPARTMENT MINUS
    SELECT
        DNO,
        DNAME
    FROM
        DEPARTMENT;