import java.util.Scanner;

public class Training {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter size of the array1: ");
        int arraySize1 = scan.nextInt();
        double[] array1 = new double[arraySize1];
        int index1;
        int index2;
        double[] array2 = new double[arraySize1];

        for (index1 = 0; index1 < array1.length; index1++) {
            System.out.println("Enter index " + (index1 + 1) + " of array1: ");
            array1[index1] = scan.nextInt();
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < 0) {
                array1[i] = array1[i] * (-1);
            }
            array2[i] = array1[i];
        }
        System.out.print(array1[index1]);

        double big = array2[0];
        double bigger = array2[0];
        double biggest = array2[0];

        for (int j = 1; j < array2.length; j++) {
            if (biggest < array2[j]) {
                biggest = array2[j];
            }
            if (bigger < array2[j] && bigger < biggest) {
                bigger = array2[j];
            }
            if (big < array2[j] && big < bigger) {
                big = array2[j];
            }
        }
        System.out.println("biggest = " + biggest);
        System.out.println("bigger = " + bigger);
        System.out.println("big = " + big);

    }
}
