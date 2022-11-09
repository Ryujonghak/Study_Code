package chap11.sec02.exam02;

/**
 * packageName : chap11.sec02.exam02
 * fileName : IntStack
 * author : 김철원
 * date : 2022-10-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-30         김철원          최초 생성
 */

// 연습문제 1번 실습 4-2 에 필요한 모든 메서드 작성하기
public class IntStack {
    private int[] stk;  // 스택용 배열
    private int capacity; // 스택 용량
    private int ptr; // 스택 포인터

//    실행 시 예외 : 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {}
    }

//    실행 시 예외 : 스택이 가득 참
    public class OverflowIntStackException extends  RuntimeException {
        public OverflowIntStackException() {}
    }

//    생성자
    public IntStack(int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            stk = new int[capacity]; // 스택 본체용 배열을 생성
        }catch (OutOfMemoryError e) { // 생성할수 없음
            capacity = 0;
        }
    }

//  스택에 x를 푸시
    public int push(int x) throws OverflowIntStackException {
        if(ptr >= capacity) {  // 스택이 가득참
            throw new OverflowIntStackException();
        }
        return stk[ptr++] = x;
    }

//    스택에서 데이터를 팝(꼭대기에 있는 데이터를 꺼냄
    public int pop() throws EmptyIntStackException {
        if (ptr <= 0){
            throw new EmptyIntStackException();
        }
        return stk[--ptr];
    }

//    스택에서 데이터를 피크(꼭대기에 있는 데이터를 들여다봄)
    public int peek() throws EmptyIntStackException {
        if (ptr <= 0){
            throw new EmptyIntStackException();
        }
        return stk[ptr-1];
    }

//    스택의 모든 요소를 삭제하는 메서드
    public void clear() {
        ptr = 0;
    }

//    스택에서 x를 검색하여 인덱스(발견하지 못하면 -1)를 반환\
    public int indexOf(int x) {
        for (int i = ptr -1; i>=0; i--){
            if (stk[i] == x){
                return i;
            }

        }
        return -1;
    }

//    스택 용량을 반환합니다
    public int getCapacity() {
        return capacity;
    }

//    스택에 쌓여 있는 데이터 개수를 반환합니다.
    public int size () {
        return ptr;
    }

//    스택이 비어 있는가?
    public boolean isEmpty() {
        return ptr <=0;
    }

//    스택이 가득 차 있는가?
    public boolean isFull() {
        return ptr >= capacity;
    }

//    스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
    public void dump() {
        if (ptr <= 0){
            System.out.println("스택이 비어 있습니다.");
        } else {
            for (int i=0; i< ptr; i++){
                System.out.print(stk[i]+" ");
            }
            System.out.println();
        }
    }


}
