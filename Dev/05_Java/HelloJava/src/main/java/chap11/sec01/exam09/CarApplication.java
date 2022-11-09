package chap11.sec01.exam09;

import chap07.sec02.exam02.Car;

/**
 * packageName : chap11.sec01.exam04
 * fileName : CarApplication
 * author : ryujonghak
 * date : 2022/10/05
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         ryujonghak          최초 생성
 */
public class CarApplication {
    public static void main(String[] args) {
        Class clazz = Car.class;

//                        클래스의 다양한 정보 보기
        System.out.println(clazz.getPackage().getName()); // 패키지 정보 보기
        System.out.println(clazz.getName()); // 패키지명 + 클래스명 정보가 출력됨(풀클래스명)
        System.out.println(clazz.getSimpleName()); // 패키지명제외한 클래스명 출력됨
    }
}
