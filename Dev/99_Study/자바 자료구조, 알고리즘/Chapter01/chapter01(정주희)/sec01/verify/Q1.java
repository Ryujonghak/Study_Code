package chapter01.sec01.verify;

/**
 * packageName : chapter01.sec02.verify
 * fileName : Q1
 * author : juhee
 * date : 2022-10-07
 * description : 네 값의 최댓값을 구하는 max4메서드를 작성하세요.
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-07         juhee          최초 생성
 */
public class Q1 {
    // 함수 max4()
    // static : 공유상수
    // 결과값 int 리턴
    static int max4(int a, int b, int c, int d){
        int max = a;
        if(b>max){
            max = b;
        }
        else if(c>max){
            max = c;
        }
        else if(d>max){
            max = d;
        }
        return max;
    }
}



