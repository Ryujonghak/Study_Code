package StudyGroup.chap01;

import java.util.Scanner;

/**
 * packageName : StudyGroup
 * fileName : qusetion1_1
 * author : hyuk
 * date : 2022/10/09
 * description : ⭐️ 세 값의 최댓값 구하기 p.13 ⭐️
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/09         hyuk          최초 생성
 */
public class Max3 {
    public static void main(String[] args) {
//        스캐너 추가
        Scanner scanner = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");
//        세 정수값 입력받기
        System.out.print("a의 값 : ");
        int a = scanner.nextInt();
        System.out.print("b의 값 : ");
        int b = scanner.nextInt();
        System.out.print("c의 값 : ");
        int c = scanner.nextInt();

//        최댓값 변수에 a로 초기화
        int max = a;

//        if (b > max){
//            max = b;
//        } else if (c > max){
//            max = c;
//        } else {
//            max = a;
//        } 👉 내가 처음 짠 코드인데 왜 안되는지는 잘 모르겠음🫠

//        b값이 최댓값보다 크면 최댓값 변수에 b 추가
        if (b > max) max = b;
//        c값이 최댓값보다 크면 최댓값 변수에 c 추가
        if (c > max) max = c;

//        최댓값 출력
        System.out.println("최댓값은 " + max + "입니다.");
    }
}
