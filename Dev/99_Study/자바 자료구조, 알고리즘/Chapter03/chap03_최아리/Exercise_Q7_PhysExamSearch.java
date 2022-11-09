package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * packageName : chap03
 * fileName : Exercise_Q7_PhysExamSearch
 * author : 최아리
 * date : 2022-10-22
 * description : 연습문제 Q7 - 실습 3-8 수정본 (내림차순으로)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-22         최아리          최초 생성
 *   Comparable 와 Comparator 의 차이 정리
 *   공통점 : 모두 인터페이스 => 사용하려면 인터페이스 내에 선언된 메소드를 반드시 구현해야한다.
 *   사용이유 : 객체를 비교할 수 있도록 만든다.
 *            primitive 타입의 실수 변수의 경우 부등호로 쉽게 비교할 수 있지만 객체 비교는 그렇게 할 수 x
 *
 *   1. Comparable : compare To(T o) 메소드가 하나 선언되어 있음
 *                   파라미터(매개변수)가 한 개 => 자기 자신과 매개변수 객체를 비교
 *                   lang 패키지에 있기 때문에 import 해줄 필요 x
 *
 *   2. Comparator : 여러 함수가 있지만 실질적으로 구현해야 하는 것은 compare(T o1, T o2)
 *                   파라미터(매개변수)가 두 개 => 두 매개변수 객체를 비교
 *                   util 패키지에 있다.
 */
//    실습 3-8을 수정하여 시력을 내림차순으로 정렬한 신체검사 데이터에서 특정 시력을 가진 사람을 검색하는
//    프로그램을 작성하세요.

//    결과값은 나오는데,, 이해가 완벽히 되진 않아요. 값을 구하기 위해서 무조건 배열의 요소값을 직접 맞추어 줘야 하는지..?

public class Exercise_Q7_PhysExamSearch {
//    신체검사 데이터 배열에서 이진 검색

    //    신체검사 데이터를 정의
    static class PhysData {
        private String name;
        private int height;
        private double vision;

        //        생성자
        public PhysData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        //    문자열로 만들어 반환하는 메서드
        public String toString() {
            return name + " " + height + " " + vision;
        }

        //    키의 오름차순으로 정렬하기 위한 comparator
        public static final Comparator<PhysData> VISION_DESC = new VisionOrderComparator();

        private static class VisionOrderComparator implements Comparator<PhysData> {
            public int compare(PhysData d1, PhysData d2) {
                return (d1.vision < d2.vision) ? 1 : (d1.vision > d2.vision) ? -1 : 0;
//                return값이 양수인 경우, 두 값의 자리가 변경되면서 정렬이 이루어진다.
            }
        }
    }

    public static void main(String[] args) {
//        VISION_DESC 이렇게 써서 불러올 수도 있었음 (헷갈리니 참고만)
//        PhysData.VisionOrderComparator VISION_DESC = new PhysData.VisionOrderComparator();

        Scanner scanner = new Scanner(System.in);
        PhysData[] x = {
                new PhysData("박준서", 175, 2.0),
                new PhysData("유서범", 171, 1.5),
                new PhysData("장경오", 174, 1.2),
                new PhysData("황지안", 169, 0.8),
                new PhysData("김찬우", 173, 0.7),
                new PhysData("이수연", 168, 0.4),
                new PhysData("강민하", 162, 0.3),
        };


        System.out.print("시력이 몇인 사람을 찾고 있나요? : ");
        double vision = scanner.nextDouble();
        int idx = Arrays.binarySearch(x, new PhysData("", 0, vision), PhysData.VISION_DESC);

        if (idx < 0) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
            System.out.println("찾은 데이터 : " + x[idx]);
        }
    }
}
