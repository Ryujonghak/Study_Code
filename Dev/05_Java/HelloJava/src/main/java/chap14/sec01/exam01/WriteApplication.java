package chap14.sec01.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * packageName : chap14.sec01.exam01
 * fileName : WriteApplication
 * author : ryujonghak
 * date : 2022/10/06
 * description : 1 byte 식 입/출력
 * 요약 :
 *      입출력 스트림(InputStream/OutputStream) : 자바에서는 데이터는 스트림을 통해 입출력됨
 *          읽기용/쓰기용에 따라 사용하는 클래스가 달라짐
 *      InputStream : 1byte 기반 입력(==읽기용) 스트림의 최상위 추상 클래스입니다.
 *          내부적으로 InputStream 을 상속받은 자식클래스들이 많음
 *          ex) 자식클래스 : DataInputStream, BufferedInputStream 등
 *      OuputStream : 1byte 기반 출력(==쓰기용) 스트림의 최상위 추상 클래스입니다.
 *          내부적으로 OutputStream 을 상속받은 자식클래스들이 많음
 *          ex) 자식클래스 : DataOutputStream, BufferedOutputStream 등
 *      Reader : 문자기반(char:2byte) 입력(==읽기용) 스트림의 최상위 추상 클래스입니다.
 *          내부적으로 Reader 을 상속받은 자식클래스들이 많음
 *      Writer : 문자기반(char:2byte) 출력(==쓰기용) 스트림의 최상위 추상 클래스입니다.
 *          내부적으로 Writer 을 상속받은 자식클래스들이 많음
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         ryujonghak          최초 생성
 */
// JAVA 입출력 객체: InputStream(1byte 입력, 읽기), OutputStream(1byte 출력, 쓰기), Reader(Char기반 입력), Writer(Char기반 출력) 최상위 클래스
//    Byte: XXXInputStream, XXXOutputStream
//    Char: XXXReader, XXXWriter
public class WriteApplication {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new FileOutputStream("src/main/resources/test1.db");
            byte a = 10;
            byte b = 20;
            byte c = 30;
//            버퍼로 데이터 이동 후 버퍼가 가득차거나 명령 실해 시 데이터 입/출력
            outputStream.write(a);
            outputStream.write(b);
            outputStream.write(c);

//            입출력 명령
            outputStream.flush();
//            버퍼 및 함수 닫기
            outputStream.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
