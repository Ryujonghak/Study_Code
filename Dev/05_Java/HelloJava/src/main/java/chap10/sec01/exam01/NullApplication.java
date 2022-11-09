package chap10.sec01.exam01;

/**
 * packageName : chap10.sec01.exam01
 * fileName : NullApplication
 * author : ryujonghak
 * date : 2022/10/04
 * description : null pointer exception
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class NullApplication {
    public static void main(String[] args) throws NullPointerException{
        String data = "";
//        변수 값이 null 이면 속석이나 함수를 부를 수 없음.
        System.out.println(data.toString()); // 에러발생
    }
}
