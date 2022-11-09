package chap99.Doit.chap01;

/**
 * packageName : chap99.Doit.chap01
 * fileName : Doit04
 * author : 김철원
 * date : 2022-10-09
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-09         김철원          최초 생성
 */
// Q5. 중앙값을 구하는 메서드는 다음과 같이 작성을 할 수도 있습니다. 그러나
//     실습 1C-1의 med3 메서드에 비해 효율이 떨어지는데 그 이유를 설명하세요

//    1C-1의 med3메서드는 최소 2번 ~ 최대 3번 조건문만 실행하고 값이 나오는 반면
//    아래의 med3 메서드는 최소 2번 ~ 최대 7번의 조건문이 실행이 되어야 값이 나와서
//    이유 : 조건문 3번이면 나오는 값을 조건문 7번을 돌려야 값이 나오기 때문에
//          효율이 떨어진다고 생각합니다.
public class Doit04 {
    static int med3(int a, int b, int c) {
        if ((b >= a && c <= a) || (b <=a && c >= a))
            return a;
        else if ((a > b && c < b) || (a < b && c > b))
            return b;
        return c;
    }
}
