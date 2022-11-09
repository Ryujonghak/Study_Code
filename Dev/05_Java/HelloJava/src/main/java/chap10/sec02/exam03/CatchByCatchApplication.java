package chap10.sec02.exam03;

/**
 * packageName : chap10.sec02.exam03
 * fileName : CatchByCatchApplication
 * author : ryujonghak
 * date : 2022/10/04
 * description : Catch가 2개 이상 있는 예외처리
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class CatchByCatchApplication {
    public static void main(String[] args) {
        try {
            String data1 = args[0];
            String data2 = args[1];

            System.out.println(data1 + " " + data2);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getClass());
        } catch (Exception e) {
            System.out.println(e.getClass());
        } finally {
            System.out.println("다시 실행하세요.");
        }
    }
}
