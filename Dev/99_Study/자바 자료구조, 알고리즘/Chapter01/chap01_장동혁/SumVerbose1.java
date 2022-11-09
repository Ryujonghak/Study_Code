package StudyGroup.chap01;

import java.util.Scanner;

/**
 * packageName : StudyGroup
 * fileName : exercise10
 * author : hyuk
 * date : 2022/10/10
 * description : ⭐️ 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요 ⭐️
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/10         hyuk          최초 생성
 */
public class SumVerbose1 {
    public static void main(String[] args) {
//        스캐너 추가
        Scanner scanner = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요 : ");
//        양의 정수값 입력받기
        int a = scanner.nextInt();
//        자릿수 세는 변수 0으로 초기화
        int count =0;

//        양의 정수가 양수라면 무한 반복
        while (a > 0) {
//            양의 정수를 10으로 나누기
            a /= 10;
//            자릿수 변수 1씩 증가
            count++;
        }

//        자릿수 출력
        System.out.println("그 수는 " + count + "자리 입니다.");
    }
}
