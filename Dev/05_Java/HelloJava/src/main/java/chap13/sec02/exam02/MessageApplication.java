package chap13.sec02.exam02;

import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName : chap13.sec02.exam02
 * fileName : MessageApplication
 * author : ryujonghak
 * date : 2022/10/06
 * description : 큐(Queue)를 이용한 메세지 큐(FIFO : 선입선출)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         ryujonghak          최초 생성
 */
public class MessageApplication {
    public static void main(String[] args) {
        Queue<Message> queue = new LinkedList<Message>();
        queue.offer(new Message("안녕하세요", "홍길동"));
        queue.offer(new Message("안녕히가세요", "깁갈돌"));

        try {
            while (!queue.isEmpty()) {
                Message message = queue.poll();
                switch (message.getCommand()) {

                    case "안녕하세요":
                        System.out.println(message.getCommand() + ", " + message.getTo() + "님");
                        break;
                    case "안녕히가세요":
                        System.out.println(message.getCommand() + ", " + message.getTo() + "님");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
