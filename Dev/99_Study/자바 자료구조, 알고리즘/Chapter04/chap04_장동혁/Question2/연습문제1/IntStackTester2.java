package StudyGroup.chap04.Question2.연습문제1;

import java.util.Scanner;

/**
 * packageName : StudyGroup.chap04.Question1
 * fileName : IntStackTester
 * author : hyuk
 * date : 2022/10/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/30         hyuk          최초 생성
 */
public class IntStackTester2 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        IntStack stack = new IntStack(64);

        while (true){
            System.out.println();
            System.out.printf("현재 데이터 개수 : %d / %d\n", stack.size(), stack.getCapacity());
            System.out.print("(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (5) 클리어 (6) 인덱스위치 (7) 스택 비어있니? (8) 스택 차있니? (0) 종료 : ");

            int menu = scanner.nextInt();
            if (menu == 0){
                break;
            }

            int x;
            int y;
            switch (menu){
                case 1: // 푸시
                    System.out.print("데이터 : ");
                    x = scanner.nextInt();
                    try {
                        stack.push(x);
                    } catch (IntStack.OverflowIntStackException e){
                        System.out.println("스택이 가득찼습니다");
                    }
                break;

                case 2: // 팝
                    try {
                        x = stack.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다");
                    } catch (IntStack.EmptyIntStackException e){
                        System.out.println("스택이 비어있습니다");
                    }
                break;

                case 3: // 피크
                    try {
                        x = stack.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다");
                    } catch (IntStack.EmptyIntStackException e){
                        System.out.println("스택이 비어 있습니다");
                    }
                break;

                case 4: // 덤프
                    stack.dump();
                    break;

                case 5: // 클리어
                    stack.clear();
                    System.out.println("스텍이 초기화 되었습니다");
                    break;

                case 6: // 인덱스위치
                    System.out.print("찾고싶은 요소 : ");
                    x = scanner.nextInt();
                    try {
                        y = stack.indexOf(x);
                        System.out.println("인덱스의 위치는 " + y + "입니다");
                    } catch (IntStack.EmptyIntStackException e){
                        System.out.println("찾으려는 요소의 인덱스 위치가 없습니다");
                    }
                    break;

                case 7: // 비어있니
//                    stack.isEmpty();
                    if (stack.isEmpty() == true){
                        System.out.println("스텍이 비어있습니다");
                    } else {
                        System.out.println("스텍이 비어있지 않습니다");
                    }
                    break;

                case 8: // 차있니
//                    stack.isFull();
                    if (stack.isFull() == true){
                        System.out.println("스텍이 차있습니다");
                    } else {
                        System.out.println("스텍이 가득차지 않습니다");
                    }
                    break;

            }
        }
    }
}
