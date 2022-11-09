package chap08.sec02.exam06;

/**
 * packageName : chap08.sec02.exam06
 * fileName : CalculatorApplication
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class CalculatorApplication {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 5));
        System.out.println(calc.subtract(10, 5));
        System.out.println(calc.times(10, 5));
        System.out.println(calc.divide(10, 5));

        System.out.println("--- 0으로 나누기 테스트 ---");
        System.out.println(calc.divide(10, 0));

        System.out.println(); // 한 줄 띄우기

        calc.showInfo();
    }

}
