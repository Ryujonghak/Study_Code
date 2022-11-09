package chap03;

import java.util.Scanner;

/**
 * packageName : chap03
 * fileName : exercise_Q5
 * author : 최아리
 * date : 2022-10-22
 * description : 연습문제 Q5 (p.115)
 * ===========================================================
 * DATE AUTHOR NOTE
 * —————————————————————————————
 * 2022-10-22 최아리 최초 생성
 */
public class Exercise_Q5 {
    // 우리가 살펴본 이진 검색 알고리즘 프로그램은 검색할 키값과 같은 값을 갖는 요소가 하나 이상일 경우
    // 그 요소 중에서 맨 앞의 요소를 찾지 못합니다. 예를 들어 다음 그림의 배열에서 7을 검색하면 중앙에 위치하는
    // a[5]를 검색합니다. 이를 개선하여 키값과 일치하는 맨 앞의 요소를 찾는 binSearchX 메서드를 작성하세요.

    // 1) 첫번째 개선 방법 - for 문 이용
    static int binSearchX(int[] a, int n, int key) {
        int pl = 0; // 검색 범위의 첫 인덱스
        int pr = n - 1; // 검색 범위의 끝 인덱스

        do {
            int pc = (pl + pr) / 2; // 중앙 요소의 인덱스

            arrays.sort(a); // 정렬 함수
            if (a[pc] == key) {
                for (int i = pl; i < pc; i++) { // **개선된 함수 => key 값이 나오면 그 앞에 또 다른 Key 값이 있는지 확인
                    if (a[i] == key) { // 있으면 제일 먼저 나오는 key값의 인덱스를 리턴
                        return i;
                    }
                }
                return pc;
            } else if (a[pc] < key) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        } while (pl <= pr);

        return -1; // 검색 실패
    }

    // 2) 두번째 개선 방법 - while 문 이용
    // static int binSearchX(int[] a, int n, int key) {
    // int pl = 0; // 검색 범위의 첫 인덱스
    // int pr = n-1; // 검색 범위의 끝 인덱스
    //
    // do{
    // int pc = (pl+pr) /2; // 중앙 요소의 인덱스
    //
    // if(a[pc] == key) { // 키 값이 확인 되면
    // while (a[pc] == key) { // while 문에 넣어서 인덱스(pc)를 줄여가면서 어디까지 key 값이 있는지 확인
    // pc--;
    // }
    // return pc;
    // } else if (a[pc] < key) {
    // pl = pc +1;
    // } else {
    // pr = pc -1;
    // }
    // } while (pl <= pr);
    //
    // return -1; // 검색 실패
    // }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[] x = new int[num]; // 요솟수가 num인 배열 x

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0] : "); // 첫 요소 입력받음
        x[0] = scanner.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = scanner.nextInt();
            } while (x[i] < x[i - 1]); // 바로 앞의 요소보다 작으면 다시 입력받음, 정렬이 이진검색의 선행조건!
        }

        System.out.print("검색할 값 : "); // 키값을 입력받음
        int ky = scanner.nextInt();

        int idx = binSearchX(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
        }
    }
}
