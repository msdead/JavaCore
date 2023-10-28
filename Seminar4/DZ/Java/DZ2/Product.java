package DZ2;

public class Product {
    String name;
    int cost;

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Item{name='" + name + "', cost=" + cost + "}";
    }
}
