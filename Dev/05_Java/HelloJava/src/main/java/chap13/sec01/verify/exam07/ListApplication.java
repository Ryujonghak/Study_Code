package chap13.sec01.verify.exam07;

import java.util.List;

/**
 * packageName : chap13.sec01.verify.exam07
 * fileName : ListApplication
 * author : ryujonghak
 * date : 2022/10/05
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         ryujonghak          최초 생성
 */
public class ListApplication {
    public static void main(String[] args) {
        BoardDao dao = new BoardDao();
        List<Board> list = dao.getBoardList();

        for(Board board : list) {
            System.out.println(board.getTitle() + "-" + board.getContent());
        }
    }

}
