import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter size of the array1: ");
        int arraySize1 = scan.nextInt();
        int[] array1 = new int[arraySize1];
        int[] array2 = new int[arraySize1];
        int index1;
        int index2;
        for (index1 = 0; index1 < array1.length; index1++) {
            System.out.println("Enter " + (index1 + 1) + " index of array1: ");
            array1[index1] = scan.nextInt();
        }

        for (index1 = 0, index2 = 0; index1 < array1.length && index2 < array2.length;
             index1++, index2++) {
            if (index1 == 0 || index1 == array1.length - 1) {
                array2[0] = array1[0];
                array2[array2.length - 1] = array1[array1.length - 1];
                System.out.println(array2[index2]);
            } else {
                array2[index2]=array1[index1-1]+array1[index1+1];
                System.out.println(array2[index2]);
            }
        }
    }
}
