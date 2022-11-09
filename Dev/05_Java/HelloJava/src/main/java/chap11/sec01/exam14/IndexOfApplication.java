package chap11.sec01.exam14;

/**
 * packageName : chap11.sec01.exam14
 * fileName : IndexOfApplication
 * author : ryujonghak
 * date : 2022/10/05
 * description : String - indexof
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         ryujonghak          최초 생성
 */
public class IndexOfApplication {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";
        int location = subject.indexOf("프로그래밍"); // indexOf("문자열") 매개변수로 받는 문자열이 시작되는 인덱스 값을 리턴
        System.out.println(location);

        if(subject.indexOf("자바") != -1) {
            System.out.println("자바가 포함");
        } else {
            System.out.println("자바가 불포함");
        }
    }
}
