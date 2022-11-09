package chap06.Verify.exam03;

/**
 * packageName : chap06.Verify.exam03
 * fileName : MemberService
 * author : ryujonghak
 * date : 2022/09/28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/28         ryujonghak          최초 생성
 */
public class MemberService {
    //MemberService 클래스에 login(0 하수와 logout() 함수를 선언하려고 합니다. 클래스를 작성하세요.
// login() 함수를 호출할 때에는 매개값으로 id와 password를 제공하고, logout() 함수는 id만 매개값으로 제공합니다.
// MemberService 클래스와 login(), logout() 함수를 선언해 보세요.
// login() 함수는 매개값 id가 "hong", 매개값 password 가 "12345" 일 경우에만 true 로 리턴하고, 그 이외의 값일 경우에는 false 를 리턴하세요.
// logout() 함수의 내용은 "hong이 로그아웃 되었습니다."가 출력되도록 하세요.
// 리턴타입 : boolean, 함수명 : login, 매개변수타입 : id(String), password(String)
// 리턴타입 : void, 함수명 : logout, 매개변수타입 : id(String)
// 결과 :
//    로그인 되었습니다.
//    hong이 로그아웃 되었습니다.
    boolean login(String value1, String value2) {
        if (value1.equals("hong")) {
            if (value2.equals("12345")) {
                return true;
            } else {
                System.out.println("로그인 정보가 정확하지 않습니다.");
                return false;
            }
        } else {
            System.out.println("로그인 정보가 정확하지 않습니다.");
            return false;
        }
    }

    void logout(String value) {
        if (value.equals("hong")) {
            System.out.println(value + "이 로그아웃 되었습니다.");
        } else {
            System.out.println("정확한 값을 넘겨주세요.");
        }
    }
}
