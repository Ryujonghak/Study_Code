package chap01.exam01;


import java.util.Scanner;

//실습 101 세 정수의 최대값을 구하기 
public class Max3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 입력받기 

        System.out.println("세 정수의 최댓값을 구합니다.");
        System.out.println("a의 값:");
        int a = scanner.nextInt(); // nestInt() :정수를 입력받는 함수

        System.out.println("b의 값:");
        int b = scanner.nextInt();


        System.out.println("c의 값:");
        int c = scanner.nextInt(); //세 값을 입력받음

        int max = a ;
        if(b>max) max =b ;// b>a 일때 max 는 b값
        if(c>max) max =c; // a,b,c 최대값을 구해서 max에 대입함.

        System.out.println("최대값은 " + max + "입니다.");



    }
    
}
