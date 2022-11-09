package chap01.exam01;


import java.util.Scanner;

// 세 값의 최소값을 구하기
public class Q2 {
    static int min3(int a, int b , int c) {
        int min =a; //최소값 정의
        if (b<min) min = b;
        if (c<min) min = c;

        return min;
    }

    public static void main(String[] args) {
        //출력하기

        Scanner scanner = new Scanner(System.in); // 입력받기
        int a,b,c; //정수 정의

        System.out.println("정수 최소값 구하기");

        System.out.print("a값:");
        a= scanner.nextInt();

        System.out.print("b값:");
        b= scanner.nextInt();

        System.out.print("c값:");
        c= scanner.nextInt();

        int min = min3(a,b,c); // 세 정수의 최소값 정의

        System.out.println("최소값" + min);
    }

}
