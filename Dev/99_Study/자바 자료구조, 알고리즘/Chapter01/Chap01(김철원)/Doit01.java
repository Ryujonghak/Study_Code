package chap99.Doit.chap01;


import java.util.Scanner;

/**
 * packageName : chap99.Doit
 * fileName : Doit01
 * author : 김철원
 * date : 2022-10-06
 * description : 실습 1-1
 *
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-06         김철원          최초 생성
 */

public class Doit01 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in); // 키보드로 받기
        System.out.println("세 정수의 최대값을 구합니다");
        System.out.print("a의 값: "); int a = stdIn.nextInt();
        System.out.print("b의 값: "); int b = stdIn.nextInt();
        System.out.print("c의 값: "); int c = stdIn.nextInt();
        int max = a;
        if( b > max ) max = b;
        if ( c > max ) max = c;

        System.out.println("최대값은 " + max + "입니다");
    }
}
