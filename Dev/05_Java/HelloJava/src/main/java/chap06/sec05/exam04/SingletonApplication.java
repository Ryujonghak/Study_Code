package chap06.sec05.exam04;

/**
 * packageName : chap06.sec05.exam04
 * fileName : SingletonApplication
 * author : ryujonghak
 * date : 2022/09/28
 * description : 공유 객체 테스트(메모리 주소가 같은지 비교)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         ryujonghak          최초 생성
 */
public class SingletonApplication {
    public static void main(String[] args) {
//        공유 객체 만들기
//        getInstance() 공유함수: 클래스명.함수명()
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("same");
        }
    }
}
