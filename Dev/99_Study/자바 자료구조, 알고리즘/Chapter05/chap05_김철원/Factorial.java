package chap11.sec02.exam02;

import java.util.Scanner;

/**
 * packageName : chap11.sec02.exam02
 * fileName : Factorial
 * author : 김철원
 * date : 2022-11-06
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-11-06         김철원          최초 생성
 */
public class Factorial {
    static int factorial (int n) {
        if (n > 0){
            return n * factorial(n - 1);
        }else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요. : ");
        int x = stdIn.nextInt();

        System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
    }
}
