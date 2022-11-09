package chap13.sec01.exam02;

/**
 * packageName : chap11.chap13.sec01.exam02
 * fileName : Board
 * author : ryujonghak
 * date : 2022/10/05
 * description : Board 객체를 저장하는 Vector
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         ryujonghak          최초 생성
 */

// Vector: 멀티쓰레드 환경(프로그래밍) 사용하는 자료구조, ArrayList와 거의 유사
//    멀티쓰레드 시 동기화를 해주어야 하는데 Vector자료구조 사용시 자동으로 동기화가 이루어짐.
public class Board {
    String subject;
    String content;
    String writer;

    public Board(String subject, String content, String writer) { // 속성 Init
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }
}
