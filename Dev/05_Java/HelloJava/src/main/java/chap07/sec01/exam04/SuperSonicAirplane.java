package chap07.sec01.exam04;

/**
 * packageName : chap07.sec01.exam04
 * fileName : SuperSonicAirplane
 * author : ryujonghak
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         ryujonghak          최초 생성
 */
public class SuperSonicAirplane extends Airplane {
    public static final int NORMAL = 1; // 공유상수
    public static final int SUPERSONIC =2;

    public int flyMode = NORMAL;

//    함수 재정의 fly()
    @Override
    public void fly() {
        if(flyMode == SUPERSONIC) {
            System.out.println("초음속 비행합니다.");
        } else {
            super.fly();
        }
    }
}
