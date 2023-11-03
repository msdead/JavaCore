package lesson4;

import java.util.Iterator;

public class A implements Iterable<Integer> {
    private int foo;
    private Integer[] baz;

    public static void main(String[] args) {
        var iterator = new A().new MyIterator();
        iterator.next();

        Node node1 = new Node();
        Node node2 = new Node();
        Node node3 = new Node();
    }


    @Override
    public String toString() {

        class MLClass {

        }


        return super.toString();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }

    public class MyIterator implements Iterator<Integer> {
    //не существует без внешнего класса
    //обращается даже к приватным полям внешнего класса
    //внешний класс может видеть только неприватные методы
    //нужен для реализации логики под конкретный экземпляр


        @Override
        public boolean hasNext() {
            System.out.println(foo);
            for (Integer i : baz) {
                System.out.println(i);
            }
            return false;
        }

        @Override
        public Integer next() {
            return null;
        }
    }

    public static class Node {
    //работает только со статическими полями и методами внешнего класса
    //может существовавать в отрыве от внешнего класса
    }
}
