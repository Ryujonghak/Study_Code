package chap07.sec01.exam02;

/**
 * packageName : chap07.sec01.exam02
 * fileName : Student
 * author : ryujonghak
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         ryujonghak          최초 생성
 */
public class Student extends People{
    public int studentNo;

//    생성자 호출시 상위 생성자를 호출하고 하위 생성자를 호출해야하기 때문에 super 함수를 통해 상위 생성자를 호출하고 하위 생성자를 추가한다.
    public Student(String name, String ssn, int studentNo) {
        super(name, ssn); // super(매개변수...): 상위의 생성자를 호출하는 함수
        this.studentNo = studentNo;
    }
}
