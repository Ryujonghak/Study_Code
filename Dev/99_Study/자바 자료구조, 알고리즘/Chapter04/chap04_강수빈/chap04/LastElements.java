package chap04;

import java.util.Scanner;

/**
 * packageName : chap04
 * fileName : LastElements
 * author : gangsubin
 * date : 2022/10/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/29         gangsubin          최초 생성
 */
public class LastElements {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        final int N = 10;
        int[] a = new int[N];
        int cnt = 0;
        int retry;

        System.out.println("정수를 입력하세요.");

        do{
            System.out.printf("%d번째 정수:", cnt + 1);
            a[cnt++ % N] = stdIn.nextInt();

            System.out.print("계속 할까요? (1.예/0.아니오) :");
            retry = stdIn.nextInt();
        } while (retry == 1);

        /*
         *
         * 입력한 값을 저장할 때, 상수로 선언한 N 크기의 큐를  cnt가 넘어가면
         * 맨 처음에 넣은 것들을 지워줘야 한다. N보다 작은 경우에는 0 인덱스부터 cnt-1 인덱스까지를
         * 출력하면 되지만, N을 넘어설 경우에는 N을 초과한 크기만큼의 인덱스부터 시작해야한다.
         * 따라서 입력한 값을 저장하는 위치의 인덱스를 cnt++%N 으로 할 경우, 인덱스는 N을 cnt로 나눈 나머지값이 되며
         * 10이 넘어갈 경우 다시 0번 인덱스부터 값을 저장하게 된다.이렇게 하면 10개의 범위를 넘어서는 데이터에 대해
         * 링 버퍼의 형태로 먼저 들어온 데이터가 사라지고 최신 10개의 데이터만 유지됨
         */
        int i = cnt - N;
        if (i < 0) i = 0;

        for (; i <cnt; i++)
            System.out.printf("%2d번째의 정수 = %d\n", i + 1, a[i % N]);
    }
}
}
