package chap07.sec01.exam01;

/**
 * packageName : chap06.sec07.exam01
 * fileName : DmbCellPhoneApp
 * author : ryujonghak
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         ryujonghak          최초 생성
 */
public class DmbCellPhoneApp {
    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone("iPhone","Silver",1);

        System.out.println(dmbCellPhone.model);
        System.out.println(dmbCellPhone.color);
//        상속 함수
        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("안녕하세요.");
        dmbCellPhone.receiveVoice("네, 안녕하세요.");
        dmbCellPhone.hangUp();
//        개별 함수
        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(10);
        dmbCellPhone.turnOffDmb();
//        상속 함수
        dmbCellPhone.powerOff();


    }
}
