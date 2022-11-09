package chap06.sec04.exam02;

/**
 * packageName : chap06.sec04.exam02
 * fileName : ComputerApplication
 * author : ryujonghak
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         ryujonghak          최초 생성
 */
public class ComputerApplication {
    public static void main(String[] args) {
        Computer computer = new Computer();

        int[] value = {1, 2, 3};
        int sum = computer.sum(value);

        System.out.println(sum);

        int mul = computer.mul(value);

        System.out.println(mul);
    }
}
