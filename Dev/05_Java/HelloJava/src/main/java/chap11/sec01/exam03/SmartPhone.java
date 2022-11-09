package chap11.sec01.exam03;

/**
 * packageName : chap11.sec01.exam03
 * fileName : SmartPhone
 * author : ryujonghak
 * date : 2022/10/04
 * description : 객체의 정보 출력하기. To String() 함수 재정의
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class SmartPhone {
    private String company;
    private String os;

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }
//    toString() 재정의
    @Override
    public String toString() {
        return this.company + ", " + this.os;
    }
}
