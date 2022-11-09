package StudyGroup.chap04.Question1;

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
public class IntStackTester {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        IntStack stack = new IntStack(64);

        while (true){
            System.out.println();
            System.out.printf("현재 데이터 개수 : %d / %d\n", stack.size(), stack.getCapacity());
            System.out.print("(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (0) 종료 : ");

            int menu = scanner.nextInt();
            if (menu == 0){
                break;
            }

            int x;
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
            }
        }
    }
}
