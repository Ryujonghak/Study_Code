package chap07.sec01.exam04;

/**
 * packageName : chap07.sec01.exam03
 * fileName : Airplane
 * author : ryujonghak
 * date : 2022/09/29
 * description : super.() 부모클래스의 함수 호출
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         ryujonghak          최초 생성
 */
public class Airplane {
    public void land() {
        System.out.println("착륙합니다.");
    }

    public void takeOff() {
        System.out.println("이륙합니다.");
    }

    public void fly() {
        System.out.println("일반 비행합니다.");
    }
}
