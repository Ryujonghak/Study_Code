package chapter04.Q1;

/**
 * packageName : chapter04
 * fileName : InStack
 * author : juhee
 * date : 2022-10-31
 * description : 실습 4-1 p.133 ~
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-31         juhee          최초 생성
 */
public class IntStack {
    private int[] stk;           // 스택용 배열 stk
    private int capacity;        // 스택의 크기
    private int ptr;             // 스택 포인터

    //  예외 EmptyIntStackException: 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() { }
    }

    //  예외 OverflowIntStackException : 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() { }
    }

    // 생성자
    public IntStack(int maxlen) {
        ptr = 0;            // 스택포인터. 데이터 수
        capacity = maxlen;  // 용량 (보통 가장 끝방의 메모리주소)
        try {
            stk = new int[capacity];          // 스택 본체용 배열을 생성
        } catch (OutOfMemoryError e) {        // 생성할 수 없음
            capacity = 0;                     // OutOfMemoryError 발생시 스택용량 0
        }
    }

    // push() : 스택에 x를 푸시(넣기)
    public int push(int x) throws OverflowIntStackException {
        //                 예외발생시 OverflowIntStackException 로 보냄
        if (ptr >= capacity)                          // 데이터 수가 용량보다 크면(스택이 가득참)
            throw new OverflowIntStackException();    // OverflowIntStackException 로 보냄
        return stk[ptr++] = x;                   // 스택포인터+1해서 배열 인덱스+1(다음 방)에 x를 넣는다
    }

    // pop() : 스택에서 데이터를 팝(꼭대기에 있는 데이터를 꺼냄)
    public int pop() throws EmptyIntStackException {
        if (ptr <= 0)                                 // 스택이 비어있으면
            throw new EmptyIntStackException();       // EmptyIntStackException 로 보냄  
        return stk[--ptr];                  // 스택포인터-1 해서 그때_stk[ptr] 저장된 값 반환
    }

    // peek() : 스택에서 데이터를 피크(꼭대기에 있는 데이터_가장 나중에 넣은 데이터를 들여다 봄)
    public int peek() throws EmptyIntStackException {
        if (ptr <= 0)                                 // 스택이 비어있으면
            throw new EmptyIntStackException();       // EmptyIntStackException 로 보냄  
        return stk[ptr - 1];               // 비어있지않으면 배열의 가장 마지막 값_stk[ptr-1] 반환
    }

    // clear() : 스택을 비움
    public void clear() {
        ptr = 0;        // 스택포인터를 0으로
    }

    // indexOf() : 스택에서 x를 검색하여 인덱스번호(발견하지 못하면 -1)를 반환
    public int indexOf(int x) {
        for (int i = ptr - 1; i >= 0; i--) {     // 꼭대기 쪽부터 선형 검색
            if (stk[i] == x)                   // ptr은 값을 넣을 때마다 +1되므로 -1해야 해당값의 주소를 가리킴(ptr_데이터 수를 나타내는 필드. 값을 넣으면 다음 값이 들어갈 주소를 가리킴)
                return i;         // 검색 성공
        }
        return -1;                // 검색 실패
    }
    
    // getCapacity() : 스택 용량을 반환
    public int getCapacity() {
        return capacity;
    }

    // size() : 스택에 쌓여 있는 데이터 개수를 반환
    public int size() {
        return ptr;
    }

    // isEmpth() : 스택이 비어 있는가
    public boolean isEmpty() {      
        return ptr <= 0;        // ptr<=0 만족시키면 true 반환(비었음), ptr>0이면 false(차 있음)
    }

    // isFull() : 스택이 가득 차 있는가?
    public boolean isFull() {
        return ptr >= capacity; // ptr>= capacity 면 true(가득찼음), false(가득 차지 않았음)
    }

    // dump() : 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
    public void dump() {
        if (ptr <= 0)
            System.out.println("스택이 비어있습니다.");
        else {
            for (int i = 0; i < ptr; i++)
                System.out.print(stk[i] + " ");     //// 인덱스 번호 0부터 출력
            System.out.println();
        }
    }
}