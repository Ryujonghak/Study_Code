package chap06.sec03.exam03;

/**
 * packageName : chap06.sec03.exam03
 * fileName : Car
 * author : ryujonghak
 * date : 2022/09/27
 * description : 생성자 오버로딩
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/27         ryujonghak          최초 생성
 */
public class Car {
    //    속성 정의
    String Company = "현대자동차";
    String Model;
    String Color;
    int MaxSpeed;

    //    객체지향언어에서 제공하는 기능: 생성자 오버로딩(일반적으로 함수명이 같으면 에러가 발생하지만 객체지향언어에서는 단, 매개변수 타입과 개수가 다르다면 허용함.)
    public Car() {
    }

    public Car(String Model) {
       this(Model, null, 0);
    }

    public Car(String Model, String Color) {
        this(Model, Color, 0);
    }

    public Car(String model, String color, int maxSpeed) {
        Model = model;
        Color = color;
        MaxSpeed = maxSpeed;
    }
}
