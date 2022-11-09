package chapter06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 클래스 생성시 주의할 점
//1) 클래스 제목 = 내부 클래스 이름이 같아야 오류 없음.
/**
 * packageName : chapter06
 * fileName : Q15
 * author : juhee
 * date : 2022-11-07
 * description : 연습문제 Q15 p.255
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-11-07         juhee          최초 생성
 */

// 실습 6-16의 배열 x를 키의 오름차순이 아니라 시력의 내림차순으로 정렬하세요
public class Q15 {

    // 신체검사 데이터
    String name;
    int height;
    double vision;

    // 생성자
    Q15(String name, int height, double vision) {
        this.name = name;
        this.height = height;
        this.vision = vision;
    }

    // 신체검사 데이터를 문자열로 반환
    public String toString() {
        return name + " " + height + " " + vision;
    }

    // 키의 오름차순용 comparator
    static final Comparator<Q15> HEIGHT_ORDER = new Q15.HeightOrderComparator();

    private static class HeightOrderComparator implements Comparator<Q15> {
        public int compare(Q15 d1, Q15 d2) {
            return Integer.compare(d2.height, d1.height);   // 내림차순.
//            return Integer.compare(d1.height, d2.height);   // 오름차순

//     return (d1.height > d2.height) ? 1 :
//            (d1.height < d2.height) ? -1 : 0;
        }
    }

    // main
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Q15[] x = {
                new Q15("강민하", 162, 0.3),
                new Q15("김찬우", 173, 0.7),
                new Q15("박준서", 175, 2.0),
                new Q15("유서범", 171, 1.5),
                new Q15("이수연", 168, 0.4),
                new Q15("장경오", 174, 1.2),
                new Q15("황지안", 169, 0.8),
        };

        Arrays.sort(x,
                Q15.HEIGHT_ORDER);

        System.out.println("* 신체검사 리스트 *");
        System.out.println("이름   키    시력");
        System.out.println("----------------");

        for (int i = 0; i < x.length; i++) {
            System.out.printf("%-8s%3d%5.1f\n",
                    x[i].name, x[i].height, x[i].vision);
        }
    }
}
