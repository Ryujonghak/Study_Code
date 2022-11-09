package chapter06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * packageName : chapter06
 * fileName : main
 * author : juhee
 * date : 2022-11-07
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-11-07         juhee          최초 생성
 */
public class PhyscData {

    // 신체검사 데이터
    String name;
    int height;
    double vision;

    // 생성자
    PhyscData(String name, int height, double vision) {
        this.name = name;
        this.height = height;
        this.vision = vision;
    }

    // 신체검사 데이터를 문자열로 반환
    public String toString() {
        return name + " " + height + " " + vision;
    }

    // 키의 오름차순용 comparator
    static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

    private static class HeightOrderComparator implements Comparator<PhyscData> {
        public int compare(PhyscData d1, PhyscData d2) {
                                                                // 오름차순 정렬!
            return (d1.height > d2.height) ? 1 :                // if else 가 아니고 if else if else 구조
                    (d1.height < d2.height) ? -1 : 0;           // 1: 배열 인덱스 +1 , -1: 배열 인덱스 -1(감소, 앞위치로), 0은 이동없음

//            return (if_조건식) ? true일떄출력할값 : (else-if_ 조건식) ? true일때출력할값 : (else)false일때출력할값 ;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        PhyscData[] x = {
                new PhyscData("강민하", 162, 0.3),     // 배열 데이터 타입 = PhyscData. PhyscData만 들어오도록 하기 위해
                new PhyscData("김찬우", 173, 0.7),     // 클래스 이름과 맞춰야 함
                new PhyscData("박준서", 175, 2.0),
                new PhyscData("유서범", 171, 1.5),
                new PhyscData("이수연", 168, 0.4),
                new PhyscData("장경오", 174, 1.2),
                new PhyscData("황지안", 169, 0.8),
        };

        Arrays.sort(x,
                PhyscData.HEIGHT_ORDER);

        System.out.println("* 신체검사 리스트 *");
        System.out.println("이름   키    시력");
        System.out.println("----------------");

        for (int i = 0; i < x.length; i++) {
            System.out.printf("%-8s%3d%5.1f\n",
                    x[i].name, x[i].height, x[i].vision);
        }
    }
}
