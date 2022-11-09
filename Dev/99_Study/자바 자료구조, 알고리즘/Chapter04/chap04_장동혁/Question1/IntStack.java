package StudyGroup.chap04.Question1;

/**
 * packageName : StudyGroup.chap04.Question1
 * fileName : IntStack
 * author : hyuk
 * date : 2022/10/30
 * description : int형 고정 길이 스택
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/30         hyuk          최초 생성
 */
public class IntStack {
    private int[] stk; // 스택용 배열
    private int capacity; // 스택 용량
    private int ptr; // 스택 포인터

    public class EmptyIntStackException extends RuntimeException {
//        실행 시 예외 처리 : 비어있는 스택
        private EmptyIntStackException(){ }
    }

    public class OverflowIntStackException extends RuntimeException{
//        실행 시 예외 처리 : 스택이 가득 참
        private OverflowIntStackException(){ }
    }

    public IntStack(int maxlen){
        ptr = 0;
        capacity = maxlen;
        try {
            stk = new int[capacity]; // 스택 본체용 배열 생성
        } catch (OutOfMemoryError e) { // 스택 생성 실패
            capacity = 0;
        }
    }

    public int push(int x) throws OverflowIntStackException{
//        스택에 x를 푸시
        if (ptr >= capacity){
//            스택이 가득 참
            throw new OverflowIntStackException();
        }
        return stk[ptr++] = x;
    }

    public int pop() throws EmptyIntStackException{
        if (ptr <= 0){
//            스택이 비어있음
            throw new EmptyIntStackException();
        }
        return stk[--ptr];
    }

    public int peek() throws EmptyIntStackException{
//        스택에서 데이터를 피크
        if (ptr <= 0){
//            스택이 비어있음
            throw new EmptyIntStackException();
        }
        return stk[ptr-1];
    }

//    스택의 용량을 반환
    public int getCapacity() {
        return capacity;
    }

//    스택에 쌓여있는 데이터 개수 반환
    public int size(){
        return ptr;
    }

//    스택 안의 모든 데이터 밑에서 위까지 순서대로 출력
    public void dump(){
        if (ptr <= 0){
            System.out.println("스택이 비어 있습니다");
        }else {
            for (int i = 0; i < ptr; i++) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }

//    연습문제 1)에서 사용하는 추가 메서드

    public void clear(){
        ptr = 0;
    }

    public int indexOf(int x){
//        스택에서 x값을 찾아 인덱스 위치 반환
        for (int i = ptr-1; i >= 0 ; i--) {
            if (stk[i] == x){ // 위에서부터 선형검색
                return i; // 검색 성공
            }
        }
        return -1; // 검색 실패
    }

    //    스택이 비어있는지 확인
    public boolean isEmpty(){
        return ptr<=0;
    }

    //    스택이 가득차있는지 확인
    public boolean isFull(){
        return ptr >= capacity;
    }

}
