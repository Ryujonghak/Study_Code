package StudyGroup.chap03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * packageName : StudyGroup.chap03
 * fileName : Question03
 * author : hyuk
 * date : 2022/10/21
 * description : 연습문제 3 P.114
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/21         hyuk          최초 생성
 */
// 요소수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞부터 순서대로 저장하고,
//    일치하는 요소수를 반환하는 메서드 작성
//    ex) 요소수가 8인 배열 a의 요소가 (1,9,2,9,4,6,7,9)이고 key가 9일 때 배열
//    idx에 {1,3,7}을 저장하고 3을 반환


public class Question03 {
    static int searchIdx(int[] a, int n, int key, int[] idx){
        int i = 0;

        a[n] = key; // 보초 추가

        while (true){
            if (a[i] == key){
                break;
            }
            i++;
        }
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요소수 : ");
        int num = scanner.nextInt(); // 요소수 입력받기
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i]==ky){
                count++;
            }
        }

        int[] index = new int[count];
        int j = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i]==ky){
               index[j] = i;
               j++;
            }
        }

        int idx = searchIdx(x, num, ky, index);

        if (idx == -1){
            System.out.println("그 값의 요소가 없습니다");
        } else {
            System.out.print("크기는 " + Arrays.toString(index) + index.length + "입니다");
        }
    }
}
