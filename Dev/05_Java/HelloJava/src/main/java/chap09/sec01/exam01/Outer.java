package chap09.sec01.exam01;

/**
 * packageName : chap09.sec01.exam01
 * fileName : Outer
 * author : ryujonghak
 * date : 2022/10/04
 * description : 특수 클래스(중첩)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class Outer {
    public Outer() {
        System.out.println("Outer 객체 생성");
    }

    //    속성의 형태 클래스가 있을 수 있음: 일반 중첩 클래스(= 인스턴스 멤버 클래스)
    public class Attr {
        public Attr() {
            System.out.println("Attr 객체 생성");
        }

        int field1; // 중첩 클래스 속성(= 필드, 멤버 변수, 인스턴스 변수)

        void method1() { // 중첩 클래스 함수
            System.out.println("Attr.method1");
        }
    }

    //    공유 중첩 클래스
    static class Share {
        public Share() {
            System.out.println("Share 객체 생성");
        }

        int field1; // 일반 속성
        static int field2; // 공유 속성

        void method1() { // 일반 함수
            System.out.println("Share.method1");
        }

        static void method2() { // 공유 함수
            System.out.println("Share.method2");
        }
    }

//    로컬 클래스
    void method() {
//        지역 클래스
        class Local {
            public Local() {
                System.out.println("Local 객체 생성");
            }
            int field1;

            void method1() {
                System.out.println("Local.method1");
            }
        }
        Local local = new Local();
        local.field1 = 1;
        local.method1();
    }
}
