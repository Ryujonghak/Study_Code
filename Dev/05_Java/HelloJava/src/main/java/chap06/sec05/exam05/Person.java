package chap06.sec05.exam05;

/**
 * packageName : chap06.sec06
 * fileName : Person
 * author : ryujonghak
 * date : 2022/09/28
 * description : final 예재
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         ryujonghak          최초 생성
 */
public class Person {
//    final 변수: 자바에서 상수를 정의하는 방법
    final String nation = "korea"; // 대입연산자를 이용하여 값을 바로 넣는 방법.
    final String ssn; // 생성자를 통해서 값을 넣는 방법.

    String name;

    public Person(String ssn, String name) {
        this.ssn = ssn;
        this.name = name;
    }
}
