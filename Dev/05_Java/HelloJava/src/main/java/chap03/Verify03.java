package chap03;

import java.util.Scanner;

/**
 * packageName : chap04
 * fileName : Sec0401
 * author : ryujonghak
 * date : 2022/09/23
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/23         ryujonghak          최초 생성
 */
public class Verify03 {
    public void exam1() {
//       자바 입력 방법: 입력 클래스(객체), System.in: 키보드 입력을 의미
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 수: ");
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println("두번째 수: ");
        double num2 = Double.parseDouble(scanner.nextLine());

        System.out.println("--------------------------------------------------------");
        if(num2 == 0) {
            System.out.println("무한대");
        } else {
            double num3 = num1 / num2;
            System.out.println(num3);
        }
//        num2 0이 아니면 "결과: num1/num2 출력 0이면 무한대 출력
    }

    public void exam2(){
        int var1 = 10;
//        문제: 원의 넓이를 구하시오.
        double var4 = var1 * var1 * 3.14;
        System.out.println("원의 넓이: "+ var4);

    }

    public void exam3() {
//        키보드 입력 패키지(객체)를 불러옴.
        Scanner scanner = new Scanner(System.in);

        System.out.println("ID를 입력해주세요");
        String ID = scanner.nextLine();

        String ID1 = "JAVA";
        String PW1 = "1234a";

//        문자열 비교 함수: .equals()
        if (ID.equals(ID1)) {
            System.out.println("비밀번호 입력해주세요.");
            String PW = scanner.nextLine();
            if(PW.equals(PW1)) {
                System.out.println("로그인되었습니다.");
            } else {
                System.out.println("로그인 실패하였습니다.");
            }
        } else {
            System.out.println("아이디가 존재하지 않습니다.");
        }


    }
}
