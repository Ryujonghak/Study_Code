package chap07.verify.exam03;

/**
 * packageName : chap07.verify.exam03
 * fileName : goodCalc
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class GoodCalc extends Calculator {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }

    @Override
    public double average(int[] a) {
        double sum = 0.0;
        for (int i : a) {
            sum += i;
        }

        return sum / a.length;
    }
}
