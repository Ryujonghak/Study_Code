package chap07.sec03.exam01;

/**
 * packageName : chap07.sec03.exam01
 * fileName : Phone
 * author : ryujonghak
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         ryujonghak          최초 생성
 */
//    추상클래스: abstract 추가하면 됨.
//    추상클래스 객체생성을 못함(New 연산을 못함.), 사용 목적: 함수 이름을 통일하고 공통된 속성이름을 사용할 목적.
//    추상클래스 = 부모클래스. 자식클래스가 상속받아 사용.
public abstract class Phone {
    public String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    //    전원을 켜는 함수
    public void turnOn() {
        System.out.println("Turning on");
    }

    //    전원을 끄는 함수
    public void turnOff() {
        System.out.println("Turning off");
    }
}
