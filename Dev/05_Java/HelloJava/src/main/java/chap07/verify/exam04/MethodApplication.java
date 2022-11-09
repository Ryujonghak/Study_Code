package chap07.verify.exam04;

/**
 * packageName : chap07.verify.exam04
 * fileName : MethodApplication
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class MethodApplication {
    static void paint(Shape p) {
        p.draw();
    }

    public static void main(String[] args) {
        Line line = new Line();

        paint(line); // line.draw(); 실행
        paint(new Shape()); // Shape.draw(); 실행
        paint(new Rect()); // Rect.draw(); 실행
        paint(new Circle()); // Circle.draw(); 실행

    }
}
