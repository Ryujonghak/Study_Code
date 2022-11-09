package chap07.sec02.exam03;

/**
 * packageName : chap07.sec02.exam03
 * fileName : DriverApp
 * author : ryujonghak
 * date : 2022/09/29
 * description : 매개변수의 다형성
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         ryujonghak          최초 생성
 */
public class DriverApp {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Bus bus = new Bus();
        Taxi taxi = new Taxi();

//        매개변수의 변화에 따른 출력되는 결과가 달라짐.
        driver.drive(bus);
        driver.drive(taxi);

    }
}
