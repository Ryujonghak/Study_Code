package chap06.sec03.exam01;

/**
 * packageName : chap06.sec03.exam01
 * fileName : CarApplication
 * author : ryujonghak
 * date : 2022/09/27
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/27         ryujonghak          최초 생성
 */
public class CarApplication {
    public static void main(String[] args) {
        Car MyCar = new Car("Black", 3000);

        System.out.println(MyCar.col);
        System.out.println(MyCar.ccnNum);

    }

}
