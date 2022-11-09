package chap06.sec02.exam01;

/**
 * packageName : chap06.sec02.exam01
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
        Car myCar = new Car();

        System.out.println(myCar.company);
        System.out.println(myCar.model);
        System.out.println(myCar.color);
        System.out.println(myCar.maxSpeed);
        System.out.println(myCar.speed);

        myCar.speed = 280;
        System.out.println(myCar.speed);
    }
}
