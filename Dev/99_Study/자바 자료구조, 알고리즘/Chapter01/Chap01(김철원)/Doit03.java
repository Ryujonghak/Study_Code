package chap99.Doit.chap01;

import java.util.Scanner;

/**
 * packageName : chap99.Doit.chap01
 * fileName : Doit03
 * author : 김철원
 * date : 2022-10-09
 * description :실습 1C - 1
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-09         김철원          최초 생성
 */
// 3개의 정숫값을 입력하고 중앙값을 구하여 출력
public class Doit03 {
    static int med3(int a,int b,int c) {
        if (a >= b)
            if(b >= c){
                return b;
            } else if (a <= c) {
                return a;
            }else {
                return c;
            }
        else if (a > c)
            return a;
        else if (b > c) {
            return c;
        }else
            return b;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in); // 키보드로 받기
        System.out.println("세 정수의 중앙값을 구합니다");
        System.out.print("a의 값: "); int a = stdIn.nextInt();
        System.out.print("b의 값: "); int b = stdIn.nextInt();
        System.out.print("c의 값: "); int c = stdIn.nextInt();
        System.out.println("중앙값은 " + med3(a,b,c) + "입니다");
    }
}
