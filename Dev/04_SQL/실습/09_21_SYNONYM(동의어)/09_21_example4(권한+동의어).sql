-- 종합 연습 문제
-- 1) KBS라는 사용자를 생성하세요.(PWD: PASS)
CREATE USER KBS IDENTIFIED BY PASS;

-- 2) 기본적인 권한 부여를 하지 않으면 데이터베이스에 로그인이 불가능하므로,
--    CONNECT, RESOURCE 롤을 KBS 사용자에게 부여하세요.
GRANT CONNECT, RESOURCE TO KBS;