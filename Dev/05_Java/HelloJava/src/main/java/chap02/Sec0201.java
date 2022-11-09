package chap02;

public class Sec0201 {

    //   속성(멤버변수)
//   함수(멤버 메소드)
//    public: 접근자(접근제어자)
//    void: 반환값이 없음(return 값이 없음.)
//    접근자 void(반환값의 자료형) 함수명(){}
    public void exam01() {
        int value = 20;
        int result = value + 20;

        System.out.println("Sec0201.exam1(): 결과는: " + result);
    }

    public void exam02() {
        int hour = 3;
        int minute = 5;

        System.out.println("Sec0201.exam2(): 시간은 " + hour + ":" + minute);
        System.out.println("Sec0201.exam2(): 시간은 총 " + (hour * 60 + minute) + "분");

    }

    public void exam03(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Sec0201.exam3(): x는 :" + x + " y는 :" + y);
    }

    public void exam04(int x) {
        if (x > 10) {
            System.out.println(x + "은 10보다 큰값입니다.");
        } else {
            System.out.println(x + "은 10보다 작은값입니다.");
        }
    }
}
