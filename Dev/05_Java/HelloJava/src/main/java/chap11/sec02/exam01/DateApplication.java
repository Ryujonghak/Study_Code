package chap11.sec02.exam01;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * packageName : chap11.sec02.exam01
 * fileName : DateApplication
 * author : ryujonghak
 * date : 2022/10/05
 * description : 날짜
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/05         ryujonghak          최초 생성
 */
public class DateApplication {
    public static void main(String[] args) {
        Date date = new Date();
        String strNow = date.toString();

        System.out.println(strNow);

//        날짜포맷 변경
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strnow2 = simpleDateFormat.format(date);

        System.out.println(strnow2);
    }
}
