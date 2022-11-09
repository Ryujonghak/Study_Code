package chap08.sec02.exam01;

/**
 * packageName : chap08.sec02.exam01
 * fileName : Car
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * 요약 :
 *     자동 타입 변환 : 구현 객체가(자식클래스) 인터페이스(부모) 변수에 대입되는 것
 *     다형성 : 상속은 같은 종류의 하위 클래스를 만드는 기술,
 *         인터페이스는 사용 방법이 같은(함수의 선언 같다) 클래스를 만드는 기술
 *     강제 타입 변환 : 인터페이스에 저장된 구현 객체(자식 클래스)를 다시 구현 클래스(자식 클래스)로
 *             변환하는것(원복)
 *     instanceof : 강제 타입 변환을 하기 전에 변환 가능한지 조사할 때 사용하는 연산자
 *         인터페이스(부모) 안에 구현객체(자식 클래스)가 있는지 조사할 때 사용
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class Car {
    Tire frontLeftTire = new HankookTire();
    Tire frontRightTire = new HankookTire();
    Tire backLeftTire = new HankookTire();
    Tire backRightTire = new HankookTire();

    void run() {
        frontLeftTire.roll();
        frontRightTire.roll();
        backLeftTire.roll();
        backRightTire.roll();
    }
}
