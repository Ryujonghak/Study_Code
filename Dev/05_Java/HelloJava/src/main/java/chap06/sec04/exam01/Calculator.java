package chap06.sec04.exam01;

/**
 * packageName : chap06.sec04.exam01
 * fileName : Calculator
 * author : ryujonghak
 * date : 2022/09/28
 * description :
 * 함수 형태 :
 *        접근제어자 리턴타입 함수명(매개변수타입 매개변수명1...매개변수타입 매개변수명n){실행문}
 *       ex) public void sample(int a, String b, double c) {}
 *       접근제어자 : public(공용), default(생략, 패키지 내의 자바파일 허용) 등
 *       함수 이름 : 함수의 기능을 잘 표현한 단어로 정의
 *           (카멜표기법(낙타표기법), 첫글자소문자 , 단어와 단어 사이는 대문자 사용)
 *       매개변수 : 함수 실행 시 전달하고 싶은 데이터
 *       리턴타입 : 함수가 실행된 이후 결과값을 {} 밖으로 전달하고 싶을 때 사용
 *          return 변수; // 변수 {} 밖으로 전달됨
 *       리턴값이 없는 함수 호출 : 객체변수.함수()
 *       리턴값이 있는 함수 호출 : double result = 객체변수.함수();
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         ryujonghak          최초 생성
 */
public class Calculator { // 속성
    // 생성자
    // 함수(메소드)
//    전원 켜는 함수
//    리턴값이 없는 함수 : void
//    사용법 : 접근제어자(public(공용), default(생략, 자기 패키지에서는 사용 가능))
//        접근제어자 리턴타입(자료형) 함수명(매개변수1, ..., 매개변수n) {}
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }

    // 리턴값이 있는 함수
//    리턴타입(자료형) 함수명 : 함수앞에 리턴타입과 { return 변수명 } 변수명의 타입 일치해야함
    int plus(int x, int y) {
        int result = x + y;

        return result;
    }

    // 1) 리턴값이 있는 나누기 함수를 추가하세요
//    함수명 : double divide(int x, int y)
    double divide(double x, double y) {
        double result = x / y;
        return result;
    }

    // 2) 리턴값이 없는 전원을 끄는 함수 추가하기
//    함수명 : powerOff()
//    결과 : "전원을 끕니다." 출력
    void powerOff() {
        System.out.println("전원을 끕니다.");
    }
}
