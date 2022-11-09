package chapter02.sec01;

import java.util.Scanner;

/**
 * packageName : chapter02.sec01
 * fileName : CardConv
 * author : juhee
 * date : 2022-10-16
 * description : 실슴 2-6[B] (p.74)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-16         juhee          최초 생성
 */
public class CardConv {

    // 기수 변환 함수 CardConv()
    static int cardConv(int x, int r, char[] d){
        int digits = 0;     // 변환 후 자리수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVZXYZ";

        do {
            d[digits++] = dchar.charAt(x%r);    // r로 나눈 나머지를 저장
            x = x/r;
        } while (x != 0);   // 몫이 0이 될 때까지 r로 나누기

        for (int i=0; i<digits/2; i++){     // 배열 d 역순으로 정렬
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }
        return digits;
    }

    // 실행함수
    public static void main(String[] args) {
        // 스캐너
        Scanner stdIn = new Scanner(System.in);
        int no;     // 변환 대상 정수(10진수)
        int cd;     // 변환할 기수(2진수~36진수 사이)
        int dno;    // 자리수
        int retry;
        char[] cno = new char[32];  // 변환 후 각 자리 숫자 넣어두는 배열

        System.out.println("10진수를 기수 변환합니다.");
        do{
            do{
                System.out.println("변환할 음이 아닌 10진수를 입력하세요: ");
                no = stdIn.nextInt();   // 입력받은 수 중 정수만 no에 저장
            } while(no<0);              // 0보다 큰 정수를 입력할 때까지 반복(그 외 입력하면 다시 질문)

            do{
                System.out.println("어떤 진수로 변환할 지 입력하세요(2진수~36진수): ");
                cd = stdIn.nextInt();   // 입력받은 수를 cd에 저장
            } while(cd<2 || cd>36);     // 2진수~36진수를 입력할 때까지 반복(그 외 입력하면 다시 질문)

            dno = cardConv(no, cd, cno);    // 함수 cardConv를 이용해 no를 cd진수로 변환 후, 자리수를 dno에 저장

            System.out.println(cd + "진수로 변경");
            for (int i=0; i<dno; i++){
                System.out.print(cno[i]);   // 배열에 담긴 바뀐 수 나란히 출력
            }
            System.out.println(" 입니다.");

            System.out.println("한 번 더 할까요? (1...예 / 0... 아니오) : ");
            retry = stdIn.nextInt();

        } while (retry == 1);   // 0이 나올때까지 반복

    }
}
