-- 2. 숫자 함수들
-- TODO: ROUDND(): 특정 자리수에서 반올림하는 함수
SELECT
    98.7654,
    ROUND(98.7654),
    ROUND(98.7654,
    2)
FROM
    DUAL;

-- TODO: TRUNC(숫자, 짤라낼 자리수): 특정 자리수에서 버림(잘라냄, 절삭)
SELECT
    98.7654,
    TRUNC(98.7654),
    TRUNC(98.7654,
    2)
FROM
    DUAL;

-- TODO: MOD(숫자, 나눌값): 입력 받은 수를 나눈 나머지 결과를 반환한다.
SELECT
    MOD(31,
    2),
    MOD(31,
    5),
    MOD(31,
    8)
FROM
    DUAL;

-- 연습문제: 모든 사원의 급여를 500으로 나눈 나머지를 계산해서 출력하세요.
SELECT
    MOD(SALARY,
    500)
FROM
    EMPLOYEE;

-- 3. 날짜 함수들
-- 1) 현재날씨 표기하기
SELECT
    SYSDATE
FROM
    DUAL;

-- 응용문제: 오늘을 기준으로 어제, 오늘, 내일날짜를 화면에 출력하세요.
SELECT
    SYSDATE     AS "오늘",
    SYSDATE - 1 AS "어제",
    SYSDATE + 1 AS "내일"
FROM
    DUAL;

-- 도전과제: 모든 사원의 근무일수 계산하기
SELECT
    HIREDATE                AS "입사일",
    ROUND(SYSDATE-HIREDATE) AS "근무일수"
FROM
    EMPLOYEE;

-- 참고) 날짜포함 시간 출력하기
-- 2) TO_CHAR(날짜형 컬럼, 포맷): 포맷 = 'yyyy-mm-dd hh24:mi:ss'
SELECT
    TO_CHAR(SYSDATE,
    'yyyy-mm-dd hh24:mi:ss')
FROM
    DUAL;

-- 참고) SQL DEV 환경설정에서 수정가능 -> 메뉴: DATABASE - NLS - 날짜형식: 'yyyy-mm-dd hh24:mi:ss'
SELECT
    SYSDATE
FROM
    DUAL;

-- 특정날짜에서 월을 기준으로 버림한 날짜 구하기
-- 날짜버림: 월 기준으로 일, 시간이 초기화됨(일 -01, 시간 - 00:00:00)
SELECT
    HIREDATE,
    TRUNC(HIREDATE,
    'MONTH')
FROM
    EMPLOYEE;

-- 3) MONTHS_BETWEEN(대상일(컬럼), 대상일(컬럼)): 날짜와 날짜사이의 개월수를 구하는 함수
-- 연습문제: 각 사원들이 근무한 개월 수 구하기
SELECT
    ENAME,
    SYSDATE    AS "현재 날짜",
    HIREDATE   AS "입사한 날짜",
    TRUNC(MONTHS_BETWEEN(SYSDATE,
    HIREDATE)) AS "근무한 개월 수"
FROM
    EMPLOYEE;

-- 4) ADD_MONTHS(대상일(컬럼), 더할 수): 특정 개월 수를 더하는 함수
SELECT
    ENAME,
    HIREDATE,
    ADD_MONTHS(HIREDATE,
    6)
FROM
    EMPLOYEE;

-- 5)  NEXT_DAY(날짜컬럼, '요일'): 해당 날짜를 기준으로 최초로 도래하는 요일에 해당하는 날짜를 구하는 함수
SELECT
    SYSDATE,
    NEXT_DAY(SYSDATE,
    'sat')
FROM
    DUAL;

-- 6) LAST_DAY(날짜컬럼): 해당 날짜가 속한 달의 마지막 날짜를 출력하는 함수
SELECT
    ENAME,
    HIREDATE,
    LAST_DAY(HIREDATE) AS "마지막 날짜"
FROM
    EMPLOYEE;

-- 4. 형변환 함수
-- TODO: 1) TO_CHAR(칼럼, 포맷): 날짜형 혹은 숫자형을 문자형으로 변환하는 함수
-- 참고) 포맷 종류: yyyy(연도(2~4자리 표현가능)), mm(월), dd(일), DAY(요일), hh(12시간), hh24(24시간), MI(분), SS(초)
-- 연습문제: 사원들의 입사일에서 입사년도와 월만 출력하고, 두번째는 요일까지 출력하세요.
SELECT
    ENAME,
    HIREDATE,
    TO_CHAR(HIREDATE,
    'yy-mm' /*NCHAR NCHAR*/ )          AS "년도/일",
    TO_CHAR(HIREDATE,
    'yyyy/mm/dd DAY' /*NCHAR NCHAR*/ ) AS "요일까지"
FROM
    EMPLOYEE;

-- 연습문제: 현재날짜와 시간을 표현하세요.
SELECT
    TO_CHAR(SYSDATE,
    'yyyy/mm/dd, hh24:mi:ss' /*NCHAR NCHAR*/ )
FROM
    DUAL;

-- TO_CHAR(숫자 컬럼, 숫자 포맷): 숫자를 문자로 변환
-- 숫자 포맷: L(각나라별 통화 기호를 붙여줌(₩, $등), 0(3자리를 잡고 자리수가 부족하면 0으로 채움), 9(자리수가 부족하면 안채워줌)
-- 급여를 출력하면서 통화기호를 포함해서 출력하세요.
SELECT
    ENAME,
    TO_CHAR(SALARY,
    'L999,999') AS "SALARY"
FROM
    EMPLOYEE;

-- TODO: 2) TO_DATE(컬럼, 숫자포맷): 문자를 숫자로 바꾸어주는 함수
-- 1981년 2월 20일에 입사한 사원 검색하기
SELECT
    ENAME,
    HIREDATE
FROM
    EMPLOYEE
WHERE
    HIREDATE = TO_DATE(19810220,
    'YYYYMMDD');

-- 3) TO_NUMBER(문자컬럼, 포맷): 숫자 형태의 문자빼기
SELECT
    TO_NUMBER('100,000',
    '999,999') - TO_NUMBER('50,000',
    '999,999') AS "TEST"
FROM
    DUAL;

-- 5. 일반 함수들
-- TODO: 1) NVL(NULL이 포함된 컬럼, 변경할 숫자(문자)): NULL -> 숫자(문자)로 변경

-- TODO: 2) DECODE(대상칼럼, 조건식 = 조건N, 결과N ..., 조건이 안되면 '실패'): SQL에서 조건문을 표시하는 함수
-- DECODE로 부서이름 출력하기
SELECT
    ENAME,
    DNO,
    DECODE(DNO,
    10,
    '회계부',
    20,
    '연구소',
    30,
    '판매부',
    40,
    '운영부',
    '디폴트')
FROM
    EMPLOYEE
ORDER BY
    DNO;

-- TODO: 참고) CASE WHEN(): DECODE와 같음.(조건식 표현)
SELECT
    ENAME,
    DNO,
    CASE
        WHEN DNO = 10 THEN
            '회계부'
        WHEN DNO = 20 THEN
            '연구소'
        WHEN DNO = 30 THEN
            '판매부'
        WHEN DNO = 40 THEN
            '운영부'
        ELSE
            '디폴트'
    END AS 부서명
FROM
    EMPLOYEE
ORDER BY
    DNO;