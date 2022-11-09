package chap13.sec01.verify.exam07;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : chap13.sec01.verify.exam07
 * fileName : BoardDao
 * author : ryujonghak
 * date : 2022/10/05
 * description : Map 인터페이스, 구현클래스()
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         ryujonghak          최초 생성
 */
public class BoardDao {
    public List<Board> getBoardList() {
        List<Board> list = new ArrayList<>();
        list.add(new Board("제목1","내용1"));
        list.add(new Board("제목2","내용2"));
        list.add(new Board("제목3","내용3"));

        return list;
    }
}
