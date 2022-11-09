package chap12.sec01.exam07;

/**
 * packageName : chap12.sec01.exam07
 * fileName : Calculator
 * author : ryujonghak
 * date : 2022/10/06
 * description : 공유 객체(2개의 쓰레드에서 공유함수 호출)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         ryujonghak          최초 생성
 */
public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }


    public synchronized void setMemory(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000); // 2초 지연
        } catch (Exception e) {

        }
        System.out.println(Thread.currentThread().getName() + " : " + this.memory);
    }
}
