package chap07.verify.exam05;

/**
 * packageName : chap07.verify.exam05
 * fileName : Cannon
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class Cannon extends Weapon {
    public Cannon(int fire) {
        super(fire);
    }

    @Override
    void view(int fire) {
        System.out.println("대포의 살상 능력은 " + fire);
    }

}
