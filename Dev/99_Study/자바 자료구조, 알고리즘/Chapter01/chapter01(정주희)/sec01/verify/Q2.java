package chapter01.sec01.verify;

/**
 * packageName : chapter01.sec02.verify
 * fileName : Q2
 * author : juhee
 * date : 2022-10-07
 * description : 세 값의 최솟값을 구하는 min3메서드를 작성하세요
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-07         juhee          최초 생성
 */
public class Q2 {
    // 함수 min3()
    static int min3(int a, int b, int c){
        int min = a;
        if(b<a){
            min = b;
        }
        else if(c<b){
            min = c;
        }
        return min;
    }
}
