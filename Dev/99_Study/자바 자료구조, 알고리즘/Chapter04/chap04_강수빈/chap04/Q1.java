package chap04;

import com.sun.org.apache.xml.internal.utils.IntStack;

import java.util.Scanner;

/**
 * packageName : chap04
 * fileName : Q1
 * author : gangsubin
 * date : 2022/10/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/29         gangsubin          최초 생성
 */
public class Q1 {
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
                        System.out.println("스택이 가득 찼습니다."); //x를 푸시했는데 안됨 -> 스택에 용량 다참 overflow에러
                    }

                case 2: //팝(데이터 꺼내기)
                    try {
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (IntStack.EmptyIntStackException e) {
                        System.out.println("스택이 비어있습니다.");
                    }
                    break;
                case 3: //피크 (위에서 꼭대기 데이터를 들여다 봤을때)
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


                //검색하기
                case 5:
                    System.out.print("검색할 데이터:");
                    x = scanner.nextInt();
                    int n = s.indexOf(x); //n을 x값이 포함되어있는지 없는지 조사함
                    if (n >= 0) //스택에 데이터가 있을경우
                        System.out.println(s.size() - n); // IntStack의 크기 -n => s.size()-n 번째에 있다
                    else //데이터가 없을경우
                        System.out.println("데이터가 없습니다.");


                case 6:
                    // 비우기
                    s.clear();
                    break;


                //데이터 출력하기
                case 7:
                    System.out.println("용량 : " + s.getCapacity());
                    System.out.println("데이터 수 :" + s.size());
                    System.out.println(s.isEmpty() ? "비어있음" : "비어있지 않음"); // 삼항연산자  ? (true) : (false)


            }


        }
    }


}
}
