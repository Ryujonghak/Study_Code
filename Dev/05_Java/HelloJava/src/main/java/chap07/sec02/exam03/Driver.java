package chap07.sec02.exam03;

/**
 * packageName : chap07.sec02.exam03
 * fileName : Driver
 * author : ryujonghak
 * date : 2022/09/29
 * description : 매개변수의 다형성
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         ryujonghak          최초 생성
 */
public class Driver {
//    운전함수
//    함수의 매개변수 Vehicle은 상위 클래스, 다형성을 이용하여 하위 클래스 BUS, TAXI를 넣을 수 있다.
    public void drive(Vehicle vehicle) {
        vehicle.run(); // 상위 클래스의 함수
    }
}
