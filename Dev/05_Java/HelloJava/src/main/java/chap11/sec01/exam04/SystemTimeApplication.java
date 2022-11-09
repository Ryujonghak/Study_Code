package chap11.sec01.exam04;

/**
 * packageName : chap11.sec01.exam04
 * fileName : SystemTimeApplication
 * author : ryujonghak
 * date : 2022/10/05
 * description : 프로그램 실행 소요 시간 구하기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         ryujonghak          최초 생성
 */
public class SystemTimeApplication {
    public static void main(String[] args) {
//        1) 시작 시간 체크
        long time = System.nanoTime(); // 1/10^9 시간
        System.out.println("시작시간(ns): " + time);

//        2) 실행
        int sum = 0;
        for (int i = 1; i < 1000000; i++) {
            sum += i;
        }

//        3) 마지막 시간 체크
        long now = System.nanoTime();

//        4) 마지막 시간 - 시작 시간 = 소요시간
        System.out.println("소요시간(ns): " + (now - time));


    }
}
