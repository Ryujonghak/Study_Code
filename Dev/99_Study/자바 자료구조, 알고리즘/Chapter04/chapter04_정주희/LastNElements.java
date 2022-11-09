package chapter04;

import java.util.Scanner;

/**
 * packageName : chapter04
 * fileName : LastNElements
 * author : juhee
 * date : 2022-10-31
 * description : 실습 4C-1
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-31         juhee          최초 생성
 */
// 원하는 갯수만큼 값을 입력받고, 배열은 요소의 갯수로 마지막 N개를 저장
public class LastNElements {
    // 메인
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in); //
        final int N = 10;       // 상수 N = 10;
        int[] a = new int[N];   // 크기 N(10)의 배열을 a배열에 저장
        int cnt = 0;            // 입력받은 갯수. 처음값 0
        int retry;              

        System.out.println("정수를 입력하세요.");

        do{
            System.out.printf("%d번째 정수:", cnt + 1);  // 입력받은값 중 정수를 cnt++ 을 N으로 나눈 나머지 크기의 배열에 저장
            a[cnt++ % N] = stdIn.nextInt();        // 처음 입력받은값,  a[0+1=1. 1나누기 N(10) = 1]
                                                   // a[1]에 저장됨      -->틀림. 첫번째 값은 cno=0, 나누기10하면 0, a[0]에 저장됨
//                                                                           이해가 안 감

            System.out.print("계속 할까요? (1. 예/ 0.아니오) :");
            retry = stdIn.nextInt();    // 스캐너에서 입력받은 값(1 또는 0) 중 정수를 retry에 저장. 즉 1
        }
        while (retry == 1);       // 1이 나오면 계속 do 실행문 반복


        int i = cnt - N;      // 입력받은 횟수-N을 i로 저장
        if (i < 0){
            i = 0;
        }

        for (; i <cnt; i++)
            System.out.printf("%2d번째의 정수 = %d\n", i + 1, a[i % N]);

        // 정수 10개까지는 1번째의 정수~10번째의 정수로 출력되는데
        // 11개 입력시, 2번째 정수부터 11번째 정수까지 10개 출력
        // 14개 입력시, 5번째 정수부터 14번째 정수까지 10개 출력
    }
}
