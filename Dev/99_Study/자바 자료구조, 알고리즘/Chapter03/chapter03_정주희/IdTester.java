package chapter03;

/**
 * packageName : chapter03
 * fileName : IdTester
 * author : juhee
 * date : 2022-10-20
 * description : 실습 3C-1 (p.119)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-20         juhee          최초 생성
 */
class Id {
    private static int counter  = 0;    // id 개수  (클래스 변수)
    private int id;     // id   (인스턴스 변수)

    // 생성자
    public Id() {
        id = ++counter;
    }

    // 함수 getCounter()
    public static int getCounter() {
        return counter;
    }
    // 함수 getId()
    public int getId() {
        return id;
    }

}

public class IdTester {
    // main함수
    public static void main(String[] args) {
        Id a = new Id();    // 아이디 1
        Id b = new Id();    // 아이디 2

        System.out.println("a의 아이디: " + a.getId());
        System.out.println("b의 아이디: " + b.getId());

        System.out.println("부여한 아이디의 개수: " + Id.getCounter());
    }
}
