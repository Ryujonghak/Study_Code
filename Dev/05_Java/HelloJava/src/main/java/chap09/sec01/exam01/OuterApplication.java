package chap09.sec01.exam01;

/**
 * packageName : chap09.sec01.exam01
 * fileName : OuterApplication
 * author : ryujonghak
 * date : 2022/10/04
 * description : 중첩 클래스의 사용법
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class OuterApplication {
    public static void main(String[] args) {
        Outer outer = new Outer();

        // 중첩 클래스 만드는 방법
        Outer.Attr attr = outer.new Attr();
        attr.method1();

        // 공유 클래스 만드는 방법
        Outer.Share share = new Outer.Share();
        share.method1();

        // 공유 중첩 클래스의 공유 함수 접근
        Outer.Share.method2();

        // 로컬 클래스 사용 방법
        outer.method();
    }
}
