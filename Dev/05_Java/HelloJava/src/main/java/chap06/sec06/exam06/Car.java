package chap06.sec06.exam06;

/**
 * packageName : chap06.sec06.exam06
 * fileName : Car
 * author : ryujonghak
 * date : 2022/09/29
 * description : 접근 제한자(제어자), setter, getter
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         ryujonghak          최초 생성
 */
public class Car {
    // public: 공용, 모든 클래스에서 사용 가능,
    // private: 다른 클래스에서는 사용이 불가능함.
    private int speed;
    private boolean stop;

//    속성은 다른객체에서 사용하지 못하게 막고 함수를 다른객체에서 사용할수 있도록 허용하여 get/set을 이용하여 조작하도록 허용.
//    get/set ter 명명법: get/set 속성명으로 명명함.
    //    getter(함수): 속성의 값(정보)을 확인할 때 사용.
    //    setter(함수):  속성의 값을 수정하고 싶을 때 사용.


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        } else {
            this.speed = 0;
        }
    }
}