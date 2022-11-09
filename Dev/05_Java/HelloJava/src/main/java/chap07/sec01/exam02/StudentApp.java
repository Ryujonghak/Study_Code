package chap07.sec01.exam02;

/**
 * packageName : chap07.sec01.exam02
 * fileName : StudentApp
 * author : ryujonghak
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         ryujonghak          최초 생성
 */
public class StudentApp {
    public static void main(String[] args) {
        Student student = new Student("홍길동","1234-1234",1);

        System.out.println(student.name);
        System.out.println(student.ssn);
        System.out.println(student.studentNo);

    }
}
