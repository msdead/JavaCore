import java.io.*;
import java.util.Date;

public class Main {

    public Main() {
    }

    public static void main(String[] var0) {

        Date date = new Date();
//        System.out.println(date);
        String text = "Hello, world";
//        System.out.println(text);
        File.write(date + " " + text);
        File.read();
    }
}

