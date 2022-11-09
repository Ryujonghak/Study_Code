package chap08.sec02.exam03;

/**
 * packageName : chap08.sec02.exam03
 * fileName : Bus
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("Bus is running");
    }

    public void checkFare(){
        System.out.println("Bus is checking...");
    }
}
