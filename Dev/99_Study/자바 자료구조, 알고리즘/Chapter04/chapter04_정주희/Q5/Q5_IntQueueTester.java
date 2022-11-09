package chapter04.Q5;

import java.util.Scanner;

/**
 * packageName : chapter04
 * fileName : Q5_IntQueueTester
 * author : juhee
 * date : 2022-11-01
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-11-01         juhee          최초 생성
 */
public class Q5_IntQueueTester {
    // 실행함수
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       // 스캐너로 입력받기
        IntQueue que = new IntQueue(64);         // 큐 길이 64

        while(true){
            System.out.println();
            System.out.printf("현재 데이터 개수 : %d / %d\n", que.size(), que.getCapacity());
            System.out.print("(1) 큐 삽입 (2) 디큐(큐 삭제) (3) 피크(가장 최신값 보기) (4) 덤프(모든 데이터 출력) (5) 인덱스위치 (0) 종료 : ");

            int menu = scanner.nextInt();
            if (menu == 0){
                break;
            }

            int x;
            int y;
            switch (menu){
                // enque() : 큐에 데이터 넣기
                case 1:
                    System.out.print("데이터 : ");
                    x = scanner.nextInt();
                    try {
                        que.enque(x);
                    } catch (IntQueue.OverflowIntQueueException e){
                        System.out.printf("큐가 가득 찼습니다");
                    }
                    break;

                // deque() : 큐 데이터 삭제
                case 2:
                    try {
                        x = que.deque();
                        System.out.println("디큐한 데이터는 " + x + "입니다");
                    } catch (IntQueue.EmptyIntQueueException e){
                        System.out.println("큐가 비어있습니다");
                    }
                    break;

                // peek() : 피크(꼭대기) 데이터 보기
                case 3:
                    try {
                        x = que.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다");
                    } catch (IntQueue.EmptyIntQueueException e){
                        System.out.println("큐가 비어 있습니다");
                    }
                    break;

                // dump() : 스택 내 모든 데이터 출력
                case 4:
                    que.dump();
                    break;

//              Q5: 클래스 IntQueue에 임의의 데이터를 검색하는 메서드 search를 추가하세요.

                // search()
                case 5:
                    System.out.print("찾고싶은 요소 : ");
                    x = scanner.nextInt();      // 찾고싶은 요소를 입력받아 x에 저장
                    
                    try {
                        y = que.search(x);
                        System.out.println("찾고싶은 요소의 인덱스는 " + y + "입니다");
                    } catch (IntQueue.OverflowIntQueueException e) {
                        System.out.println("찾고싶은 요소가 없습니다");
                    }
            }
        }
    }
}
