package chap04;

/**
 * packageName : chap04
 * fileName : Sec0401
 * author : ryujonghak
 * date : 2022/09/23
 * description : 조건문
 * 요약 :
 *      if문 - if(조건식1){실행문}/else if(조건식2){실행문2}/else{실행문3}
 *      조건식1...2까지 각각 true/false인지 판단해서 실행할지 결정
 *      switch문 - switch(변수) { case 값1: 실행문1 case 값2:... default: 실행문n }
 *      변수의 값을 판단해서 변수값이 값1이면 실행문1이 실행... 모두 아니면 dafault 에 실행문 실행됨
 *      사용시 실행문 실행하고 break;로 빠져나와야 함
 *
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/23         ryujonghak          최초 생성
 * 2022/09/26         ryujonghak          수정
 */
public class Sec0401 {
    public void exam01() {
        int score = 93;

        if (score >= 90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 \'A\'입니다");
        } else if (score < 90) {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 \'B\'입니다");
        } else {
            System.out.println("잘못된 입력");
        }
//        score >= 90 이면 점수가 90보다 큽니다.
//        등급은 A입니다.

//        score < 90 이면 점수가 90보다 작습니다.
//        등급은 B입니다.
    }

    public void exam02() {

        int num = (int) (Math.random() * 6) + 1;
//        랜덤 함수: 0 <= num < 1 사이 실수를 출력해주는 함수
        if (num == 1) {
            System.out.println(num + "번 출력");
        } else if (num == 2) {
            System.out.println(num + "번 출력");
        } else if (num == 3) {
            System.out.println(num + "번 출력");
        } else if (num == 4) {
            System.out.println(num + "번 출력");
        } else if (num == 5) {
            System.out.println(num + "번 출력");
        } else if (num == 6) {
            System.out.println(num + "번 출력");
        } else if (num == 7) {
            System.out.println(num + "번 출력");
        } else {
            System.out.println("Error");
        }
    }

    public void exam06() {
        int num = (int) (Math.random() * 4) + 8;
        if (num == 8) {
            System.out.println(num + "번 출근합니다.");
        } else if (num == 9) {
            System.out.println(num + "번 회의를 합니다.");
        } else if (num == 10) {
            System.out.println(num + "번 업무를 봅니다.");
        } else {
            System.out.println("외근을나갑니다");
        }
    }

    public void exam07(char grade) {
//        입력되는 grade에 따른 출력문
        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("우수 회원입니다.");
                break;
            case 'B':
            case 'b':
                System.out.println("일반 회원입니다.");
                break;
            default:
                System.out.println("손님입니다.");
                break;
        }
    }
}
