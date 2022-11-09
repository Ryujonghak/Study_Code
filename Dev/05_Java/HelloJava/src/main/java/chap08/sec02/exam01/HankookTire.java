package chap08.sec02.exam01;

/**
 * packageName : chap08.sec02.exam01
 * fileName : HankookTire
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class HankookTire implements Tire{
    @Override
    public void roll() {
        System.out.println("한국타이어가 굴러갑니다.");
    }
}
