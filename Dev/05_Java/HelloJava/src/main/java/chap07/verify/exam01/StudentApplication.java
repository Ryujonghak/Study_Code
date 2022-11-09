package chap07.verify.exam01;

/**
 * packageName : chap07.verify.exam01
 * fileName : StudentApplication
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class StudentApplication {
    public static void main(String[] args) {
        Student student = new Student();
        student.set(30,"홍길동",175,99);

        System.out.println(student.age);
        System.out.println(student.name);
        System.out.println(student.height);
        System.out.println(student.getWeight());
    }
}
