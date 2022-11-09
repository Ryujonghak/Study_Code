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
// Q6. 오른쪽 처럼 기수 변환 과정을 자세히 나타내는 프로그램을 작성하세요
public class CardConv_Q6 {
    static int cardConv(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int a =0; // d[digits++]에 들어가 있는 배열 꺼내기 위한 수
        do {
            if ( digits == 0){
                System.out.printf("%d|%6d\n", r,x); // 첫번째 줄 출력
                System.out.println(" +------");
            } else if (x / r != 0) {              // digits == 0 이 아니니깐 실행 됨

                System.out.printf("%d|%6d  ···%s\n", r,x,d[a]);  // 진수, 나눠진정수, d[0]배열에 저장된 값 출력
                System.out.println(" +------");
                a++; // 0부터 출력돼야 ex)14일때 1을 출력하고 다음에 0을 출력할 수 있음

            }else if(r>x){        // r이 x값보다 크면 나눌 수 없기때문에 1번밖에 실행이 안됨

                System.out.printf("%d|%6d  ···%s\n", r, x,d[a]);  // 진수 나눠진정수    정수%진수== 나머지 출력됨
                System.out.println(" +------");
                System.out.printf("%8s  ...%d\n", 0 ,x); // x 값이 r보다 작으면 x값이 나머지가 되고
//                                                x 자리에 있던 수는 0이 되기 때문에 0으로 고정 시키고 x를 나머지로 옮김

            }
            d[digits++] = dchar.charAt(x % r); // 나머지의 값을 digits배열에 하나씩 담음

            x /= r; // 축약식 같은거임 x = x/r; 이거랑 같음  result += i; <- 많이 본 축약식

        } while (x != 0); // x가 0이면 while 반복문이 종료됨

        for (int i = 0; i < digits / 2; i++) {    // 역순으로 해줘야 진수의 값을 제대로 읽을 수 있음 69P에 자세히 나옴
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }

        return digits;

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no; // 변환하는 정수
        int cd; // 기수
        int dno; // 변환 후의 자릿수
        int retry; // 다시 한번
        char[] cno = new char[32];

        System.out.println("10진수 기수 변환합니다.");

        do {
            System.out.print("변환하는 음이 아닌 정수:");
            no = stdIn.nextInt();
        } while (no < 0);
        do {
            System.out.print("어떤 진수로 변활할까요? (2~36): ");
            cd = stdIn.nextInt();
        } while (cd < 2 || cd > 36);

        dno = cardConv(no, cd, cno);

        System.out.print(cd + "진수로 ");
        for (int i = 0; i < dno; i++) {
            System.out.print(cno[i]);
        }
        System.out.println("입니다");

    }
}
