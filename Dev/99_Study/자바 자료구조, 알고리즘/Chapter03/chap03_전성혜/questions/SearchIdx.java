package chap03.sec01.exam01.questions;

import java.util.Scanner;

/**
 * packageName : chap03.sec01.exam01
 * fileName : SearchIdx
 * author : 유영미
 * date : 2022-10-23
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-23         유영미          최초 생성
 */
public class SearchIdx {
    static int SearchIdx(int[] a, int n, int key, int[] idx) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                idx[count++] = i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num]; // 요솟수가 num 인 배열
        int[] y = new int[num]; // 요솟수가 num 인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        System.out.print("검색할 값 : "); // 키값을 입력받음
        int ky = scanner.nextInt();

        int count = SearchIdx(x, num, ky, y); // 배열 x에서 값이 ky인 요소를 y에 저장

        if (count == 0) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
                System.out.println(count);
        }
    }
}
