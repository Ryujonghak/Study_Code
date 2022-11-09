package chap12.chatting.Client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * packageName : chap12.chatting.Client
 * fileName : SendThread
 * author : ryujonghak
 * date : 2022/10/06
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         ryujonghak          최초 생성
 */
public class SendThread extends Thread {
    private final Socket socket;
    // 콘솔 입력 받기
    Scanner scanner = new Scanner(System.in);

    public SendThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
//            소켓을 통해 데이터 쓰기
            DataOutputStream sendWriter = new DataOutputStream(socket.getOutputStream());
            String sendString;
            while (true) {
                // 콘솔 입력 처리
                sendString = scanner.nextLine();
//                데이터 쓰기
                sendWriter.writeUTF(sendString);
//                버퍼에 채워진 글자를 네트웍으로 내보내기
                sendWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
