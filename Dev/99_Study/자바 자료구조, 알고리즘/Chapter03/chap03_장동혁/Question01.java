package StudyGroup.chap03;

import java.util.Scanner;

/**
 * packageName : StudyGroup.chap03
 * fileName : Question01
 * author : hyuk
 * date : 2022/10/21
 * description : 3-3 p.104
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/21         hyuk          최초 생성
 */
public class Question01 {
    static int seqSearchSen(int[] a, int n, int key){
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
        int num = scanner.nextInt();
        int[] x = new int[num + 1];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = scanner.nextInt();

        int idx = seqSearchSen(x, num, ky);

        if (idx == -1){
            System.out.println("그 값의 요소가 없습니다");
        } else {
            System.out.print("그 값은 x[" + idx + "]에 있습니다.");
        }

    }
}
