package StudyGroup.chap04.Question3.연습문제5;

import java.util.Scanner;

/**
 * packageName : StudyGroup.chap04.Question3.연습문제5
 * fileName : IntQueueTester
 * author : hyuk
 * date : 2022/10/30
 * description : p.158
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/30         hyuk          최초 생성
 */
public class IntQueueTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntQueue que = new IntQueue(64);

        while(true){
            System.out.println();
            System.out.printf("현재 데이터 개수 : %d / %d\n", que.size(), que.getCapacity());
            System.out.print("(1) 큐 (2) 디큐 (3) 피크 (4) 덤프 (5) 인덱스위치 (0) 종료 : ");

            int menu = scanner.nextInt();
            if (menu == 0){
                break;
            }

            int x;
            int y;
            switch (menu){
                case 1: // 큐에 데이터 넣기
                    System.out.print("데이터 : ");
                    x = scanner.nextInt();
                    try {
                        que.enque(x);
                    } catch (IntQueue.OverflowIntQueueException e){
                        System.out.printf("큐가 가득 찼습니다");
                    }
                    break;

                case 2:
                    try { // 큐에 데이터 삭제
                        x = que.deque();
                        System.out.println("디큐한 데이터는 " + x + "입니다");
                    } catch (IntQueue.EmptyIntQueueException e){
                        System.out.println("큐가 비어있습니다");
                    }
                    break;

                case 3:
                    try { // 선택한 큐 데이터 보기
                        x = que.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다");
                    } catch (IntQueue.EmptyIntQueueException e){
                        System.out.println("큐가 비어 있습니다");
                    }
                    break;

                case 4: // 출력
                    que.dump();
                    break;

                case 5: // 인덱스 위치
                    System.out.print("찾고싶은 요소 : ");
                    x = scanner.nextInt();
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
