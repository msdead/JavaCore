package ru.gb.manerov;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        int var1 = OtherClass.add(2, 2);
        System.out.println(Decorator.decorate(var1));
        var1 = OtherClass.sub(2, 2);
        System.out.println(Decorator.decorate(var1));
        var1 = OtherClass.mul(2, 2);
        System.out.println(Decorator.decorate(var1));
        var1 = OtherClass.div(2, 2);
        System.out.println(Decorator.decorate(var1));
    }
}
