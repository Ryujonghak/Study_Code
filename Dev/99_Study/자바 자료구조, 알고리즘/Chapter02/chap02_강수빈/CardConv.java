package chap02;

import java.util.Scanner;

/**
 * packageName : chap02
 * fileName : CardConv
 * author : gangsubin
 * date : 2022/10/16
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/16         gangsubin          최초 생성
 */
public class CardConv {

    static int cardConv(int x, int r, char[] d){

        int digits = 0; // 변환 전 자릿수
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // 변환 후 자릿수

        do{ // X를 R로 나눈 나머지를 인덱스로 하는 문자를 배열 d의 요소 d[digits]에 대입하고 digits값을 1증가시킴
            d[digits++] = dchar.charAt(x % r); // X 를 R 로 나눈 나머지를 저장함
            x /=r;
        }while(x !=0);

        for (int i = 0; i <digits ; i++) { //배열 D의 숫자 문자열을 역순으로 정렬함
                                            // d[0]~d[digits-1]
            char t = d[i];
            d[i] = d[digits -i -1];
            d[digits -i -1] = t;

        }
        return digits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no; //변환하는 정수
        int cd; // 기수
        int dno;//변화뒤 자릿수
        int retry; //한번더
        char[] cno = new char[32];  //char 배열 32번방까지 만듦 .배열의 크기
                                    // 변환 뒤의 각 자리를 저장하는 문자인 배열

        System.out.println("10진수를 기수 변환 합니다.");
        do {
            do {
                System.out.println("변환 하는 음이 아닌 정수 :");
                no = scanner.nextInt(); //입력받음
            } while (no < 0); //no가 음수가 되면 종료

            do {
                System.out.println("어떤진수로 변환 할까요? (2~36):");
                cd = scanner.nextInt();
            } while (cd < 2 || cd > 36); // 2진수보다 작거나 36진수보다 크면 종료

            dno = cardConv(no, cd, cno); //no를 cd진수로 변환함


            System.out.println(cd + "진수로");
            for (int i = 0; i < dno; i++) {
                System.out.println(cno[i]); //윗자리부터 차례대로 나타냄

            }
            System.out.println("입니다.");

            System.out.print("한 번 더 할까요? (1..예 / 0..아니요):");
            retry = scanner.nextInt();
        } while (retry == 1);

    }

}
