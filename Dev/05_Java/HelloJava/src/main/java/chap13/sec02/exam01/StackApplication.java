package chap13.sec02.exam01;

import java.util.Stack;

/**
 * packageName : chap13.sec02.exam01
 * fileName : StackApplication
 * author : ryujonghak
 * date : 2022/10/06
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         ryujonghak          최초 생성
 */
public class StackApplication {
    public static void main(String[] args) {
        Stack<Coin> stack = new Stack<Coin>();
        stack.push(new Coin(10));
        stack.push(new Coin(20));
        stack.push(new Coin(30));
        stack.push(new Coin(40));

//        Coin coin = stack.peek();
//        System.out.println("Peek: " + coin.getValue());
//
//        coin = stack.pop();
//        System.out.println("Value: " + coin.getValue());
//
//        coin = stack.pop();
//        System.out.println("Value: " + coin.getValue());
//
//        coin = stack.pop();
//        System.out.println("Value: " + coin.getValue());
//
//        coin = stack.pop();
//        System.out.println("Value: " + coin.getValue());

        try {
            for (Coin coin : stack) {
                System.out.println(coin.getValue());
            }
        } catch (Exception e) {
//            System.out.println("예외처리: " + e.getClass());
            if (stack.isEmpty()) {
                System.out.println("Stack is empty!");
            } else {
                System.out.println("Stack contains");
            }
        }


    }
}
