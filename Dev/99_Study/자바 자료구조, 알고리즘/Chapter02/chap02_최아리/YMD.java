package chap02;

import java.util.Calendar;

/**
 * packageName : chap02
 * fileName : YMD
 * author : 최아리
 * date : 2022-10-18
 * description : 연습문제 Q8 (p.90)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-18         최아리          최초 생성
 */
public class YMD {
    int y; // 년
    int m; // 월(1~12)
    int d; // 일(1~31)

    //        생성자
    public YMD(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }


//    1) Calendar 이용법 -- 더 깔끔한 방법! 추천 **

    public void dateAfter(int n) { // n = 더할 일 수
        Calendar cal = Calendar.getInstance(); // 현재시간
        cal.set(y, m, d);

        System.out.println("원래 날짜 : " + y + "년" + m + "월" + d + "일");

        cal.add(Calendar.DAY_OF_MONTH , n);

        System.out.println( n + "일 뒤의 날짜 : " + cal.get(Calendar.YEAR) + "년 " + cal.get(Calendar.MONTH)
                + "월 " + cal.get(Calendar.DAY_OF_MONTH) + "일");

    }

    public void dateBefore(int n) { // n = 뺄 일 수
        Calendar cal = Calendar.getInstance(); // 현재시간
        cal.set(y, m, d);

        System.out.println("원래 날짜 : " + y + "년" + m + "월" + d + "일");

        cal.add(Calendar.DAY_OF_MONTH , -n);

        System.out.println( n + "일 앞의 날짜 : " + cal.get(Calendar.YEAR) + "년 " + cal.get(Calendar.MONTH)
                + "월 " + cal.get(Calendar.DAY_OF_MONTH) + "일");

    }

//    2) 그냥 대충 짠 코드 -- 1번을 참고해주세요,,
//    (달 수도 31로 계산하고 급하게 짜서 아마도? 많이? 엉망입니다. 언젠가 다시 고칠 예정)
//        함수 : n일 뒤의 날짜를 반환
    public String after(int n) {
        String result1;

        if (d + n > 31) {
            if (m != 12) {
                result1 = y + "년" + (m + 1) + "월" + (d + n - 31) + "일";
            } else {
                m = 1;
                result1 = (y + 1) + "년" + m + "월" + (d + n - 31) + "일";
            }
        } else {
            result1 = y + "년" + m + "월" + (d + n) + "일";
        }
        return result1;
    }

    public String before(int n) {
        String result2;

        if ((d - n) < 0) {
            if (m == 1) {
                m = 12;
                result2 = (y - 1) + "년" + m + "월" + (31 + d - n) + "일";
            } else {
                result2 = y + "년" + (m - 1) + "월" + (31 + d - n) + "일";
            }
        } else {
            result2 = y + "년" + m + "월" + (d - n) + "일";
        }
        return result2;
    }


    public static void main(String[] args) {
        YMD ymd = new YMD(1994, 10,2);



        System.out.println(ymd.after(10));
        System.out.println(ymd.before(10));

        System.out.println();

        ymd.dateAfter(10);
        ymd.dateBefore(10);

    }

}
