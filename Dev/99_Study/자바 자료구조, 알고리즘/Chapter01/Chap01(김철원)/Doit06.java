package chap99.Doit.chap01;

/**
 * packageName : chap99.Doit.chap01
 * fileName : Doit06
 * author : 김철원
 * date : 2022-10-10
 * description :연습문제 Questions 11
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-10         김철원          최초 생성
 */
// Q11. 오른쪽 결과와 같이 위쪽과 왼쪽에 곱하는 수기 있는
//      구구단 곱셈표를 출력하는 프로그램을 작성하세요.
//      (구분선은 수직선(|),마이너스(-), 플러스(+) 기호를 사용하세요
public class Doit06 {
    public static void main(String[] args) {
        System.out.println("   |" + "  1" + "  2" + "  3" + "  4" + "  5" + "  6" + "  7" + "  8" + "  9");
        System.out.println("---+---------------------------");
        for (int i = 1; i<=9;i++){
            System.out.printf("%2d", i);
            System.out.print(" |");
            for (int j =1; j<=9;j++)
                System.out.printf("%3d", i*j);
            System.out.println();
        }
    }
}
