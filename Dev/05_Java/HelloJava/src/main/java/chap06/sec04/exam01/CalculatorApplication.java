package chap06.sec04.exam01;

/**
 * packageName : chap06.sec04.exam01
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

        calculator.powerOn();
        calculator.powerOff();

        int sum = calculator.plus(10, 5);
        System.out.println(sum);

        double div = calculator.divide(10, 5);
        System.out.println(div);

    }
}
