package chap04;

/**
 * packageName : chap04
 * fileName : Sec0402
 * author : ryujonghak
 * date : 2022/09/26
 * description : 반복문
 * 요약 :
 * for문 : for(초기화식; 조건식; 증감식) {반복문}
 * 조건식이 true일때만 반복문 실행됨
 * while문 :
 * 초기화식
 * while(조건식) {
 * 반복문;
 * 증감식;
 * }
 * 조건식이 true일때만 반복문 실행됨
 * do{반복문} while문 : do{반복문}while(조건식);
 * 최초 1번은 반복문이 실행되고 그다음에 조건식이 true인지 판단함
 * break : 반복문 강제 중단
 * continue : 아래 라인 실행 않하고, 증감식 또는 조건식으로 강제 이동
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/26         ryujonghak          최초 생성
 */
public class Sec0402 {
    public void exam01() {
//        1 ~ 100까지의 합을 출력하기: for문
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += i;
        }
        System.out.println("합: " + result);
    }

    //    반복문을 실수로 반복하기.
    public void exam02() {
//        실수로 반복문을 실행하는 것은 가능하나 결과에 오차가 발생할 수 있음(권고하지 않음.)
//        현대 코딩언어: 부동소수점 법을 사용(장점: 실수를 엄청 많이 사용할 수 있음. 단점: 오차 발생)
//        과거 코딩언어: 고정소수점 법을 사용(장점: 정확도가 높음. 단점: 실수를 많이 표현하지 못함.)
        for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
            System.out.println(x);
        }
    }

    //    자바언어로 구구단 출력하기
    public void exam05() {
//        2중 loop
        int i = 0;
        int j = 0;

        for (i = 1; i < 10; i++) {
            System.out.println("*** " + i + "단 ***");
            for (j = 1; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
        }
    }

    public void exam07() {
//        exam03번과 같이 하나 while()문으로 만드시오.
        int i = 1;
        int result = 0;
//        while (i != 101) {
//            result += i;
//            i++;
//        }

//        자바에서 사용하는 DO While문(먼저 반복문을 실행 후 조건을 비교하는 문법)
        do {
            result += i;
            i++;
        } while (i != 101);

        System.out.println("합: " + result);
    }

    public void exam08() {
//        랜덤 함수를 사용하여 1~6까지 임의의 정수를 뽑아 출력, 6이 나오면 break로 반복문을 중단하고 나오는 프로그램을 코딩하시오.
        int RDNum = 0;
        while (true) {
            RDNum = (int) (Math.random() * 6) + 1;
            if (RDNum == 6) {
                System.out.println("반복문을 중단합니다.");
                break;
            }
            System.out.println("RDNum: " + RDNum);
        }
    }

    //    1 ~ 10까지 사이의 수 중에서 짝수만 출력하는 코드: continue문을 사용해서 코딩하기
    public void exam09() {
        int i;
//        continue 사용시 반복문 내의 내용을 실행하지 않고 강제로 위로 올림.
        for (i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }
    }

    //    자바 8에서 새로나온 문법
//    반복문 사용하는 라벨
//    2중 loop 에서 바깥쪽 for문 'A' ~ 'Z' 반복하고,
//                 안쪽 for문  'a' ~ 'z' 반복함
//                 안쪽 for문에서 소문자 g 나오면 break; 반복문 중단하고 싶음
//                 break는 안쪽 for문 중단시키지만 바깥쪽 for문 중단시키지 않음.
//    양쪽 다 중단 시키기 위해 라벨을 붙이면 그쪽까지 중단 가능 : break 라벨명
    public void exam10() {
        Outter:
        for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower <= 'z'; lower++) {
                System.out.println(upper + "-" + lower);
                if (lower == 'g') {
                    break Outter;
                }
            }
        }
        System.out.println("프로그램 종료");
    }

}
