package chap03;

import java.util.Scanner;

// TODO: 입력하는 부분이 잘못됨.

/**
 * packageName : chap03
 * fileName : BinSearch
 * author : gangsubin
 * date : 2022/10/24
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * —————————————————————————————
 * 2022/10/24 gangsubin 최초 생성
 */
public class BinSearch {
    // 요솟수가 n개인 배열 a에서 key와 같은 요소를 이진 검색함

    static int binSearch(int[] a, int n, int key) {
        int pl = 0; // 검색범위 제일 앞 인덱스
        int pr = n - 1; // 검색범위 제일 뒤 인덱스

        do {
            int pc = (pl + pr) / 2; // 중앙요소 인덱스
            if (a[pc] == key)
                return pc; // 검색에 성공함
            else if (a[pc] < key) // 키값보다 작으면 검색범위를 뒤쪽 절반으로 좁힘
                pl = pc + 1;
            else
                pr = pc - 1; // 검색범위 앞쪽 절반으로 좁힘
        } while (pl <= pr);

        return -1; // 검색결과가 없을때 -1 리턴
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num]; // 요솟수가 num 인 배열

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]:"); // 첫 요소 입력
        x[0] = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            do {
                System.out.print("x[" + i + "]:");
                x[i] = scanner.nextInt();
            } while (x[i] < x[i - 1]); // 바로 앞의 요소보다 작으면 다시 입력받음

        }
        System.out.print("검색할 값:");
        int ky = scanner.nextInt();

        int idx = binSearch(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색함

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println("그 값은 x[" + idx + "] 에 있습니다.");
    }
}
