package chap01.exam01;

import java.util.Scanner;

public class Q1 {
    static int max4(int a,int b,int c,int d){
        int max = a; //최댓값
        if(b>max) max=b;
        if(c>max) max=c;
        if(d>max) max=d;

        return max; //구한 최댓값을 호출한곳으로 반환하기
    }

    public static void main(String[] args) {
        // 출력

        Scanner scanner = new Scanner(System.in); // 입력받기
        int a,b,c,d; // 정수임을 정의

        System.out.println("최대값구하기");
        System.out.print("a값:");
         a= scanner.nextInt();

        System.out.print("b값:");
        b= scanner.nextInt();

        System.out.print("c값:");
        c= scanner.nextInt();

        System.out.print("d값:");
        d= scanner.nextInt();

        int max = max4(a,b,c,d); //최대값

        System.out.println("최대값은 "+max );



    }
}
