package chapter01.sec01;

import java.util.Scanner;

/**
 * packageName : chapter01
 * fileName : no1
 * author : juhee
 * date : 2022-10-06
 * description : 실습 1-1
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-06         juhee          최초 생성
 */
// 3개의 정수값을 입력하고 최대값을 정하여 출력
public class Max3 {
    // 메인함수
    public static void main(String[] args) {
        // 스캐너로 입력받기
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 최대값을 구합니다.");
        System.out.print("a의 값: ");
        // nextInt() : 키보드에서 엔터쳐서 들어온 값 중 정수를 가져옴
        // nextLine() : 키보드에서 엔터쳐서 들어온 값 가져옴
        int a = stdIn.nextInt();    
        System.out.println("b의 값: ");
        int b = stdIn.nextInt();    // b에 입력받은 값 저장
        System.out.println("c의 값: ");
        int c = stdIn.nextInt();    // c에 입력받은 값 저장

        int max = a;    // a가 max(최대값)이라고 일단 설정
        if (b > max) max = b;   // b가 max(a)보다 크면 b를 max에 넣음
        if (c > max) max = c;

        // 출력
        System.out.println("최대값은 " + max + "입니다.");



    }
}
