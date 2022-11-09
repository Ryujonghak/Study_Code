package chap01.exam01;

import java.util.Scanner;

public class Q10 {
    //양의정수 3개 입력 -> 자리수 출력하기
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 정수값 3개 입력 받는 입력 함수

        System.out.println("정수 자릿수 구하기");
        int n;

        do {
            System.out.println("정수:");
            n = scanner.nextInt(); //정수 n값이 입력됨
        }while (n<=0); // n이 0보다 클때까지 반복해서 실행함

        int num = 0 ; // num  = 자릿수

       while(n>0){      // while(조건식)  // n이 0보다 클떄 n을 10으로 나눔
           n = n/10; //TODO  여기 왜 10으로 나눌까?
           num++;
       }
            System.out.println("그 수는"+ num +"자리 입니다.");

        }
    }

