package chap13.sec01.exam04;

import java.util.HashSet;
import java.util.Set;

/**
 * packageName : chap13.sec01.exam04
 * fileName : HashSetApplication
 * author : ryujonghak
 * date : 2022/10/05
 * description : Set 인터페이스 구현클래스들
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         ryujonghak          최초 생성
 */
// Set: 집합을 표현한 인터페이스, 구현한 클래스 HashSet, LinkedHashSet, TreeSet 등
// 특징: 순서가 없다. 중복이 허용되지 않음(강제로 중복데이터를 삽입할 경우 덮어쓰기로 실행됨).
public class HashSetApplication {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

//        .add(): 삽입
        set.add("JAVA");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("myBATIS");

//        System.out.println(set);
        for (String s : set) {
            System.out.println("Set: " + s);
        }

        System.out.println("--------------------------------");

//        .size(): 크기
        int size = set.size();
        System.out.println("size: " + size);

        System.out.println("--------------------------------");

//        .remove(): 삭제
        set.remove("myBATIS");
//        for (String s : set) {
//            System.out.println("Set: " + s);
//        }

//        .clear(): 전체 삭제
        set.clear();
        System.out.println("set.clear");
        if (set.isEmpty() == true) {
            System.out.println("set empty");
        } else {
            System.out.println("set not empty");
        }
    }
}
