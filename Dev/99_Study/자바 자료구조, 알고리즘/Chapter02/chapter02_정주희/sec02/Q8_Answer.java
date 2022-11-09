package chapter02.sec02;

/**
 * packageName : chapter02.sec02
 * fileName : YMD
 * author : juhee
 * date : 2022-10-18
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-18         juhee          최초 생성
 */
public class Q8_Answer {
    static class YMD{
        int year;
        int month;
        int day;


        static int[][] mdays = {
                {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
                {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
        };

        YMD(int year, int month, int day){
            this.year = year;
            this.month = month;
            this.day = day;
        }

        YMD after(int n){
            if(n < 0) return(before(-n));
            YMD result = new YMD(this.year, this.month, this.day);

            result.day += n;

            while(result.day > mdays[isLeap(result.year)][result.month - 1]){
                result.day -= mdays[isLeap(result.year)][result.month - 1];
                if(++result.month > 12){
                    result.year++;
                    result.month = 1;
                }
            }

            return result;
        }

        YMD before(int n){
            if(n < 0) return(after(-n));
            YMD result = new YMD(this.year, this.month, this.day);

            result.day -= n;

            while(result.day < 1){
                if(--result.month < 1){
                    result.year--;
                    result.month = 12;
                }
                result.day += mdays[isLeap(result.year)][result.month - 1];
            }

            return result;
        }
    }
}
