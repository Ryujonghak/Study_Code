package chap04;

import java.util.Scanner;

/**
 * packageName : chap04
 * fileName : IntStackTester
 * author : 최아리
 * date : 2022-11-01
 * description : 실습4-2 (p.140)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-22         최아리          최초 생성
 */
// 원하는 개수만큼 값을 계속 입력받고, 요솟수가 N인 배열에 마지막 N개를 저장
class LastNElements {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        final int N = 10;
        int[] a = new int[N];    // 읽어 들인 값을 저장
        int cnt = 0;             // 읽어 들인 개수
        int retry;               // 재검색 원할 시

        System.out.println("정수를 입력하세요.");

        do {
            System.out.printf("%d번째 정수: ", cnt + 1);
//            큐는 프론드 -> 리어 -> 프론트... 이런식으로 인덱스 값이 반복되기 때문에, 이 경우엔 인덱스는 cnt 를 N으로 나눈 나머지값
//            10이 넘어가면 다시 10번부터 데이터 저장
            a[cnt++ % N] = stdIn.nextInt();
          System.out.print("계속 할까요? (Yes…1／No…0) : ");
            retry = stdIn.nextInt();
        } while (retry == 1); // 다시 하고싶으면

        int i = cnt - N;
        if (i < 0) i = 0;

        for ( ; i < cnt; i++)
            System.out.printf("%2d번째 ＝ %d\n", i + 1, a[i % N]);
    }
}