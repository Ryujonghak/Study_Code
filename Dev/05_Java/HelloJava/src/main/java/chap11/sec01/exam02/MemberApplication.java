package chap11.sec01.exam02;

/**
 * packageName : chap11.sec01.exam02
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
        Member member = new Member("blue"); // 방번호(주소) 1
        Member member2 = new Member("blue"); // 방번호(주소) 2
        Member member3 = new Member("red");

//        객체 비교 시 .equals 방번호(주소) 비교
        if(member.equals(member2)) {
            System.out.println("member 와 member2는 같습니다.");
        } else {
            System.out.println("member 와 member2는 다릅니다.");
        }
    }

}
