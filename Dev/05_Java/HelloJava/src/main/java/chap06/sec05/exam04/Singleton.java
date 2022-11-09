package chap06.sec05.exam04;

/**
 * packageName : chap06.sec05.exam04
 * fileName : Singleton
 * author : ryujonghak
 * date : 2022/09/28
 * description : 디자인 패턴 Singleton
 * 목적 : 공유 객체(객체의 상태르 공유하기 위한 목적)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         ryujonghak          최초 생성
 */
public class Singleton {
//    첫번째: 다른 객체에서 생성을 못하게 막아야함.
    private static Singleton singleton = new Singleton(); // 최초 1번 생성
//    다른객체에서 생성을 막는 방법? private을 이용하여 선언시 1번만 생성 후 재생성 불가하게 만듬.
    private Singleton() {

    }
//    다른 객체에서는 이미 만들어진 객체를 고유해서 사용가능.
    static Singleton getInstance() {
        return singleton;
    }

}
