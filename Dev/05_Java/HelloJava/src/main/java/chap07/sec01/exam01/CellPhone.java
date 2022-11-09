package chap07.sec01.exam01;

/**
 * packageName : chap06.sec07.exam01
 * fileName : CellPhone
 * author : ryujonghak
 * date : 2022/09/29
 * description : 상속
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         ryujonghak          최초 생성
 */
public class CellPhone {
    // 상속: 부모(상위) 클래스에서 자식(하위, 파생) 클래스로 속성과 함수를 쓸수있도록 해줌.
    // 장점: 1) 코딩 중복을 제거함. 2) 상위 클래스의 속성이나 함수를 수정하면 하위 클래스는 연관되어 자동으로 수정됨(유지보수성, 코딩생산성 증가).
    String model;
    String color;

    // 생성자


    // 메소드(함수)
    void powerOn() {
        System.out.println("Power On");
    }

    void powerOff() {
        System.out.println("Power Off");
    }

    //    벨을 울리는 함수
    void bell() {
        System.out.println("bell");
    }

    //    핸드폰 통화 기능(함수)
    void sendVoice(String text) {
        System.out.println("자신: " + text);
    }

    void receiveVoice(String text) {
        System.out.println("상대방: " + text);
    }

//    통화 종료
    void hangUp() {
        System.out.println("hangUp");
    }


}
