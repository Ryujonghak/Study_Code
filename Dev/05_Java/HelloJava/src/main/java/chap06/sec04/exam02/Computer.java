package chap06.sec04.exam02;

/**
 * packageName : chap06.sec04.exam01
 * fileName : Computer
 * author : ryujonghak
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         ryujonghak          최초 생성
 */
public class Computer {
//    더하기 함수
//     int sum(int[] value) {
//         int num = 0;
//         for (int i : value) {
//             num += i;
//         }
//         return num;
//     }

    int sum(int... value) { // ... 문법: 매개변수 배열 형태를 자동으로 만들어 주는 연산자.
        int num = 0;
        for (int i : value) {
            num += i;
        }
        return num;
    }

     int mul(int[] value) {
         int num = 1 ;
         for (int i : value) {
             num *= i;
         }
         return num;
     }
}
