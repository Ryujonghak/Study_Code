package chap12.sec01.exam01;

import java.awt.*;

/**
 * packageName : chap12.sec01.exam01
 * fileName : BeepTask
 * author : ryujonghak
 * date : 2022/10/06
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         ryujonghak          최초 생성
 */
public class BeepTask implements Runnable {
    //    작업쓰레드 실행 함수
    public void run() {
//        Beep음을 들려주는 코드
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500); // 0.5초 지연
            } catch (Exception e) {

            }
        }
    }

    public static void main(String[] args) {
        Runnable task = new BeepTask(); // 작업쓰레드
//        다형성: Runnable 인터페이스 변수 = new 구현클래스();
        Thread thread = new Thread(task); // 매개변수로 작업쓰레드를 넘김.
        thread.start(); // 매개변수로 받은 task.run()이 실행됨.

//        Main 쓰레드 실행
        for (int i = 0; i < 10; i++) {
            System.out.println("Beep");
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
