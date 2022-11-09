import chap01.Sec0101;
import chap02.Sec0201;
import chap02.Sec0202;
import chap02.Sec0203;
import chap02.Sec0204;
import chap03.Sec0301;
import chap04.Sec0401;
import chap04.Sec0402;
import chap05.Sec0501;
import chap05.Sec0502;
import chap05.Sec0503;

import java.io.IOException;

public class javaApplication {

    //     객체를 생성해서 함수를 호출: 객체 지향 코딩
//   main함수는 클래스(객체)내에서 1번만 사용할 수 있음.
//   다른 클래스(객체) 사용하는 함수를 출력용, 입력용 등으로 최종 사용.
    public static void main(String[] args) throws IOException {
//  클래스명(객체명)
        Sec0101 sec0101 = new Sec0101();
        Sec0201 sec0201 = new Sec0201();
        Sec0202 sec0202 = new Sec0202();
        Sec0203 sec0203 = new Sec0203();
        Sec0204 sec0204 = new Sec0204();
        Sec0301 sec0301 = new Sec0301();
        Sec0401 sec0401 = new Sec0401();
        Sec0402 sec0402 = new Sec0402();
        Sec0501 sec0501 = new Sec0501();
        Sec0502 sec0502 = new Sec0502();
        Sec0503 sec0503 = new Sec0503();

//  객체 함수 호출
//        sec0101.exam01();
//        sec0101.exam02(3, 3);

//        sec0201.exam01();
//        sec0201.exam02();
//        sec0201.exam03(3, 5);
//        sec0201.exam04(11);

//        sec0202.exam01();
//        sec0202.exam02();
//        sec0202.exam03();
//        sec0202.exam04();
//        sec0202.exam05();
//        sec0202.exam06();
//        sec0202.exam07();
//        sec0202.exam08(false);

//        sec0203.exam01();
//        sec0203.exam02();10
//        sec0203.exam03();

//        sec0204.exam01();
//        sec0204.exam02();
//        sec0204.exam03();

//        sec0301.exam02();
//        sec0301.exam03();
//        sec0301.exam04();
//        sec0301.exam09(115, 7);
//        sec0301.exam10();
//        sec0301.exam11();

//        sec0401.exam01();
//        sec0401.exam02();
//        sec0401.exam06();
//        sec0401.exam07('A');

//        sec0402.exam01();
//        sec0402.exam02();
//        sec0402.exam05();
//        sec0402.exam07();
//        sec0402.exam08();
//        sec0402.exam09();

//        sec0501.stringEqualExample();

//        sec0502.getStudent();
//        sec0502.ArrayCreateByValueList();
//        sec0502.ArrayCreateByNew();
//        sec0502.ArrayCreateByValueList2();
//sec0502.ArrayInArray();
//        sec0502.ArrayCopyByForExample();

        sec0503.EnumWeek();

//  객체 지향의 단점: 1)소스가 복잡해짐. 2)성능 떨어짐.
//  객체 지향의 장점: 1)소스 변화에 유연함(소스 변경시 유연하게 대처가능).

    }
}
