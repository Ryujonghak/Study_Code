package chap03;

import java.util.Scanner;

/**
 * packageName : chap03
 * fileName : SeqSearchSen
 * author : gangsubin
 * date : 2022/10/24
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/24         gangsubin          최초 생성
 */
public class SeqSearchSen {

    // 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 보초법으로 선형 검색함
    static int seqSearchSen(int[]a,int n, int key){
        int i =0;

        a[n] = key;

        while(true){
            if(a[i] == key) // 검색이 성공했을시 (인덱스를 반환함 )
                break;
            i++;
        }
        return i == n ? -1 : i; // ? 문법 : -1 검색실패시 i 검색성공시
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //입력받음

        System.out.println("요솟수: ");
        int num = scanner.nextInt();
        int[]x = new int[num+1]; //요솟수가 num +1 인 배열 -> 보초의 자리를 추가하기 위함

        for (int i = 0; i < num; i++) {
            System.out.println("x[" + i + "]: ");

            x[i] = scanner.nextInt();
        }

        System.out.print("검색할 값:"); //키값을 입력받음
        int ky = scanner.nextInt();

        int idx = seqSearchSen(x , num ,ky); // 배열 x에서 값이 ky인 요소를 검색함

        if(idx == -1) //요소값이 없을떄 -1
            System.out.println("그 값의 요소가 없습니다");
        else
            System.out.println("그 값은 x[" + idx + "]에 있습니다." );
    }
}
