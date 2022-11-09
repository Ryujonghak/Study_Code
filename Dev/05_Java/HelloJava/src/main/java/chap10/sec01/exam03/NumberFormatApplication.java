package chap10.sec01.exam03;

/**
 * packageName : chap10.sec01.exam03
 * fileName : NumberFormatApplication
 * author : ryujonghak
 * date : 2022/10/04
 * description : NumberFormatException
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class NumberFormatApplication {
    public static void main(String[] args) {
        String data1 = "100";
        String data2 = "a100";

        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2); // 숫자로 바꿀수 없는 값을 강제로 변환할 경우 발생하는 에러

        System.out.println(value1 + " " + value2);
    }
}
