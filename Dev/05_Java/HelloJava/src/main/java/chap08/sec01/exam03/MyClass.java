package chap08.sec01.exam03;


/**
 * packageName : chap08.sec01.exam03
 * fileName : MyClass
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class MyClass {
    RemoteControl remoteControl;

    public MyClass(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
        remoteControl.turnOn();
        remoteControl.setVolume(5);
        remoteControl.turnOff();
    }
}
