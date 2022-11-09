package StudyGroup.chap06.Question1.실습6_16;

import StudyGroup.chap03.HeightOrderComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


/**
 * packageName : StudyGroup.chap06.Question1.실습6_16
 * fileName : PhyscExamSort
 * author : hyuk
 * date : 2022/11/06
 * description : p.254 ~ 255
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/11/06         hyuk          최초 생성
 */
public class PhyscExamSort {
//    신체검사 데이터
    static class PhyscData{
        String name;
        int height;
        double vision;

    public PhyscData(String name, int height, double vision) {
        this.name = name;
        this.height = height;
        this.vision = vision;
    }

    public String toString(){
        return name+" "+height+" "+vision;
    }

    static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

    private static class HeightOrderComparator implements Comparator<PhyscData> {
        @Override
        public int compare(PhyscData d1, PhyscData d2) {
//            키의 오름차순 정렬
            return (d1.height > d2.height) ? 1 :
                    (d1.height < d2.height) ? -1 : 0;

//            위의 코드를 간결하게 표현
//            return Integer.compare(d1.height, d2.height);
        }
    }
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhyscData[] x = {
                new PhyscData("강민하", 162, 0.3),
                new PhyscData("김찬우", 173, 0.7),
                new PhyscData("박준서", 175, 2.0),
                new PhyscData("유서범", 171, 1.5),
                new PhyscData("이수연", 168, 0.4),
                new PhyscData("장경오", 174, 1.2),
                new PhyscData("황지안", 169, 0.8)
        };

        Arrays.sort(x, PhyscData.HEIGHT_ORDER);

        System.out.println("신체검사 리스트");
        System.out.println("이름   키    시력");
        System.out.println("--------------");

        for (int i = 0; i < x.length; i++) {
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
        }
    }
}
