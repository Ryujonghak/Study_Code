package chap01;

/**
 * packageName : chap01
 * fileName : exercise_Q11
 * author : 최아리
 * date : 2022-10-11
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-11         최아리          최초 생성
 */
public class exercise_Q11 {
//    오른쪽 결과와 같이 위쪽과 왼쪽에 곱하는 수가 있는 구구단 곱셈표를 출력하는 프로그램을 작성하세요.

    public static void main(String[] args) {

        System.out.print("   | ");

        for(int i=1; i<=9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("---+------------------");

        for(int i=1; i<=9; i++) {
            System.out.print(i + " |  ");
            for(int j=1; j<=9; j++) {
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
}
