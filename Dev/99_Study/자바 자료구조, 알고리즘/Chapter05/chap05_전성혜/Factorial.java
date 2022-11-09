package chap05;

import java.util.Scanner;

/**
 * packageName : chap05
 * fileName : Factorial
 * author : 유영미
 * date : 2022-11-06
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-11-06         유영미          최초 생성
 */
public class Factorial {
    //    음이 아닌 정수 n의 팩도리얼값을 반환
    static int factorial(int n) {
        if (n > 0) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int x = scanner.nextInt();

        System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
    }
}
