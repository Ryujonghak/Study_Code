package chap03.sec01.exam01;

import java.util.Scanner;

/**
 * packageName : chap03.sec01.exam01
 * fileName : SeqSearchSen
 * author : 유영미
 * date : 2022-10-23
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-23         유영미          최초 생성
 */
public class SeqSearchSen {
    // 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 보초법으로 선형 검색
    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key; // 배열 마지막에 보초값 추가

        while (true) {
            if (a[i] == key) // 종료 조건 2) 검색 성공
                break;
            i++;
        }
        return i == n ? -1 : i; // 보초값이면 -1 리턴, 아니면 요소의 인덱스 리턴
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num + 1]; // 요솟수가 num + 1 인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = scanner.nextInt();
        }

        System.out.print("검색할 값 : "); // 키값을 입력받음
        int ky = scanner.nextInt();

        int idx = seqSearchSen(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
        }
    }
}






















