package chap08.sec02.exam03;

/**
 * packageName : chap08.sec02.exam03
 * fileName : VehicleApp
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class VehicleApp {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run(); // 버스가 달립니다.

        System.out.println("------------------------");

        Bus bus = (Bus)vehicle; // 강제 타입 변환

        bus.run();        // 버스가 달립니다.
        bus.checkFare();  // 승차요금을 체크합니다.
    }

}
