package chap05;

import java.util.Calendar;

/**
 * packageName : chap5
 * fileName : Sec0503
 * author : ryujonghak
 * date : 2022/09/27
 * description : 열거형 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/27         ryujonghak          최초 생성
 */
public class Sec0503 {
    public void EnumWeek() {
        //    예제: 요일을 체크해서 일요일(Sunday)이면 "일요일은 축구를 합니다." 출력 그 외의 요일에는 "열심히 자바 공부를 합니다." 출력.
        Week today = null; // Week 열거형 클래스 (상수값)
        //    자바에서 제공하는 날짜 객체 가져오기
        Calendar calendar = Calendar.getInstance(); // 객체 생성.
//    calendar 요일은 일(1),월(2), ...., 토(7)로 숫자로 표현되어 있음.
        int week = calendar.get(Calendar.DAY_OF_WEEK); // DAY_OF_WEEK: 요일(반환 값(정수))

        switch (week) {
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;
        }

//                오늘의 요일 출력
        System.out.println("오늘 요일: " + today);

        if (today == Week.SUNDAY) {
            System.out.println("일요일에는 축구를 합니다.");
        } else {
            System.out.println("열심히 자바 공부를 합니다.");
        }

    }
}

