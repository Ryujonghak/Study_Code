package chap08.sec02.exam04;

/**
 * packageName : chap08.sec02.exam04
 * fileName : DriverApp
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class DriverApp {
    public static void main(String[] args) {
        Flyable flyable = new Bat();
        flyable.fly();

        flyable = new Sparrow();
        flyable.fly();

        Swimable swimable = new Whale();
        swimable.swim();
    }
}
