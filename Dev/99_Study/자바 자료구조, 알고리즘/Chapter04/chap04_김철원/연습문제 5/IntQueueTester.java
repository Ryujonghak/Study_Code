package chap11.sec02.exam02;

import java.util.Scanner;

/**
 * packageName : chap11.sec02.exam02
 * fileName : IntQueueTester
 * author : 김철원
 * date : 2022-11-01
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-11-01         김철원          최초 생성
 */
public class IntQueueTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntQueue s = new IntQueue(64);	// 최대 64개 인큐할 수 있는 큐

        while (true) {
            System.out.printf("현재 데이터 개수 : %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1) 인큐　(2) 디큐　(3) 피크　(4) 덤프　(5) 검색 (0) 종료 : ");

            int menu = stdIn.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 1: 								//  인큐
                    System.out.print("데이터 : ");
                    x = stdIn.nextInt();
                    try {
                        s.enque(x);
                    } catch (IntQueue.OverflowIntQueueException e) {
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;

                case 2: 								//  디큐
                    try {
                        x = s.deque();
                        System.out.println(" 디큐한 데이터는 " + x + "입니다.");
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;

                case 3: 								// 피크
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;

                case 4: 								// 덤프
                    s.dump();
                    break;

                case 5: { 								// 검색
                    System.out.print("찾을 값 : ");
                    x = stdIn.nextInt();
                    int a = s.search(x);
                    if (a != 0) {
                        System.out.println("front 에서 " + a + "번째 위치에 저장되어 있습니다.");
                    } else {
                        System.out.println("찾는 값이 존재하지 않습니다.");
                    }
                    break;
                }
            }
        }
    }
}

