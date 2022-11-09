package chap08.sec01.exam02;

/**
 * packageName : chap08.sec01.exam02
 * fileName : SmartTelevisionApp
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class SmartTelevisionApp {
    public static void main(String[] args) {
        SmartTelevision smartTelevision = new SmartTelevision();

        RemoteControl rc = smartTelevision;
        Searchable sa = smartTelevision;

        rc.turnOn();
        rc.setVolume(9);
        rc.turnOff();

        sa.search("www.naver.com");
    }
}
