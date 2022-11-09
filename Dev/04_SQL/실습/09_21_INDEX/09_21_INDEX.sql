-- TODO: index: 조회속도(성능) 향상을 위해 조건에 해당하는 컬럼에 생성함.
-- TODO: 데이터사전: USER_INDEX_COLUMNS
SELECT
    INDEX_NAME,
    TABLE_NAME,
    COLUMN_NAME
FROM
    USER_IND_COLUMNS
WHERE
    TABLE_NAME IN ('EMPLOYEE',
    'DEPARTMENT');

-- TODO: 인덱스 생성: CREATE INDEX 인덱스명 ON 테이블명(컬럼명);
-- EMPLOYEE.ENAME에 인덱스 적용(생성)하기
CREATE INDEX IDX_EMPLOYEE_ENAME ON EMPLOYEE(
    ENAME
);

SELECT
    *
FROM
    EMPLOYEE
WHERE
    ENO = 7369;

-- TODO: 인덱스 삭제: DROP INDEX 인덱스명;
DROP INDEX IDX_EMPLOYEE_ENAME;

-- TODO: 인덱스를 적용해야할 경우:
-- TODO 1.테이블의 행의 수가 많을 경우(데이터가 많을 경우), 2.WHERE(조건)절에 특정 컬럼이 많이 사용될 경우, 3.JOIN에 자주 사용되는 컬럼

-- TODO: 특수한 INDEX
-- TODO: 결합 INDEX: 찾는 컬럼이 자주 같이 등장하는 컬럼 끼리 결합.
CREATE INDEX IDX_DEPT_COM ON DEPARTMENT(
    DNAME,
    LOC
);

-- 검색형태
SELECT
    *
FROM
    DEPARTMENT
WHERE
    DNAME = 'SALES'
    AND LOC = 'NEW YORK';

-- INDEX 삭제
DROP INDEX IDX_DEPT_COM;

-- TODO: 함수 INDEX: 컬럼과 논리적으로 계산되어 검색되면 빨리 찾도록 생성.
CREATE INDEX IDX_EMP_ANNSAL ON EMPLOYEE(
    SALARY*12
);

-- INDEX 삭제
DROP INDEX IDX_EMP_ANNSAL;