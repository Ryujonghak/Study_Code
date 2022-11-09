package chap05;

/**
 * packageName : chap5
 * fileName : Sec0501
 * author : ryujonghak
 * date : 2022/09/26
 * description : 참조 자료(타입)형(배열, 객체)
 * 요약:
 * 기본자료형: byte, short, int, long, float, double, boolean
 * - 스택 메모리에 값이 바로 저장.
 * 참조자료형: 객체, 배열, 열거형(enum)
 * - 스택 메모리주소에서는 힙 메모리주소가 저장 값은 힙 메모미에 저장.
 * JVM 메모리 구조: 메소드, 스택, 힙의 구조를 가진다.
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/26         ryujonghak          최초 생성
 */
public class Sec0501 {
//    속성 생략(멤버 변수)

    //    함수(멤버 메소드)
    public void stringEqualExample() {


//        메모리에 어떻게 저장이 될까요?
//        어느 메모리 공간에 저장이 될까요?
//        코딩언어 : 프로그램을 개발 -> 메모리에 로딩(적재) 실행
//        파일 관리 : 01_HTML 폴더 : html 들어감
//                   02_Vue 폴더 : Vue 관련 파일이 들어감
//                   03_Java 폴더 : Java 파일 들어감
//        A, B, C 세분화해서 위에 처럼 각각 용도에 맞게 관리가 됨
//      메모리(호텔) :  스택방(기본자료형, 지역변수/매개변수),
//                    메소드방(프로그램 코드,클래스 코드들, 전역변수(정적변수), 함수) : 공유방
//                    힙방(참조자료형, 객체, 배열)
        //        4가지 : int, double, boolean (기본 타입(자료형))
//        int age = 25;
//        double price = 100.5;
//        스택 방(LIFO: 마지막에 들어간 변수가 먼저 나옴)
//        주소  : 변수명 | 값
//        2번방 : price | 100.5
//        1번방 : age   | 25

//        참조자료형(객체) 살펴보기 -> 힙방
//        자바에서 String 객체 에서 strVal1 , strVal2 의 값이 같으면 무조건 방번호를 일치
        String strVal1 = "String"; // 10번 저장
        String strVal2 = "String"; // 10번 저장
//        String strVal3 = "신민철"; // 10번 저장
//        String strVal4 = "신민철"; // 10번 저장

//        참조 자료형의 메모리 관리
//        스택 방                                      힙방
//        주소  : 변수명   | 값                   주소 : 값
//       1번방  : strVal1 | 10번 힙방 <--------  10번 : "신"
//                                             11번 : "민"
//                                             12번 : "철"
//       2번방  : strVal2 | 10번 힙방 <--------

//        == : 1) 참조 자료형일 경우(객체, 배열) 두 변수의 주소값(방번호)을 비교
//             2) 기본 자료형이면 두 변수의 값을 비교
        if (strVal1 == strVal2) {
            System.out.println("strVal1 == strVal2 입니다.");
        } else {
            System.out.println("strVal1 != strVal2 입니다.");
        }

//        .equals() : 문자열 값을 비교하는 함수
        if (strVal1.equals(strVal2)) {
            System.out.println("strVal1와 strVal2 문자열이 같음");
        } else {
            System.out.println("strVal1와 strVal2 문자열이 다름");
        }

//        이번에는 String 객체 생성(new 이용) -> 일반 힙 메모리공간에 생성.
//        String 객체: =를 이용하여 만들면 힙방(String을 위한 전용공간: String Constant Pool)에 생성.
        String strVal3 = new String("신민철");
        String strVal4 = new String("신민철");

        //        =가 아닌 new 연산자를 통해 생성했으므로 메모리주소가 다름.
        if (strVal3 == strVal4) {
            System.out.println("strVal3 == strVal4 입니다.");
        } else {
            System.out.println("strVal3 != strVal4 입니다.");
        }

        //        .equals() : 문자열 값을 비교하는 함수
        if (strVal3.equals(strVal4)) {
            System.out.println("strVal3와 strVal4 문자열이 같음");
        } else {
            System.out.println("strVal3와 strVal4 문자열이 다름");
        }

//        자바언어의 문제점: NULL 포인트 예외(에러) 시도 때도 없이 나옴.
//        파이썬 -> Null을 넣어도 에러가 나지 않게 막아줌.

//        1)  null 값을 가진 배열 또는 객체에 값을 집어 넣으려 하는 경우.
//        int intArray[] = null;
//        intArray[0] =10; //null 포인트 에러 발생.

//        2) null 값에 함수를 실행했을 경우.
//        String str = null;
//        System.out.println("총 문자수: " + str.length());

//        gc(쓰레기 수집기): 일정 시점에 메모리에서 자동으로 제거함.(연결이 끊긴 데이터들), gc가 동작중에는 성능저하가 발생함.
    }
}
