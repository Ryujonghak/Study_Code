package chap11.sec01.exam13;

/**
 * packageName : chap11.sec01.exam13
 * fileName : StringToByteApplication
 * author : ryujonghak
 * date : 2022/10/05
 * description : 문자열 -> 바이트 전환
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         ryujonghak          최초 생성
 */
public class StringToByteApplication {
    public static void main(String[] args) {
        String str = "ABCDE";
        try {
            byte[] bytes = str.getBytes("UTF-8");
            System.out.println(bytes);
            System.out.println(bytes.length);

            String str2 = new String(bytes, "UTF-8");
            System.out.println(str2);
        } catch (Exception e) {
            System.out.println(e.getClass());
        }

    }
}
