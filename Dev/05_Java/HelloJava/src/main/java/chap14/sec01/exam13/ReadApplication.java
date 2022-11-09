package chap14.sec01.exam13;

import java.io.FileReader;
import java.io.Reader;

/**
 * packageName : chap14.sec01.exam11
 * fileName : ReadApplication
 * author : ryujonghak
 * date : 2022/10/07
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         ryujonghak          최초 생성
 */
public class ReadApplication {
    public static void main(String[] args) {
//        파일 읽기용(입력)으로 열기
        try {
            Reader reader = new FileReader("src/main/resources/test9.txt");
            char[] buffer = new char[1024];

            while (true) {
                int data = reader.read(buffer, 0, buffer.length);
                if (data != -1) {
                    for (int i = 0; i < data; i++) {
                        System.out.println(buffer[i]);
                    }
                } else {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getClass());
        }

    }
}
