import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        String text = "Hello, world!";
        System.out.println(text);
        File file = new File("Text.txt");
        try{
            FileWriter fr = new FileWriter(file,true);
            fr.write(text);
            fr.write("\n");
            fr.close();
        }
        catch(IOException e) {
            System.out.println("Ошибка");
        }
    }
}