package chap06.sec04.exam05;

/**
 * packageName : chap06.sec04.exam05
 * fileName : CarApplication
 * author : ryujonghak
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         ryujonghak          최초 생성
 */
public class CarApplication {
    public static void main(String[] args) {
        Car car = new Car();
        car.keyTurnOn();
        for (int i = 0; i < 5; i++) {
            car.run();
        }
        int speed = car.getSpeed();
        car.println("현재속도: " + speed + "km/h");


    }
}
