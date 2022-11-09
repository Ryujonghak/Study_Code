package chap14.sec02.exam02;

import java.io.*;

/**
 * packageName : chap14.sec02.exam02
 * fileName : NonBufferVsBufferApplication
 * author : ryujonghak
 * date : 2022/10/07
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/07         ryujonghak          최초 생성
 */
public class NonBufferVsBufferApplication {
    static int data = -1;

    //    파일 Copy용 공유 함수
    public static long copy(InputStream is, OutputStream os) throws Exception {
//        복사 시 걸린 시간 체크
        long start = System.nanoTime(); // start time

//        복사 실행
        while (true) {
//            1byte 식 데이터 읽기
            data = is.read();
            if (data == -1) break;
            os.write(data); // 새로운 파일에 쓰기
        }

        long end = System.nanoTime(); // end time

        return (start - end); // 걸린 시간 리턴
    }

    public static void main(String[] args) throws Exception {
//        원본 이미지 경로 지정
        String orgImgPath1 = "src/main/resources/images/image01.jpeg"; // girl 이미지
        String orgImgPath2 = "src/main/resources/images/image02.jpeg"; // boy 이미지

//        복사본 이미지 저장 경로 지정
        String cpyImgPath1 = "src/main/resources/images/image01_Copy.jpeg"; // girl 이미지
        String cpyImgPath2 = "src/main/resources/images/image02_Copy.jpeg"; // boy 이미지

//        논버퍼 사용 -----------------------------------------------------------------

//        파일 읽기용으로 원본이미지 열기
        FileInputStream fileInputStream = new FileInputStream(orgImgPath2);

//        파일 쓰기용으로 복사본 이미지 열기
        FileOutputStream fileOutputStream = new FileOutputStream(cpyImgPath2);

//        복사와 함께 시간 측정 : copy() 공유함수 호출
        long nonBufferTime = copy(fileInputStream, fileOutputStream);
        System.out.println("nonBufferTime: " + nonBufferTime + "ns");

//        파일 닫기
        fileInputStream.close();
        fileOutputStream.close();

//        버퍼 사용 ------------------------------------------------------------------

//        파일 읽기용으로 원본이미지 열기
        FileInputStream fileInputStream2 = new FileInputStream(orgImgPath2);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream2);

//        파일 쓰기용으로 복사본 이미지 열기
        FileOutputStream fileOutputStream2 = new FileOutputStream(cpyImgPath2);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);

//        복사와 함께 시간 측정 : copy() 공유함수 호출
        long BufferTime = copy(bufferedInputStream, bufferedOutputStream);
        System.out.println("BufferTime: " + BufferTime + "ns");

//        파일 닫기
        fileInputStream2.close();
        fileOutputStream2.close();

//        차이 나는 시간 구하기
        System.out.println("nonBufferTime - bufferTime: " + (BufferTime - nonBufferTime));
    }
}
