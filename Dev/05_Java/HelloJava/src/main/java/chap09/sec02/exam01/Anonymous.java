package chap09.sec02.exam01;

/**
 * packageName : chap09.sec02.exam01
 * fileName : Anonymous
 * author : ryujonghak
 * date : 2022/10/04
 * description : 익명 클래스의 사용법
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class Anonymous {
    //    1) 일반 속성에 익명 객체 사용
    Person filed = new Person() {
        //        익명 개체: 부모클래스 객체변수 = new 부모클래스 { 이름 없이 사용하는 클래스 내용 }
        void work() {
            System.out.println("출근합니다.");
        }

        @Override
        void wake() {
            System.out.println("6시에 일어납니다.");
            work();
        }
    }; // Composition(구성, 집합)

    //    함수의 로컬 변수에도 사용가능
    void method() {
//        로컬 변수값으로 익명 객체 대입
        Person localVar = new Person() {
            void walk() {
                System.out.println("산책합니다.");
            }

            @Override
            void wake() {
                System.out.println("7시에 일어납니다.");
                walk();
            }
        };

        localVar.wake(); // 지역변수(Person 객체)의 함수호출
    }

    void method2(Person person) {
        person.wake();
    }
}
