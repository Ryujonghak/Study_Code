package chap07.verify.exam03;

/**
 * packageName : chap07.verify.exam03
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
        GoodCalc goodCalc = new GoodCalc();

        System.out.println(goodCalc.add(2,3));
        System.out.println(goodCalc.subtract(2,3));
        System.out.println(goodCalc.average(new int[]{2,3,4}));
    }

}
