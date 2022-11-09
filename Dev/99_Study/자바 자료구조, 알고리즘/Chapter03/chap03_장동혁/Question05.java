package StudyGroup.chap03;

/**
 * packageName : StudyGroup.chap03
 * fileName : Question05
 * author : hyuk
 * date : 2022/10/24
 * description : 실습 3C-1 p.119 ~ p.120
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/24         hyuk          최초 생성
 */

class Id{
    private static int counter = 0; // id를 몇개 부여했는지 저장
    private int id; // id

    public Id() {
        this.id = ++counter;
    }

    public static int getCounter(){ // counter를 반환하는 클래스 메서드
        return counter;
    }

    public int getId(){ // id를 반환하는 인스턴스 메서드
        return id;
    }
}

public class Question05 {
    public static void main(String[] args) {
        Id a = new Id(); // 아이디 1번
        Id b = new Id(); // 아이디 2번

        System.out.println("a의 아이디 : " + a.getId());
        System.out.println("b의 아이디 : " + b.getId());

        System.out.println("부여한 아이디의 개수 : " + Id.getCounter());
    }
}
