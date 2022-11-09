package chap07.sec02.exam05;

/**
 * packageName : chap07.sec02.exam05
 * fileName : ChildApplication
 * author : ryujonghak
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         ryujonghak          최초 생성
 */
public class ChildApplication {
    public static void main(String[] args) {
//        다형성 자동타입변환
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        System.out.println(parent.field1);
//        다형성 사용시 하위(자식)클래스의 함수 및 속성을 사용할 수 없다.

//        하위객체를 상위객체로 강제 형변환
        Child child = (Child) parent;
        child.field2 = "data2";
        child.method3();
        System.out.println(child.field2);
    }
}
