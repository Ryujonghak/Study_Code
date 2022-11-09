package StudyGroup.chap04.Question3.연습문제5;

/**
 * packageName : StudyGroup.chap04.Question3.연습문제5
 * fileName : IntQueue
 * author : hyuk
 * date : 2022/10/30
 * description : p.158
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/30         hyuk          최초 생성
 */
public class IntQueue {
    private int[] que; // 큐에 쓸 배열
    private int capacity; // 큐의 용량
    private int front; // 맨 앞 커서
    private int rear; // 맨 뒤 커서
    private int num; // 현재 데이터 개수

//    실행 예외 처리 : 큐가 비어있음
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException(){}
    }

//    실행 예외 처리 : 큐가 가득참
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException(){}
    }

//    생성자
    public IntQueue(int maxlen){
        num = front = rear = 0;
        capacity = maxlen;
        try {
            que = new int[capacity]; // 큐 본체용 배열 생성
        } catch (OutOfMemoryError e){ // 생성할 수 없음
            capacity = 0;
        }
    }

//    큐에 데이터를 넣기
    public int enque(int x) throws OverflowIntQueueException {
        if (num >= capacity){
            throw new OverflowIntQueueException(); // 큐가 가득 찼을 때
        }
        que[rear++] = x;
        num++;
        if (rear == capacity){
            rear = 0;
        }
        return x;
    }

//    큐에 데이터 빼기
    public int deque() throws EmptyIntQueueException{
        if (num <= 0){
//            큐가 비어있을 때
            throw new EmptyIntQueueException();
        }
        int x = que[front++];
        num--;
        if (front == capacity){
            front = 0;
        }
        return x;
    }

//    큐 데이터 피크
    public int peek() throws EmptyIntQueueException {
        if (num <=0){
            throw new EmptyIntQueueException();
        }
        return que[front];
    }

//    큐 비우기
    public void clear(){
        num = front = rear = 0;
    }

//    큐에서 x를 검색해서 인덱스 반환
    public int indexOf(int x){
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (que[idx] == x){
                return idx;
            }
        }
        return -1;
    }

//    큐의 용량을 반환
    public int getCapacity() {
        return capacity;
    }

//    큐에 쌓여 있는 데이터 개수 반환
    public int size(){
        return num;
    }

//    큐가 비어있는지 확인
    public boolean isEmpty(){
        return num <= 0;
    }

//    큐가 가득차있는지 확인
    public boolean isFull(){
        return num >= capacity;
    }

//    검색하는 메서드
    public int search(int x){
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (que[idx] == x){
                return idx;
            }
        }
        return -1;
    }

//    큐안에 데이터를 앞에서 뒤 순서로 출력
    public void dump(){
        if (num <= 0){ // 큐가 비어있을 때
            System.out.println("큐가 비어있습니다");
        }else {
            for (int i = 0; i < num; i++) {
                System.out.print(que[(i + front) % capacity] + " ");
            }
            System.out.println();
        }
    }
}
