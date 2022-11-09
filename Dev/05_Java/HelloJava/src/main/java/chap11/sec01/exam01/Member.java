package chap11.sec01.exam01;

/**
 * packageName : chap11.sec01.exam01
 * fileName : Member
 * author : ryujonghak
 * date : 2022/10/04
 * description : 객체 동등 비교(.equals())
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class Member {
    public String id;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
//            강제형변환
            Member member = (Member) obj;
            if(this.id.equals(member.id)) {
                return true;
            }
        }
        return false;
    }

    public Member(String id) {
        this.id = id;
    }
}
