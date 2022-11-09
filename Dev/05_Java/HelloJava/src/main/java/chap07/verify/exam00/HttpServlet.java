package chap07.verify.exam00;

/**
 * packageName : chap07.verify
 * fileName : HttpServlet
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
// 문제 : HttpServlet 추상 클래스가 다음과 같이 선언되어 있습니다.
//    HttpServletExample 의 main() 함수안에서 다음과 같이 코딩되어 있을때
//    "로그인 합니다.", "파일 다운로드 합니다." 차례대로 출력되도록 코딩하세요.
public abstract class HttpServlet {
    public abstract void service();
}
