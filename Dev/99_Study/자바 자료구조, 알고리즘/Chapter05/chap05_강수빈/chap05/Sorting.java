package chap05;

/**
 * packageName : chap05
 * fileName : Sorting
 * author : gangsubin
 * date : 2022/11/05
 * description : sorting 대충 정리
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/11/05         gangsubin          최초 생성
 */
public class Sorting {
    /* 버블 정렬
    - 비교와 교환이 모두 일어날 수 있기 때문에 코드는 단순하지만 성능은 좋지 않다.


    * public static void sortByBubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(arr, j, j + 1);
            }
        }
    }
}
첫 번째 for문의 i는 두 번째 for문의 j가 0 ~ (n - 2) -> 0 ~ (n - 3) -> ... -> 0 과 같이 반복하도록 하기 위함.

j가 처음에 0 ~ (n-2) 까지 반복하는 이유 = j의 원소와 j + 1의 원소를 비교하기 때문에 n-2까지!
for문을 돌면서 뒤 원소가 더 작으면 swap()한다.
     */

    // swap() - > 말그대로 두개 배열 위치 바꿔줌

    public static void swap(int[] arr, int idx1, int idx2) {
        int tmp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = tmp;
    }

    //선택정렬

    public static void sortBySelectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            swap(arr, i, minIdx);
        }
    }
//    인덱스 0 ~ (n - 1)을 돌면서 원소의 값이 가장 작은 인덱스를 찾는다.
//    인덱스 0과 가장 작은 인덱스의 원소를 swap()한다.
//    다시 인덱스 1 ~ (n - 1)을 돌면서 원소의 값이 가장 작은 인덱스를 찾는다.
//    인덱스 1과 가장 작은 인덱스의 원소를 swap()한다.
//    반복...
}
