package chap06.sec05.exam01;

/**
 * packageName : chap06.sec05.exam01
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

        Car car1 = new Car("포르쉐",100);
        Car car2 = new Car("벤츠", 50);

        for (int i = 0; i < 5; i++) {
            car1.run();
            car2.run();
        }

    }
}
