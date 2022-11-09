package chap04.exam04;

import java.util.Scanner;

/**
 * packageName : chap04
 * fileName : LastNElements
 * author : 유영미
 * date : 2022-10-31
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-31         유영미          최초 생성
 */
public class LastNElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int N = 10;
        int[] a = new int[N];       // 입력받은 값을 저장
        int cnt = 0;                // 입력받은 개수
        int retry;                  // 다시 한번?

        System.out.println("정수를 입력하세요.");

        do {
            System.out.printf("%d번째 정수: ", cnt + 1);
            a[cnt++ % N] = scanner.nextInt();

            System.out.print("계속 할까요? (예.1/아니요.0): ");
            retry = scanner.nextInt();
        } while (retry == 1);

        int i = cnt - N;
        if (i < 0) i = 0;

        for (; i < cnt; i++) {
            System.out.printf("%2d번쨰 정수 = %d\n", i + 1, a[i % N]);
        }
    }
}








