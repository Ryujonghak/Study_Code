package chap09.sec01.exam06;

/**
 * packageName : chap09.sec01.exam06
 * fileName : ButtonApplication
 * author : ryujonghak
 * date : 2022/10/04
 * description : 실행 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class ButtonApplication {
    public static void main(String[] args) {
        Button button = new Button();
//        다형성: 함수 호출 모양은 같은데 결과가 달라지는 것
        button.setOnClickListener(new CallListenter()); // 다형성
        button.touch();

        button.setOnClickListener(new MessageListenter()); // 다형성
        button.touch();
    }
}
