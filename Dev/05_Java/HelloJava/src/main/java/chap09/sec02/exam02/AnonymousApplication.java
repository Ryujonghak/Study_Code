package chap09.sec02.exam02;

/**
 * packageName : chap09.sec02.exam02
 * fileName : AnonymousApplication
 * author : ryujonghak
 * date : 2022/10/04
 * description : 실행클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class AnonymousApplication {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();
//        익명 객체 속성 사용
        anonymous.field.turnOn();
        anonymous.field.turnOff();

        System.out.println("------------------------");

//        익명객체 함수 사용
        anonymous.method1();

        System.out.println("------------------------");

//        매개변수 값으로 익명객체 전달
        anonymous.method2(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Turning on Radio");
            }

            @Override
            public void turnOff() {
                System.out.println("Turning off Radio");
            }
        });

    }
}
