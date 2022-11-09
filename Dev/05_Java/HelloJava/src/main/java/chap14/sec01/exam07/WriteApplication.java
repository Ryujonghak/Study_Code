package chap14.sec01.exam07;

import java.io.FileWriter;
import java.io.Writer;

/**
 * packageName : chap14.sec01.exam07
 * fileName : WriteApplication
 * author : ryujonghak
 * date : 2022/10/07
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         ryujonghak          최초 생성
 */
public class WriteApplication {
    public static void main(String[] args) {
//        파일 쓰기용(출력용) 열기(문자기반(char): 2byte)
        try {
            Writer writer = new FileWriter("src/main/resources/test7.txt");
            char a = 'A';
            char b = 'B';
            char c = 'C';
//            버퍼에 넣기
            writer.write(a);
            writer.write(b);
            writer.write(c);
//            버퍼에서 파일로 쓰기
            writer.flush();
//            Writer 객체 끄기
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }
}
