package chap07.verify.exam05;

/**
 * packageName : chap07.verify.exam05
 * fileName : Weapon
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class Weapon {
    int fire;

    public Weapon(int fire) {
        this.fire = fire;
    }

    void view(int fire){
        System.out.println("기본무기의 살상 능력은 "+fire);
    }

    public int Fire() {
        return fire;
    }
}
