import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter size of the array: ");
        int arraySize = scan.nextInt();
        int[] array = new int[arraySize];
        boolean isTrue = true;

        for (int index = 0; index < array.length; index++) {
            System.out.println("Enter " + (index + 1) + " index : ");
            array[index] = scan.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                isTrue = false;
                break;
            }
        }
        if (isTrue){
            System.out.println("Masiwa e ogledalen.");
        }else{
            System.out.println("Masiwa NE E ogledalen");
        }
    }
}
