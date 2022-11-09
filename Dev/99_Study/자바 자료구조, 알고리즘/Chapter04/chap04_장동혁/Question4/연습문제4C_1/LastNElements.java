package StudyGroup.chap04.Question4.연습문제4C_1;

import java.util.Scanner;

/**
 * packageName : StudyGroup.chap04.Question4.연습문제4C_1
 * fileName : LastNElements
 * author : hyuk
 * date : 2022/10/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/30         hyuk          최초 생성
 */
//  원하는값을 계속 입력받고, 요소수가 n인 배열에 마지막 n개를 저장
public class LastNElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = 10; // 상수 지정
        int[] a = new int[n]; // 입력받은 값을 저장하는 배열
        int count = 0; // 입력받은 개수
        int retry; // 재시도할지 여부 정하는 변수

        System.out.println("정수를 입력하세요");

        do {
            System.out.printf("%d번째 정수 : ", count+1);
            a[count++ % n] = scanner.nextInt();

            System.out.print("계속할까요? (1. 예 / 0. 아니요) : ");
            retry = scanner.nextInt();
        } while (retry == 1);

        int i = count - n;
        if (i < 0){
            i = 0;
        }

        for (; i < count; i++) {
            System.out.printf("%d번째 정수 = %d\n", i+1, a[i%n]);
        }
    }
}
