package chap07.sec03.exam01;

/**
 * packageName : chap07.sec03.exam01
 * fileName : SmartPhoneApplication
 * author : ryujonghak
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         ryujonghak          최초 생성
 */
public class SmartPhoneApplication {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("RJH");

        System.out.println("owner: " + smartPhone.owner);
        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();

    }
}
