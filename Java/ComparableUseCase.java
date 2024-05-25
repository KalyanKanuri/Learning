import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person> {
    int age;
    String name;

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }
}

public class ComparableUseCase {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(23, "Sriya"));
        list.add(new Person(24, "Kalyan"));
        list.add(new Person(1, "Arjun"));

        Collections.sort(list);

        /* using comparator
        Comparator<Person> per = (p1, p2) -> p1.age > p2.age ? 1 : -1;
        Collections.sort(list, per);
        */

        for (Person p : list) {
            System.out.println(p);
        }
    }
}
