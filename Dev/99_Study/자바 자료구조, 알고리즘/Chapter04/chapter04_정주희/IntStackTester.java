package chapter04;

import chapter04.Q1.IntStack;

import java.util.Scanner;

/**
 * packageName : chapter04
 * fileName : IntStackTester
 * author : juhee
 * date : 2022-10-31
 * description : 실습 4-2 (p.140)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-31         juhee          최초 생성
 */
public class IntStackTester {
    // main
    public static void main(String[] args) {
        // scanner
        Scanner stdIn = new Scanner(System.in);     // 스캐너로 입력받기
        IntStack s = new IntStack(64);              // 64개를 수납할 수 있는 스택

        while (true){
            System.out.println();
            System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (0)종료: ");

            int menu = stdIn.nextInt();     // 키보드로 받은 값 menu에 저장
            if(menu == 0){                  // 0 을 입력받으면 종료
                break;
            }

            int x = 0;
            switch(menu){
                case 1:     // 푸시(넣기)             // 입력받은 값이 1이면
                    System.out.print("데이터: ");     // x에 넣기
                    x = stdIn.nextInt();

                try{
                    s.push(x);                       // 스택 s에 x 를 넣기(push)
                } catch (IntStack.OverflowIntStackException e){     // OverflowIntStackException 에러 발생 시 메시지 출력(배열크기보다 많이 들어간 경우)
                    System.out.println("스택이 가득 찼습니다.");
                }
                break;

                case 2:     // 팝(꺼내기)             // 입력받은 값이 2면
                    try {
                        x = s.pop();                // 스택 s에서 꺼낸(pop) 것 x에 넣기
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e){    // EmptyIntStackException 에러 발생 시 메시지 출력 (스택이 빈 경우)
                        System.out.println("스택이 비었습니다.");
                    }
                    break;

                case 3:     // 피크(제일 마지막에 넣은 값)        // 입력받은 값이 3이면
                    try {
                        x = s.peek();                      // 스택 s의 피크(마지막에 넣은 제일 위 꼭대기 값)을 x에 넣기
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e){    // EmptyIntStackException 에러 발생 시 메시지 출력
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;

                case 4:             // 입력받은 값이 4면
                    s.dump();       // 스택 s의 덤프 (데이터 전부 보기)
                    break;

            }
        }


    }
}
