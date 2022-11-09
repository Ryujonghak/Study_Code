package chap07.sec01.exam06;

/**
 * packageName : chap07.sec01.exam05
 * fileName : Car
 * author : ryujonghak
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         ryujonghak          최초 생성
 */
public class Car {
    public int speed;

//    속도 증가 함수
    public void speedUp() {
        speed += 1;
    }

    public final void stop() {
        speed = 0;
    }
}
