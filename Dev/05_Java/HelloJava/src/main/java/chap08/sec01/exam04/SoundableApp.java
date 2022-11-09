package chap08.sec01.exam04;

/**
 * packageName : chap08.sec01.exam04
 * fileName : SoundableApp
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class SoundableApp {
    static void printSound(Soundable soundable) {
        System.out.println(soundable.sound());
    }
    public static void main(String[] args) {


        printSound(new Cat());
        printSound(new Dog());
    }
}
