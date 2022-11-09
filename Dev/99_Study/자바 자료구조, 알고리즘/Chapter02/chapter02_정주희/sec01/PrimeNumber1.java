package chapter02.sec01;

/**
 * packageName : chapter02.sec01
 * fileName : PrimeNumber1
 * author : juhee
 * date : 2022-10-16
 * description : 실습 2-7 (p.75)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-16         juhee          최초 생성
 */
// 1000 이하의 소수를 나열하시오
public class PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0;    // 나눗셈의 횟수
        
        for(int n=2; n<=1000; n++){     // 구하려는 소수
            int i;                      // 나누는 수
            for(i=2; i<n; i++){
                counter++;      // 식 완료 후 나눗셈 횟수+1
                if(n%i == 0)    // i로 나누어 떨어지면 끝
                break;
            }
            if(n==i){
                System.out.println(n);  // 자기자신 말고 나누어떨어지지 않으면 그것 출력
            }
                
        }
    }
}
