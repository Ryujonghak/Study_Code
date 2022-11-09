package jungSuck.chap14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * packageName : jungSuck.chap14
 * fileName : Ex14_4
 * author : ryujonghak
 * date : 2022/10/11
 * description : 컬렉션(자료구조)과 함수형 인터페이스의 만남
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/11         ryujonghak          최초 생성
 */
public class Ex14_4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

//        list값 모두 출력
        list.forEach(i -> System.out.print(i + ", ")); // 람다식
        System.out.println();
        System.out.println("--------------------------");

//        list에서 2또는 3의 배수를 제거함.
        list.removeIf(i -> i % 2 == 0 || i % 3 == 0);
        System.out.println(list);
        System.out.println("--------------------------");

//        list값 바꾸기
        list.replaceAll(i -> i * 10);
        System.out.println(list);
        System.out.println("--------------------------");

        Map<String, String> map = new HashMap<String, String>();
        System.out.println("Map Keys = value");
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");

        map.forEach((key, value) -> System.out.println(key + " = " + value));
        System.out.println();


    }
}
