package chap02;

import java.util.Calendar;

/**
 * packageName : chap02
 * fileName : YMD
 * author : 김철원
 * date : 2022-10-18
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-18         김철원          최초 생성
 */
// Q8. 오른쪽 처럼 년월일을 필드로 갖는 클래스를 만드세요.
//     다음과 같이 생성자(constructor) 와 메서드를 정의해야 합니다.
public class YMD_Q8 {
    int y;  // 년
    int m;  // 월 (1~12) 이중에 들어감
    int d;  // 일 (1~31) 이중에 들어감
//    1) 생성자(주어진 날짜로 선정)
//    YMD(int y, int m, int d)
    public YMD_Q8(int y, int m, int d) {
        this.y = y;                          // 매개변수로 받아서 위의 값에 넘겨줌
        this.m = m;                          // 매개변수로 받아서 위의 값에 넘겨줌
        this.d = d;                          // 매개변수로 받아서 위의 값에 넘겨줌
    }

//    n일 뒤의 날짜를 반환
//    YMD after(int n)
    public void YMDafter(int n) {
        Calendar cal = Calendar.getInstance();          // 현재날짜 가져오기

        cal.set(y,m,d);                                  // 주어진 날짜 가져오기 == 바꿔치기
        System.out.print(cal.get(Calendar.YEAR)+"년 "    // 주어진 날짜 출력하기
                + (cal.get(Calendar.MONTH)) + "월 "
                + cal.get(Calendar.DATE) + "일");

        System.out.println(" + "+ n +"일 뒤의 날짜는?");

        cal.add(Calendar.DATE, +n);                      // 날짜 더하기 함수

        System.out.println(cal.get(Calendar.YEAR)+"년 "  // 더한 날짜 출력
                + (cal.get(Calendar.MONTH)) + "월 "
                + cal.get(Calendar.DATE) + "일");
    }

//    n일 앞의 날짜를 반환
//    YMD before(int n)
    public void YMDbefore(int n) {
        Calendar cal = Calendar.getInstance();       // 현재시간 가져오기

        cal.set(y,m,d);                               // 주어진 날짜 가져오기
        System.out.print(cal.get(Calendar.YEAR)+"년 "  // 주어진 날짜 출력
                + (cal.get(Calendar.MONTH)) + "월 "
                + cal.get(Calendar.DATE) + "일");
        System.out.println(" - "+n+"일 앞의 날짜는?");

        cal.add(Calendar.DATE, -n);                  // 날짜를 빼는 함수

        System.out.println(cal.get(Calendar.YEAR)+"년 "  // 뺀 날짜 출력
                + (cal.get(Calendar.MONTH)) + "월 "
                + cal.get(Calendar.DATE) + "일");
    }




    public static void main(String[] args) {
        YMD_Q8 YMD = new YMD_Q8(2022,  10, 18);
        YMD.YMDafter(20); // 위의 입력된 매개변수의 값을 기준으로 + 일
        YMD.YMDbefore(20); // 위의 입력된 매개변수의 값을 기준으로 - 일







    }
}
