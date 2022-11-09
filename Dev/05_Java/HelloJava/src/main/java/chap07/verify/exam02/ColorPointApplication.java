package chap07.verify.exam02;

/**
 * packageName : chap07.verify.exam02
 * fileName : ColorPointApplication
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class ColorPointApplication {
    public static void main(String[] args) {
        ColorPoint colorPoint = new ColorPoint();
        colorPoint.set(3,4); // 부모 클래스의 함수 호출
        colorPoint.setColor("red"); // 자식 클래스의 함수 호출 red
        colorPoint.showColorPoint(); // 자식클래스의 함수 호출 (3,4)
    }

}
