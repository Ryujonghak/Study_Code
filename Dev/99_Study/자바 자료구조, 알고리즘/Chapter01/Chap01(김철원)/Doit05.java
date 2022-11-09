package chap99.Doit.chap01;

import java.util.Scanner;

/**
 * packageName : chap99.Doit.chap01
 * fileName : Doit05
 * author : 김철원
 * date : 2022-10-10
 * description :연습문제 Questions 10
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-10         김철원          최초 생성
 */
// Q10. 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요. 예를 들어서 135를 입력
//      하면 '그 수는 3자리 입니다.' 라고 출력하고, 1314를 입력하면 '그 수는 4자리 입니다.'
//      라고 출력합니다.
public class Doit05 {
    public void ques10(int a) {
        int Num = 1; // 반복문이 돌아가면서 나눌값
        int result; // 주어진 정수를 나눈값을 담을 그릇
        int i;
        for (i = 1; true;i++) {
            result = a / Num;
            if (10> result) {     // 나눈값이 10 미만이면 자리수가 나오고 break를 써서 반복문 중단
                break;
            }
            Num = Num * 10; // 반복문이 돌아가면서 1 10 100 1000 10000 이 됨
        }
        System.out.println("그 수는 " + i + "자리입니다."); // i의 값이 자리수
    }
    
    public static void main(String[] args) {
        Doit05 doit05 = new Doit05();
        doit05.ques10(135);
        doit05.ques10(1314);
    }
}