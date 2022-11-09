package chap12.sec01.exam07;

/**
 * packageName : chap12.sec01.exam07
 * fileName : CalculatorApplication
 * author : ryujonghak
 * date : 2022/10/06
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         ryujonghak          최초 생성
 */

public class CalculatorApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // 1st 스레드 setMemory 호출
        User1 user1 = new User1();
        user1.setCalculator(calculator);
        user1.start(); //run 함수 실행

        //2nd 스레드 setMemory 호출
        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start(); //run 함수 실행

    }

}
