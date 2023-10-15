import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {

    public File(String file) {
    }

    public static void write(String text) {
        File file = new File("Text");
        try {
            FileWriter fr = new FileWriter("Text", true);
            fr.write(text);
            fr.write("\n");
            fr.close();
        } catch (
                IOException e) {
            System.out.println("Ошибка");
        }
    }
    public static void read () {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Text"));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
