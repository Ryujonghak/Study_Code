package chap14.sec02.exam05;

import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * packageName : chap14.sec02.exam05
 * fileName : PrintApplication
 * author : ryujonghak
 * date : 2022/10/07
 * description : 프린터 보조 스트림
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         ryujonghak          최초 생성
 */
public class PrintApplication {
    public static void main(String[] args) {
//        byte 기반 쓰기용 파일 열기
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/printStream.txt");
//            보조 스트림 사용: Print 기능 추가
            PrintStream printStream = new PrintStream(fileOutputStream);

            printStream.println("Hello World!");
            printStream.println(123);
            printStream.println(100.100);

            printStream.flush();
            printStream.close();
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }
}
