package chapter01.sec02.verify;

import java.util.Scanner;

/**
 * packageName : chapter01.sec02.verify
 * fileName : QApplication
 * author : juhee
 * date : 2022-10-11
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-11         juhee          최초 생성
 */
public class Q10Application {
    // 스캐너 객체 생성
    static Scanner sc = new Scanner(System.in);     // 키보드에서 입력받기

    // 공유함수
    static void num() {
        String str = sc.next();     // .next() : 입력받은 숫자를 문자열로 리턴하여 str에 저장
        System.out.println("그 수는 " + str.length() + "자리입니다.");  // .length() : 문자열의 길이 반환
        // num2()함수에서 "그 수는 " + count + "자리입니다." 가 출력되는데 왜 여기도 썼지..?

    }
    // 메인함수
    public static void main(String[] args) {
        // 객체 생성
        Q10 q10 = new Q10();

        // 함수 호출
        System.out.println("숫자를 입력하세요.");
        q10.num2();
    }
}
