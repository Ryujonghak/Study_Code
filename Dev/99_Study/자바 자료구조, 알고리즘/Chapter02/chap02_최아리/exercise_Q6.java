package chap02;

import java.util.Scanner;

/**
 * packageName : chap02
 * fileName : exercise_Q6
 * author : 최아리
 * date : 2022-10-18
 * description : 연습문제 Q6 (p.75)
 * ===========================================================
 * DATE AUTHOR NOTE
 * —————————————————————————————
 * 2022-10-18 최아리 최초 생성
 */
// 결과창이 약간 다르게 나오는데 해결 방법은?
public class exercise_Q6 {

    static int cardConv_2(int x, int r, char[] d) {
        int digits = 0; // 변환 후의 자릿수
        String dChar = "0123456789ABCDEFGHIKKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dChar.charAt(x % r); // r(바꾸고 싶은 진수)로 나눈 나머지를 저장

            System.out.println(r + " |      " + x + " ... " + dChar.charAt(x % r));

            x /= r;

            if (x == (x % r)) {
                System.out.println(r + " |      " + x);
            } else {
                // System.out.println(" +--------");
            }
            if (x != 0) {
                System.out.println(" +--------");
            } else {

            }

        } while (x != 0);

        for (int i = 0; i < digits / 2; i++) { // 배열 d의 숫자 문자열을 역순으로 정렬
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }

        return digits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no; // 변환하는 정수
        int cd; // 바꾸고 싶은 진수
        int dno; // 변환 후의 자릿수
        char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어 두는 문자 배열

        System.out.println("10진수를 기수 변환합니다.");

        do {
            System.out.print("변환하는 음이 아닌 정수 : ");
            no = scanner.nextInt();
        } while (no < 0);

        do {
            System.out.print("어떤 진수로 변환할까요? (2~36) ");
            cd = scanner.nextInt();
        } while (cd < 2 || cd > 36);

        dno = cardConv_2(no, cd, cno); // no를 cd진수로 변환, dno는 자릿수

        System.out.print(cd + "진수로 ");
        for (int i = 0; i < dno; i++) {
            System.out.print(cno[i]); // 배열출력
        }
        System.out.println("입니다.");

    }
}
