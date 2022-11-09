package chap06.sec05.exam01;

/**
 * packageName : chap06.sec05.exam01
 * fileName : Car
 * author : ryujonghak
 * date : 2022/09/28
 * description : 인스턴스(객체) 멤버와 정적 멤버
 * 요약 :
 *      객체(==인스턴스)멤버 : 객체 속성(멤버변수), 객체 함수(멤버메소드)
 *      this : 객체 내부의 자기자신을 의미하는 객체변수, 자신의 클래스 안에서만 사용가능
 *      공유(==정적==전역) 변수(함수) : 객체를 생성하지 않고 사용가능, 변수(함수)앞에 static 키워드 붙임
 *          사용법 : 클래스명.변수명, 클래스명.함수명()
 *      싱글톤 : 공유 객체
 *      final : 상수 만드는 키워드 , 변수의 앞에 붙이면 상수가 됨, 초기값 바로 지정해야함
 *          사용법 : final 변수명 = 초기값
 *      static final : 공유 상수
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         ryujonghak          최초 생성
 */
public class Car {
    String model;
    int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }


    void setSpeed(int speed) { //setter 함수
        this.speed = speed;
    }

    public Car(String model) {
        this.model = model;
    }

    public Car(int speed) {
        this.speed = speed;
    }

//    run(): 반복문을 돌려서 출력
    void run() {
        System.out.println(this.model+"가 달립니다. "+this.speed+"km/h");
        this.speed += 10;
    }
}
