package chap03;

import java.util.Scanner;

/**
 * packageName : chap04
 * fileName : Sec0401
 * author : ryujonghak
 * date : 2022/09/23
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/23         ryujonghak          최초 생성
 */
public class Sec0301 {

    public void exam02() {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("--------------------------------------------------------");
        x++; //증감 연산자
        ++x;
        System.out.println("x = " + x);

        System.out.println("--------------------------------------------------------");
        y--;
        --y;
        System.out.println("y = " + y);
//  12 8
        System.out.println("--------------------------------------------------------");
        z = ++x + y++;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }

    public void exam03() {
        boolean play = true;
        System.out.println(play);

        play = !play;
        System.out.println(play);

        play = !play;
        System.out.println(play);
    }

    public void exam04() {
        char c1 = 'A' + 1;
        char c2 = 'A';
        System.out.println(c1);
        System.out.println(c2);
    }

    public void exam09(int d, int value) {
        int charCode0 = 'A';
        int charCode1 = 'Z';

        int charCode2 = 'a';
        int charCode3 = 'z';

//        charCode가 대문자면 대문자 이군요 하고 소문자면 소문자인군요 출력, 숫자면 숫자

        if (d >= charCode0 && d <= charCode1) {
            System.out.println("대문자");
        } else if (d >= charCode2 && d <= charCode3) {
            System.out.println("소문자");
        } else {
            System.out.println("알파벳이 아닙니다.");
        }

//        int value = 6;
        if (value % 3 == 0 && value % 2 == 0) {
            System.out.println("2와 3의 배수");
        } else if (value % 3 == 0 || value % 2 == 0) {
            System.out.println("2 또는 3의 배수");
        } else {
            System.out.println("2와 3의 배수가 아닙니다.");
        }
    }

    public void exam10() {
//        사칙연산 축약식
        int result = 0;
        result += 10;
        System.out.println(result);

        result -= 5;
        System.out.println(result);

        result *= 5;
        System.out.println(result);

        result /= 5;
        System.out.println(result);

        result %= 5;
        System.out.println(result);
    }

    public void exam11() {
//        3항 연산자
        int score = 85;
        char grade = score >= 90 ? 'A' :(score >= 80 ? 'B' : 'C' );
        System.out.println(grade);

    }

}
