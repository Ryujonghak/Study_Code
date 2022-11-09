package chap14.sec03.exam02;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * packageName : chap14.sec03.exam02
 * fileName : FileApplication
 * author : ryujonghak
 * date : 2022/10/07
 * description : File 클래스를 이용한 파일 및 폴더 정보 보기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         ryujonghak          최초 생성
 */
public class FileApplication {
    public static void main(String[] args) {
        try {
            File dir = new File("src/main/resources/images");
            File file1 = new File("src/main/resources/file1.txt");
            File file2 = new File("src/main/resources/file2.txt");
            File file3 = new File("src/main/resources/file3.txt");

            if (dir.exists() == false) {
                dir.mkdirs(); // 폴더가 없으면 폴더 만들기 실행
            }
            if (file1.exists() == false) {
                file1.createNewFile();
            }
            if (file2.exists() == false) {
                file2.createNewFile();
            }
            if (file3.exists() == false) {
                file3.createNewFile();
            }

//            파일객체 현재 디렉토리 목록 보기
            File temp = new File("src/main/resources");
            File[] content = temp.listFiles();

            System.out.println("시간\t\t\t형태\t\t크기\t\t이름");
            System.out.println("--------------------------------------------------------");

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");

            for (File file : content) {
//            파일 또는 정보를 출력
                System.out.print(sdf.format(new Date(file.lastModified()))); // 1열 ( 최근에 파일이 수정된 시간 )
                if (file.isDirectory()) {
                    System.out.print("\t<DIR>\t\t\t" + file.getName());       // 2열
                } else {
                    System.out.print("\t\t\t" + file.length() + "\t" + file.getName()); // 3열 + 4열
                }
                System.out.println(); // 줄바꿈
            }
        } catch (Exception e) {
            System.out.println(e.getClass());
        }
    }
}
