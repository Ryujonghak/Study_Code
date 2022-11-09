package chap09.sec02.exam01;

/**
 * packageName : chap09.sec02.exam01
 * fileName : AnonymousApplication
 * author : ryujonghak
 * date : 2022/10/04
 * description : 실행 클래스 + 매개변수의 익명함수 사용법
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class AnonymousApplication {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();

//        익명객체의 속성 사용
        anonymous.filed.wake();
//        익명객체의 함수 호출
        anonymous.method(); // 익명객체가 안에서 실행됨.
//        매개변수의 익명객체 사용
        anonymous.method2(new Person() { // 익명객체를 생성하여 매개변수로 전달
            void study() {
                System.out.println("공부합니다.");
            }

            @Override
            void wake() { // method2는 wake를 실행하도록 짜여있음.
                System.out.println("8시에 일어납니다.");
                study();
            }
        });
    }
}
