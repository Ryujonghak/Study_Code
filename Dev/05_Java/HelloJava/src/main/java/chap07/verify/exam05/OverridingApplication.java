package chap07.verify.exam05;

/**
 * packageName : chap07.verify.exam05
 * fileName : OverrideingApplication
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class OverridingApplication {
    public static void main(String[] args) {
        Weapon weapon = new Weapon(10);
        Cannon cannon = new Cannon(20);

        weapon.view(weapon.Fire());
        cannon.view(cannon.Fire());
    }
}
