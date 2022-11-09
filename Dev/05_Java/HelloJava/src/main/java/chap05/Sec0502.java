package chap05;

/**
 * packageName : chap5
 * fileName : Sec0502
 * author : ryujonghak
 * date : 2022/09/26
 * description : 배열(참조 자료형)
 * 요약 :
 * 배열은 초기에 크기가 정해지면 추가로 값을 넣을 수 없음.
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/26         ryujonghak          최초 생성
 */
public class Sec0502 {
    //    예제 학생의 성적을 저장하여 총합과 평균을 출력하는 프로그램을 작성해 봅시다.
    public void getStudent() { // 배열 정의 및 생성 방법 1
//        주의점: =(괄호)로 배열 생성시 선언과 동시에 값을 넣어야함.
        int[] score = {83, 90, 87, 88, 89, 90, 91, 92, 93, 75}; // 배열선언
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i]; // 총합
        }
        int avg = sum / score.length; // 평균
        System.out.println("총합: " + sum + ",\n평균: " + avg); // 출력
    }

    public void ArrayCreateByValueList() { // 배열 정의 및 생성 방법 2
//        1) 1라인 생성 방법
//        int[] score = new int[] {83, 90, 87}; // NEW 연산자로 배열(객체) 생성 가능.

//        2) 여러 라인 생성 방법
        int[] score;
        score = new int[]{83, 90, 87}; // NEW 연산자로 배열(객체) 생성 가능.

//        기본성적 출력하기
        int i = 0;
        int sum = 0;
        while (i < score.length) {
            System.out.println("현재 가지고 있는 성적: " + score[i] + " ,배열번호: " + i);
            sum += score[i];
            i++;
        }
        double avg = (double) sum / score.length; // 평균
        System.out.println("총합: " + sum + ",\n평균: " + avg); // 출력
    }

    public void ArrayCreateByNew() { // 배열 정의 및 생성 방법 3
        int[] arr1 = new int[3]; // 배열의 크기를 지정, 초기 값을 지정하지 않으면 자료형에 해당하는 값으로 채워져있다.
//        정수(0), 실수(0.0), 문자열(null)로 들어간다.
//        1) 학생 성적 값을 넣어보기.
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        int i = 0;
        while (i < arr1.length) { // 배열 값 출력.
            System.out.println("arr1[" + i + "]: " + arr1[i]);
            i++;
        }

        System.out.println("--------------------------------------------------------");

//        연습문제: 실수(Double) 배열 arr2를 만들어서 값(0.1, 0.2, 0,3)을 저장하고 출력하시오.
        double[] arr2 = new double[]{0.1, 0.2, 0.3};
        i = 0;
        while (i < arr2.length) { // 배열 값 출력.
            System.out.println("arr2[" + i + "]: " + arr2[i]);
            i++;
        }

        System.out.println("--------------------------------------------------------");

//        연습문제: 문자열(String) 배열 arr3를 만들어서 값(1월, 2월, 3월) 저장하고 출력하시오.
        String[] arr3 = {"1월", "2월", "3월"};
        i = 0;
        while (i < arr3.length) { // 배열 값 출력.
            System.out.println("arr3[" + i + "]: " + arr3[i]);
            i++;
        }
    }

    public void ArrayCreateByValueList2() {
        int[] score;
        score = new int[]{83, 90, 87};

        int i = 0;
        int sum = ADD(score);
        while (i < score.length) {
            System.out.println("현재 가지고 있는 성적: " + score[i] + " ,배열번호: " + i);
            i++;
        }
        double avg = (double) sum / score.length; // 평균
        System.out.println("총합: " + sum + ",\n평균: " + avg); // 출력
    }

    public int ADD(int[] scores) { // 성적 배열을 매개변수로 받아 합계를 계산해서 리턴하는 함수.
        int i = 0;
        int sum = 0;
        while (i < scores.length) {
            sum += scores[i];
            i++;
        }
        return sum;
    }

    public void ArrayInArray() {
//        자바에서 2차원 배열 정의 및 생성
//        1) 2차원 배열 정의 및 생성
//        int[][] matchScores = new int[2][3]; // new 배열[행개수][열개수];
//        matchScores[행번호][열번호] = 데이터 값; // 배열 값 넣기.

//        2) 2차원 배열 정의 및 생성
        int[][] matchScores = {{1, 2, 3}, {11, 12, 13}};

//        2차원 배열 값 넣기 및 출력(2중 loop 사용)
//        for(행개수) { 바같쪽 중괄호
//            for(열개수) { 안쪽 중괄호
//
//            }
//        }

//        2차원 배열 출력(2중 loop 사용)
        for (int i = 0; i < matchScores.length; i++) {
            for (int j = 0; j < matchScores[i].length; j++) {
                System.out.println("(" + i + "," + j + "): " + matchScores[i][j]);
            }
        }
//        System.out.println(matchScores); //메모리 주소 출력.
    }

//    2차원 배열(참고): 비대칭 배열
//    1) 비대칭 배열 정의 및 생성 방법
//    int[][] engLishScores = new int[2][]; // 비대칭 배열 생성
//    engLishScores[0] = new int[0]{1, 2}; // 비대칭 배열 값 넣기
//    engLishScores[1] = new int[0]{11, 12, 13}; // 비대칭 배열 값 넣기
//    2) 비대칭 배열 정의 및 생성 방법
//    int[][] engLishScores = {{1, 2},{11, 12, 13}};

    public void ArrayCopyByForExample() { // 데이터 복사 방법: 1) 카피본 생성 복사(깊은복사, Deep Copy) 2) 메모리주소 값만 복사(얇은 복사, Swallow Copy)
//        System.arraycopy(); : 자바에서 지원하는 깊은복사용 함수.
        int[] oldIntArray = {1, 2, 3};
        int[] newIntArray = new int[5];

        System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length);
//        System.arraycopy(복사할 Src(원본) 배열, 복사 시작값, 복사된 Dest(카피본) 배열, 복사될 시작값, 복사할 배열 크기);

        int i = 0;
        while (i < newIntArray.length) {
            System.out.println(newIntArray[i]);
            i++;
        }
    }

    public void AdvancedForExample() {
        int[] scores = {95, 71, 72, 73, 80};
//        점수 총합과 평균 구하기: 향상된 for문으로
        int sum = 0;
        for (int score : scores) { // for(자료형 변수 : 배열) { 반복문 }
            sum += score;
        }
        System.out.println("점수총합: " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("점수평균: " + avg);
    }
}
