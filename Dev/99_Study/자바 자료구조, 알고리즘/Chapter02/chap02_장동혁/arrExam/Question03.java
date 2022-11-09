package StudyGroup.chap02.arrExam;

/**
 * packageName : StudyGroup.chap02
 * fileName : Question2_7
 * author : hyuk
 * date : 2022/10/16
 * description : Question2_7 p.75
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/16         hyuk          최초 생성
 */

//  ⭐️ 1000 이하의 소수 나열하기 ⭐️
public class Question03 {
    public static void main(String[] args) {
        int count =0; // 나눗셈 횟수세는 변수
        for (int i = 0; i <= 1000; i++) { // 0부터 1000이하까지 1씩 증가하면서 반복
            int j;
            for (j = 2; j < i; j++) {
                count++;
                if (i % j == 0) // 나누어떨어지면 소수❌
                    break; // 반복중지
            }
            if (i == j) // 마지막까지 나누어 떨어지지 않음
                System.out.println(i); // 출력
        }
        System.out.println("나눈셈을 수행한 횟수 : " + count);
    }
}
