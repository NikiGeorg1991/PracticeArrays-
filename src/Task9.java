import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize1;

        do {
            System.out.println("enter size of the array1: ");
            arraySize1 = scan.nextInt();
        }while (arraySize1<0);

        int[] array1 = new int[arraySize1];
        int index1;
        int[] array2 = new int[arraySize1];

        for (index1 = 0; index1 < array1.length; index1++) {
            System.out.println("Enter " + (index1 + 1) + " index of array1: ");
            array1[index1] = scan.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i]=array1[array2.length-i-1];
        }
        for (int j = 0; j < array2.length; j++) {

            System.out.print( array2[j] + " , " );
        }
    }
}
