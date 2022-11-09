package chapter01.sec01;

/**
 * packageName : chapter01
 * fileName : Median
 * author : juhee
 * date : 2022-10-06
 * description : 실습 1C-1
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-06         juhee          최초 생성
 */
// 3개의 정수값을 입력하고 중앙값을 구하여 출력
public class Median {
    // 함수 med3()
    // static : 공유상수
    // 결과값 int 리턴
    static int med3(int a, int b, int c){
        if(a > b){              // a > b > c, a > c > b, c > a > b
            if(b >= c){         // a > b > c
                return b;
            }else if (a <= c){  // b < a < c
                return a;
            } else return c;    // a > c < b

        }else if (a>c){         // a<=b면서 a>c인 경우,  b > a > c
            return a;
        }else if (b>c){         // a<=b면서 b>c인 경우, b > c > a
            return c;
        } else return b;        // a<=b면서 a<=c면서 b<=c 인 경우, a < b < c
    }

}
