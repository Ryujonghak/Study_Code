package chap14.sec02.exam06;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * packageName : chap14.sec02.exam06
 * fileName : ObjectApplication
 * author : ryujonghak
 * date : 2022/10/07
 * description : 객체 입출력 보조스트림
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         ryujonghak          최초 생성
 */
public class ObjectApplication {
    //    객체 쓰기 공유 함수
    public static void writeList() {
//        자료구조 : ArrayList
        List<Board> list = new ArrayList<>();

        list.add(new Board(1, "제목1", "내용1", "글쓴이1", new Date()));
        list.add(new Board(2, "제목2", "내용2", "글쓴이2", new Date()));
        list.add(new Board(3, "제목3", "내용3", "글쓴이3", new Date()));

//        기본 스트림 파일
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/board.txt");
//            보조스트림 객체를 파일로 사용할 수 있도록 해주는 기능
//            객체가 직렬화 기능을 상속받아야 함.(직렬화: 객체를 내부적으로 Byte로 변환시켜주는 기능(implements Serializable)
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(list);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }

    //    객체 읽기 공유 함수
    public static List<Board> readList() {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src/main/resources/board.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            List<Board> list = (List<Board>) objectInputStream.readObject(); // 역직렬화

            objectInputStream.close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        writeList();
        List<Board> list = readList();
//        화면에 객체 데이터 출력
//        날짜 포맷 수정
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        for (Board board : list) {
            System.out.println(
                    board.getBno() + "\t" +
                            board.getTitle() + "\t" +
                            board.getContent() + "\t" +
                            board.getWriter() + "\t" +
                            dateFormat.format(board.getDate())
            );
        }
    }
}
