package chap01;

/**
 * packageName : chap01
 * fileName : exercise_Q3
 * author : 최아리
 * date : 2022-10-11
 * description : 연습문제 Q4 (p.19)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-11         최아리          최초 생성
 */
public class exercise_Q3 {
//    네 값이 최솟값을 구하는 min4메서드를 작성하세요.

    public static void main(String[] args) {
        System.out.println("최솟값은 " + min4(2, 5, 7, 3) + "입니다.");
    }

     static int min4(int a, int b, int c, int d) {
        int min = a;

        if(b < min) {
            min = b;
        }
        if(c < min) {
            min = c;
        }
        if(d < min) {
            min = d;
        }

        return min;
     }
}
