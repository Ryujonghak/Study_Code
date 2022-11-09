package chap09.sec01.exam04;

/**
 * packageName : chap09.sec01.exam04
 * fileName : Outer
 * author : ryujonghak
 * date : 2022/10/04
 * description : 지역 클래스에 사용제한
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class Outer {
    public void method(int arg) {
//        지역변수 -> 지역클래스가 있을 경우 상수(final)로 변환됨.(값 변경 불가)
        int localValue = 1;
//        지역클래스
        class Inner {
            public void method() {
                int result = arg + localValue; // 일반 중첩 함수간에 속성, 함수는 사용 가능.
            }
        }
    }
}
