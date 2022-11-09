package chap11.sec01.exam18;

/**
 * packageName : chap11.sec01.exam18
 * fileName : TrimApplication
 * author : ryujonghak
 * date : 2022/10/05
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         ryujonghak          최초 생성
 */
public class TrimApplication {
    public static void main(String[] args) {
//        trim() : 앞/뒤 공백 제거, 문자열 중간에 공백은 제거안됨(ex: "12 34")
        String tel = "  02";
        String tel2 = "123   ";
        String tel3 = "   1234   ";

        String telsum = tel.trim() + tel2.trim() + tel3.trim();
        System.out.println(telsum);
    }

}
