package chap06.sec02.exam02;

/**
 * packageName : chap06.sec02.exam02
 * fileName : FieldApplication
 * author : ryujonghak
 * date : 2022/09/27
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/27         ryujonghak          최초 생성
 */
public class FieldApplication {
    public static void main(String[] args) {
        FieldInit fieldInit = new FieldInit();


        System.out.println(fieldInit.booleanField);
        System.out.println(fieldInit.charField);

        System.out.println(fieldInit.doubleField);
        System.out.println(fieldInit.floatField);

        System.out.println(fieldInit.byteField);
        System.out.println(fieldInit.shortField);
        System.out.println(fieldInit.intField);
        System.out.println(fieldInit.longField);


        System.out.println(fieldInit.arrField);
        System.out.println(fieldInit.StringField);

    }
}

