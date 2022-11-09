package StudyGroup.chap05.Question1.실습5_1;

import java.util.Scanner;

/**
 * packageName : StudyGroup.chap05.Question1.실습5_1
 * fileName : Factorial
 * author : hyuk
 * date : 2022/11/06
 * description : p.164
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/11/06         hyuk          최초 생성
 */
public class Factorial {
    static int factorial(int n){
        if (n>0){
            return n*factorial(n-1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = scanner.nextInt();

        System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");
    }
}
