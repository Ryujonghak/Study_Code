package chap01;

import java.util.Scanner;

/**
 * packageName : chap01
 * fileName : Max3
 * author : 최아리
 * date : 2022-10-11
 * description : 실습 1-1
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-11         최아리          최초 생성
 */
public class Max3 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.print("a의 값 : "); int a = num.nextInt();
        System.out.print("b의 값 : "); int b = num.nextInt();
        System.out.print("c의 값 : "); int c = num.nextInt();

        int max = a;
        if(b > max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }

        System.out.println("최댓값은 " + max + "입니다.");
    }
}
