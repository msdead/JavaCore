package lesson5;

import lesson3.Person;

import java.util.Optional;

public class PersonRepository {
    public Optional<Person> findById(String id) {
        if (id.equals("id")) {
            return Optional.of(new Person("Timofei", 99, 100));
        }
        return Optional.empty();
    }
}
