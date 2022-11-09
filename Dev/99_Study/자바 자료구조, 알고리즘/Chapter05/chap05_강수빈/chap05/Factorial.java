package chap05;

import java.util.Scanner;

/**
 * packageName : chap05
 * fileName : Factorial
 * author : gangsubin
 * date : 2022/11/05
 * description :
 *
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/11/05         gangsubin          최초 생성
 */

/* TODO 재귀 알고리즘
* 장점) 짧고 쉬움
* 단점) 시간이 많이걸림
*      공간을 많이 차지함 (-> 새로 return된 값의 공간이 필요하고
*                        함수에 필요한 데이터를 채워야함
*                        = 공간차지함)
* 어떻게 사용하는가
* 1)팩토리얼 - (n>0) 일때
*            n! = n * (n-1)!
*
* 2)지수승계산함
*   ex) 2^3 = 8을 나타낼때 (base = 2 / exponent = 3)
*   TODO calcpower()
*    clacpower(2,3) = 2 * calcpower(2,2) = 2*2* calcpower(2,1) = 2*2*2  */

public class Factorial {
    //음이 아닌 정수 n의 팩토리얼을 구하기

    static int factorial(int n){ //int n이 양의정수 일때
        if(n>0)
            return factorial(n-1); // factorial  기본 공식  n! = n X (n-1)!
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수값을 입력하세요 :");
        int x = scanner.nextInt();

        System.out.println( x + "의 팩토리얼은" + factorial(x) + "입니다.");
    }
}
