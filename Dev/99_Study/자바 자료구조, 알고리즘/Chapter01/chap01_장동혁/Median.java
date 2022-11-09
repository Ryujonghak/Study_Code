package StudyGroup.chap01;

import java.util.Scanner;

/**
 * packageName : StudyGroup
 * fileName : Median
 * author : hyuk
 * date : 2022/10/09
 * description : ⭐️ 3개의 정수값을 입력하고 중앙값을 구하여 출력 p.21 ⭐️
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/09         hyuk          최초 생성
 */
public class Median {
//    공유 함수 선언
    static int med3(int a, int b, int c){
        if (a >= b) // a가 b보다 크거나 같다면
            if (b >= c) // b가 c보다 크거나 같다면
            return b; // b값 반환
            else if (c >= a) // c가 a보다 크거나 같다면
            return a; // a값 반환
            else
            return c; // 아니라면 c값 반환
        else if (a > c) // a가 c보다 크다면
            return a; // a값 반환
        else if (b > c) // b가 c보다 크다면
            return c; // c값 반환
        else
            return b; // 아니라면 b값 반환
    }

    public static void main(String[] args) {
//        스캐너 추가
        Scanner scanner = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
//        세 정수 입력받기
        System.out.print("a의 값 : ");
        int a = scanner.nextInt();
        System.out.print("b의 값 : ");
        int b = scanner.nextInt();
        System.out.print("c의 값 : ");
        int c = scanner.nextInt();

//        중간값 출력
        System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
    }
}
