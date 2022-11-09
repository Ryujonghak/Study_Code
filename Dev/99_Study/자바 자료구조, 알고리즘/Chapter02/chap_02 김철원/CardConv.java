package chap02;

import java.util.Scanner;

/**
 * packageName : chap02
 * fileName : CardConv
 * author : 김철원
 * date : 2022-10-17
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-17         김철원          최초 생성
 */
public class CardConv {
    static int cardConv(int x,int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지를 저장 59를 16진수 나머지는 11이고 두번째 나머지는 3 몫은 0
//            몫은 3이다
            x /= r;  // x에 3이 들어간다 두번째 x에 0이 들어간다 do~while문 종료
        } while (x !=0);
        for (int i = 0; i < digits / 2; i++) { // 배열d의 숫자 문자열을 역순으로 정렬
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i -1] = t;
        }

        return digits;

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;
        int cd;
        int dno;
        int retry;
        char[] cno = new char[32];

        System.out.println("10진수 기수 변환합니다.");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수:");
                no = stdIn.nextInt();
            }while (no < 0 );
            do {
                System.out.print("어떤 진수로 변활할까요? (2~36): ");
                cd = stdIn.nextInt();
            }while (cd < 2 || cd > 36);

            dno = cardConv(no,cd,cno);


            System.out.print(cd + "진수로 ");
            for (int i = 0; i< dno; i++) {
                System.out.print(cno[i]);
            }
            System.out.println("입니다");

            System.out.print("한 번 더 할까요? (1...예/0...아니요): ");
            retry = stdIn.nextInt();
        }while (retry == 1);
    }
}
