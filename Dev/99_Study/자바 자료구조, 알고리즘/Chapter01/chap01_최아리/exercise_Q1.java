package chap01;

import java.util.Scanner;

/**
 * packageName : chap01
 * fileName : exercise_Q1
 * author : 최아리
 * date : 2022-10-11
 * description : 연습문제 Q1 (p.19)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-11         최아리          최초 생성
 */
public class exercise_Q1 {
//    네 값의 최댓값을 구하는 max4 메서드를 작성하세요.

    public static void main(String[] args) {
        System.out.println("최댓값은 " + max4(2, 5, 7, 3) + "입니다.");
    }

    static int max4(int a, int b, int c, int d) {

        int max = a;
        if(b > max) {
            max = b;
        }
        if(c > max) {
            max = c;
        }
        if(d > max) {
            max = d;
        }

        return max;
    }
}

