package chap06.sec04.exam03;

/**
 * packageName : chap06.sec04.exam03
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
        Car car = new Car();

        car.setGas(5);

        boolean gasState = car.isLeftGas();


        if (gasState) {
            System.out.println("출발합니다.");
            car.run();
        }

        if (car.isLeftGas() == true) {
            System.out.println("Gas를 주입할 필요가 없습니다.");
        } else {
            System.out.println("Gas를 주입하세요.");
        }
    }
}


