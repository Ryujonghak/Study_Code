package chap06.sec04.exam04;

/**
 * packageName : chap06.sec04.exam04
 * fileName : Calculator
 * author : ryujonghak
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         ryujonghak          최초 생성
 */
public class Calculator {
    int plus(int a, int b) {
        int result = a + b;
        return result;
    }

    double avg(int a, int b) {
        double sum = plus(a, b);
        double result = sum / 2;
        return result;
    }
//    평균을 구해서 출력하는 함수
    void execute() {
        double result = avg(7, 10);
        println(String.valueOf(result));
    }
//    프린트함수
    void println(String s) {
        System.out.println("계산결과: " + s);
    }

}
