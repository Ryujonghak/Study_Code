package chap08.sec01.exam03;

/**
 * packageName : chap08.sec01.exam03
 * fileName : MyClassApp
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class MyClassApp {
    public static void main(String[] args) {
        MyClass myClass = new MyClass(new Audio());

        System.out.println("------------------------");

        myClass = new MyClass(new Television());
    }
}
