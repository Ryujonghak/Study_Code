package StudyGroup.chap01;

/**
 * packageName : StudyGroup
 * fileName : exercise11
 * author : hyuk
 * date : 2022/10/10
 * description : ⭐️ 구구단 출력표 ⭐️
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/10         hyuk          최초 생성
 */
public class exercise11 {
    public static void main(String[] args) {
//        맨위의 구구단 행 출력
        for (int i = 1; i <10; i++) {
            System.out.print("\t" + i);
        }
//        줄 바꾸기
        System.out.println();
//        구분선 추가
        System.out.println("--+-----------------------------------");
        for (int i = 1; i <10; i++) {
//            바깥 구구단 순서 반복문
            for (int j = 1; j <10; j++) {
//                안쪽 구구단 세로 순서 출력
                if (j==1){
                    System.out.print(i*j + " | ");
                }
//                안쪽 구구단 순서 반복문
                System.out.print(i*j + "\t");
            }
//            줄 바꾸기
            System.out.println();
        }
    }
}