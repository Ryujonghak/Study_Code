package chap01;

/**
 * packageName : chap01
 * fileName : exercise_Q5
 * author : 최아리
 * date : 2022-10-11
 * description : 연습문제 Q5
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-11         최아리          최초 생성
 */
public class exercise_Q5 {
//    중앙값을 구하는 메서드는 다음과 같이 작성할 수도 있습니다. 그러나 실습 1C-1의 med3 메서드에 비해 효율이
//    떨어지는데 그 이유를 설명하세요.

    static int med3(int a, int b, int c) {
        if((b >= a && c <= a) || (b <= a && c >=a)) {
            return a;
        } else if((a > b && c < b) || (a < b && c > b)) {
            return b;
        } else {
            return c;
        }
    }

//    위의 작성된 메서드를 사용하면 계산해야 하는 경우의 수가 더 많아져서 속도가 조금 더 길어지기 때문인 것 같다.
}
