package chap14.sec02.exam01;

import java.io.*;

/**
 * packageName : chap14.sec02.exam01
 * fileName : CharConvertApplication
 * author : ryujonghak
 * date : 2022/10/07
 * description : 보조 스트림(문자 변환 보조 스트림)
 * 요약 :
 *      보조 스트림 : 다른 스트림과 연결되어 편리한 기능 제공해주는 객체
 *          데코레이션(장식) 패턴이 적용됨
 *          사용법 : new 보조스트림(기본스트림)
 *          종류 : 문자 변환, 입출력성능향상, 기본자료형 입출력, 객체 직렬화 등
 *      문자 변환 : 소스파일이 바이트기반 입출력이고 문자라면 Reader, Writer로 변환을 고려
 *          OutputStreamWriter, InputStreamReader
 *      성능 향상 : 기본적으로 InputStream/OutputStream 조그만 버퍼가 있음
 *          하지만 이것으로 충분하지 않아 더 큰 버퍼가 필요하면 보조스트림을 고려
 *          BufferedOutputStream/BufferedInputStream, BufferedWriter/BufferedReader
 *      기본자료형 입출력 : DataInputStream/DataOutputStream
 *          기본 자료형 int, double, String 등을 사용할 수 있음
 *      개행 출력 : PrintStream 의 println() , print() 함수를 사용가능
 *
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         ryujonghak          최초 생성
 */
//자바 입출력 객체: 데코레이션(장식) 패턴
//
public class CharConvertApplication {
    //    파일 쓰기용 공유 함수
    public static void write(String str) throws Exception {
//        파일을 쓰기용으로 열기
        FileOutputStream fos = new FileOutputStream("src/main/resources/test11.txt");

//        1byte로 쓰기용 문자단위로 파일에 쓰고 싶습니다. -> 보조스트림 : OutputStreamWriter
//      사용법 : 문자단위스트림 변수 = new 보조스트림(파일스트림변수)
//        (데코레이션 패턴 사용)
        Writer writer = new OutputStreamWriter(fos); // FileOutputStream 객체 + OutputStreamWriter
//        문자를 버퍼에 출력
        writer.write(str); // 매개변수 문자열을 버퍼에 출력
//        버퍼에 출력 -> 파일에 출력
        writer.flush();
        writer.close();
    }


    public static String read() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/test11.txt");
        Reader reader = new InputStreamReader(fileInputStream);

            char[] buffer = new char[100];
            int len = reader.read(buffer);
            reader.close();
            String data = new String(buffer, 0, len);
        return  data;
    }

    public static void main(String[] args) throws Exception {
        write("문자 변환 스트림을 사용합니다.");
        String data = read();
        System.out.println(data);
    }
}
