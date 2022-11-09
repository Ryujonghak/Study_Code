package chap13.sec01.exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * packageName : chap13.sec01.exam06
 * fileName : HashMapApplication
 * author : ryujonghak
 * date : 2022/10/05
 * description : Map
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         ryujonghak          최초 생성
 */
public class HashMapApplication {
    // Map: 인터페이스, 키와 값으로 구성된 자료구조(Entry(키 중복 X, 값 중복 O)), 키값이 중복되면 덮어쓰기
    public static void main(String[] args) {
//        Map 자료 구조 생성
        Map<String, Integer> map = new HashMap<>();

//      map객체.put(키, 값) : 객체 추가
        map.put("신용권", 85); // 1st Entry
        map.put("홍길동", 90); // 2nd Entry
        map.put("동장군", 80);
        map.put("홍길동", 95);

//        for(String b : map.keySet()) {
//            System.out.println(b);
//        }

//      map.size() : map 객체 크기 보기
        System.out.println("총 Entry 수 :" + map.size());

//      map.get(키) : 키값에 해당하는 값을 보기
        System.out.println("홍길동 :" + map.get("홍길동"));
        System.out.println();

//        객체를 뽑아서 출력하기
        Set<String> keySet = map.keySet(); // Map -> Set 변환 : 키만 있는 집합
//        반복문을 실행할때 : Iterator 객체 이용하면 간편하게 실행할 수 있음
        Iterator<String> keyIterator = keySet.iterator(); // Iterator로 변환
//        keyIterator.hasNext() : Iterator 객체안에 값이 있으면
        while (keyIterator.hasNext()) {
//            1st .next() 호출 : 최초 자료
//            2nd .next() 호출 : 두번째 자료
//            ...
//            nth .next() 호출 : n번째 자료
            String key = keyIterator.next(); // 그 값을 임시 key 변수에 넣기
            Integer value = map.get(key); // 키로 값을 조회
            System.out.println(key + " : " + value);
        }
        System.out.println(); // 줄바꿈

//        자료 삭제
        map.remove("홍길동");
        System.out.println("총 Entry 수: " + map.size());

//        자료 모두 삭제
        map.clear();
        System.out.println("총 Entry 수 : "+ map.size());
    }
}
