package jungSuck.chap14;

import java.util.Optional;

/**
 * packageName : jungSuck.chap14
 * fileName : Ex14_8
 * author : ryujonghak
 * date : 2022/10/11
 * description : Optional 사용하기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/11         ryujonghak          최초 생성
 */
public class Ex14_8 {
    public static void main(String[] args) {
//        Optional: Null 방지 클래스(NullPointerException 예외를 방지해줌.)
//        Optional.of(): 데이터(값) 넣기
        Optional<String> optStr = Optional.of("abcde");

//        Optional에서 값을 가져오기
        System.out.println("optStr: " + optStr.get());
        System.out.println("--------------------------");

        Optional optional1 = Optional.of(0);
        System.out.println("optional: " + optional1.get());
        System.out.println("--------------------------");

        Optional optional2 = Optional.empty();
//        System.out.println("optional2: " + optional2.get()); // error 발생
        System.out.println(optional2.orElse("empty"));
        System.out.println("--------------------------");

        System.out.println(optional1.isPresent());
        System.out.println(optional2.isPresent());
    }
}
