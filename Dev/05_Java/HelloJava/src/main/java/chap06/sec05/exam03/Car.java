package chap06.sec05.exam03;

/**
 * packageName : chap06.sec05.exam03
 * fileName : Car
 * author : ryujonghak
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         ryujonghak          최초 생성
 */

// 예제: 공유변수(함수) 사용시 주의점
public class Car {
    int speed;

    void run() {
        System.out.println(speed+"km/h로 달립니다.");
    }
// 공유함수
    public static void main(String[] args) {
//    this.speed = 100; // 에러발생: 같은 클래스 내부라도 공유함수내 사용이 불가능.
        Car car = new Car();
        car.speed = 100;
        car.run();
    }
}
