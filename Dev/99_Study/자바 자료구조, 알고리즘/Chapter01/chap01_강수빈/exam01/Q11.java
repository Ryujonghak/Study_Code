package chap01.exam01;

public class Q11 {
    public static void main(String[] args) {
        System.out.println("구구단 곱셈");


        for (int i = 1; i <=9 ; i++) {
            System.out.printf("%3d",i); //%3d == 공백주는 format 문자열
                                        //3= 자리수, % = 특정포맷으로 대체하겠다는 뜻 , d는 10진수를 의미
            for (int j = 1; j <=9 ; j++) {
                System.out.printf("%3d",i*j);
            }
            System.out.println();
        }

        // TODO 가로 세로줄 어떻게 넣는지 모르겠음.
    }
}
