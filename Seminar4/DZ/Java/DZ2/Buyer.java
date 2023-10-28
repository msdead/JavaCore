package DZ2;

public class Buyer {
    String name;
    int age;
    public Buyer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Buyer() {
    }

    @Override
    public String toString() {
         return "Customer{name='" + name + '\'' +
                 ", age=" + age + "'}";

    }
}