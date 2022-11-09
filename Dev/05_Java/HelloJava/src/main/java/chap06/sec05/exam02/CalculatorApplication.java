package chap06.sec05.exam02;

/**
 * packageName : chap06.sec05.exam02
 * fileName : CalculatorApplication
 * author : ryujonghak
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         ryujonghak          최초 생성
 */
public class CalculatorApplication {
    public static void main(String[] args) {
        double result1 = 10 * 10 * Calculator.pi; // pi = 3.14 공유 변수
        int result2 = Calculator.plus(10, 5); // 두개의 매개변수 더하기 공유함수
        int result3 = Calculator.minus(10, 5); // 두개의 매개변수 더하기 공유함수

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);

    }
}
