package StudyGroup.chap02.classExam;

import java.util.Scanner;

/**
 * packageName : StudyGroup.chap02
 * fileName : exercise07
 * author : hyuk
 * date : 2022/10/16
 * description : 연습문제7
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/16         hyuk          최초 생성
 */
public class Question02 {
//    평균키와 시력분포 구하기
    static final int VMAX = 21;
//    시력분포(0.0~0.1 단위로 21개)

    static class PhyscData {
        String name; // 이름
        int height; // 키
        double vision; // 시력

        public PhyscData(String name, int height, double vision) {
//            생성자로 초기화
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }


    static void distVision(PhyscData[] data, int[] dist){
        int i = 0;
        dist[i] = 0;
        for (i = 0; i < data.length; i++) {
            if (data[i].vision >= 0.0 && data[i].vision <= VMAX / 10.0)
                dist[(int)(data[i].vision*10)]++;
        }
    }

    public static void main(String[] args) {
//        인적사항
        PhyscData[] arr = {
                new PhyscData("강민하", 162, 0.3),
                new PhyscData("김찬우", 173, 0.7),
                new PhyscData("박준서", 175, 2.0),
                new PhyscData("유서범", 171, 1.5),
                new PhyscData("이수연", 168, 0.4),
                new PhyscData("장경오", 174, 1.2),
                new PhyscData("황지안", 169, 0.8),
        };

        int[] vdist = new int[VMAX];

        System.out.println("신체검사 리스트");
        System.out.println("이름   키      시력");
        System.out.println("==================");
        for (int i = 0; i < arr.length; i++){
            System.out.printf("%-8s%3d%5.1f\n"
                            , arr[i].name
                            , arr[i].height
                            , arr[i].vision);
//            printf 자료형별
//            s : String
//            d : int
//            f : float
        }

        distVision(arr, vdist);

        System.out.println("\n시력 분포");
        for (int i = 0; i < VMAX; i++) {
//            0 ~ 20까지 반복
            System.out.print(i/10.0 + " ~ : ");
            for (int j = 0; j < vdist[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
