package chap12.sec01.exam02;

/**
 * packageName : chap12.sec01.exam02
 * fileName : BeepThreadApplication
 * author : ryujonghak
 * date : 2022/10/06
 * description : 상속받은 쓰레드 실행하기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         ryujonghak          최초 생성
 */
public class BeepThreadApplication {
    public static void main(String[] args) {
        Thread thread = new BeepThread();
        thread.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("BeepThread");
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }

        }
    }
}
