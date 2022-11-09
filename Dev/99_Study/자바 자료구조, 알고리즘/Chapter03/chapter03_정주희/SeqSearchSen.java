package chapter03;

import java.util.Scanner;

/**
 * packageName : chapter03
 * fileName : SeqSearchSen
 * author : juhee
 * date : 2022-10-20
 * description : 실습 3-3 (p.104)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-20         juhee          최초 생성
 */
public class SeqSearchSen {

    // 선형 검색(보초법)
    // 요소수가 n인 배열 a에서 key와 값이 같은 요소를 보초법으로 선형 검색
    static int seqSearchSen(int[]a, int n, int key){
        int i = 0;

        a[n] = key;     // 맨 끝 요소 n. 보초 추가?

        while(true) {
            if(a[i] == key){    // 검색 성공
                break;
            }
            i++;
        }
        return i == n ? -1 : i;   // i==n이면 -1 출력
    }

    // 실행함수
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소의 개수: ");

        int num = stdIn.nextInt();
        int[]x = new int[num + 1];      // 요소의 개수가 입력받은 수 + 1 인 배열 x..??
                                        // 3 입력하면 index 0, 1, 2 이렇게 입력받던데...?

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값: ");  // key 값
        int ky = stdIn.nextInt();

        int idx = seqSearchSen(x, num, ky);     //배열 x에서 num = ky 인 요소 검색

        if(idx == -1){      // 배열 끝에 도착하는 경우
            System.out.println("그 값의 요소가 없습니다.");
        } else System.out.println("그 값은 x[" +idx + "]에 있습니다.");

    }


}
