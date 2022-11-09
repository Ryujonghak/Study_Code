package chap06.sec02.Verify;

/**
 * packageName : chap06.sec02.Verify
 * fileName : MemberApplication
 * author : ryujonghak
 * date : 2022/09/27
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/27         ryujonghak          최초 생성
 */
public class MemberApplication {
    public static void main(String[] args) {
        // Member 객체를 생성하고 속성에 아래의 값으로 저장한 후 속성의 값을 출력하세요.
        Member member = new Member();

        member.name = "최하얀";
        member.id = "23";

        System.out.println("이름: "+member.name);
        System.out.println("ID: "+member.id);

//        결과 :
//            이름 : 최하얀
//            id : 23

    }
}
