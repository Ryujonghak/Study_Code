package chap10.sec02.exam02;

/**
 * packageName : chap10.sec02.exam01
 * fileName : TryCatch2FinallyApplication
 * author : ryujonghak
 * date : 2022/10/04
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class TryCatch2FinallyApplication {
    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];

            System.out.println(data1 + " " + data2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getClass());
//            return; // 함수종료
        } finally { // 예외처리와 상관없이 무조건 실행되는 블럭
            System.out.println("에러 발생");
        }

        try {
            String data1 = null;
            String data2 = null;

            int num1 = Integer.parseInt(data1);
            int num2 = Integer.parseInt(data2);

            System.out.println(num1 + " " + num2);

        } catch (Exception e) {
            System.out.println("Error: " + e.getClass());
        } finally { // 예외처리와 상관없이 무조건 실행되는 블럭
            System.out.println("에러 발생");
        }
    }
}
