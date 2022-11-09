package chapter01.sec02.verify;

/**
 * packageName : chapter01.sec02.verify
 * fileName : Q11
 * author : juhee
 * date : 2022-10-07
 * description : 구구단 곱셈표를 출력하는 프로그램을 작성하세요
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-07         juhee          최초 생성
 */
public class Q11 {
    // 메인 함수
    public static void main(String[] args) {
        System.out.println("  |  1  2  3  4  5  6  7  8  9 ");
        System.out.println("--+---------------------------");

        for (int i = 1; i <= 9; i++) {              // 앞의 단수. 1단, 2단, 3단...
            System.out.printf("%d |", i);   // 이것만 돌리면 안맞는데 왜 밑에 for랑 같이돌리면 맞는거지?

            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i * j);    // 1*1, 1*2, 1*3, ...
            }                                       // 9까지 돌리면 2*1, 2*2...
            System.out.println();
        }
    }
}
