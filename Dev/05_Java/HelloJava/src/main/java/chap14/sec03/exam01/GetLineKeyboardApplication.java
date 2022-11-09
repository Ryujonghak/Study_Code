package chap14.sec03.exam01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * packageName : chap14.sec03.exam01
 * fileName : GetLineKeyboardApplication
 * author : ryujonghak
 * date : 2022/10/07
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         ryujonghak          최초 생성
 */
// System.in : 키보드로 부터 입력
// System.out : 모니터로 출력
public class GetLineKeyboardApplication {
    public static void main(String[] args) throws Exception {
//        기본스트림(byte) <- 키보드 입력
        InputStream inputStream = System.in;
//        byte + 문자기반 보조스트림 기능 추가
        Reader reader = new InputStreamReader(inputStream);
//        성능향상 보조스트림 기능 추가
//        최종적으로 : 기본 + 문자기반 + 성능향상 기능 추가
//        BufferedXX 보조스트림 : .readLine() 한줄씩 읽는 함수 있음
        BufferedReader bufferedReader = new BufferedReader(reader);

        while (true) {
            System.out.print("입력하세요: ");
            String lineStr = bufferedReader.readLine(); // 한줄씩 읽기
//            종료 조건
            if (lineStr.equals("q") || lineStr.equals("quit")) break;
            System.out.print("입력된내용: " + lineStr);
            System.out.println(); // 줄바꿈
        }

        bufferedReader.close(); // 입출력 스트림 닫기
    }
}
