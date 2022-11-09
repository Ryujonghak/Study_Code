package chapter04.Q1;

import java.util.Scanner;

/**
 * packageName : chapter04
 * fileName : Q1
 * author : juhee
 * date : 2022-10-31
 * description : 연습문제 Q1 p.143
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-31         juhee          최초 생성
 */
public class Q1 {
    // 클래스 IntStack의 모든 매서드를 사용하는 프로그램
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
                // push() : 푸시(넣기)
                case 1:                              // 입력받은 값이 1이면
                    System.out.print("데이터: ");     // x에 넣기
                    x = stdIn.nextInt();

                    try{
                        s.push(x);                       // 스택 s에 x 를 넣기(push)
                    } catch (IntStack.OverflowIntStackException e){     // OverflowIntStackException 에러 발생 시 메시지 출력(배열크기보다 많이 들어간 경우)
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                // pop() : 팝(꺼내기)
                case 2:                             // 입력받은 값이 2면
                    try {
                        x = s.pop();                // 스택 s에서 꺼낸(pop) 것 x에 넣기
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e){    // EmptyIntStackException 에러 발생 시 메시지 출력 (스택이 빈 경우)
                        System.out.println("스택이 비었습니다.");
                    }
                    break;

                // peek() : 피크(제일 마지막에 넣은 값)
                case 3:                             // 입력받은 값이 3이면
                    try {
                        x = s.peek();                      // 스택 s의 피크(마지막에 넣은 제일 위 꼭대기 값)을 x에 넣기
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e){    // EmptyIntStackException 에러 발생 시 메시지 출력
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;

                // dump() : 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
                case 4:             // 입력받은 값이 4면
                    s.dump();       // 스택 s의 덤프 (데이터 전부 보기)
                    break;

                // indexOf() : 스택에서 x를 검색
                case 5:
                    System.out.print("검색할 데이터 : ");
                    x = stdIn.nextInt();
                    int n = s.indexOf(x);
                    if (n >= 0)
                        System.out.println("꼭대기에서 " + (s.size() - n) +"번째에 있습니다.");
                    else
                        System.out.println("그 데이터가 없습니다.");
                    break;

                // clear() : 스택을 비움(ptr을 0으로)
                case 6:
                    s.clear();
                    break;

                // 데이터 출력
                case 7:
                    System.out.println("용량 : " + s.getCapacity());
                    System.out.println("데이터수 : " + s.size());
                    System.out.println("비어 " + (s.isEmpty()  ? "있습니다."
                            : "있지 않습니다."));
                    System.out.println("가득 " + (s.isFull() ? "차 있습니다."
                            : "차 있지 않습니다."));
                    break;
            }
        }
    }
}
