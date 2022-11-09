package StudyGroup.chap02.classExam;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * packageName : StudyGroup.chap02
 * fileName : exercise08
 * author : hyuk
 * date : 2022/10/16
 * description : 연습문제8
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/16         hyuk          최초 생성
 */

//      ✅ Calendar :  날짜와 시간을 다루는 클래스
//            👉 .getInstance() : 현재 날짜와 시간 정보를 가진 Calendar 객체를 생성
//            👉 .set(int year, int month, int date) : 현재 객체의 연,월,일을 다른 값으로 설정
//            👉 .getTime() : 현재 객체를 Date 객체로 변환
//            👉 .add(date, int) : date에서 int값만큼 날짜 계산
//      ✅ SimpleDateFormat : 날짜와 시간을 형식화하여 나타낼 수 있도록 하는 클래스
//            👉 .format() : 매개변수로 받은 값을 SimpleDateFormat 형식으로 변환

public class Question03 {
    public static class YMD {
        Integer year;
        Integer month;
        Integer day;

        //        생성자
        public YMD(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }

        public void getTime() {
//            ⭐️ 시간 가져오는 함수 ⭐️
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일"); // 날짜포맷 지정
            cal.set(year,month,day);
            System.out.println("지정한 날짜는 : " + sdf.format(cal.getTime())); // 지정한 날짜 출력
        }

        public void YMDafter(int n){
//        ⭐️ n일 전의 날짜 출력 함수 ⭐️
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일"); // 날짜포맷 지정

            cal.set(year,month,day);
            cal.add(Calendar.DATE, n); // n일 후의 날짜 cal 변수에 입력하기
            System.out.println(n+"일 후의 날짜는 : "+sdf.format(cal.getTime())); // n일 후의 날짜 출력


        }

        public void YMDbefore(int n){
//        ⭐️ n일 후의 날짜 출력 함수 ⭐️
            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일"); // 날짜포맷 지정

            cal.set(year,month,day);
            cal.add(Calendar.DATE, -n); // -n일 후의 날짜 cal 변수에 입력하기
            System.out.println(n+"일 전의 날짜는 : "+sdf.format(cal.getTime())); // n일 전의 날짜 출력
        }
    }


    public static void main(String[] args) {
        YMD ymd = new YMD(1995, 11, 11);
//        YMD 클래스 매개변수 넣어서 가져오기

        ymd.getTime(); // 매개변수 넣은 날짜 가져오기
        ymd.YMDafter(10); // n일 후 날짜 가져오기
        ymd.YMDbefore(10); // n일 전 날짜 가져오기
    }
}
