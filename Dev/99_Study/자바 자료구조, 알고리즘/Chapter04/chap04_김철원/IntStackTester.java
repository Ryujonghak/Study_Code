package chap11.sec02.exam02;

import java.util.Scanner;

/**
 * packageName : chap11.sec02.exam02
 * fileName : IntStackTester
 * author : 김철원
 * date : 2022-10-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-30         김철원          최초 생성
 */
public class IntStackTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        IntStack s = new IntStack(64);  // 최대 64개를 넣을 수 있는 스택

        while (true) {
            System.out.println();
            System.out.printf("현재 데이터 개수 : %d / %d\n" , s.size(),s.getCapacity());
            System.out.print("(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (0) 종료 : ");

            int menu = stdIn.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 1:        // 스택에 값 추가하기
                    System.out.print("데이터: ");
                    x = stdIn.nextInt();
                    try {
                        s.push(x);
                    }catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2:           // 스택 값 제거 하기
                    try {
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    }catch (IntStack.EmptyIntStackException e){
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 3:             // 스택에 맨 위에 있는 값을 출력하기
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    }catch (IntStack.EmptyIntStackException e ){
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;
                case 4:             // 스택에 있는 모든 요소 출력하기
                    s.dump();
                    break;
            }
        }
    }
}
