package jungSuck.chap11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * packageName : jungSuck.chap11
 * fileName : Ex11_6
 * author : ryujonghak
 * date : 2022/10/07
 * description : Arrays 의 유용한 함수들
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         ryujonghak          최초 생성
 */
public class Ex11_6 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {{11, 12, 13}, {21, 22, 23}};

//        배열의 값 출력
//        Arrays: 자바에서 배열을 대표하는 클래스
//        Arrays.toString(Array): Array의 값이 보임.
//        Arrays.DeepToString(다차원 Array): 다차원 Array의 값이 보임.
        System.out.println("arr=" + Arrays.toString(arr));
        System.out.println("arr2D=" + Arrays.deepToString(arr2D));

//        Arrays.copyOf(Array, Length): Array를 길이 만큼 복사해줌.
//        Arrays.copyOfRange(Array, StartFrom, Length): Array를 시작점에서 길이만큼 복사해줌.
        System.out.println("--- 배열 Copy ------------------------------------");
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, 3);
        int[] arr4 = Arrays.copyOf(arr, 7);
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7);

//        Arrays.toString(Array): Array 값이 보임.
        System.out.println("arr2=" + Arrays.toString(arr2));
        System.out.println("arr3=" + Arrays.toString(arr3));
        System.out.println("arr4=" + Arrays.toString(arr4));
        System.out.println("arr5=" + Arrays.toString(arr5));
        System.out.println("arr6=" + Arrays.toString(arr6));

//        Arrays.fill(Array, Value): 불러온 Array에 Value로 채움.
        int[] arr7 = new int[5];
        Arrays.fill(arr7, 9);  // arr=[9,9,9,9,9]
        System.out.println("arr7=" + Arrays.toString(arr7));

        Arrays.setAll(arr7, i -> (int) (Math.random() * 6) + 1);
        System.out.println("arr7=" + Arrays.toString(arr7));

        for (int i : arr7) {
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph) + i);
        }

        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};

//        Arrays.equals(Array1, Array2): Array1과 Array2의 값을 비교해서 boolean을 보여줌.
//        Arrays.deepEquals(Array1, Array2): 다차원 Array1과 Array2의 값을 비교해서 boolean을 보여줌.
        System.out.println(Arrays.equals(str2D, str2D2));     // false
        System.out.println(Arrays.deepEquals(str2D, str2D2)); // true

        char[] chArr = {'A', 'D', 'C', 'B', 'E'};

        System.out.println("chArr=" + Arrays.toString(chArr));
//        Arrays.binarySearch(Array, key): key값이 있는 Array의 인덱스 값을 보여줌.
        System.out.println("index of B =" + Arrays.binarySearch(chArr, 'B'));
        System.out.println("= After sorting =");
//        Arrays.sort(Array): Array의 데이터를 정렬하여 줌.
        Arrays.sort(chArr);
        System.out.println("chArr=" + Arrays.toString(chArr));
        System.out.println("index of B =" + Arrays.binarySearch(chArr, 'B'));

//        Array -> list 변환
        System.out.println("--- Array -> list 변환 --------------------------------");
        List list = new ArrayList(Arrays.asList(1,2,3,4,5)); // 배열을 리스트로 변환
        list.add(6);
        System.out.println(list.toString()); // List 값 보기

    }
}