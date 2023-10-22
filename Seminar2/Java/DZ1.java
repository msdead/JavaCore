import java.util.Arrays;
import java.util.Random;
public class DZ1 {
    public static void main(String[] args) {
        int[] arrayNumber = createArray();
        System.out.println(Arrays.toString(arrayNumber));
        System.out.printf("Количество чётных элементов массива = %d", serchEven(arrayNumber));

    }

    private static Object serchEven(int[] arrayNumber) {
        int num = 0;
        for (int item : arrayNumber){
            if(item % 2 == 0){
                num = num + 1;
            }
        }
        return num;
    }

    public static int[] createArray() {
        Random random = new Random();
        int [] arrayNumber = new int[10];
        for (int i = 0; i < arrayNumber.length; i++){
            arrayNumber[i] = random.nextInt(0, 9);
        }
        return arrayNumber;
    }
}