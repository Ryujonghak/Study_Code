package chap07.sec02.exam06;

/**
 * packageName : chap07.sec02.exam06
 * fileName : ChildApplication
 * author : ryujonghak
 * date : 2022/09/29
 * description : 실행 클래스, instanceof 연산자
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         ryujonghak          최초 생성
 */
public class ChildApplication {
    public static void method1(Parent parent) {
        if(parent instanceof Child) { // 다형성을 사용한 객체인지 아닌지 판단하는 명령어(연산자), 자식개체가 있으면 True 없으면 false.
           Child child = (Child) parent;// 자식객체로 원복
            System.out.println("강제 형변환 성공");
        } else {
            System.out.println("강제 형변환 실패");
        }
    }

    public static void main(String[] args) {
        Parent parent = new Child();

        method1(parent); // child 객체가 들어간 부모 객체를 매개변수로 전달함.


    }
}
