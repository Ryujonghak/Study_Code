// package com.example.jpaexam.controller.exam06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * packageName : com.example.jpaexam.controller.exam06
 * fileName : Q7
 * author : 김철원
 * date : 2022-10-23
 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * —————————————————————————————
 * 2022-10-23 김철원 최초 생성
 */
public class Q7 {
    // 신체검사 데이터를 정의
    static class PhyscData {
        private String name; // 이름
        private int height; // 키
        private double vision; // 시력

        // 생성자
        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        // 결과 출력할때 문자열로 만드는 메소드
        public String toString() {
            return name + " " + height + " " + vision;
        }

        // 시력의 내림차순으로 정렬하기 위한 comparator
        public static final Comparator<PhyscData> VISION_DESC = new VisionDescComparator();

        private static class VisionDescComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.vision < d2.vision) ? 1 : (d1.vision > d2.vision) ? -1 : 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // 시력을 내림차순으로 정렬한 데이터
        PhyscData[] x = {
                new PhyscData("박준서", 175, 2.0),
                new PhyscData("유서범", 171, 1.5),
                new PhyscData("장경오", 174, 1.2),
                new PhyscData("황지안", 169, 0.8),
                new PhyscData("김찬우", 173, 0.7),
                new PhyscData("이수연", 168, 0.4),
                new PhyscData("강민하", 162, 0.3),
        };

        System.out.print("시력이 몇 인 사람을 찾고 있나요?: ");
        double vision = stdIn.nextDouble(); // 시력 입력값 받음
        int idx = Arrays.binarySearch(
                x // 배열 x에서
                , new PhyscData("", 0, vision) // 시력 vision인 요소를
                , PhyscData.VISION_DESC // VISION_DESC 에 의해 검색
        );

        if (idx < 0) { // 결과 출력 로직
            System.out.println("해당하는 시력에 사람이 없습니다");
        } else {
            System.out.println("그 사람은 x[" + idx + "]에 있습니다.");
            System.out.println("찾은 데이터: " + x[idx]);
        }
    }
}
