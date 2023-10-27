package DZ1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(new Person("Иван", LocalDate.of(1996, 11, 11)));
        allPeople.add(new Person("Петя", LocalDate.of(1995, 06, 11)));
        allPeople.add(new Person("Даша", LocalDate.of(1995, 04, 15)));
        allPeople.add(new Person("Паша", LocalDate.of(1993, 06, 15)));
        allPeople.add(new Person("Миша", LocalDate.of(1996, 11, 29)));
    }

    public static void main(String[] args) {

        System.out.println(allPeople);
        Collections.sort(allPeople, Comparator.comparing(Person::getBirthDate));
        System.out.println(allPeople);

    }
}
