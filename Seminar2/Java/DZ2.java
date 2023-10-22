import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;
public class DZ2 {
    public static void main(String[] args) {
        int[] arrayNumber = createArray();
        System.out.println(Arrays.toString(arrayNumber));
        PrintStream printf = System.out.printf("Разница между самым большим и самым маленьким элементами массива %d - %d = %d ", serchMax(arrayNumber), serchMin(arrayNumber), difference(serchMax(arrayNumber), serchMin(arrayNumber)));
    }

    private static int serchMax(int[] arrayNumber) {
        int num = 0;
        for (int item : arrayNumber){
            if(item > num){
                num = item;
            }
        }
        return num;
    }

    private static int serchMin(int[] arrayNumber) {
        int num = arrayNumber[0];
        for (int item : arrayNumber){
            if(item < num){
                num = item;
            }
        }
        return num;
    }

    private static Object difference(int max, int min){
        int difference =  max - min;
        return difference;
    }

    public static int[] createArray() {
        Random random = new Random();
        int [] arrayNumber = new int[5];
        for (int i = 0; i < arrayNumber.length; i++){
            arrayNumber[i] = random.nextInt(0, 9);
        }
        return arrayNumber;
    }
}