package chap12.chatting.Client;

import java.io.IOException;
import java.net.Socket;

/**
 * packageName : chap12.chatting.Client
 * fileName : SocketClient
 * author : ryujonghak
 * date : 2022/10/06
 * description : 클라리언트 채팅 실행 프로그램
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         ryujonghak          최초 생성
 */
public class SocketClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8888);
            System.out.println("서버와 접속되었습니다.");

            ReceiveThread receiveThread = new ReceiveThread(socket);
            receiveThread.start();

            SendThread sendThread = new SendThread(socket);
            sendThread.start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
