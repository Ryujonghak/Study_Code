
DROP TABLE TB_COMMENT CASCADE CONSTRAINT;

CREATE TABLE TB_COMMENT(
                           CID NUMBER NOT NULL,
                           COMMENT_CONTENT VARCHAR2(3000) ,
                           COMMENT_WRITER VARCHAR2(256) ,
                           BID NUMBER ,
                           INSERT_TIME VARCHAR2(50) ,
                           UPDATE_TIME VARCHAR2(50)
);

ALTER TABLE TB_COMMENT ADD CONSTRAINT PK_COMMENT_ID PRIMARY KEY(CID);

DROP SEQUENCE SQ_COMMENT;

CREATE SEQUENCE SQ_COMMENT
    INCREMENT BY 1 START WITH 1
    MINVALUE 1
    MAXVALUE 99999999;


INSERT INTO TB_COMMENT VALUES (SQ_COMMENT.nextval,'댓글_내용','홍길동',1  ,TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), null);
INSERT INTO TB_COMMENT VALUES (SQ_COMMENT.nextval,'댓글_내용2','장길산',1 , TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), null);
INSERT INTO TB_COMMENT VALUES (SQ_COMMENT.nextval,'댓글_내용3','임꺽정',2 , TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), null);
INSERT INTO TB_COMMENT VALUES (SQ_COMMENT.nextval,'댓글_내용4','전우치',3 , TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), null);


DROP TABLE TB_BOARD CASCADE CONSTRAINT;

CREATE TABLE TB_BOARD (
                          BID NUMBER NOT NULL ,
                          BOARD_TITLE VARCHAR2(256) ,
                          BOARD_CONTENT VARCHAR2(255),
                          BOARD_WRITER VARCHAR2(255) ,
                          VIEW_CNT NUMBER DEFAULT 0,
                          INSERT_TIME VARCHAR2(50),
                          UPDATE_TIME VARCHAR2(50)
);

ALTER TABLE TB_BOARD ADD CONSTRAINT PK_BOARD_ID PRIMARY KEY(BID);

DROP SEQUENCE SQ_BOARD;

CREATE SEQUENCE  SQ_BOARD
    MINVALUE 1 MAXVALUE 99999999
    INCREMENT BY 1 START WITH 1;



INSERT INTO TB_BOARD VALUES (SQ_BOARD.nextval, '제목','내용','전우치',  1, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), null);
INSERT INTO TB_BOARD VALUES (SQ_BOARD.nextval, '제목2','내용2','임꺽정',1,  TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), null);
INSERT INTO TB_BOARD VALUES (SQ_BOARD.nextval, '제목3','내용3','장길산',1,  TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), null);
INSERT INTO TB_BOARD VALUES (SQ_BOARD.nextval, '제목4','내용4','홍길동',1,  TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), null);
INSERT INTO TB_BOARD VALUES (SQ_BOARD.nextval, '제목','내용5','전우치',  1, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), null);
INSERT INTO TB_BOARD VALUES (SQ_BOARD.nextval, '제목2','내용6','임꺽정',1,  TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), null);
INSERT INTO TB_BOARD VALUES (SQ_BOARD.nextval, '제목3','내용7','장길산',1,  TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), null);
INSERT INTO TB_BOARD VALUES (SQ_BOARD.nextval, '제목4','내용8','홍길동',1,  TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), null);
INSERT INTO TB_BOARD VALUES (SQ_BOARD.nextval, '제목','내용9','전우치',  1, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), null);
INSERT INTO TB_BOARD VALUES (SQ_BOARD.nextval, '제목2','내용10','임꺽정',1,  TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), null);
INSERT INTO TB_BOARD VALUES (SQ_BOARD.nextval, '제목3','내용11','장길산',1,  TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), null);
INSERT INTO TB_BOARD VALUES (SQ_BOARD.nextval, '제목4','내용12','홍길동',1,  TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), null);
INSERT INTO TB_BOARD VALUES (SQ_BOARD.nextval, '제목','내용13','전우치',  1, TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), null);
INSERT INTO TB_BOARD VALUES (SQ_BOARD.nextval, '제목2','내용14','임꺽정',1,  TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), null);
INSERT INTO TB_BOARD VALUES (SQ_BOARD.nextval, '제목3','내용15','장길산',1,  TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), null);
INSERT INTO TB_BOARD VALUES (SQ_BOARD.nextval, '제목4','내용16','홍길동',1,  TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'), null);