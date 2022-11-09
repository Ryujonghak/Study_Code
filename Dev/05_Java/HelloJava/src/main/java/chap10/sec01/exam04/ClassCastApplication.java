package chap10.sec01.exam04;

/**
 * packageName : chap10.sec01.exam04
 * fileName : ClassCastApplication
 * author : ryujonghak
 * date : 2022/10/04
 * description : ClassCastException
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/04         ryujonghak          최초 생성
 */
public class ClassCastApplication {
    public static void main(String[] args) {
        Dog dog = new Dog();
        changeDog(dog); // 가능

        Cat cat = new Cat();
        changeDog(cat); // 타입(형)이 다른 클래스를 변환 할려하면 발생함.
    }
//    공유함수
    public static void changeDog(Animal animal) {
        Dog dog = (Dog)animal;
    }
}

class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}