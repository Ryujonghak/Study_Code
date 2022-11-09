package chap02;

/**
 * packageName : chap02
 * fileName : PrimeNumber1
 * author : 최아리
 * date : 2022-10-17
 * description : 실습 2-7 (p.75)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-17         최아리          최초 생성
 */
public class PrimeNumber1 {
//    1000 이하의 소수를 나열 (버전1 - 개선x)

    public static void main(String[] args) {
        int counter=0; // 나눗셈의 횟수 (개선된 알고리즘과 비교하기 위해 카운트)

        for(int n=2; n<=1000; n++) { // n은 구할 소수
            int i;

            for(i=2; i<n; i++) { // i가 나누는 수
                counter++;
                if(n % i == 0) { // 나누어 떨어지면 소수 x
                    break; // 바로 다음 수로 넘어가기
                }
            }

            if(n == i) { // 마지막까지 나누어 떨어지지 않음 => i++되어서 나온 i값과 n이 같으면 그 수는 소수
                System.out.println(n);
            }
        }

        System.out.println("나눗셈을 수행한 횟수 : " + counter); // 1000까지 총 78022 회 실행
    }
}

//  알고리즘을 개선하고 싶다면 소수는,

//  1. 2 ~ n-1까지 어떤 소수로도 나누어떨어지지 않는다.
//  2. n의 제곱근 이하의 어떤 소수로도 나누어떨어지지 않는다.

//  라는 소수의 특성을 이용하여 코드를 개선할 수도 있다.

