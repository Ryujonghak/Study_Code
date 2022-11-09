package chap14.sec01.exam05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * packageName : chap14.sec01.exam04
 * fileName : ReadApplication
 * author : ryujonghak
 * date : 2022/10/06
 * description :
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
            byte[] buffer = new byte[100];
            while (true) {
                int data = inputStream.read(buffer);
                if (data == -1) {
                    System.out.println("읽기 끝");
                    break;
                }
                System.out.println("읽어들인 수: " + data);
                for (int i = 0; i < data; i++) {
                    System.out.println((char) buffer[i]);
                }
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
