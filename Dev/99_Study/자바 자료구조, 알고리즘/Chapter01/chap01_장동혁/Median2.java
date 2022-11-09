package StudyGroup.chap01;

import java.util.Scanner;

/**
 * packageName : StudyGroup
 * fileName : Median2
 * author : hyuk
 * date : 2022/10/10
 * description : ⭐️ 3개의 정수값을 입력하고 중앙값을 구하여 출력 p.22 ⭐️
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/10         hyuk          최초 생성
 */
public class Median2 {
    static int med3(int a, int b, int c){
        if ((b >= a && c <= a) || (b <= a && c<= a))
            return a;
        else if ((a > b && c < b) || (a < b && c > b))
            return b;
        return c;
    }

//    a > b && c < b 👉 이 조건이 항상 false로 나오기 때문에 굳이 필요없는 연산을 한번 더 하기 때문 ??

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.print("a의 값 : ");
        int a = scanner.nextInt();
        System.out.print("b의 값 : ");
        int b = scanner.nextInt();
        System.out.print("c의 값 : ");
        int c = scanner.nextInt();

        System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
    }
}