package DZ1;

import java.time.LocalDate;

public class Person implements Comparable<Person> {

    private String name;
    private LocalDate birthDate;

    Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Имя: " + this.name +  ". Дата рождения: " + birthDate;
    }

    @Override
    public int compareTo(Person o) {
        return getBirthDate().compareTo(o.getBirthDate());
    }
}

