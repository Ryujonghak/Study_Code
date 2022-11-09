package chap03;

/**
 * packageName : chap03
 * fileName : Id
 * author : 최아리
 * date : 2022-10-22
 * description : 실습 3C-1 (p.119)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-22         최아리          최초 생성
 */
public class Id {
//    아이디를 부여하는 클래스
    private static int counter = 0; // 아이디를 몇 개 부여했는지 저장 (클래스 변수 = static 있음)
    private int id; // 아이디 (인스턴스 변수 = static 없음)

//    생성자
    public Id() {
        id = ++counter;
    }

//    counter를 반환하는 클래스 메서드(공유함수), getter
    public static int getCounter() {
        return counter;
    }

//    아이디를 반환하는 인스턴스 메서드, getter
    public int getId() {
        return id;
    }
}
