package chap11.sec01.exam12;

/**
 * packageName : chap11.sec01.exam12
 * fileName : StringCharAtApplication
 * author : ryujonghak
 * date : 2022/10/05
 * description : StringCharAt
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         ryujonghak          최초 생성
 */
public class StringCharAtApplication {
    public static void main(String[] args) {
        String ssn = "010624-1230123";
        char gender = ssn.charAt(7); // charAt(인덱스번호) 문자열의 해당 인덱스 번호의 내용을 가져온다.

        switch (gender) {
            case '1':
            case '3':
                System.out.println("남자입니다.");
                break;
            case '2':
            case '4':
                System.out.println("여자입니다.");
                break;
        }
    }
}
