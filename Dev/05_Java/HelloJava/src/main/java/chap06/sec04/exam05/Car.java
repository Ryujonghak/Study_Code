package chap06.sec04.exam05;

/**
 * packageName : chap06.sec04.exam05
 * fileName : Car
 * author : ryujonghak
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         ryujonghak          최초 생성
 */
public class Car {
    int speed;

    void println(String message) { //sout 대용
        System.out.println(message);
    }

    void keyTurnOn() {
        println("키를 돌립니다.");
    }

    void run() {
//        달립니다.(시속:10km/h)
        speed += 10;
        println("달립니다. Speed(시속): " + speed + "km/h");
    }

    int getSpeed() {
        return speed;
    }


}
