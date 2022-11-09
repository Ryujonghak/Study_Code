package chap08.sec01.exam02;

/**
 * packageName : chap08.sec01.exam02
 * fileName : SmartTelevision
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class SmartTelevision implements RemoteControl, Searchable {
    private int volume;

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }

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
