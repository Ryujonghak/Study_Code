package chap11.sec01.exam17;

/**
 * packageName : chap11.sec01.exam17
 * fileName : SubStringApplication
 * author : ryujonghak
 * date : 2022/10/05
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         ryujonghak          최초 생성
 */
public class SubStringApplication {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0, 6); // 인덱스번호 : 0 ~ (6-1)사이의 문자 자르기
        System.out.println(firstNum);

//        사용법 : 문자열.substring(시작인덱스, [끝인덱스])
//              시작인덱스 ~ (끝인덱스-1)까지 문자열 자르기
        String secondNum = ssn.substring(7); // 매개변수 1개 넣으면 문자열 끝까지 자름
        System.out.println(secondNum);
    }

}
