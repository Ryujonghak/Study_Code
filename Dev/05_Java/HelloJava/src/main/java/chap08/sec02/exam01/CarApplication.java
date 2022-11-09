package chap08.sec02.exam01;

/**
 * packageName : chap08.sec02.exam01
 * fileName : CarApplication
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class CarApplication {
    public static void main(String[] args) {
        Car car = new Car();

        car.run();

        System.out.println("------------------------");
        car.frontLeftTire = new KumhoTire();
        car.frontRightTire = new KumhoTire();

        car.run();
    }
}
