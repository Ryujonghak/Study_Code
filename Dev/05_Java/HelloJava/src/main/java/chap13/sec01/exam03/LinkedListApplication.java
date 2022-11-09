package chap13.sec01.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * packageName : chap13.sec01.exam03
 * fileName : LinkedListApplication
 * author : ryujonghak
 * date : 2022/10/05
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         ryujonghak          최초 생성
 */
// LinkedList: ArrayList의 단점 개선, 중간에 데이터가 추가/삭제시 성능저하를 개선
public class LinkedListApplication {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        List<String> list2 = new ArrayList<>();

        long startTime;
        long endTime;
//        1) 처음 시간
        startTime = System.nanoTime();

//        2) ArrayList 실행
        for (int i = 0; i < 10000; i++) {
            list.add(0, String.valueOf(i));
        }
//        3) 끝 시간
        endTime = System.nanoTime();
        System.out.println("LinkedList 소요시간: " + (endTime - startTime) + "ns");


//        1) 처음 시간
        startTime = System.nanoTime();

//        2) ArrayList 실행
        for (int i = 0; i < 10000; i++) {
            list2.add(0, String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 소요시간: " + (endTime - startTime) + "ns");
    }
}
