package chapter03;

import java.util.Scanner;

/**
 * packageName : chapter03
 * fileName : Q5
 * author : juhee
 * date : 2022-10-20
 * description : 연습문제 5 (p.115)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-20         juhee          최초 생성
 */
// 이진 검색 알고리즘 프로그램은 검색할 값과 같은 값을 갖는 요소가 하나 이상일 경우, 그 요소 중에서 맨 앞의 요소를 찾지 못합니다.
// 예를 들어, 아래 그림의 배열에서 7을 검색하면 중앙에 위치하는 a[5]를 검색합니다.
// 맨 앞의 요소를 찾는 binSearchX 메서드를 작성하세요.
public class Q5 {
    static int binSearch(int[] a, int n, int key) {
        // 배열 a, 요소 수 n 개, key 와 일치하는 것 찾기
        int pl  = 0;    // 맨 앞 인덱스
        int pr = n  -1; // 맨 끝

        do
        {
            int pc = (pl + pr) / 2;     // 중앙값

            if (a[pc] == key) {
                int idx = pc;
                while (a[idx] == key) {
                    idx--;
                }
                return idx + 1;
            }
            else if (a[pc] < key)       // 앞쪽 검색
                pl = pc + 1;
            else
                pr = pc - 1;
        }

        while (pl <=  pr);          // 맨 앞 인덱스가 맨끝에 도달할 때까지 계속 do 반복(검색)

        return -1;                  // 인덱스 끝
    }

    // main
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);     // 스캐너로 입력받기

        System.out.print("요소의 개수: ");
        int num = stdIn.nextInt();      // 입력받은 값 num에 저장
        int[] x = new int[num];         // 요소 num 개를 가지는 배열 x

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]: ");
        x[0] = stdIn.nextInt();         // x[0]값 입력받기

        for (int i = 1; i < num; i++) {
            do {
                System.out.print       ("x[" + i + "]: ");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]);
        }

        System.out.print("검색할 값: ");
        int ky = stdIn.nextInt();       // 배열 중 ky값 검색

        int idx = binSearch(x, num, ky);    // x 배열, 요소의 갯수 num개, 찾을 값 ky

        if (idx == - 1)                 // 배열 끝에 다다르면
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
    }
}
