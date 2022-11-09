package chap14.sec02.exam04;

import java.io.*;

/**
 * packageName : chap14.sec02.exam04
 * fileName : DataInputApplication
 * author : ryujonghak
 * date : 2022/10/07
 * description : 기본 자료형으로 입/출력하기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         ryujonghak          최초 생성
 */
public class DataInputApplication {
    public static void main(String[] args) throws Exception {
//        byte 단위 파일 쓰기용으로 열기
        FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/primitive.txt");
//        보조 스트림: 기본 자료형을 사용할 수 있게 함.(DataOutputStream)
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

        dataOutputStream.writeUTF("홍길동");
        dataOutputStream.writeDouble(95.4);
        dataOutputStream.writeInt(1);

        dataOutputStream.writeUTF("감자밭");
        dataOutputStream.writeDouble(90.4);
        dataOutputStream.writeInt(2);

        dataOutputStream.flush();
        dataOutputStream.close();

//        파일 읽기
        try {
            FileInputStream fileInputStream = new FileInputStream("src/main/resources/primitive.txt");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);

            while (true) {
                System.out.println(dataInputStream.readUTF());
                System.out.println(dataInputStream.readDouble());
                System.out.println(dataInputStream.readInt());

                if (dataInputStream.available() < 0) {
                    dataInputStream.close();
                    break;
                }
            }
        } catch (EOFException e) {
//            System.out.println("더이상 읽어올 byte 없음.");
        }
    }
}