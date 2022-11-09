package chap14.sec01.exam02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * packageName : chap14.sec01.exam02
 * fileName : WriteApplication
 * author : ryujonghak
 * date : 2022/10/06
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         ryujonghak          최초 생성
 */
public class WriteApplication {
    public static void main(String[] args) {
//        파일을 쓰기용(출력)으로 열기
        try {
            OutputStream outputStream = new FileOutputStream("src/main/resources/test2.txt");
            byte[] bytes = {65, 66, 67, 68, 69};

            outputStream.write(bytes);
//            outputStream.write(bytes, 1, 3);

            outputStream.flush();
            outputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
