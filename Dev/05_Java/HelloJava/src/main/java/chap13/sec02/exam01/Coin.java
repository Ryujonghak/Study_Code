package chap13.sec02.exam01;

/**
 * packageName : chap13.sec02.exam01
 * fileName : Coin
 * author : ryujonghak
 * date : 2022/10/06
 * description : 스택(자료구조)
 * 요약 : 스택 특징 : LIFO(Last IN First Out) 나중에 들어온 자료가 먼저 나가는 구조
 *       주요함수 : .push() 스택에 객체 넣기, .pop() 스택에 객체 뺴기, .peek() 스택 제일 위 데이터 조회
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         ryujonghak          최초 생성
 */

// 모델: 데이터 저장 또는 조회 용도로 사용하는 클래스, 속성과 생성자, Getter, Setter만 있어야 함.
public class Coin { // 모델
    private int value;

    public Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
