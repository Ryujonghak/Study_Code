package chap07.sec01.exam03;

/**
 * packageName : chap07.sec01.exam03
 * fileName : Cumputer
 * author : ryujonghak
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         ryujonghak          최초 생성
 */

public class Computer extends Calculator {

//    @Override // 함수 재정의: 상속 받은 함수의 내용을 재정의하고 싶은 경우 사용.
//    double areaCircle(double r) {
//        System.out.println("Computer.areaCircle()");
//        return Math.PI * r * r;
//    }


    @Override
    double areaCircle(double r) {
        System.out.println("Computer.areaCircle()");
        return Math.PI * r * r;
    }
}
