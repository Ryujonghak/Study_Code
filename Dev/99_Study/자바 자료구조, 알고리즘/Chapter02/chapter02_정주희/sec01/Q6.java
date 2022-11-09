package chapter02.sec01;

import java.util.Scanner;

/**
 * packageName : chapter02.sec01
 * fileName : Q6
 * author : juhee
 * date : 2022-10-16
 * description : 연습문제 Q6 (p.75)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-16         juhee          최초 생성
 */
// 10진수에서 2진수로 변환하는 과정을 자세히 나타내는 프로그램을 작성하세요
public class Q6 {
    public static void main(String[] args) {
        // 10진수 입력받기
        Scanner sc = new Scanner(System.in);
        int no;     // 변환 대상
        int cd;     // 몇 진수로 변환할 건지
        int dno;    // 자리수
        char[] cno = new char[32];  // 변환 후 각 자리 숫자를 넣어두는 배열

        System.out.println("10진수를 기수변환합니다.");
        System.out.print("변환하는 음이 아닌 정수: ");
        
        no = sc.nextInt();  // 입력받은 10진수
        System.out.println("어떤 진수로 변환할까요?(2~36): ");
        cd = sc.nextInt();  // 몇 진수로 변환할 건지

        dno = CardConv(no, cd, cno);    // 함수 cardConv(no를 cd진수로 변환), 자리수를 cno에 저장

        for (int i = 0; i < dno; i++) {
            System.out.print(cno[i]);   // 배열에 담긴 수를 나란히 출력
        }
    }

    // 함수 CardConv() : 실습 2-6[A]
    static int CardConv (int x, int y, char[] d) {
        int digits = 0; // 변환 후 자리수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";  // 36진수 1부터 나열

        do {
            if (digits == 0) {
                System.out.printf("%d|%6d\n", y, x);    // y진수로 변환, x(입력받은 수)
                System.out.println(" +------");
            }
            else if (x / y != 0) {                      //  x 나누기 y가 0이 아니면
                System.out.printf("%d|%6d  ...%d\n", y, x ,x % y);  // y진수, x몫, x를 y로 나눈 나머지 순서대로 출력
                System.out.println(" +------");
            }
            else
                System.out.printf("%8d  ...%d\n", y, x ,x % y);     // x 나누기 y 가 0이면
            d[digits++] = dchar.charAt(x % y);

            x /= y;     // x=몫, x가 0이 될 때까지 y로 나누기 (x = x/y)

        } while (x != 0);   // x가 0이면 반복문 끝 (

        for (int i = 0; i < digits /2; i++) {
            char temp = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = temp;
        }
        return digits;
    }
    

}
