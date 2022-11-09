package chap06.sec05.exam05;

/**
 * packageName : chap06.sec06
 * fileName : PersonApplication
 * author : ryujonghak
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         ryujonghak          최초 생성
 */
public class PersonApplication {
    public static void main(String[] args) {
        Person person = new Person("1234567-1234567","홍길동");

        System.out.println(person.nation);
        System.out.println(person.ssn);
        System.out.println(person.name);

//        person.nation = null; //상수는 값을 변경할 수 없음.
    }
}
