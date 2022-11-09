package chapter02.sec02;

import java.util.Scanner;

/**
 * packageName : chapter02.sec02
 * fileName : PhysicalExamination
 * author : juhee
 * date : 2022-10-17
 * description : 실습 2-10 (p.88)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-17         juhee          최초 생성
 */
public class PhysicalExamination {
    // 공유상수
    static final int VMAX = 21;
    
    // 공유 클래스 
    static class PhyscData{
        // 속성
        String name;    // 이름
        int height;     // 키
        double vision;  // 시력

        // 생성자
        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

        // 함수 aveHeight()
        // 키의 평균 구하기
        static double aveHeight(PhyscData[] dat){
            double sum = 0;

            for(int i=0; i<dat.length; i++){
                sum += dat[i].height;
            }
            return sum / dat.length;
        }

        // 함수 distVision()
        // 시력 분포 구하기
        static void distVision(PhyscData[] dat, int[] dist){
            int i = 0;
            dist[i] =0;
            for(i=0; i<dat.length; i++){
                if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX/10)
                    dist[(int)(dat[i].vision*10)]++;
            }
        }

    // 실행함수
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in); // 스캐러로 입력받기

        PhyscData[] x = {
            new PhyscData("강민하", 162, 0.3),
            new PhyscData("김찬우", 173, 0.7),
            new PhyscData("박준서", 165, 2.0),
            new PhyscData("유서범", 171, 1.5),
            new PhyscData("이수연", 168, 0.4),
            new PhyscData("장경오", 174, 1.2),
            new PhyscData("황지안", 169, 0.8),
        };
        int[] vdist = new int[VMAX];    // 시력 분포

        System.out.println("  신체검사 리스트");
        System.out.println("이름    키    시력");
        System.out.println("------------------");

        for(int i=0; i<x.length; i++){
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
        }
        System.out.printf("\n평균 키: %5.1fcm\n", aveHeight(x));

        distVision(x, vdist);   // 시력분포를 구함

        System.out.println("\n시력 분포");
        for(int i=0; i<VMAX; i++)
            System.out.printf("%3.1f~: %2d명\n", i/10, vdist[i]);

    }

}
