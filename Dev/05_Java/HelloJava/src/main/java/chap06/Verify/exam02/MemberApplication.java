package chap06.Verify.exam02;

/**
 * packageName : chap06.Verify.exam02
 * fileName : MemberApplication
 * author : ryujonghak
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         ryujonghak          최초 생성
 */
public class MemberApplication {
    public static void main(String[] args) {
//        1) Member 객체를 생성하고 싶습니다. 생성자에서 name 속성과 id 속성을
//        외부에서 받은 값으로 초기화 할 수 있도록 Member 클래스를 작성해 보세요.
        Member member = new Member("홍길동", "hong");

        System.out.println("name :" + member.name);
        System.out.println("id :" + member.id);
    }
}
