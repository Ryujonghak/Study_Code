package jungSuck.chap12;

import java.util.ArrayList;
import java.util.Objects;

/**
 * packageName : jungSuck.chap12
 * fileName : Ex12_1
 * author : ryujonghak
 * date : 2022/10/11
 * description : 제네릭스 <></>
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022/10/11         ryujonghak          최초 생성
 */
class Product {

}

class Tv extends Product {
    String name = "동성 Tv";

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return Objects.equals(name, tv.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class Audio extends Product {
    String name = "동성 Audio";

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Audio audio = (Audio) o;
        return Objects.equals(name, audio.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class Ex12_1 {
    public static void main(String[] args) {
        ArrayList<Product> arrayList = new ArrayList<>();
        ArrayList<Tv> tvArrayList = new ArrayList<>();
        ArrayList<Audio> audioArrayList = new ArrayList<>();

        arrayList.add(new Tv());
        arrayList.add(new Audio());

        Tv tv = (Tv) arrayList.get(0);
        Audio audio = (Audio) arrayList.get(1);
        System.out.println("List 0번: " + tv.name);
        System.out.println("List 1번: " + audio.name);

        tvArrayList.add(new Tv());

        audioArrayList.add(new Audio());
    }

    public static void printAll(ArrayList<Product> list) {
        for (Product p : list) {
            System.out.println(p.toString());
        }
    }
}
