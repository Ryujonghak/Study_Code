package jungSuck.chap14;

import java.io.File;
import java.util.function.*;
import java.util.*;

/**
 * packageName : jungSuck.chap14
 * fileName : Ex14_2
 * author : ryujonghak
 * date : 2022/10/11
 * description : 람다와 스티림(*) (함수형 프로그램 언어 차용 문법_
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/11         ryujonghak          최초 생성
 */
// 람다식(화살표 함수) 사용할 수 있는 경우: 함수형 인터페이스에 사용 가능.
public class Ex14_2 {
    public static void main(String[] args) {
//        함수형 인터페이스: 모든 코딩은 함수로 코딩한다(매개변수, 리턴값).
//        클로저 언어(제일 인기 있는 함수형 프로그래밍 언어)
//        Supplier: 매개변수 없이 반환값만 있는 함수 Ex) T get()
//        Consumer: 매개변수가 있고 반환값은 없는 함수 Ex) void accect(T t)
//        Function: 일반적인 함수, 매개변수와 반환값이 있는 함수 Ex)T apply(T t)
//        Predicate: 매개변수가 있고 반환값이 boolean 값으로 있는 함수 Ex)boolean test(T t)
//        Runnable: 매개변수와 반환값이 둘다 없는 함수 Ex) void run()
        Supplier<Integer> s = () -> (int) (Math.random() * 100) + 1;
        Consumer<Integer> c = i -> System.out.println(i + ", ");
        Predicate<Integer> p = i -> i % 2 == 0; // 참과 거짓 출력
        Function<Integer, Integer> f = i -> i / 10 * 10; // 1의 자리를 없애는 함수
        Runnable r = () -> System.out.println("Runnable");

        List<Integer> list = new ArrayList<Integer>();
        makeRandomList(s, list);
        System.out.println(list); // 1 ~ 100가지 중 10개의 램덤 숫자가 나옴
        System.out.println("---------------------------");
        printEventNum(p, c, list); // List에 짝수인것만 화면에 출력
        System.out.println("--------------------------");
        List<Integer> newList = doSomething(f, list); // 일의 자리를 없앤 숫자 배열이 생성
        System.out.println(newList);


    }

    //    제네릭 함수 : 제네릭을 매개변수에 사용하는 함수, 반환타입 앞에 <T>를 붙임
//    제네릭 함수 : static <T> 반환타입 함수명(매개변수타입 매개변수명...) {}
//    1~100까지 중 10개의 랜덤 숫자 넣기
    static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for (int i = 0; i < 10; i++) {
            list.add(s.get());
        }
    }

    //    List에 저장된 요소의 값이(i) 짝수인것만 화면에 출력
    static <T> void printEventNum(Predicate<T> p, Consumer<T> c, List<T> list) {
        for (T i: list) {
            if(p.test(i)) { // 람다식은 함수 이름이 없으므로 p의 람다식을 대리해서 사용
                c.accept(i); // 람다식은 함수 이름이 없으므로 c의 람다식을 대리해서 사용
            }
        }
        System.out.println(); // 줄바꿈
    }
    //    1의 자리를 없앤 새로운 배열을 만들어서 List에 저장(1의 자리는 0으로 변경)
//    제네릭 함수: 함수의 리턴값 앞에 <>, 제네릭 표현식을 사용하는 함수
    static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
        List<T> newList = new ArrayList<T>(list.size());

        for (T i: list) {
            newList.add(f.apply(i));
        }
        return newList;
    }

}
