package chap10.sec02.exam04;

/**
 * packageName : chap10.sec02.exam04
 * fileName : ThrowsApplication
 * author : ryujonghak
 * date : 2022/10/04
 * description : Throws, 예외처리 넘기기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class ThrowsApplication {
    public static void main(String[] args) {
        try {
            findClass();
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }

    public static void findClass() throws Exception {
        Class clazz = Class.forName("java.lang.String2");
    }
}