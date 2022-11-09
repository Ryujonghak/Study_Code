package chap13.sec01.exam02;

import java.util.List;
import java.util.Vector;

/**
 * packageName : chap13.sec01.exam02
 * fileName : BoardApplication
 * author : ryujonghak
 * date : 2022/10/05
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         ryujonghak          최초 생성
 */
public class BoardApplication {
    public static void main(String[] args) {
        List<Board> list = new Vector<>();

        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        list.remove(2);
        list.remove(3);

        for (Board b : list) {
            System.out.println(b.subject + ", " + b.content + ", " + b.writer);
        }

//        list.remove(index n);
    }
}
