package chap07.sec01.exam06;

/**
 * packageName : chap07.sec01.exam06
 * fileName : SportsCar
 * author : ryujonghak
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         ryujonghak          최초 생성
 */
public class SportsCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }
//  final 붙은 상위 클래스 함수는 재정의 할 수 없음(stop() 함수).
}
