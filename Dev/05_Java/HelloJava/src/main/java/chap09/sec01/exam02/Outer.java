package chap09.sec01.exam02;

/**
 * packageName : chap09.sec01.exam02
 * fileName : Outer
 * author : ryujonghak
 * date : 2022/10/04
 * description : 중첩 클래스의 공유 객체, 일반 객체
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class Outer {
    //    일반속성 = 일반 중첩 클래스의 객체
    Attr attr = new Attr();
    Share share = new Share();

    //    일반함수
    void method1() {
//        지역변수: 함수안에서만 사용이되고 외부에서 사용할 수 없는 변수
        Attr attr = new Attr();
        Share share = new Share();
    }

//    공유 변수
//    static Attr attr3 = new Attr(); //  사용불가.
//    static Share share3 = new Share(); // 공유 변수에는 공유 중첩 클래스 사용가능.
//    static void method2() {
//        Attr attr = new Attr(); // 사용불가.
//        Share share = new Share(); // 공유 함수, 변수, 클래스 간에서 사용가능.
//    }

    //    일반 중첩 클래스
    class Attr {

    }

    //    공유 중첩 클래스
    static class Share {

    }
}
