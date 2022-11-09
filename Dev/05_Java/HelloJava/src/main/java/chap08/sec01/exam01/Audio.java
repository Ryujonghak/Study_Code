package chap08.sec01.exam01;

/**
 * packageName : chap08
 * fileName : Audio
 * author : ryujonghak
 * date : 2022/09/30
 * description : 구현클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class Audio implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Turning on");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off");
    }

    @Override
    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
            System.out.println("Volume: " + this.volume);
        } else {
            System.out.println("허용되지 않는 값이 입력됨.");
        }
    }
}
