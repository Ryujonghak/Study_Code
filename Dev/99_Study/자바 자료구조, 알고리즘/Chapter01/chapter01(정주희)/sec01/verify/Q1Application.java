package chapter01.sec01.verify;

/**
 * packageName : chapter01.sec01.verify
 * fileName : Q1Application
 * author : juhee
 * date : 2022-10-10
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-10         juhee          최초 생성
 */
public class Q1Application {
    // 메인함수
    public static void main(String[] args) {
        // 객체 생성
        Q1 q1 = new Q1();

        // 함수 호출
        int result = q1.max4(4,3,2, 1);
        System.out.println("최대값은: " + result);
    }
}
