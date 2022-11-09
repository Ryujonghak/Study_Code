package chap07.verify.exam02;

/**
 * packageName : chap07.verify.exam02
 * fileName : Point
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class Point {
    int num1;
    int num2;

    void set(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    void showPoint() {
        System.out.println("("+num1+","+num2+")");
    }


}
