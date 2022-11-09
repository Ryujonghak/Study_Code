package chapter01.sec01.verify;

/**
 * packageName : chapter01.sec01.verify
 * fileName : Q3
 * author : juhee
 * date : 2022-10-07
 * description : 네 값의 최솟값을 구하는 min4 메서드를 작성하세요
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-07         juhee          최초 생성
 */
public class Q3 {
    // 함수 min4()
    static int min4(int a, int b, int c, int d){
        int min = a;
        if(b<a){
            min = b;
        }
        else if(c<b){
            min = c;
        }
        else if(d<c){
            min = d;
        }
        return min;
    }
}
