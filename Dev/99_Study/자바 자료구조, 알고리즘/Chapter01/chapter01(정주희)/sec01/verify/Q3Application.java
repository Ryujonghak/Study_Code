package chapter01.sec01.verify;

/**
 * packageName : chapter01.sec01.verify
 * fileName : Q3Application
 * author : juhee
 * date : 2022-10-10
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-10         juhee          최초 생성
 */
public class Q3Application {
    // main함수
    public static void main(String[] args) {
        // 객체 생성
        Q3 q3 = new Q3();

        // 함수 호출
        System.out.println("최소값은: " + q3.min4(11,12,13,14));
    }
}
