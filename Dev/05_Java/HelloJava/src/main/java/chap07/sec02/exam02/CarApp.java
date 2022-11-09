package chap07.sec02.exam02;

/**
 * packageName : chap07.sec02.exam02
 * fileName : CarApp
 * author : ryujonghak
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         ryujonghak          최초 생성
 */
public class CarApp {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println(car.frontLeftTire);
        System.out.println(car.frontLeftTire);
        System.out.println(car.backLeftTire);
        System.out.println(car.backRightTire);


        int i = 0;
        while (i < 6) {
            int problemLocation = car.run();
            i++;
            switch (problemLocation) {
                case 1:
                    System.out.println("앞왼쪽 한국타이러로 교체");
                    car.frontLeftTire = new HankookTire("앞왼쪽",15);
                    break;
                case 2:
                    System.out.println("앞오른쪽 금호타이어로 교체");
                    car.frontRightTire = new KumhoTire("앞오른쪽", 13);
                    break;
                case 3:
                    System.out.println("뒤왼쪽 한국타이어로 교체");
                    car.backLeftTire = new HankookTire("뒤왼쪽", 15);
                    break;
                case 4:
                    System.out.println("뒤오른쪽 금호타이어로교체");
                    car.backRightTire = new KumhoTire("뒤오른쪽",13);
                    break;
                default:
                    System.out.println("타이어 이상무");
                    break;
            }
            System.out.println("-------------------------------------");
        }


        car.stop();
    }
}
