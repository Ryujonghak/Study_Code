package chap12.sec01.exam02;

import java.awt.*;

/**
 * packageName : chap12.sec01.exam02
 * fileName : BeepThread
 * author : ryujonghak
 * date : 2022/10/06
 * description : Thread 클래스 상속받아 만들기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         ryujonghak          최초 생성
 */
public class BeepThread extends Thread {
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
