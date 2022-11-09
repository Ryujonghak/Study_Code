package chapter04.Q5;

/**
 * packageName : chapter04
 * fileName : Q5_IntQueue
 * author : juhee
 * date : 2022-11-01
 * description : p.148 ~
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-11-01         juhee          최초 생성
 */
public class IntQueue {
    // 실습 4-3[A] p.148
    // 속성
    private int[] que; // 큐용 배열
    private int capacity; // 큐의 용량
    private int front; // 맨 앞의 커서
    private int rear; // 맨 뒤의 커서
    private int num; // 현재 데이터 개수


    //  예외 EmptyIntStackException: 큐가 비어 있음
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException(){}
    }

    //  예외 OverflowIntStackException : 큐가 가득 참
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException(){}
    }

    // 생성자
    public IntQueue(int maxlen){
        num = front = rear = 0;
        capacity = maxlen;
        try {
            que = new int[capacity];        // 큐 본체용 배열 생성
        } catch (OutOfMemoryError e){       // 생성할 수 없음 OutOfMemoryError 발생, capacity = 0
            capacity = 0;
        }
    }

    // 실습 4-3[B] p.151
    // 큐에 데이터를 인큐
    public int enque(int x) throws OverflowIntQueueException {
        if (num >= capacity){     // 큐가 가득 참
            throw new OverflowIntQueueException();
        }
        que[rear++] = x;
        num++;

        if (rear == capacity){
            rear = 0;
        }
        return x;
    }

    // 실습 4-3[C]
    // 큐에 데이터를 디큐(빼기)
    public int deque() throws EmptyIntQueueException{
        if (num <= 0){      // 큐가 비어있음
            throw new EmptyIntQueueException();
        }
        int x = que[front++];
        num--;

        if (front == capacity){
            front = 0;
        }
        return x;
    }

    // 실습 4-3[D]
    //  큐에서 데이터를 피크(맨 마지막에 넣은 데이터 보기)
    public int peek() throws EmptyIntQueueException {
        if (num <=0){       // 큐가 비어있음
            throw new EmptyIntQueueException();
        }
        return que[front];
    }

    // 큐 비움
    public void clear(){
        num = front = rear = 0;
    }

    // 큐에서 x를 검색해서 인덱스(찾지 못하면 -1) 반환
    public int indexOf(int x){
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (que[idx] == x){         // 검색 성공
                return idx;
            }
        }
        return -1;      // 검색 실패
    }

    // 큐의 용량을 반환
    public int getCapacity() {
        return capacity;
    }

    // 큐에 쌓여 있는 데이터 개수 반환
    public int size(){
        return num;
    }

    // 큐가 비어있나요
    public boolean isEmpty(){
        return num <= 0;
    }

    // 큐가 가득찼나요
    public boolean isFull(){
        return num >= capacity;
    }

    // 큐 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
    public void dump(){
        if (num <= 0){      // 큐가 비어있음
            System.out.println("큐가 비어있습니다");
        }else {
            for (int i = 0; i < num; i++) {
                System.out.print(que[(i + front) % capacity] + " ");
            }
            System.out.println();
        }
    }

    // 클래스 IntQueue에 임의의 데이터를 검색하는 메서드 search를 추가하세요.
    //            // 큐에서 x를 검색해서 인덱스(찾지 못하면 -1) 반환
    //            public int indexOf(int x) {
    //                for (int i = 0; i < num; i++) {
    //                    int idx = (i + front) % capacity;
    //                    if (que[idx] == x) {         // 검색 성공
    //                        return idx;
    //                    }
    //                }
    //                return -1;      // 검색 실패
    //            }
    public int search(int x){
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (que[idx] == x){     // 검색 성공
                return idx;
            }
        }
        return -1;      // 실패
    }
}
