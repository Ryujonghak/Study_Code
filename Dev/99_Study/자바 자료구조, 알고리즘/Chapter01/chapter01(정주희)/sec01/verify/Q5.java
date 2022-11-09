package chapter01.sec01.verify;

/**
 * packageName : chapter01.sec01.verify
 * fileName : Q5
 * author : juhee
 * date : 2022-10-07
 * description : 중앙값을 구하는 메서드를 다음과 같이 작성하면 실습1c-1의 med3 메서드에 비해 효율이 떨어지는 이유를 설명하세요.
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-07         juhee          최초 생성
 */
public class Q5 {
    // 중앙값 구하는 함수 med3()
    static int med3(int a, int b, int c){
        if((b>=a && c<=a) || (b<=a && c>=a))    // b > a > c 이거나 c > a > b
            return a;
        else if((a>b && c<b) || (a<b && c>b))    // a > b > c 이거나 c > b > a
            return b;
        return c;
    }                                               // if 조건문 하나에 비교식 3번 계산해야해서..?


//    // 실습 c-1의 함수 med3()
//    static int med3(int a, int b, int c){
//        if(a > b){
//            if(b >= c){
//                return b;
//            }else if (a <= c){
//                return a;
//            } else return c;
//
//        }else if (a>c){
//            return a;
//        }else if (b>c){
//            return c;
//        } else return b;
//    }
}
