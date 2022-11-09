package chapter01.sec01.verify;

/**
 * packageName : chapter01.sec01.verify
 * fileName : Q2Application
 * author : juhee
 * date : 2022-10-10
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-10         juhee          최초 생성
 */
public class Q2Application {
    // main함수
    public static void main(String[] args) {
        // 객체 생성
        Q2 q2 = new Q2();

        // 함수 호출
        int result = q2.min3(1,2,3);
        System.out.println("최소값은: " + result);
        System.out.println("최소값은: " + q2.min3(3,4,5));
    }
}
