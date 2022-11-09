-- scott/tiger : 실습  계정
-- 유저 만드는 명령어
-- create user 계정명 identified by 패스워드
CREATE USER SCOTT95 IDENTIFIED BY TIGER;
-- 권한(GRANT) : 접속, 리소드 사용권한 줘야됨
-- 권한 종류 : CONNECT(접속), RESOURCE(테이블, 인덱스, 함수 등), UNLIMITED TABLESPACE(물리적인 공간(테이블이 저장된 공간))
GRANT CONNECT, RESOURCE, UNLIMITED TABLESPACE TO SCOTT95;
-- 유저가 사용하는 공간 줘야함 :전용공간, 임시공간
-- SQL 문법 : ALTER USER 계정명 DEFAULT TABLESPACE 전용공간명(USERS);
ALTER USER SCOTT95 DEFAULT TABLESPACE USERS;
-- ALTER USER 계정명 TEMPORARY TABLESPACE 임시공간(TEMP);
ALTER USER SCOTT95 TEMPORARY TABLESPACE TEMP;
-- 수정 alter
alter user scott95 identified by tiger;
-- 패스워드 락 풀기
alter user scott95 ACCOUNT UNLOCK;
