package chap09.sec01.exam05;

/**
 * packageName : chap09.sec01.exam05
 * fileName : Outer
 * author : ryujonghak
 * date : 2022/10/04
 * description : 중첩 클래스 안에서 바깥 this 참조
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class Outer {
    String field = "Outer-feild";

    void method() {
        System.out.println(field);
    }

    //    일반 중첩 클래스
    class Nested {
        String field = "Nested-feild";

        void method() {
            System.out.println(field);
        }

        void print() {
            System.out.println(this.field); // 중첩 클래스의 this를 의미
            this.method(); // 중첩 클래스의 함수 호출

//            바깥 클래스 접근
            System.out.println(Outer.this.field);
            Outer.this.method();
        }
    }
}
