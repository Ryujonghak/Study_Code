package CodeUp.Service;

import CodeUp.Model.Solution;

import java.util.Scanner;


/**
 * packageName : CodeUp.Service
 * fileName : SolutionService
 * author : ryujonghak
 * date : 2022/10/11
 * description : 구현(자식)클래스 - 업무로직 함수들 모임
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/11         ryujonghak          최초 생성
 */
public class SolutionService4Impl implements SolutionService {
    @Override
    public Solution codeUp01(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자를 입력해주세요.");
        String line = scanner.next();
        solution.setStrResult(line);

        return solution;
    }

    @Override
    public Solution codeUp02(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자를 입력해주세요.");
        String line = scanner.next();
        solution.setStrResult(line);

        return solution;
    }

    @Override
    public Solution codeUp03(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 2개 빈칸을 두고 입력해주세요.");
        String line = scanner.nextLine();
        String[] str = line.split(".");
        String num1 = str[0];
        String num2 = str[1];
        solution.setStrResult(num1 + ", " + num2);

        return solution;
    }

    @Override
    public Solution codeUp04(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 2개 빈칸을 두고 입력해주세요.");
        String line = scanner.nextLine();
        String str = null;
        for (int i = 0; i < line.length(); i++) {
            str += line.charAt(i);
        }
        solution.setStrResult(str);
        return solution;
    }

    @Override
    public Solution codeUp05(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("실수를 입력해주세요.");
        int num = scanner.nextInt();
        if (num >= 10000 && num <= 99999) {
            String str = "[" + num / 10000 + "]" + "[" + num / 1000 + "]" +"[" + num / 100 + "]" +"[" + num / 10 + "]" +"[" + num / 1 + "]";
            solution.setStrResult(str);

            return solution;
        } else {
            solution.setStrResult("잘못된 값 입력");

            return solution;
        }
    }

    @Override
    public Solution codeUp06(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("시간을 입력해주세요.");
        String[] str = scanner.nextLine().split(":");
        solution.setStrResult(str[1]);

        return solution;
    }

    @Override
    public Solution codeUp07(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("시간을 입력해주세요.");
        String[] str = scanner.nextLine().split(":");
        solution.setStrResult(str[2]);

        return solution;
    }

    @Override
    public Solution codeUp08(Solution solution) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 1개가 입력된다. :");
        String strInput = String.valueOf(scanner.nextLong()); // 한줄 문자열로 입력받기

        solution.setStrResult(strInput);

        return solution;
    }

    @Override
    public Solution codeUp09(Solution solution) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("정소수점 아래 숫자가 11개 이하인 실수 1개가 입력된다. :");

        String strInput = String.format("%.11f", scanner.nextDouble()); // 한줄 문자열로 입력받기

        solution.setStrResult(strInput);

        return solution;
    }

    @Override
    public Solution codeUp10(Solution solution) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 1개가 입력된다. :");
        String strInput = String.valueOf(scanner.nextLong()); // 한줄 문자열로 입력받기

        solution.setStrResult(strInput);

        return solution;

    }
}
