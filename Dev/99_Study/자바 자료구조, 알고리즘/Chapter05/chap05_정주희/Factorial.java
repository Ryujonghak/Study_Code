package chapter05;

import java.util.Scanner;

/**
 * packageName : chapter05
 * fileName : Factorial
 * author : juhee
 * date : 2022-11-07
 * description : 실습 5-1 p.164
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-11-07         juhee          최초 생성
 */
// 팩토리얼 값을 재귀적으로 구함

public class Factorial {

    // 음이 아닌 정수 n의 팩토리얼 값 구하기
    // factorial()함수
    static int factorial(int n) {
        if(n>0){
            return n*factorial(n-1);     // n * (n-1을 이 함수에 넣은 결과값)
        } else return 1;                    // n<=0, 1을 반환
    }

    // main함수
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수를 입력하세요");
        int x = stdIn.nextInt();    // 입력받은 값 x에 저장

        System.out.println(x + "의 팩토리얼은 " + factorial(x)+ "입니다.");
    }

}
