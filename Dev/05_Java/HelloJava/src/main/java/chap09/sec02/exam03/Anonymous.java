package chap09.sec02.exam03;

/**
 * packageName : chap09.sec02.exam03
 * fileName : Anonymous
 * author : ryujonghak
 * date : 2022/10/04
 * description : 익명 객체의 지역변수 사용
 * 요약 :
 *      익명 자식 객체 : 자식 클래스가 재사용되지않고, 특정 위치에서 1번만 사용될 경우
 *          자식 클래스를 만들지 않고 익명 객체를 사용하는 것이 더 좋음
 *          익명 객체 생성자는 만들지 않음
 *          사용법 : 부모클래스 객체변수 = new 부모클래스(매개변수...){
 *                                      // 속성
 *                                      // 함수
 *                                   }
 *      익명 구현(자식) 객체 : 구현(자식) 클래스가  재사용되지않고, 특정 위치에서 1번만 사용될 경우
 *             구현(자식) 클래스를 만들지 않고 익명 객체를 사용하는 것이 더 좋음
 *          사용법 : 인터페이스 인터페이스변수 = new 인터페이스() {
 *                                          // 재정의 함수
 *                                          // 속성
 *                                        }
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class Anonymous {
    private int field;

    //    일반함수내에서 지역변수로 익명객체 사용
    public void method(int arg1, int arg2) {
        int val1 = 0;
        int val2 = 0;

        field = 10; // 속성

//        지역변수 = new 부모인터페이스() { 익명객체 }
//        ! 익명객체 사용시 지역변수는 모두 상수(final)로 판단하기 때문에 값을 변경할 수 없음.
        Calculator calculator = new Calculator() {
            @Override
            public int sum() {
                int result = field + arg1 + arg2 + val1 + val2;
                return result;
            }
        };
        System.out.println(calculator.sum()); // 익명객체의 함수 사용
    }
}
