package chap04;


import com.sun.org.apache.xml.internal.utils.IntStack;

import java.util.Scanner;

/**
 * packageName : chap04
 * fileName : IntStackTester
 * author : gangsubin
 * date : 2022/10/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/29         gangsubin          최초 생성
 */



// 스택은 언제 사용되는지...? 예시 찾기

//웹 브라우저 방문기록 (뒤로 가기) : 가장 나중에 열린 페이지부터 다시 보여준다.
//역순 문자열 만들기 : 가장 나중에 입력된 문자부터 출력한다.
//실행 취소 (undo) : 가장 나중에 실행된 것부터 실행을 취소한다.
//후위 표기법 계산
//수식의 괄호 검사 (연산자 우선순위 표현을 위한 괄호 검사)

public class IntStackTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //정수값을 입력받는다
        IntStack s = new IntStack(64); //스택의 크기 정함 -> 최대 64개를 저장할 수 있는 스택


        while (true) {
            System.out.println(); //메뉴 구분을 위한 빈 행 추가 함
            System.out.printf("현재 데이터 개수 : %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (0)종료 : ");


            int menu = scanner.nextInt(); //입력받은 수가 0일때 break;
            if (menu == 0)
                break;


            int x;
            switch (menu) {
                case 1: //푸시
                    System.out.print("데이터 :");
                    x = scanner.nextInt();

                    try {
                        s.push(x);
                    } catch (IntStack.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }

                case 2: //팝(데이터 꺼내기)
                    try {
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;
                case 3: //피크
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;

                case 4: //덤프 (스택안의 모든 데이터를 출력함) 바닥-> 꼭대기
                    s.dump();
                    break;
            }
        }


    }


}
