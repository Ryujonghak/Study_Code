package chap12.chatting.Server;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;

/**
 * packageName : chap12.chatting.Server
 * fileName : ReciveThread
 * author : ryujonghak
 * date : 2022/10/06
 * description : 글자 받기 쓰레드
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         ryujonghak          최초 생성
 */
public class ReceiveThread extends Thread {
    //    네트워크 통신 소켓 속성
    public final Socket socket;

    public ReceiveThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
//            데이터 입력 : InputStream
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            String reciveString;
            while (true) {
                reciveString = dataInputStream.readUTF(); // 전송된 데이터 받기
                System.out.println("상대방: " + reciveString);
            }
        } catch (SocketException e) {
            System.out.println("상대방과 연결이 종료되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("ERROR!");
        }
    }
}
