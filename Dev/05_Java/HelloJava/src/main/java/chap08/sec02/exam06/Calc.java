package chap08.sec02.exam06;

/**
 * packageName : chap08.sec02.exam06
 * fileName : Calc
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public interface Calc {
    int ERROR = -999999999;

    int add(int num1, int num2);      // 덧셈
    int subtract(int num1, int num2); // 뺄셈
    int times(int num1, int num2);    // 곱셈
    int divide(int num1, int num2);   // 나눗셈
}
