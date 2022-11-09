package chap08.sec02.exam06;

/**
 * packageName : chap08.sec02.exam06
 * fileName : Calculator
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class Calculator implements Calc {
    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return  num1 - num2;
    }

    @Override
    public int times(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if(num1 != 0 && num2 != 0) {
            return num1 / num2;
        } else {
            return ERROR;
        }

    }

    public void showInfo() {
        System.out.println("간단한 사칙연산 계산기입니다.");
    }
}
