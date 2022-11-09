package chap01;

import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * packageName : chap01
 * fileName : exercise_Q10
 * author : 최아리
 * date : 2022-10-11
 * description : 연습문제 Q10 (p.35)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-11         최아리          최초 생성
 */
public class exercise_Q10 {
    //    양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요. 예를 들어 135를 입력하면
//    '그 수는 3자리입니다.'라고 출력하고, 1314를 입력하면 '그 수는 4자리입니다.'라고 출력합니다.
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n;

        System.out.println("양의 정수를 입력하세요.");

        do {
            System.out.print("n값 : ");
            n = num.nextInt();
        } while (n <= 0); // n이 0보다 클 때까지 반복합니다.

        int length = (int)(Math.log10(n)+1);
//        String 형의 경우 length 함수를 지원하지만, int형은 길이 함수가 없다.
//        이럴경우 Math 함수를 사용하면 자리수를 구할 수 있다.

        System.out.println("그 수는" + length + "입니다." );
    }
}