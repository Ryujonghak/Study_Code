package jungSuck.chap11;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.*; // 자료구조 공유함수

/**
 * packageName : jungSuck.chap11
 * fileName : Ex11_19
 * author : ryujonghak
 * date : 2022/10/07
 * description : Collection(List, Map, Set) 에 유용한 함수들
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         ryujonghak          최초 생성
 */
public class Ex11_19 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list.toString());

//        Collections(자료구조) 공유 함수들
        System.out.println("--- 데이터 넣기 --------------------------------");
        addAll(list, 1, 2, 3, 4, 5);
//        자료구조 객체는 객체를 바로 출력해줌.
        System.out.println(list.toString());

        System.out.println("--- 오른쪽으로 2칸식 이동 --------------------------------");
//        사용법: rotate(객체, 이동할 수)
        rotate(list, 2);
        System.out.println(list.toString());

        System.out.println("--- 첫번째와 3번째 요소 교환(swap)--------------------------------");
        swap(list, 1, 3);
        System.out.println(list.toString());

        System.out.println("--- 저장된 요소의 위치를 임의로 변경: 섞기(shuffle)--------------------------------");
        shuffle(list);
        System.out.println(list.toString());

        System.out.println("--- 정렬/ 역순정렬(sort, reverse)--------------------------------");
        sort(list); // 정렬(오름차순)
        reverse(list); // 역순정렬(내림차순)
        System.out.println(list.toString());

        System.out.println("--- 이진검색(binarySearch)--------------------------------");
        int idx = binarySearch(list, 3);
        System.out.println("인덱스 위치: " + idx);

        System.out.println("--- Max/ Min --------------------------------");
        System.out.println("Max/Min: " + max(list) + "/" + min(list));

        System.out.println("--- fill --------------------------------");
        fill(list, 9); // obj 값으로 다 채워줌.
        System.out.println("List: " + list);

        System.out.println("--- copy --------------------------------");
        List newList = new ArrayList();
        addAll(newList, list);
        System.out.println("newList: " + newList);

        System.out.println("--- replaceAll(바꾸기) --------------------------------");
        replaceAll(list, 9,1);
        System.out.println(list);
    }
}
