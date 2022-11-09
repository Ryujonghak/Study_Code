package chap02;

import java.io.IOException;

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
public class Sec0204 {

    public void exam01() {
//        int value = 123;
//        System.out.println(value);
////        포맷에 맞추어서 출력하는 함수: printf()
//        System.out.printf("상품의 가격: %d₩\n", value);
//        System.out.printf("상품의 가격: %6d₩\n", value);
//        System.out.printf("상품의 가격: %-6d₩\n", value);
//        System.out.printf("상품의 가격: %06d₩\n", value);

//        원의 넓이
//        double area = 3.14159 * 10 * 10;
//        System.out.printf("반지름이 %d인 원의 넓이: %10.2f\n", 10, area);

//        문자열
        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
    }

    public void exam02() throws IOException {
//        키코드 입력(정수): enter, shift, space 등 키코드
        int keyCode;

        keyCode = System.in.read();
        System.out.println("keyCode" + keyCode);
    }

    public void exam03() throws IOException {
//        키코드 입력(정수): enter, shift, space 등 키코드
        int keyCode;
        while (true) {
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);

            if (keyCode == 113) { // 소문자 q 입력시 종료.
                System.out.println("Stop");
                break;
            }
        }
    }
}
