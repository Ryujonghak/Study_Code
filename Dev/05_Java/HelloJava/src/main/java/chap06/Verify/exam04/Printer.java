package chap06.Verify.exam04;

/**
 * packageName : chap06.Verify.exam04
 * fileName : Printer
 * author : ryujonghak
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         ryujonghak          최초 생성
 */
public class Printer {

    static void println(int value) { // 공유(전역, 정적)함수
        System.out.println("공유함수(int): " + value);
    }
    static void println(double value) { // 공유(전역, 정적)함수
        System.out.println("공유함수(double): " + value);
    }
    static void println(boolean value) { // 공유(전역, 정적)함수
        System.out.println("공유함수(boolean): " + value);
    }
    static void println(String value) { // 공유(전역, 정적)함수
        System.out.println("공유함수(String): " + value);
    }
}
