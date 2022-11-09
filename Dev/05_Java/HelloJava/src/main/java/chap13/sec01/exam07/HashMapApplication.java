package chap13.sec01.exam07;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName : chap13.sec01.exam07
 * fileName : HashMapApplication
 * author : ryujonghak
 * date : 2022/10/05
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         ryujonghak          최초 생성
 */
public class HashMapApplication {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<Student, Integer>();
        map.put(new Student(1,"홍길동"), 95);
        map.put(new Student(1,"홍길동"), 95);

        System.out.println(map.size());
    }
}
