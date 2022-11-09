package chap03.sec01.exam01;

/**
 * packageName : chap03.sec01.exam01
 * fileName : IdTester
 * author : 유영미
 * date : 2022-10-24
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-24         유영미          최초 생성
 */
public class IdTester {
    public static void main(String[] args) {
        Id a = new Id(); // 아이디 1
        Id b = new Id(); // 아이디 2

        System.out.println("a의 아이디 : " + a.getId());
        System.out.println("b의 아이디 : " + b.getId());

        System.out.println("부여한 아이디의 개수 : " + Id.getCounter());

    }
}
