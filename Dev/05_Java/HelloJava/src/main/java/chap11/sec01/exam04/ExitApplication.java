package chap11.sec01.exam04;

/**
 * packageName : chap11.sec01.exam04
 * fileName : ExitApplication
 * author : ryujonghak
 * date : 2022/10/05
 * description : System 메서드
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         ryujonghak          최초 생성
 */
public class ExitApplication {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i == 5) {
//                break; // 반복문 중단
                System.exit(0); // 프로그램 강제종료
            }
        }
    }
}
