package chap01;

import java.util.Scanner;

/**
 * packageName : chap01
 * fileName : Median
 * author : 최아리
 * date : 2022-10-11
 * description : 실습 1C-1
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-11         최아리          최초 생성
 */
public class Median {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.print("a의 값: "); int a = num.nextInt();
        System.out.print("b의 값: "); int b = num.nextInt();
        System.out.print("c의 값: "); int c = num.nextInt();

        System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
    }
//    3개의 정숫값을 입력하고 중앙값을 구하여 출력
    static int med3(int a, int b, int c) {
        if(a >= b) {
            if(b >= c) {
                return  b;
            } else if(a <= c) {
                return a;
            } else {
                return c;
            }
        }
        else if(a > c) {
            return a;
        }
        else if(b > c) {
            return c;
        }
        else {
            return b;
        }
    }
}
