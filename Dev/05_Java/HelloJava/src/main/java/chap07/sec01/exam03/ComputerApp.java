package chap07.sec01.exam03;

/**
 * packageName : chap07.sec01.exam03
 * fileName : ComputerApp
 * author : ryujonghak
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         ryujonghak          최초 생성
 */
public class ComputerApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Computer computer = new Computer();
        double num1 = calculator.areaCircle(5);
        System.out.println(num1);
        double num = computer.areaCircle(5);
        System.out.println(num);
    }
}
