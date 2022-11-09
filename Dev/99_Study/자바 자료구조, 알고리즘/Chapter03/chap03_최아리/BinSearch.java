package chap03;

import java.util.Scanner;

/**
 * packageName : chap03
 * fileName : BinSearch
 * author : 최아리
 * date : 2022-10-22
 * description : 실습3-4 (p.109)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-22         최아리          최초 생성
 */
public class BinSearch {
//    요솟수가 n개인 배열 a애서 key와 같은 요소를 이진 검색
    static int binSearch(int[]a, int n, int key) {
        int pl = 0; // 검색 범위의 첫 인덱스
        int pr = n-1; // 검색 범위의 끝 인덱스

        do{
            int pc = (pl+pr) /2; // 중앙 요소의 인덱스

            if(a[pc] == key) {
                return pc;
            } else if (a[pc] < key) {
                pl = pc +1;
            } else {
                pr = pc -1;
            }
        } while (pl <= pr);

        return -1; // 검색 실패
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num]; // 요솟수가 num인 배열 x

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0] : "); // 첫 요소 입력받음
        x[0] = scanner.nextInt();

        for (int i=1; i<num; i++) {
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = scanner.nextInt();
            } while (x[i] < x[i-1]); // 바로 앞의 요소보다 작으면 다시 입력받음, 정렬이 이진검색의 선행조건!
        }

        System.out.print("검색할 값 : "); // 키값을 입력받음
        int ky = scanner.nextInt();

        int idx = binSearch(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색

        if(idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
        }
    }
}


