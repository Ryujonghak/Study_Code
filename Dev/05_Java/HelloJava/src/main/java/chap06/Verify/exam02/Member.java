package chap06.Verify.exam02;

/**
 * packageName : chap06.Verify.exam02
 * fileName : Member
 * author : ryujonghak
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         ryujonghak          최초 생성
 */
public class Member {
    String name;
    String id;


    public Member() {
    }

    public Member(String name) {
        this.name = name;
    }

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
    }
}
