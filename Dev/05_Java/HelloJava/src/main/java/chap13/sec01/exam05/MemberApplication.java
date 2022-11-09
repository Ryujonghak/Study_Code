package chap13.sec01.exam05;

import java.util.HashSet;
import java.util.Set;

/**
 * packageName : chap13.sec01.exam05
 * fileName : MemberApplication
 * author : ryujonghak
 * date : 2022/10/05
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         ryujonghak          최초 생성
 */
public class MemberApplication {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("홍길동", 30));
        set.add(new Member("홍길동", 30));

        for (Member member : set) {
            System.out.println(member.name + ", " + member.age);
        }
        System.out.println("총 객체수: " + set.size());
    }
}
