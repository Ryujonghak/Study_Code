package chap03;

import java.util.Scanner;

/**
 * packageName : chap03
 * fileName : exercise_Q3
 * author : 최아리
 * date : 2022-10-22
 * description : 연습문제 Q3 (p.114)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-22         최아리          최초 생성
 */
public class Exercise_Q3 {
//    요솟수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를 배열 idx의 맨 앞부터 순서대로 저장하고,
//    일치하는 요솟수를 반환하는 메서드를 작성하세요. 예를 들어 요솟수가 8인 배열 a의 요소가 {1, 9, 2, 9, 4, 6, 7, 9}
//    이고 key가 9일 때 배열 idx에 {1, 3, 7}을 저장하고 3을 반환합니다.

    static int searchIdx(int[] a, int n, int key, int[] idx) {

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == key)
                idx[count++] = i;
        }
        return count; // 리턴은 idx의 요솟수 값을 반환한다.

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num =  scanner.nextInt();
        int[] x = new int[num]; // 입력 받은 요솟수 값을 길이로 하는 배열 x를 만든다.

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = scanner.nextInt(); // 배열 x의 값들을 받는다.
        }

        System.out.print("검색할 값: ");
        int ky = scanner.nextInt();
        int[] idx = new int[num]; // num을 요솟수로 하는 배열 idx 생성
        int count = searchIdx(x, num, ky, idx); // 리턴 값으로 배열 idx의 요솟수가 나옴

        if (count == 0) {
            System.out.println("그 값의 요소가 없습니다.");
        }
        else {
            for (int i : idx) { // idx 배열 길이만큼 반복
                System.out.print(i + " ");
            }

//            참고로 위의 확장 for문을 풀어쓰면 아래의 식과 같으니 헷갈리지 말기!
//            확장 for문에서의 i는 인덱스를 나타내는 것이 아니고 각 요소 값을 의미함
//            여기서 콜론(:) 의미 => ~의 안에 있는
//            for(int i=0; i<idx.length; i++) {
//                System.out.print(idx[i] + " ");
//            }
        }
    }
}
