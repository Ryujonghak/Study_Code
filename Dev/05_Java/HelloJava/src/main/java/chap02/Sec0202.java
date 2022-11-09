package chap02;

public class Sec0202 {

    public void exam01() {
        int var1 = 0b1011; // 2진수(0b 붙이면 2진수)
        int var2 = 0206; // 8진수 (0 붙이면 8진수)
        int var3 = 365; // 10진수
        int var4 = 0xB3; // 16진수(0x 붙이면 16진수)

        System.out.println(var1 + " " + var2 + " " + var3 + " " + var4);
        //출력은 전부 10진수로 이루어짐
    }

    public void exam02() {
        byte var1 = -128; // byte(1byte 정수형), int(4byte 정수형)
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 127;

        System.out.println(var1 + " " + var2 + " " + var3 + " " + var4);
    }

    public void exam03() {
//        long(8byte 정수형)
        long var1 = 10;
        long var2 = 20L; // L을 붙여 long형태를 알려줌.
        long var3 = 1000000000L;

        System.out.println(var1 + " " + var2 + " " + var3);
    }

    public void exam04() {
//        문자형: 1개의 문자를 저장하는 자료형, 문자열형(1개 이상의 문자를 저장)
        char c1 = 'A'; // 한개의 문자  '',  두개의 문자이상 ""
        char c2 = 65; // 아스키코드 자동변환
        char c3 = '\u0041'; // 유니코드 자동변환
        char c4 = '가';
        char c5 = '\uac00'; // 유니코드 자동변환

        System.out.println(c1 + " " + c2 + " " + c3 + " " + c4 + " " + c5);
    }

    public void exam05() {
//        문자열 자료형: string
        String name = "홍길동";
        String job = "programmer";

        System.out.println(name + " " + job);
    }

    public void exam06() {
        System.out.println("번호\t이름\t직업");
        System.out.print("행 단위출력\n");
//        \ : 특수기호를 넣고 싶을 때 사용
        System.out.println("우리는 \"개발자\" 입니다.");
        System.out.println("봄 \\여름 \\가을 \\겨울");
    }

    public void exam07() {
//        실수형
        float var1 = 3.14f; // float(4byte) 실수형은 끝에 f를 붙인다.
        double var2 = 3.14; // double(8byte)은 표시를 해 줄 필요가 없다.

        float var3 = 0.12345678901234f; // float(4byte) 실수형은 끝에 f를 붙인다.
        double var4 = 0.12345678901234567890; // double(8byte)은 표시를 해 줄 필요가 없다.

        System.out.println(var1 + " " + var2);
        System.out.println(var3 + "\n" + var4);
    }

    public void exam08(boolean stop) {
//        boolean: 참(true), 거짓(false)를 저장하는 자료형
        if(stop) {
            System.out.println("stop");
        } else {
            System.out.println("start");
        }

    }
}
