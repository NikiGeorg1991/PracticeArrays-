import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter size of the array1: ");
        int arraySize1 = scan.nextInt();
        int[] array1 = new int[arraySize1];
        System.out.println("enter size of the array2: ");
        int arraySize2 = scan.nextInt();
        int[] array2 = new int[arraySize2];
        boolean isTrue = true;
        int index;
        int index2;

        for (index = 0; index < array1.length; index++) {
            System.out.println("Enter " + (index + 1) + " index of array1: ");
            array1[index] = scan.nextInt();
        }

        for (index2 = 0; index2 < array2.length; index2++) {
            System.out.println("Enter " + (index2 + 1) + " index of array2: ");
            array2[index2] = scan.nextInt();
        }
        if (arraySize1 == arraySize2) {
            for (index = 0, index2 = 0; index < array1.length && index2 < array2.length;
                 index++, index2++)
                if (array1[index] != array2[index2]) {
                    isTrue = false;
                    break;
                }

            if (isTrue) {
                System.out.println("Masiwite sa ednakwi");
            } else {
                System.out.println("Masiwite sa razlichni.");
            }
        }else{
            System.out.println("Masiwite sa s razlichna dyljina");
        }
    }
}




