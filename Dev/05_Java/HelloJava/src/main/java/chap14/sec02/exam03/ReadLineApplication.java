package chap14.sec02.exam03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/**
 * packageName : chap14.sec02.exam03
 * fileName : ReadLineApplication
 * author : ryujonghak
 * date : 2022/10/07
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         ryujonghak          최초 생성
 */
public class ReadLineApplication {
    public static void main(String[] args) throws Exception {
//        문자기반(char) 파일 읽기용으로 열기
        Reader reader = new FileReader("src/main/resources/language.txt");
//        보조스트림: 버퍼가 있는 읽기
        BufferedReader bufferedReader = new BufferedReader(reader);

        String data;
        while (true) {
            data = bufferedReader.readLine();
            if (data == null) break;
            System.out.println(data);
        }
        bufferedReader.close();
    }
}
