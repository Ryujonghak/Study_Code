package chap13.sec01.exam01;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName : chap11.chap13.sec01.exam01.ArrayListApplication
 * fileName : ArrayListApplication
 * author : ryujonghak
 * date : 2022/10/05
 * description : 컬렉션 프레임워크(List, Set, Map)
 * 요약 : 자바 컬렉션 프레임워크(List, Set, Map): 널리 알려진 자료구조를 활용하여 객체들을 효율적으로 추가/삭제/조회할 수 있도록 만든 인터페이스/클래스
 *      List: 배열을 개선한 자료구조, 인터페이스 / 배열과 차이점은 크기가 자동증가됨. / 구현클래스(ArrayList, LinkedList, Vector)
 *      ArrayList: 순차적으로 추가/삭제 속도 빠름, 중간에 추가/삭제시 속도 저하
 *      linkedList: 중간에 추가/삭제 시 속도 빠름, 순차적으로 추가/삭제 시 ArrayList보다 느림.
 *      Vector: 멀티 쓰레드 환경에서 사용하는 자료구조(비동기 문제를 동기화를 통해 해결해줌.)
 *
 *      Set: 집합을 표현한 자료구조, 인터페이스 / 순서가 없음. / 중복이 제거됨. / 구현클래스(HashSet)
 *      HashSet: .equals(), .hashCode()를 재정의해야 올바르게 사용 가능.
 *
 *      Map: (key, value)로 구성된 자료구조, 인터페이스 / 키는 유일 값은 중복이 가능 / 구현클래스(HashMap, HashTable)
 *      HashTable: 멀티 쓰레드 환경에서 사용하는 자료구조(비동기 문제를 동기화를 통해 해결해줌.)
 *
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         ryujonghak          최초 생성
 */

// List : 인터페이스(부모), 배열을 모방해서 개선한 자료구조,
//      구현(자식)클래스 : ArrayList(*****), Vector, LinkedList 등
// 특징: 인덱스를 사용하고(순서가 있음), 데이터 중복저장이 가능
// 단점: 빈번하게 추가/ 삭제를 하면 실행 동안 성능저하
// 배열의 단점 : 자동으로 크기 증가 되지 않음(개선)
// List 자료구조 : 배열과 유사하고 자동으로 크기가 증가함.

public class ArrayListApplication {
    public static void main(String[] args) {
        //        다형성 : 인터페이스(부모) 변수명 = new 구현클래스();
//        list 객체 <- ArrayList , Vector, LinkedList
//        <제한할자료형> : 제네릭 , 객체 자료형을 제한하기 위해 사용

        List<String> list = new ArrayList<String>();

//        객체.add(): 개선된 배열에 자료 생성하는 함수
        list.add("JAVA");
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2, "Database");
        list.add("myBATIS"); // 데이터베이스 연결하기 위한 용도의 프레임워크

        System.out.println(list);
//        배열 크기 가져오기
        int size = list.size();
        System.out.println("총 객체수: " + size);
        System.out.println();

//        n번째 자료 가져오기
//        String n = list.get(n);

//        n번째 자료 삭제하기
//        list.remove(n);

//        모든 자료 삭제하기
//        list.clear();
    }
}
