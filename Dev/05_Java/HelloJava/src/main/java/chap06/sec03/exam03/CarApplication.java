package chap06.sec03.exam03;

/**
 * packageName : chap06.sec03.exam03
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
        Car car1 = new Car();
        Car car2 = new Car("자가용");
        Car car3 = new Car("자가용","빨강");
        Car car4 = new Car("자가용","빨강",200);


    }
}
