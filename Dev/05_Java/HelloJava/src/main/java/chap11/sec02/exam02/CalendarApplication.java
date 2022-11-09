package chap11.sec02.exam02;

import java.util.Calendar;

/**
 * packageName : chap11.sec02.exam02
 * fileName : CalendarApplication
 * author : ryujonghak
 * date : 2022/10/05
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         ryujonghak          최초 생성
 */
public class CalendarApplication {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance(); // 싱글톤(디자인 패턴)

        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int week = now.get(Calendar.DAY_OF_WEEK);
        int day = now.get(Calendar.DAY_OF_MONTH);

        System.out.println("year: " + year + " month: " + month + " day: " + day);
        System.out.println("week: " + week);

        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);

        System.out.println("hour: " + hour + " minute: " + minute + " second: " + second);
    }
}
