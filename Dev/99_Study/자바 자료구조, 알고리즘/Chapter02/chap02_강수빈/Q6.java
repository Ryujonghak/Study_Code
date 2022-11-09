package chap02;

/**
 * packageName : chap02
 * fileName : Q6
 * author : gangsubin
 * date : 2022/10/16
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * —————————————————————————————
 * 2022/10/16 gangsubin 최초 생성
 */
public class Q6 {

    // TODO 진짜 진짜 모르겠음.. + ===== 이런거 어떻게 넣어야하는지 모르겠어요...... 죽여주세요

    static int cardConv(int x, int r, char[] d) {

        int digits = 0; // return 이전의 자리수

        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // 변환이후 자리수

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);

        for (int i = 0; i < digits; i++) {
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;

        }
        return digits;
    }
}
