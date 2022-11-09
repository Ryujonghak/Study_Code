package chap01.exam01;

import java.util.Scanner;

public class Q3 {
    //네개의 최소값을 구하는 min4 메서드 작성

    static int min4(int a,int b,int c, int d){
        int min = a;
        if (b<min) min = b;
        if (c<min) min = c;
        if (d<min) min = d;

        return min;
    }

    public static void main(String[] args) {
        //출력하기

        Scanner scanner = new Scanner(System.in); //입력받기

        System.out.println("4개의 정수의 최소값");

        System.out.print("a값:");
        int a = scanner.nextInt();

        System.out.print("a값:");
        int b = scanner.nextInt();

        System.out.print("a값:");
        int c = scanner.nextInt();

        System.out.print("a값:");
        int d = scanner.nextInt();


         int min = min4(a,b,c,d);
        System.out.println("최소값은 " + min);

    }
}
