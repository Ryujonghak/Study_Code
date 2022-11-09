package chap06.sec04.exam03;

/**
 * packageName : chap06.sec04.exam03
 * fileName : Car
 * author : ryujonghak
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         ryujonghak          최초 생성
 */
public class Car {
    //    gas를 체크해서 차가 출발을 합니다.
//    Gas가 있으면 "출발합니다."를 출력 및 .run() gas--실행, 없으면
    int gas;

    //    gas의 속성을 저장하는 함수
    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
//        조건문 gas == 0이면
        if (gas == 0) {
            System.out.println("Gas가 없습니다.");
            return false;
        } else {
            System.out.println("Gas가 있습니다.");
            return true;
        }
    }

    void run() {
        boolean success = true;
        while (success) {
            if (gas > 0) {
                System.out.println("차가 달립니다. Gas 잔량: " + gas);
                --gas;
            } else {
                System.out.println("차가 멈춥니다.");
                success = false; // 또는 return, break를 사용가능.
            }
        }
    }
}
