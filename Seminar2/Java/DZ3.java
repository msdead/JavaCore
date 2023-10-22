import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;
public class DZ3 {
    public static void main(String[] args) {
        int[] arrayNumber = createArray();
        System.out.println(Arrays.toString(arrayNumber));
        PrintStream printf = System.out.printf("Значение =  %s",searchTruth(arrayNumber));
    }

    private static boolean searchTruth(int[] arrayNumber) {
        int num1 = arrayNumber[0];
        int num2 = arrayNumber[1];
        if (num1 == 0 && num2 == 0){
            return true;
        }
        for (int i = 1; i < arrayNumber.length; i++){
            num1 = num2;
            num2 = arrayNumber[i];
            if(num1 == 0 && num2 == 0){
                return true;
            }
        }
        return false;
    }

    public static int[] createArray() {
        Random random = new Random();
        int [] arrayNumber = new int[10];
        for (int i = 0; i < arrayNumber.length; i++){
            arrayNumber[i] = random.nextInt(0, 10);
        }
        return arrayNumber;
    }
}