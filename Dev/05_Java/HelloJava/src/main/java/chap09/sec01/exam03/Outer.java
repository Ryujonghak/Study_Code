package chap09.sec01.exam03;

/**
 * packageName : chap09.sec01.exam03
 * fileName : Outer
 * author : ryujonghak
 * date : 2022/10/04
 * description : 일반 중첩 클래스의 사용 제한
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class Outer {
    int field1; // 일반 속성

    void method1() { // 일반 함수

    }

    static int field2; // 공유 속성

    static void method2() { // 공유 함수

    }

    //    일반 중첩 클래스: 바깥 클래스의 속성, 함수 쓰기 모두 가능.
    class Attr {
        void method() {
            field1 = 10; // 바깥 클래스의 일반 속성은 가져와서 사용하는데 문제 없음.
            method1(); // 바깥 클래스의 일반 함수는 가져와서 사용하는데 문제 없음.

            field2 = 10; //바깥 클래스의 고유 속성은 가져와서 사용하는데 문제 없음.
            method2(); // 바깥 클래스의 공유 함수는 가져와서 사용하는데 문제 없음.
        }
    }

//    공유 중첩 클래스: 바깥 클래스의 일반 속성, 함수는 사용 불가.
    static class Share {
        void method() {
//            field1 = 10; // 바깥 클래스의 일반 속성은 가져와서 사용하는데 문제 있음.
//            method1(); // 바깥 클래스의 일반 함수는 가져와서 사용하는데 문제 있음.

            field2 = 10; //바깥 클래스의 고유 속성은 가져와서 사용하는데 문제 없음.
            method2(); // 바깥 클래스의 공유 함수는 가져와서 사용하는데 문제 없음.
        }
    }
}
