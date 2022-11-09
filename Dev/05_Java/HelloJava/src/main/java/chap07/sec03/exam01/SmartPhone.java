package chap07.sec03.exam01;

/**
 * packageName : chap07.sec03.exam01
 * fileName : SmartPhone
 * author : ryujonghak
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         ryujonghak          최초 생성
 */
public class SmartPhone extends Phone {
    public SmartPhone(String owner) {
        super(owner);
    }

//    인터넷 검색 함수
    public void internetSearch() {
        System.out.println("Internet Search");
    }
}
