package chap06.sec04.exam06;

/**
 * packageName : chap06.sec04.exam06
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
        Calculator calculator = new Calculator();

        double result1 = calculator.areaRectangle(10);
        double result2 = calculator.areaRectangle(10, 20);

        System.out.println("정사각형 넓이: " + result1);
        System.out.println("직사각형 넓이: " + result2);
    }
}
