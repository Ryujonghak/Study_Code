import chap03.Verify03;
import chap04.Verify04;
import chap05.Verify05;

/**
 * packageName : PACKAGE_NAME fileName : VerifyApplication author : ryujonghak date : 2022/09/23
 * description : =========================================================== DATE            AUTHOR
 * NOTE ————————————————————————————— 2022/09/23         ryujonghak          최초 생성
 */
public class VerifyApplication {

    public static void main(String[] args) {
        Verify03 verify03 = new Verify03();
        Verify04 verify04 = new Verify04();
        Verify05 verify05 = new Verify05();

//        verify03.exam1();
//        verify03.exam2();
//        verify03.exam3();

//        verify04.exam02();
//        verify04.exam03();
//        verify04.exam04();
//        verify04.exam05();
//        verify04.exam06();
//        verify04.exam07();

        verify05.exam04();
        verify05.exam05();
        verify05.exam0302();
    }
}
