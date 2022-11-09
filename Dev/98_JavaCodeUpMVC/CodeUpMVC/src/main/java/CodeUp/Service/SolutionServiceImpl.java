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
public class SolutionServiceImpl implements SolutionService {
    @Override
    public Solution codeUp01(Solution solution) {
        solution.setStrResult("Hello, world!");

        return solution;
    }

    @Override
    public Solution codeUp02(Solution solution) {
        solution.setStrResult("Hello world!");

        return solution;
    }

    @Override
    public Solution codeUp03(Solution solution) {
        solution.setStrResult("Hello\nworld!");

        return solution;
    }

    @Override
    public Solution codeUp04(Solution solution) {
        solution.setStrResult("'Hello'");

        return solution;
    }

    @Override
    public Solution codeUp05(Solution solution) {
        solution.setStrResult("\"Hello world!\"");

        return solution;
    }

    @Override
    public Solution codeUp06(Solution solution) {
        solution.setStrResult("\"!@#$%^&*()\"");

        return solution;
    }

    @Override
    public Solution codeUp07(Solution solution) {
        solution.setStrResult("\"C:\\Download\\hello.cpp\"");

        return solution;
    }

    @Override
    public Solution codeUp08(Solution solution) {
        solution.setStrResult("┌┬┐\n" +
                "├┼┤\n" +
                "└┴┘");

        return solution;
    }

    @Override
    public Solution codeUp09(Solution solution) {
        solution.setStrResult("NO Answer");

        return solution;
    }

    @Override
    public Solution codeUp10(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int line = Integer.parseInt(scanner.next());
        solution.setStrResult(String.valueOf(line));

        return solution;
    }
}
