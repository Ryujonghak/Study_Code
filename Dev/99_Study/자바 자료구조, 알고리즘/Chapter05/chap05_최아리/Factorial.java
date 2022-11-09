package chap05;

import java.util.Scanner;

/**
 * packageName : chap05
 * fileName : Factorial
 * author : 최아리
 * date : 2022-11-04
 * description : 실습 5-1 (p.164)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-22         최아리          최초 생성
 */

// 팩토리얼값을 재귀적으로 구함

public class Factorial {
    //        음이 아닌 정수 n의 팩토리얼 값을 반환
    static int factorial(int n) {
        if (n > 0)
            return n * factorial(n - 1);
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = stdIn.nextInt();

        System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
    }
}
