package com.example.jpaexam.controller.exam06;

/**
 * packageName : com.example.jpaexam.controller.exam06
 * fileName : Id
 * author : 김철원
 * date : 2022-10-23
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-23         김철원          최초 생성
 */
public class Id_3C_1 {
    private static int counter = 0;        //아이디를 몇 개 부여했는지 저장
    private int id;                        // 아이디

    //  생성자(constructor)
    public Id_3C_1() {
        id = ++counter;
    }

    //   counter를 반환하는 클래스 메서드(가장 큰 식별 번호를 얻음)
    public static int getCounter() {
        return counter;
    }

    // 아이디를 반환하는 인스턴스 메서드(식별 번호를 얻음)
    public int getId() {
        return id;
    }
//    public class IdTester {} 오류 뜸
    public static void main(String[] args) {
        Id_3C_1 a = new Id_3C_1();        // 아이디1
        Id_3C_1 b = new Id_3C_1();        // 아이디2

        System.out.println("a의 아이디: " + a.getId());
        System.out.println("b의 아이디: " + b.getId());

        System.out.println("부여한 아이디의 개수 = " + Id_3C_1.getCounter());
    }
}

