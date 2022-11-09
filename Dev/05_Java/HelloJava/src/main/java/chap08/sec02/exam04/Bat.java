package chap08.sec02.exam04;

/**
 * packageName : chap08.sec02.exam04
 * fileName : Bat
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class Bat implements Flyable{
    @Override
    public void fly() {
        System.out.println("Bat is fly!");
    }
}
