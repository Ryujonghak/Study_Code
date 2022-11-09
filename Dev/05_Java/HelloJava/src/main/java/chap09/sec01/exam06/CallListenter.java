package chap09.sec01.exam06;

/**
 * packageName : chap09.sec01.exam06
 * fileName : CallListenter
 * author : ryujonghak
 * date : 2022/10/04
 * description : Button 내에 공유 중ㅊ버 인터페이스 구현 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class CallListenter implements Button.OnClickListener {
    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }
}
