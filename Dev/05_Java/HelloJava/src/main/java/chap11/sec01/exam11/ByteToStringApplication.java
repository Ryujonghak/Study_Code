package chap11.sec01.exam11;

/**
 * packageName : chap11.sec01.exam11
 * fileName : ByteToStringApplication
 * author : ryujonghak
 * date : 2022/10/05
 * description : byte 배열 -> 문자열 배열로 변환하기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         ryujonghak          최초 생성
 */
public class ByteToStringApplication {
    public static void main(String[] args) {
        byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
        String strings = new String(bytes); // 매개변수로 배열을 넣어주면 String으로 형변환
        System.out.println(strings);

        String str = new String(bytes, 6, 4);
        System.out.println(str);
    }
}
