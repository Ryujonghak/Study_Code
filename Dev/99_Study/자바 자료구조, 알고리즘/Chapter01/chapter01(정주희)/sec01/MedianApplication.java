package chapter01.sec01;

/**
 * packageName : chapter01.sec01
 * fileName : MedianApplication
 * author : juhee
 * date : 2022-10-10
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-10         juhee          최초 생성
 */
public class MedianApplication {
    // main함수
    public static void main(String[] args) {
        // 객체 정의
        Median median = new Median();

        // 함수 출력
        int result = median.med3(3,2,1);
        System.out.println("중앙값은: " + result);

        System.out.println("중앙값은: " + median.med3(3,4,5));
    }
}
