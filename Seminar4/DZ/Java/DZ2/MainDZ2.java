package DZ2;


import java.sql.Array;

public class MainDZ2 {
    private final static Buyer[] buyer = {
            new Buyer("Ivan", 20),
            new Buyer("Petr", 30)
    };
    private final static Product[] product = {
            new Product("Ball", 100),
            new Product("Sandwich", 1000),
            new Product("Table", 10000),
            new Product("Car", 100000),
            new Product("Rocket", 10000000)
    };
    private static final Order[] orders = new Order[10];

    private static boolean isInArray(Object[] arr, Object o) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals(o)) return true;
        return false;
    }

    public static Order buy(Buyer who, Product what, int howMuch) {
        if (!isInArray(buyer, who))
            throw new Exceptions.CustomerException("Unknown customer: " + who);
        if (!isInArray(product, what))
            throw new Exceptions.ProductException("Unknown item: " + what);
        if (howMuch < 0 || howMuch > 100)
            throw new Exceptions.AmountException("Incorrect amount: " + howMuch);
        return new Order(who, what, howMuch);

    }


    public static void main(String[] args) {
        Object[][] info = {
                {buyer[0], product[0], 1},
                {buyer[1], product[1], -1},
                {buyer[0], product[2], 150},
                {buyer[1], new Product("Flower", 10), 1},
                {new Buyer("Fedor", 40), product[3], 1},
        };
        int capacity = 0;
         int i = 0;
         while (capacity != orders.length - 1 || i != info.length) {
             try {
                 orders[capacity] = buy((Buyer) info[i][0], (Product) info[i][1], (int) info[i][2]);
                 capacity++;
             } catch (Exceptions.ProductException e) {
                 e.printStackTrace();
             } catch (Exceptions.AmountException e) {
                 orders[capacity++] = buy((Buyer) info[i][0], (Product) info[i][1], 1);
             } catch (Exceptions.CustomerException e) {
                 throw new RuntimeException(e);
             } finally {
                 System.out.println("Orders made: " + capacity);
             }
             ++i;
         }
    }
}