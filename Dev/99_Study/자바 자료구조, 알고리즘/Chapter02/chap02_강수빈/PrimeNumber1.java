package chap02;

/**
 * packageName : chap02
 * fileName : PrimeNumber1
 * author : gangsubin
 * date : 2022/10/16
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/16         gangsubin          최초 생성
 */
public class PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0;

        for( int n =2 ; n <= 1000; n++){
            for (int j = 2; j< n; j++) {
                counter++;
                if(n % j ==0)  //나누어떨어지면 소수가 아니니까 break;
                    break;
            }
            if(n ==1)
                System.out.println(n);
        }

        System.out.println("나눗셈을 수행한 횟수:"+ counter);
    }
}
