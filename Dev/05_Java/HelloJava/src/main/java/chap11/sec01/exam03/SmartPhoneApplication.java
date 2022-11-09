package chap11.sec01.exam03;

/**
 * packageName : chap11.sec01.exam01
 * fileName : SmartPhoneApplication
 * author : ryujonghak
 * date : 2022/10/04
 * description : 실행 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class SmartPhoneApplication {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Google","Android");
//        toString(): 객체를 문자열로 변환하는 함수.
        System.out.println(smartPhone.toString());
    }
    
}
