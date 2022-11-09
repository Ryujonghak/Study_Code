package chap02;

/**
 * packageName : chap02
 * fileName : PrimeNumber1
 * author : 김철원
 * date : 2022-10-17
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-17         김철원          최초 생성
 */
public class PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0; //나눗셈 횟수

        for (int n =2; n <=1000; n++) {
            int i;
            for (i = 2; i<n; i++) {
                counter++;
                if (n % i == 0) { // 나누어 떨어지면 소수가 아님
                    break;      // 반복은 더이상 불필요함
                }
            }
            if (n == i) // 마지막까지 나누어떨어지지 않음
                System.out.println(n);
        }
        System.out.println("나눗셈을 수행한 횟수: " + counter);
    }
}
