package chapter02.sec02;

/**
 * packageName : chapter02.sec02
 * fileName : Q8
 * author : juhee
 * date : 2022-10-17
 * description : 연습문제 Q8 (p.90)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-17         juhee          최초 생성
 */
// 년월일을 필드로 갖는 클래스를 만드세요
public class Q8 {
    // 속성
    int year;  // 년
    int month;  // 월
    int day;  // 일

    // 1~12월 달 별 일수
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };


    // 생성자(주어진 날짜_오늘로 설정)
    // YMD(int year, int month, int day)
    public Q8(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

//    public String getTime(){
//        String today;
//
//        return year + "년" + month + "월" + day + "일";
//    }



    // n일 뒤의 날짜를 반환
    // YMD after(int n)




    // n일 앞의 날짜를 반환
    // YMD before(int n)


}
