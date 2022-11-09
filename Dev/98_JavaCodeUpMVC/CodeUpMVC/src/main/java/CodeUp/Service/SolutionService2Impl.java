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
public class SolutionService2Impl implements SolutionService {
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
        System.out.println("실수를 입력해주세요.");
        float num = scanner.nextFloat();
        solution.setStrResult(String.valueOf(num));

        return solution;
    }

    @Override
    public Solution codeUp03(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 2개 빈칸을 두고 입력해주세요.");
        String line = scanner.nextLine();
        String[] str = line.split(" ");
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
        String[] str = line.split(" ");
        String num1 = str[0];
        String num2 = str[1];
        solution.setStrResult(num2 + ", " + num1);

        return solution;
    }

    @Override
    public Solution codeUp05(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("실수를 입력해주세요.");
        float num = scanner.nextFloat();
        float num2 = (float) (Math.round(num * 100) / 100.0);
        solution.setStrResult(String.valueOf(num2));

        return solution;
    }

    @Override
    public Solution codeUp06(Solution solution) {
        solution.setStrResult("No Answer");

        return solution;
    }

    @Override
    public Solution codeUp07(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력해주세요.");
        int num = scanner.nextInt();
        solution.setStrResult(num + " " + num + " " + num);

        return solution;
    }

    @Override
    public Solution codeUp08(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력해주세요.(01 23)");
        String line = scanner.nextLine();
        String[] str = line.split(" ");
        String num1 = str[0];
        String num2 = str[1];
        solution.setStrResult(num1 + " : " + num2);

        return solution;
    }

    @Override
    public Solution codeUp09(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력해주세요.(yyyy.mm.dd)");
        String line = scanner.nextLine();
        String[] str = line.split("\\.");
        String num1 = str[0];
        String num2 = str[1];
        String num3 = str[2];
        solution.setStrResult(num1 + "-" + num2 + "-" + num3);

        return solution;
    }

    @Override
    public Solution codeUp10(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력해주세요.(123456-1234567)");
        String line = scanner.nextLine();
        String[] str = line.split("-");
        String num1 = str[0];
        String num2 = str[1];
        solution.setStrResult(num1 + "" + num2);

        return solution;
    }
}
