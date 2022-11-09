package chap07.sec01.exam04;

/**
 * packageName : chap07.sec01.exam04
 * fileName : SSAirplaneApp
 * author : ryujonghak
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         ryujonghak          최초 생성
 */
public class SSAirplaneApp {
    public static void main(String[] args) {
        SuperSonicAirplane superSonicAirplane = new SuperSonicAirplane();

        superSonicAirplane.takeOff();
        superSonicAirplane.fly();
        superSonicAirplane.flyMode = superSonicAirplane.SUPERSONIC;
        superSonicAirplane.fly();
        superSonicAirplane.land();

    }
}
