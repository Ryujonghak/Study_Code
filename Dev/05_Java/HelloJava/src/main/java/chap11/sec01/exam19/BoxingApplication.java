package chap11.sec01.exam19;

/**
 * packageName : chap11.sec01.exam19
 * fileName : BoxingApplication
 * author : ryujonghak
 * date : 2022/10/05
 * description : Wrapper(포장) Class, Boxing/ UnBoxing
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         ryujonghak          최초 생성
 */
public class BoxingApplication {
    public static void main(String[] args) {
//        기본 자료형 : byte, short, int, long, float, double, char, boolean
//        위의 자료형을 객체로 변환해야 할때가 있음
//        int -> Integer 객체 있음
//        double -> Double 객체 있음
//        boolean -> Boolean 객체 있음

//        기본자료형 -> 객체 변환 : Boxing
        Integer obj1 = new Integer(100); // 객체 정수형(Wrapper Class), 옛날방식
        Integer obj2 = 100; // 기본자료형 -> 객체 자동변환(AutoBoxing), 요즘방식

//        객체 -> 기본자료형 : UnBoxing
        int value1 = obj1.intValue(); // 원복
        int value2 = obj2; // 자동 변환(객체 -> 기본자료형)

        System.out.println(value1);
        System.out.println(value2);
    }
}

