package chap08.sec01.exam01;

/**
 * packageName : chap08
 * fileName : RemoteControlApplication
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class RemoteControlApplication {
    public static void main(String[] args) {
        RemoteControl audio = new Audio();
        RemoteControl television = new Television();

        audio.turnOn();
        audio.setVolume(10);
        audio.turnOff();



    }
}
