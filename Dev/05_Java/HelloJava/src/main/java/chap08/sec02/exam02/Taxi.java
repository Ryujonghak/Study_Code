package chap08.sec02.exam02;

/**
 * packageName : chap08.sec02.exam02
 * fileName : Taxi
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class Taxi implements Vehicle{
    @Override
    public void drive(Vehicle vehicle) {
        System.out.println("Taxi가 달립니다.");
    }
}
