package chap04;

import java.util.Scanner;

/**
 * packageName : chap04
 * fileName : Verify04
 * author : ryujonghak
 * date : 2022/09/26
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/26         ryujonghak          최초 생성
 */
public class Verify04 {
    //    Refactoring(리팩토링): 클래스 정리 정돈
//    클래스명, 변수명, 함수명 등을 의미에 맞게 고치는 활동(성능에 상관 X).
//    2) for문을 이용하여 1~100까지 정수 중에서 3의 배수의 총합을 구하는 코드를 작성하세요.
    public void exam02() {
        int result = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                result += i;
//                continue;
            }
        }
        System.out.println("3의 배수 총합은: " + result);
    }

    //    3) 반복문으로 Math.random() 함수를 이용해서 2개의 주사위를 던졌을 때 나오는 값(값1, 값2)의 가지수를 출력하고 눈의 합이 5이면 실행을 멈추는 프로그램을 작성.
    public void exam03() {
        while (true) {
            int RDNum1 = (int) (Math.random() * 6) + 1;
            int RDNum2 = (int) (Math.random() * 6) + 1;
            if (RDNum2 + RDNum1 == 5) {
                System.out.println("주사위 눈의 합이 5가 되어 프로그램이 중단되었습니다.");
                break;
            }
            System.out.println("(" + RDNum1 + "," + RDNum2 + ")");
        }
    }

    //    4) 2중 for문을 이용해서 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력해 보세요.
//    단 ,x와 y는 10 이하의 자연수( 1 ~ 10까지 )
    public void exam04() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int sum = (4 * i) + (5 * j);
                if (sum == 60) {
                    System.out.println("(" + i + "," + j + ")");
                }
            }
        }

    }
    //5 for문을 이용해 다음과 같이 *를 출력하는코드를 작성해 보세요 .
//    결과 :
//          *
//          **
//          ***
//          ****


    public void exam05() {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if (j == i) {
                    System.out.print("\n");
                }
            }
        }
    }

    //        6) for문을 이용해서 다음과 같이 *를 출력하는 코드를 작성해 보세요.
//    결과 :
//            *
//           **
//          ***
//         ****
    public void exam06() {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > 0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    //    코드 완성하기
//    7) while문과 Scanner를 이용해서 키보드로 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를
//       []에 작성해 보세요. 프로그램을 실행하면 다음과 같은 결과가 나와야 함
//    단, Scanner 의 nextLine() 사용하세요.
//    실행결과 : 선택> 1
//           예금액> 10000
//             선택> 2
//           출금액> 2000
//             선택> 3
//             잔고> 8000
//             선택> 4
//             프로그램 종료
    public void exam07() {
        boolean run = true;

        int balance = 0;

        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("-------------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------------");
            System.out.print("선택> ");

//             아래 부분을 완성하세요 — 시작
            switch (scanner.nextLine()) {
                case "1":
                    System.out.print("예금액> ");
                    balance = balance + Integer.parseInt(scanner.nextLine());
                    System.out.print("잔고금액> ");
                    System.out.println(balance + "₩");
                    break;
                case "2":
                    if (balance > 0) {
                        System.out.print("출금액> ");
                        balance = balance - Integer.parseInt(scanner.nextLine());
                        System.out.print("잔고금액> ");
                        System.out.println(balance + "₩");
                        break;
                    } else {
                        System.out.println("잔고가 없어 출금할 수 없습니다.");
                        System.out.print("잔고금액> ");
                        System.out.println(balance + "₩");
                        break;
                    }
                case "3":
                    System.out.print("잔고금액> ");
                    System.out.println(balance + "₩");
                    break;
                case "4":
                    System.out.println("종료합니다.");
                    run = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }


//           끝
            System.out.println();
        }

        System.out.println("프로그램 종료");
    }
}

