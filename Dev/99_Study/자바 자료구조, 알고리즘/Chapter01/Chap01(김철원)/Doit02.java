package chap99.Doit.chap01;

/**
 * packageName : chap99.Doit
 * fileName : Doit02
 * author : 김철원
 * date : 2022-10-06
 * description : 연습문제 Questions 1, 2, 3
 *
 *
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-06         김철원          최초 생성
 */
// Q1. 네 값의 최대값을 구하는 max4 메서드를 작성하세요.
//     작성한 메서드를 테스트하기 위해 main메서드를 포함한 프로그램을 작성해야 합니다.
//     이후의 문제도 마찬가지 입니다.
// Q2. 세 값의 최솟값을 구하는 min3 메서드를 작성하세요.
// Q3. 네 값의 최솟값을 구하는 min4 메서드를 작성하세요.
public class Doit02 {
    public static int max4 (int a, int b, int c, int d) {
        int max = a; // max에 초기값을 정해준다. 왜? 비교를 하기 위해서
        if (b > max) max = b; // 조건문이 true 일때 max값을 b값으로 바꿔준다.
        if (c > max) max = c;
        if (d > max) max = d;
        return max;
    }
    public static int min3 (int a, int b, int c) {
        int min = a; // min에 초기값을 정해준다. 왜? 비교하기 위해서
        if (b < min) min = b; // 조건문이 true 일때 min값을 b값으로 바꿔준다
        if (c < min) min = c;
        return min;
    }
    public static int min4 (int a, int b, int c, int d) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;
        return min;
    }

    public static void main(String[] args) {
        Doit02 doit02 = new Doit02();
        System.out.println(doit02.max4(1,2,3,4));
        System.out.println(doit02.min3(1,2,3));
        System.out.println(doit02.min4(1,2,3,4));
    }
}
