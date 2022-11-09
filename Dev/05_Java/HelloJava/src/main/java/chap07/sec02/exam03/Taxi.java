package chap07.sec02.exam03;

/**
 * packageName : chap07.sec02.exam03
 * fileName : Taxi
 * author : ryujonghak
 * date : 2022/09/29
 * description : 하위클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         ryujonghak          최초 생성
 */
public class Taxi extends Vehicle{
    @Override
    public void run() {
        System.out.println("Taxi is running");
    }
}
