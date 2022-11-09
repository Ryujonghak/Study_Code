package chap13.sec01.exam05;

import java.util.Objects;

/**
 * packageName : chap13.sec01.exam05
 * fileName : Member
 * author : ryujonghak
 * date : 2022/10/05
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         ryujonghak          최초 생성
 */
public class Member {
    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return age == member.age && Objects.equals(name, member.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
//    //    name과 age값이 같으면 같은 객체라고 .equals() 재정의
////    name 과 age 값이 같으면 동일한 hashcode() 값이 리턴
//    @Override
//    public int hashCode() {
//        return name.hashCode() + age;
//    }
//
//    //    .equals() 재정의
////    name 과 age 값이 같으면 true 리턴 , 아니면 false 리턴
//    @Override
//    public boolean equals(Object obj) {
//        if(obj instanceof Member) {
//            Member member = (Member) obj;
//            return this.name.equals(member.name) && (this.age == member.age);
//        } else {
//            return false;
//        }
}
