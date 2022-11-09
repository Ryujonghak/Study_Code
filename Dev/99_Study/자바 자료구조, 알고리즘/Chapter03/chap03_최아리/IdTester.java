package chap03;

/**
 * packageName : chap03
 * fileName : IdTester
 * author : 최아리
 * date : 2022-10-22
 * description : 실습 3C-1 (p.119)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-22         최아리          최초 생성
 */
public class IdTester {
    public static void main(String[] args) {
//        객체 2개 생성
        Id a = new Id(); // 아이디1
        Id b = new Id(); // 아이디2

        System.out.println("a의 아이디 : " + a.getId()); // 인스턴스 메소드 호출
        System.out.println("b의 아이디 : " + b.getId()); // 인스턴스 메소드 호출

        System.out.println("부여한 아이디의 개수 : " + Id.getCounter()); // 클래스 메소드 호출

//        => 클래스 변수와 클래스 메소드는 객체 생성 없이 바로 쓸 수 있다.
    }
}
