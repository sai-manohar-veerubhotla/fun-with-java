package ca.javafunblog.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FunWithComparator {
    private static void fun() {
        Person person1 = new Person(26, "Vamsi");
        Person person2 = new Person(25, "Manohar");
        Person person3 = new Person(2, "alexa");

        List<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        System.out.println("people: " + people);
        Collections.sort(people,
                (p1, p2) -> Integer.valueOf(p1.getAge()).compareTo(p2.getAge()));

        System.out.println("people sorted by age: " + people);

        Collections.sort(people,
                (p1, p2) -> p1.getName().compareTo(p2.getName()));

        System.out.println("people sorted by name: " + people);


        // SAME AS ABOVE!!!!
        Collections.sort(people,
                Comparator.comparing(Person::getName));


        // Function -> takes one input -> gives one output
        // Supplier -> takes nothing -> but gives output
        // Consumer -> takes something -> gives nothing
        // Predicate -> takes something -> tells if its false or true

    }

    public static void main(String[] args) {
        fun();
    }
}
