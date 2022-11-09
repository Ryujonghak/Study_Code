package chap01.exam01;

import java.util.Scanner;

public class Median {
    static int med3(int a, int b, int c){
        if(a>=b)
            if(a>=c)
                return b; // a가 b보다 크거나같고 a가 c보다 크거나 같을때 중앙값 b 리턴
        else if (a<= c)
            return a; // a가 c 보다 작다면 c>a>b a값리턴
        else return c ;

        else if (a>c)
            return a; // a 가 c 보다 크다면 b>a>c  a 값 리턴
        else if (b>c)
            return c; // b>a=c or b>c>a 이므로 c 리턴

        else return b; //나머지 b 리턴

    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in); // 정수 입력받기

        int a,b,c ; //abc가 정수임을 정의
        System.out.println("세 정수의 중앙값을 구한다");

        System.out.print("a값:");
        a= scanner.nextInt();

        System.out.print("b값:");
        b= scanner.nextInt();

        System.out.print("c값:");
        c= scanner.nextInt();

        System.out.println("중앙값은"+med3(a,b,c)+"입니다.");

    }
}
