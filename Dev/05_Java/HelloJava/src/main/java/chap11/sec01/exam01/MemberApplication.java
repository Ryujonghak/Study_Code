package chap11.sec01.exam01;

/**
 * packageName : chap11.sec01.exam01
 * fileName : MemberApplication
 * author : ryujonghak
 * date : 2022/10/04
 * description : 실행클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class MemberApplication {
    public static void main(String[] args) {
        Member member = new Member("blue");
        Member member2 = new Member("blue");
        Member member3 = new Member("red");

//        객체 비교시 .equals()는 메모리 주소 비교를 함.
        if (member.equals(member3)) {
            System.out.println("O");
        } else {
            System.out.println("X");
        }
    }
}
