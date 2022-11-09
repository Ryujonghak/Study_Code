package chap07.verify.exam00;

/**
 * packageName : chap07.verify
 * fileName : HttpServletExample
 * author : ryujonghak
 * date : 2022/09/30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/30         ryujonghak          최초 생성
 */
public class HttpServletExample {
    public static void main(String[] args) {
        method(new LoginServlet());         // "로그인 합니다"
        method(new FileDownloadServlet());  // "파일 다운로드합니다."
    }

    public static void method(HttpServlet servlet) {
        servlet.service();
    }
}
