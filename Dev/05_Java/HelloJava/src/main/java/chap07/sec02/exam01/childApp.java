package chap07.sec02.exam01;

/**
 * packageName : chap07.sec02.exam01
 * fileName : childApp
 * author : ryujonghak
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         ryujonghak          최초 생성
 */
public class childApp {
    public static void main(String[] args) {
//자식 클래스 객체 생성
        child child = new child();
        child2 child2 = new child2();
//        child3 child3 = new Child3();

//        다형성(상속관계) : 사용 방법은 동일하지만 다양한 객체를 이용해서 다양한 실행결과가
//                        나오도록 하는것
//        자동형변환 : 부모객체 = 자식객체
//        부모객체.함수(); -> 재정의한 함수가 자식객체 있을 경우 재정의한 함수가 호출됨
//        다형성의 장점 :
//        예) 자동차가 타이어를 끼워넣는 방법은 일정하지만 금호타이어, 고급타이어 등 넣느냐에 따라서 주행속도가 달라짐
//        다향성을 구현: 함수 재정의 + 타입변환(형변환)
        parent parent = child2; // 연산자 byte -> int

        parent.method1(); // 부모 함수 호출
        parent.method2(); // 부모 함수 , 재정의한 자식 함수 ? 재정의한 자식 함수(o)

//        parent.method3(); // 다형성으로 이루어진 객체는 자식 객체의 고유 함수를 사용못함(에러 발생)
//
    }
}
