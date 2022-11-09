package chap10.sec02.exam01;

/**
 * packageName : chap10.sec02.exam01
 * fileName : TryCatchFinallyApplication
 * author : ryujonghak
 * date : 2022/10/04
 * description : 일반 예외처리
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class TryCatchFinallyApplication {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("String2");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
