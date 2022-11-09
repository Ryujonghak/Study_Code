package chap13.sec02.exam02;

/**
 * packageName : chap13.sec02.exam02
 * fileName : Message
 * author : ryujonghak
 * date : 2022/10/06
 * description : Message
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         ryujonghak          최초 생성
 */
// 큐(Queue):  인터페이스, FIFO(First In First Out) 선입선출, 구현클래스(LinkedList 사용)
// 큐의 함수들 : .offer(객체를 넣기), .peek(맨앞에 있는 객체 정보 조회), .poll(객체 꺼내기)
public class Message {
    private String command;
    private String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
