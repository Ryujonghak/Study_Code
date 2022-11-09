package chap02;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * packageName : chap02
 * fileName : Q8
 * author : gangsubin
 * date : 2022/10/16
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/16         gangsubin          최초 생성
 */
public class YMD {

    //TODO 진짜 모르겠어요.. 살려주세요

    public static void main(String[] args) {
        // Scanner 클래스 인스턴스 생성
        Scanner sc = new Scanner(System.in);
        String[] week = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};

        // Calendar 클래스 인스턴스 생성
        Calendar cal = Calendar.getInstance(); //오늘날짜 가져오기

        int y,m,d,w;				//-- 연, 월, 일, 요일
        int num;					//-- 사용자로부터 입력받은 날 수

        y = cal.get(Calendar.YEAR);
        m = cal.get(Calendar.MONTH)+1;
        d = cal.get(Calendar.DATE);
        w = cal.get(Calendar.DAY_OF_WEEK);

        // 현재 연, 월, 일, 요일 확인(가져오기 : get())
        System.out.printf("오늘 날짜 : %d-%d-%d %s\n",y,m,d,week[w-1]);

        System.out.print("after : ");
        num = sc.nextInt();

        cal.add(Calendar.DATE,num);
        //cal.set(Calendar.DATE,cal.get(Calendar.DATE)+num);
        //y = cal.get(Calendar.YEAR);
        //m = cal.get(Calendar.MONTH)+1;
        //d = cal.get(Calendar.DATE);
        //w = cal.get(Calendar.DAY_OF_WEEK);

        System.out.println("\n========[확인결과]========");
        //System.out.printf("%d일 후 : %d-%d-%d %s\n",num,y,m,d,week[w-1]);
        System.out.printf("%d일 후 : %tF %tA \n",num,cal,cal);
        System.out.println("============================");
    }
}
