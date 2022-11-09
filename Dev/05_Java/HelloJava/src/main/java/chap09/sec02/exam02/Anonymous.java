package chap09.sec02.exam02;

/**
 * packageName : chap09.sec02.exam02
 * fileName : Anonymous
 * author : ryujonghak
 * date : 2022/10/04
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class Anonymous {
// 인터페이스안에 익멱 클래스를 만들어 넣을 수 있다.
    RemoteControl field = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("Turning on TV");
        }

        @Override
        public void turnOff() {
            System.out.println("Turning off TV");

        }
    };

//    함수내 지역변수에 익명 객체 사용
    void method1() {
        RemoteControl localVar = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Turning on Audio");
            }

            @Override
            public void turnOff() {
                System.out.println("Turning off Audio");
            }
        };
        localVar.turnOn();
        localVar.turnOff();
    }

    void method2(RemoteControl remoteControl) {
        remoteControl.turnOn();
        remoteControl.turnOff();
    }
}
