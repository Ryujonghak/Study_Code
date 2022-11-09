package chap08.sec02.exam05;

/**
 * packageName : chap08.sec02.exam05
 * fileName : CustomerApp
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class CustomerApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer;
        buyer.buy();

        Sell seller = customer;
        seller.sell();

        if(seller instanceof Customer) {
            Customer customer2 = (Customer) seller;
            customer2.order();
        }
    }
}
