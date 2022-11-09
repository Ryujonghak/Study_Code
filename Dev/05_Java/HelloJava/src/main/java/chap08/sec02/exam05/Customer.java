package chap08.sec02.exam05;

/**
 * packageName : chap08.sec02.exam05
 * fileName : Customer
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class Customer implements Sell, Buy {
    @Override
    public void buy() {
        System.out.println("buy");
    }

    @Override
    public void sell() {
        System.out.println("sell");
    }

    public void order() {
        System.out.println("Customer.order");
    }
}
