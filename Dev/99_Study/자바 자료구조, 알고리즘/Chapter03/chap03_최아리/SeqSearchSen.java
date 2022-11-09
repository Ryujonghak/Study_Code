package chap03;

import java.util.Scanner;

/**
 * packageName : chap03
 * fileName : SeqSearchSen
 * author : 최아리
 * date : 2022-10-22
 * description : 실습 3-3 (p.104)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-22         최아리          최초 생성
 */
public class SeqSearchSen {
//    요솟수가 n인 배열a 에서 key와 값이 같은 요소를 보초법으로 선형 검색

    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key; // 보초를 추가

        while(true) {
            if(a[i] == key) { // 검색 성공 => i가 n에 도달하면 break
                break;
            }
            i++;
        }

        return i == n? -1 : i; // i가 n이면? -1, 아니면? i
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = scanner.nextInt();
        int[]x = new int[num+1]; // 요솟수가 num+1인 배열

        for(int i=0; i<num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt(); // x[0~6] 다 입력되고 x[7]은 비워둠(보초값) 
        }

        System.out.print("검색할 값 : ");
        int ky = scanner.nextInt();

        int idx = seqSearchSen(x, num, ky);

        if(idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
        }
    }
}





















