package chap11.sec01.exam20;

/**
 * packageName : chap11.sec01.exam20
 * fileName : MathApplication
 * author : ryujonghak
 * date : 2022/10/05
 * description : Math 메서드
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         ryujonghak          최초 생성
 */
public class MathApplication {
    public static void main(String[] args) {
//        Math.abs(): 절대값 구하기
        int v1 = Math.abs(-5);
        double v2 = Math.abs(-3.14);
        System.out.println(v1 + ", " + v2);

//        Math.ceil(double): 소수점 올림 함수
        double v3 = Math.ceil(5.3);
        double v4 = Math.ceil(-5.3);
        System.out.println(v3 + ", " + v4);

//        Math.floor(double): 소수점 내림 함수
        double v5 = Math.floor(5.3);
        double v6 = Math.floor(-5.3);
        System.out.println(v5 + ", " + v6);

//        Math.max(변수, 변수): 두수의 최대값 구하기
        int v7 = Math.max(5, 9);
        double v8 = Math.max(5.3, 2.5);
        System.out.println(v7 + ", " + v8);

//        Math.max(변수, 변수): 두수의 최소값 구하기
        int v9 = Math.min(5, 9);
        double v10 = Math.min(5.3, 2.5);
        System.out.println(v9 + ", " + v10);

//        Math.random()
        double v11 = Math.random();
        System.out.println(v11);

//        Math.round(): 실수 반올림(첫째자리만 가능)
        long v14 = Math.round(5.3);
        long v15 = Math.round(5.7);
        System.out.println(v14 + ", " + v15);

//        세번째 자리 반올림
        double v16 = 12.3456;
        double temp = v16 * 100;
        double temp2 = Math.round(temp);
        v16 = temp2/ 100;
        System.out.println(v16);

    }
}
