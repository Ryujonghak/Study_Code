package chapter03;

import java.util.Scanner;

/**
 * packageName : chapter03
 * fileName : Q3
 * author : juhee
 * date : 2022-10-20
 * description : 연습문제 3 (p.114)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-20         juhee          최초 생성
 */
// 요솟수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞부터 순서대로 저장하고,
// 일치한 요솟수를 반환하는 메서드를 작성하세요.
// 예를 들어, 요솟수가 8인 배열 a의 요소가 {1, 9, 2, 9, 4, 6, 7, 9}이고 key가 9면 배열 idx에 {1, 3, 7}을 저장하고, 3을 반환
public class Q3 {

    static int searchIdx(int[] a, int n, int key, int[] idx) {

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == key)            // 배열에서 key와 일치하는 값 찾으면
                idx[count++] = i;       // 카운트 증가 (인덱스 넘버)
        }
        return count;
    }

    // 메인함수
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소의 개수: ");
        int num =  stdIn.nextInt();     // 입력받은 요소의 갯수 num에 저장
        int[] x = new int[num];         // 요소의 갯수를 num 개로 하는 배열 x

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값: ");
        int ky = stdIn.nextInt();       // 입력받은 검색할 값 ky에 저장
        int[] idx = new int[num];       // 요소의 갯수를 num개로 하는 새로운 배열 idx
        int count = searchIdx(x, num, ky, idx);     // 배열 x, 요수의 갯수 num, 검색할 값 xy, 검색한 값의 인덱스값 저장할 배열 idx

        if (count == 0)                 // searchIdx함수, 배열에서 일치하는 값을 못찾는 경우 count값이 증가하지 않음
            System.out.println("그 값의 요소가 없습니다.");
        else
            for (int i : idx)
                System.out.print(i + " ");
    }
}
