package chap06.sec03.exam02;

/**
 * packageName : chap06.sec03.exam02
 * fileName : KoreanApplication
 * author : ryujonghak
 * date : 2022/09/27
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/27         ryujonghak          최초 생성
 */
public class KoreanApplication {
    public static void main(String[] args) {
//        한국인 객체를 생성
//        매개변수 2개짜리 생성자를 이용해서 속성을 초기화 하세요.
//        초기화한 결과를 출력하세요.

        Korean k1 = new Korean("박자바", "011225-1234567");
        Korean k2 = new Korean("김자바", "930525-0654321");

        System.out.println("이름: "+ k1.name+", 주민번호: "+ k1.ssn);
        System.out.println("이름: "+ k2.name+", 주민번호: "+ k2.ssn);

    }
}
