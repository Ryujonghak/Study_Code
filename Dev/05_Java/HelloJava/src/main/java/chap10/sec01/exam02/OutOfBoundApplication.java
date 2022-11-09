package chap10.sec01.exam02;

/**
 * packageName : chap10.sec01.exam02
 * fileName : OuterBoundApplication
 * author : ryujonghak
 * date : 2022/10/04
 * description : ArrayIndexOutOfBoundsException
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class OutOfBoundApplication {
    public static void main(String[] args) {

        String data1 = args[0];
        String data2 = args[1];

        System.out.println("args[0]: " + data1);
        System.out.println("args[1]: " + data2);
    }
}
