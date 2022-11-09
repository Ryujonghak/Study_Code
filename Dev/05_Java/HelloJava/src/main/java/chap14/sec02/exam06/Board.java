package chap14.sec02.exam06;

import java.io.Serializable;
import java.util.Date;

/**
 * packageName : chap14.sec02.exam06
 * fileName : Board
 * author : ryujonghak
 * date : 2022/10/07
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         ryujonghak          최초 생성
 */
// 순수 객체(모델, Model): 속성, 생성장, Set/Getter 만 있음.(목적: 데이터 저장/검색용)
//    Service: 업무가 들어가 있는 객체
//    Controller: 여러 화면(View)을 조작하는 클래스
//    MVC 디자인 패턴: M(Model) / V(View) / C(Controller)
public class Board implements Serializable {
//    속성: 게시판 번호, 제목, 내용, 글쓴이, 작성날짜
    private int bno;
    private String title;
    private String content;
    private String writer;
    private Date date;

    public Board(int bno, String title, String content, String writer, Date date) {
        this.bno = bno;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
