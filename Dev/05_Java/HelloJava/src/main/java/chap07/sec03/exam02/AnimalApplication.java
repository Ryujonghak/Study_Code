package chap07.sec03.exam02;

/**
 * packageName : chap07.sec03.exam02
 * fileName : AnimalApplication
 * author : ryujonghak
 * date : 2022/09/29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/09/29         ryujonghak          최초 생성
 */
public class AnimalApplication {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.sound();
        dog.sound();

        System.out.println("------------------------");

        Animal animal = null;

        animal = (Dog) dog;
        animal.sound();

        animal = (Cat) cat;
        animal.sound();

        System.out.println("------------------------");
        animalSound(dog);
        animalSound(cat);
    }

    public static void animalSound(Animal animal) {
        animal.sound();
    }
}
