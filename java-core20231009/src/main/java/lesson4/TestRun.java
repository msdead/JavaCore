package lesson4;

public class TestRun {
    public static void test(Runnable runnable) {
        System.out.println("Что-то делаем");
        System.out.println("Что-то делаем");
        System.out.println("Что-то делаем");
        runnable.run();
        System.out.println("Закончили");
        System.out.println();
    }
}
