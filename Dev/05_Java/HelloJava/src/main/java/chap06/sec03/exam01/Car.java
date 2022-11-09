package chap06.sec03.exam01;

/**
 * packageName : chap06.sec03.exam01
 * fileName : Car
 * author : ryujonghak
 * date : 2022/09/27
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/27         ryujonghak          최초 생성
 */
public class Car {
//    생성자: 리턴타입(자료형) 없음.
//    Car() { //기본 생서자: 매개변수가 없는 생성자, 사용법: 클래스명() {}
//
//    }
    String col;
    int ccnNum;
    Car(String color, int cc) {
//        속성의 초기화를 담당함.(초기값을 넣어줌.)
        col = color;
        ccnNum = cc;
    }

}
