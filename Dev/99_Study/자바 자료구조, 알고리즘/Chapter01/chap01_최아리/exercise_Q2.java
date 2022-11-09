package chap01;

/**
 * packageName : chap01
 * fileName : exercise_Q2
 * author : 최아리
 * date : 2022-10-11
 * description : 연습문제 Q2 (p.19)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-11         최아리          최초 생성
 */
public class exercise_Q2 {
//    네 값의 최댓값을 구하는 max4 메서드를 작성하세요.

    public static void main(String[] args) {
        System.out.println("최솟값은 " + min3(2, 5, 7) + "입니다.");
    }
    static int min3(int a, int b, int c) {
        int min = a;
        if(b < min) {
            b = min;
        }
        if(c < min) {
            c = min;
        }
        return min;
    }
}
