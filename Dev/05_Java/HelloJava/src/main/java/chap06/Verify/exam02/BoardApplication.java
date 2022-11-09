package chap06.Verify.exam02;

/**
 * packageName : chap06.Verify.exam02
 * fileName : BoardApplication
 * author : ryujonghak
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         ryujonghak          최초 생성
 */
public class BoardApplication {
    public static void main(String[] args) {
        Board board = new Board("제목", "내용");

        System.out.println("title: " + board.title);
        System.out.println("content: " + board.content);
    }
}
