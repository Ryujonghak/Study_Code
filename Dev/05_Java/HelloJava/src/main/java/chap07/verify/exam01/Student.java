package chap07.verify.exam01;

/**
 * packageName : chap07.verify.exam01
 * fileName : Student
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class Student extends Person{
    void set(int age, String name, int height, int weight) {
        this.age = age;
        this.name = name;
        this.height = height;
        setWeight(weight);
    }
}
