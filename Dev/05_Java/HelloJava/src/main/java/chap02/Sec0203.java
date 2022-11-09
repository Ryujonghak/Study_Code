package chap02;
/**
 * packageName : chap04
 * fileName : Sec0401
 * author : ryujonghak
 * date : 2022/09/23
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/23         ryujonghak          최초 생성
 */
public class Sec0203 {

    public void exam01() {
//        자동 형변환 형태
//        int형에  byte형을 밀어 넣으면 사이즈가 int가 byte보다 크기 때문에 가능하다.
        byte bytevalue = 10;
        int intvalue = bytevalue;

        System.out.println("bytevlaue : " + bytevalue);
        System.out.println("intvlaue : " + intvalue);

//       char 1byte 이기 떄문에 아스키코드 또는 유니코드로 변환되어 int형에 담기 가능.
        char charvalue = '가';
        intvalue = charvalue;
        System.out.println("아스키코드 또는 유니코드 : " + intvalue);

//       long에 int형 변환 가능(int -> long).

//        정수를 실수형으로 변환가능
        long longvalue = 100;
        float floatvalue = longvalue;
        System.out.println("floatvalue : " + floatvalue);
    }

    public void exam02() {
//        int -> char
        int intValue = 44032;
        char charValue = (char) intValue; //캐스팅연산자(형변환)
        System.out.println("CharValue : " + charValue);

//        long -> int
        long longValue = 100;
        intValue = (int) longValue; //캐스팅연산자(형변환)
        System.out.println("intValue : " + intValue);

//        double -> int
        double doubleValue = 3.14;
        intValue = (int) doubleValue;
        System.out.println("intValue : " + intValue);
    }

    public void exam03() {
//        내부적으로 byte + byte = int가 됩니다.
        byte result1 = 10 + 20;

        System.out.println(result1);

//        정수 자료형 모두 사용하기
        byte byteValue = 10;
        int intValue = 100;
        long longValue = 1000;
        long result = byteValue + intValue + longValue;
//        제일 큰 자료형으로 선언해서 사용해야함.
        System.out.println(result);
    }

    public void exam04() {
//        숫자문자열 -> 숫자 변환시키는 함수
        int value1 = Integer.parseInt("103");
        double value2 = Double.parseDouble("103.123");
        boolean value3 = Boolean.parseBoolean("true");
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);

//        숫자 -> 숫자문자열로 변환시키는 함수
        String value4 = String.valueOf(value1);
        String value5 = String.valueOf(value2);
        String value6 = String.valueOf(value3);
        System.out.println(value4);
        System.out.println(value5);
        System.out.println(value6);
    }
}
