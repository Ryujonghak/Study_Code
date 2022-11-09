package StudyGroup.chap01;

import java.util.Scanner;

/**
 * packageName : StudyGroup
 * fileName : Min3
 * author : hyuk
 * date : 2022/10/09
 * description : ⭐️ 세 값의 최솟값 구하기 p.19 ⭐️
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/09         hyuk          최초 생성
 */
public class Min3 {
    public static void main(String[] args) {
//        스캐너 추가
        Scanner scanner = new Scanner(System.in);

        System.out.println("세 정수의 최솟값을 구합니다.");
//        세 정수값 입력받기
        System.out.print("a의 값 : ");
        int a = scanner.nextInt();
        System.out.print("b의 값 : ");
        int b = scanner.nextInt();
        System.out.print("c의 값 : ");
        int c = scanner.nextInt();

//        최소값을 a로 초기화
        int min = a;

//        b값이 최솟값보다 작다면 최솟값 변수에 b 추가
        if (b < min) min = b;
//        c값이 최솟값보다 작다면 최솟값 변수에 c 추가
        if (c < min) min = c;

//        최솟값 출력
        System.out.println("최솟값은 " + min + "입니다.");

    }
}
