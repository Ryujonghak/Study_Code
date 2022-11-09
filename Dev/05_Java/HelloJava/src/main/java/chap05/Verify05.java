package chap05;

/**
 * packageName : chap5
 * fileName : Verify05
 * author : ryujonghak
 * date : 2022/09/27
 * description : 종합연습문제(배열 / 열거형)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/27         ryujonghak          최초 생성
 */
public class Verify05 {
    //    4) 주어진 배열에서 최대값을 구해보세요.
    public void exam04() {
        int max = 0;
        int[] array = {1, 5, 3, 8, 2};


        for (int i : array) {
            max = Math.max(max, i);
        }
        System.out.println("결과: " + max);
    }

    //    5) 2중 for문을 이용해서 주어지 배열의 전체 항목의 합과 평균을 구해보세요.
//    결과 :
//        sum : 881
//        avg : 88.1
    public void exam05() {
        int[][] array = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}};

        int sum = 0; // 합계 변수
        double avg = 0.0; // 평균 변수
        int num = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            num += array[i].length;
        }
        avg = (double) sum / num;
        System.out.println("총합: " + sum + ", 평균: " + avg);
    }


    public void exam0302() {
        Exam0302 exam = Exam0302.FAIL_PASSWORD;

        if (exam == Exam0302.SUCCESS) {
            System.out.println("로그인 성공하였습니다.");
        } else if (exam == Exam0302.FAIL_ID) {
            System.out.println("아이디가 틀립니다.");
        } else if (exam == Exam0302.FAIL_PASSWORD) {
            System.out.println("비밀번호가 틀립니다.");
        } else {
            System.out.println("Error");
        }
    }
}
