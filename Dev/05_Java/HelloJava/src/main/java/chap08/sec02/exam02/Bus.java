package chap08.sec02.exam02;

/**
 * packageName : chap08.sec02.exam02
 * fileName : Bus
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class Bus implements Vehicle{
    @Override
    public void drive(Vehicle vehicle) {
        System.out.println("bus가 달립니다.");
    }
}
