package chap12.chatting.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * packageName : chap12.chatting.Server
 * fileName : SocketServer
 * author : ryujonghak
 * date : 2022/10/06
 * description : 채팅 서버 프로그램
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         ryujonghak          최초 생성
 */
public class SocketServer {
    public static void main(String[] args) {
        int port = 8888;

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            while (true) {
//            클라이언트 소켓 포트 정보가 서버와 일치하면 요청 받아 들이는 함수 호출
                Socket socket = serverSocket.accept();
                System.out.println("ip: " + socket.getInetAddress() + ":" + socket.getPort()+"와 연결됨.");

//                쓰레드 시작
                ReceiveThread reciveThread = new ReceiveThread(socket);
                reciveThread.start();

                SendThread sendThread = new SendThread(socket);
                sendThread.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
