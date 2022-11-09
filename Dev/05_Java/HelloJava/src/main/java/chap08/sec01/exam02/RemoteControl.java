package chap08.sec01.exam02;

/**
 * packageName : chap08
 * fileName : RemoteControl
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public interface RemoteControl {
    int MAX_VOLUME = 10; // 공유상수(interface 내에서는 static final 생략)
    int MIN_VOLUME = 1;

//    추상함수(interface 내에서는 abstract 생략)
    void turnOn(); // 리모컨 켜기
    void turnOff(); // 끄기

    void setVolume(int volume); // volume 조절함수


}
