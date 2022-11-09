package chap12.chatting.Server;

import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * packageName : chap12.chatting.Server
 * fileName : SendThread
 * author : ryujonghak
 * date : 2022/10/06
 * description : 서버용 SendThread
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         ryujonghak          최초 생성
 */
public class SendThread extends Thread {
    //    소켓 + 쓰레드
    private final Socket socket;

    private Scanner scanner = new Scanner(System.in);

    public SendThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
//            입출력 객체 사용: 네트워크에 기본 자료형을 사욜할 수 있게 만들어 주는 객체
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            String sendString;

            while (true) {
                sendString = scanner.nextLine(); // 키보드 입력
                dataOutputStream.writeUTF(sendString); // 네트워크 버퍼 이동
                dataOutputStream.flush(); // 버퍼에 있는 내용 전송
            }
        } catch (Exception e) {
            e.printStackTrace(); // 에러코드 및 메세지를 화면에 출력
        }
    }
}
