package chap14.sec01.exam06;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * packageName : chap14.sec01.exam04
 * fileName : ReadApplication
 * author : ryujonghak
 * date : 2022/10/06
 * description : 지정된 길이 만큼 읽기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         ryujonghak          최초 생성
 */
public class ReadApplication {
    public static void main(String[] args) {
//        한번에 크게 읽기용으로 배열 크기 설정
        try {
            InputStream inputStream = new FileInputStream("src/main/resources/test2.txt");
            byte[] buffer = new byte[5];
            int data = inputStream.read(buffer, 2, 3);

            System.out.println("읽어들인 수: " + data);
            if (data != -1) {
                for (int i = 0; i < buffer.length; i++) {
                    System.out.println((char) buffer[i]);
                }
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getClass());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
