package chap13.sec01.exam07;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/**
 * packageName : chap13.sec01.exam07
 * fileName : HashTable
 * author : ryujonghak
 * date : 2022/10/06
 * description : 아이디와 비밀번호 검사하기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/06         ryujonghak          최초 생성
 */
// Map: 인터페이스, 구현클래스(HashMap, HashTable)
//    멀티쓰레드 시 사용 Vector, HashTable 자료구조는 프로그램 내에서 각각 비동기적으로 실행을 동기화 실행으로 수정함.
public class HashTable {
    public static void main(String[] args) {
        Map<String, String> map = new Hashtable<>();
//        아이디와 비밀번호 미리 저장
        map.put("spring", "12");
        map.put("summer", "123");
        map.put("fall", "1234");
        map.put("winter", "12345");

//        키보드 입력(System.in)
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("ID");
            String id = scanner.nextLine();
            System.out.println("PW");
            String pw = scanner.nextLine();

            //            아이디와 키가 존재하는 확인
//            .containsKey(키) : 키가 있으면 true, 없으면 false
            if (map.containsKey(id)) {
//                아이디가 키에 존재
//                .get(키) : return값(결과값) map의 값이 나옴
                if (map.get(id).equals(pw)) {
                    System.out.println("로그인 되었습니다.");
                    break;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다.");
                }
            } else {
                System.out.println("입력하신 아이디가 존재하지 않습니다.");
            }

//            map.put(id, pw);
//            if(map.size() == 4) {
//                break;
//            } else {
//                System.out.println("ID와 PW가 틀렸습니다.");
//            }

//            if(map.equals(map.put(id,pw))) {
//                System.out.println("ID와 PW가 일치합니다.");
//                break;
//            } else {
//                System.out.println("ID와 PW가 일치하지 않습니다");
//            }
        }

    }
}
