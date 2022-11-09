package chapter01.sec02.verify;

import java.util.Scanner;

import static chapter01.sec02.verify.Q10Application.sc;

/**
 * packageName : chapter01.sec02.verify
 * fileName : Q10
 * author : juhee
 * date : 2022-10-07
 * description : 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-07         juhee          최초 생성
 */
public class Q10 {
    // 함수
    static void num2() {    // 모르겠음..
        int ten = 1;
        int count = 0;
        int n = sc.nextInt();   // 스캐너로 입력받은 수를 int로 저장
        while (n >= ten) {  // 입력받은 수가 1보다 크면
            count++;
            ten *= 10;
        }
        System.out.println("그 수는 " + count + "자리입니다.");
    }
}
