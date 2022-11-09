package chap14.sec01.exam04;

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
        try {
            InputStream inputStream = new FileInputStream("src/main/resources/test2.txt");
            while (true) {
                int data = inputStream.read();
                if(data == -1) {
                    break;
                }
            System.out.println((char)data);
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
