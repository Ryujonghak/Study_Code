package chap08.sec01.exam04;



/**
 * packageName : chap08.sec01.exam04
 * fileName : Dog
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class Dog implements Soundable {
    @Override
    public String sound() {
       return "멍멍";
    }
}
