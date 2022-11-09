package jungSuck.chap14;

import java.util.*;
import java.util.stream.Stream;

/**
 * packageName : jungSuck.chap14
 * fileName : StreamApplication
 * author : ryujonghak
 * date : 2022/10/11
 * description : Stream의 유용한 함수들
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/11         ryujonghak          최초 생성
 */
public class StreamApplication {
    public static void main(String[] args) {
        String[] strArr = {"Kang", "Hwang", "Hong"};

//        배열 -> List 변환: Arrays.asList()
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        List<String> stringList = Arrays.asList(strArr);

//        Arrays.sort(); // 배열정렬
//        Collections.sort(stringList); // 자료구조 정렬

        for (String str : stringList) {
            System.out.println(str);
        }

        System.out.println("--------------------------------------------------------");

        System.out.println("Stream Foreach");
//        Stream: 추상화된 가상된 구조 -> 유용한 함수 다수 포진(함수형 프로그래밍 함수 차용)
//        Stream 대상 -> 자료구조(List, Set, Map)
//        stringList.stream()
//                .sorted()
//                .forEach(s -> System.out.println(s));

//        fillter : 원본 배열에서 조건에 해당하는 배열만 재생성
//        integerList.stream()
//                .filter(x -> x < 3) // 정수 배열: 3보다 작은 정수를 갖는 배열로 재생성
//                .forEach(x -> System.out.println(x));

//        중복값 제거한 자료구조 생성
//        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 1, 2, 3, 4, 5).
//                stream()
//                .distinct() // 중복제거
////                .forEach(x -> System.out.print(x + " "));
//                .forEach(System.out::println);

        System.out.println("--------------------------------------------------------");

        System.out.println("Map");
        integerList.stream()
                .map(x -> x * x)
                .forEach(System.out::println);

        System.out.println("--------------------------------------------------------");
//        Limit(제한 값)
        System.out.println("Limit");
        integerList.stream()
                .limit(1) // 자료구조 내에 최대값 제한.
                .forEach(System.out::println);

        System.out.println("--------------------------------------------------------");
//        Skip
        System.out.println("Skip");
        integerList.stream()
                .skip(2) // 앞의 n개으 원소 무시
                .forEach(System.out::println);

        System.out.println("--------------------------------------------------------");
//        오름/내림차순 정렬
        System.out.println("sort");
        Arrays.asList(1,5,4,3,2).stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nComparator.reverseOrder()");
        Arrays.asList(1,5,4,3,2).stream()
                .sorted(Comparator.reverseOrder()) // 내림차순
                .forEach(System.out::println);
    }
}
