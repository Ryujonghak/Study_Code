package chap02;

import java.util.Scanner;

import static chap02.PhysicalExamination.*;

/**
 * packageName : chap02
 * fileName : exercise_Q7
 * author : 최아리
 * date : 2022-10-18
 * description : 연습문제 Q7 (p.90)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-18         최아리          최초 생성
 */
public class exercise_Q7 {

    public static void main(String[] args) {

        PhysicalExamination.PhyscData[] x = {
                new PhysicalExamination.PhyscData("강민하", 162, 0.3),
                new PhysicalExamination.PhyscData("김찬우", 173, 0.7),
                new PhysicalExamination.PhyscData("박준서", 175, 2.0),
                new PhysicalExamination.PhyscData("유서범", 171, 1.5),
                new PhysicalExamination.PhyscData("이수연", 168, 0.4),
                new PhysicalExamination.PhyscData("창경오", 174, 1.2),
                new PhysicalExamination.PhyscData("황지안", 169, 0.8),
        };
        int[] vdist = new int[VMAX]; // 시력분포

        System.out.println("* 신체검사 리스트 *");
        System.out.println("이름     키      시력");
        System.out.println("-------------------");


        for(int i=0; i<x.length; i++) {
            System.out.printf("%-6s%3d%7.1f\n", x[i].name, x[i].height, x[i].vision);
        }

        System.out.printf("\n평균 키: %5.1fcm\n", aveHeight(x));

        disVision(x, vdist); // 시력 분포를 구함

        System.out.println("\n시력 분포");
        for (int i=0; i<VMAX; i++) {
            System.out.printf("%3.1f~: ", i /10.0);
            for(int j = 0; j < vdist[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
