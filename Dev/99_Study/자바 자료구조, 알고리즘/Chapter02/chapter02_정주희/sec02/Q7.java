package chapter02.sec02;

import java.util.Scanner;

/**
 * packageName : chapter02.sec02
 * fileName : Q7
 * author : juhee
 * date : 2022-10-17
 * description : 연습문제 Q7 (p.90)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-17         juhee          최초 생성
 */
public class Q7 {
    // PhysicalExamination 시력분포를 출력
    // 0.1 ~ : *
    // 0.2 ~ : ***
    // 0.3 ~ : *
    // ...
    
    // 공유상수
    static final int VMAX = 21;

    // 정적 클래스... 
    static class PhyscData {
        // 속성
        String name;
        int height;
        double vision;
        
        // 생성자
        PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

    }

    // aveHeight() 함수
    static double aveHeight(PhyscData[] dat) {
        double sum = 0;
        
        for (int i = 0; i < dat.length; i++) {
            sum += dat[i].height;
        }
        return sum/dat.length;
    }

    // distVision() 함수
    static void distVision(PhyscData[] dat, int[] dist) {
        int i = 0;
        dist[i] = 0;
        for (i = 0; i < dat.length; i++) {
            if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
                dist[(int) (dat[i].vision * 10)]++;
        }
    }

    // 실행함수
    public static void main(String[] args)  {
        // 스캐너로 입력받기
        Scanner sc = new Scanner(System.in);
        
        // 키 데이터
        PhyscData[] x = {
                new PhyscData("박현규", 162, 0.3),
                new PhyscData("함진아", 173, 0.7),
                new PhyscData("최윤미", 175, 2.0),
                new PhyscData("홍연의", 171, 1.5),
                new PhyscData("이수진", 168, 0.4),
                new PhyscData("김용준", 174, 1.2),
                new PhyscData("박용규", 169, 0.8),
        };

        int[] vdist = new int[VMAX];

        System.out.println("신체검사 리스트");
        System.out.println("이름   키    시력");
        System.out.println("----------------");

        for (int i = 0; i < x.length; i++)
            System.out.printf("%-8s%3d%5.1f\n",
                    x[i].name, x[i].height, x[i].vision);
        System.out.printf("\n평균키: %5.1fcm\n", aveHeight(x));
        distVision(x, vdist);

        System.out.println("시력분포");
        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f ~ :", i/10.0);

            // vdist[i]개의 별을 출력하도록 메서드 호출
            printStars(vdist[i]);
            System.out.println();
        }

    }
    // 파라미터로 받은 수만큼 별을 출력하는 메서드
    public static void printStars(int n) {
        for (int i = 0; i < n; i++)
            System.out.print('*');
    }
    
}
