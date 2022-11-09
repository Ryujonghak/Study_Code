package chap07.sec01.exam01;

/**
 * packageName : chap06.sec07.exam01
 * fileName : DmbCellPhone
 * author : ryujonghak
 * date : 2022/09/29
 * description : 상속(자식클래스)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         ryujonghak          최초 생성
 */

public class DmbCellPhone extends CellPhone {
    //    상위에서 속성은 상속받았으므로 정의할 필요가 없음.
    int channel; // TV Channel 속성

    public DmbCellPhone(String model, String color, int channel) {
        this.channel = channel;
        this.model = model;
        this.color = color;
    }

    //    TV 수신을 시작하는 함수
    void turnOnDmb() {
        System.out.println("채널: " + channel + "번 방송 수신을 시작합니다.");
    }

    //    채널 돌리기 함수
    void changeChannelDmb(int channel) {
        this.channel = channel;
        System.out.println("Channel: " + channel);
    }

    void turnOffDmb() {
        System.out.println("Turning off");
    }
}
