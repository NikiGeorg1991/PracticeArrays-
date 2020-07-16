import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {

        int index1;
        int index2;
        int arraySize1;
        double biggest = Integer.MIN_VALUE;
        double bigger = Integer.MIN_VALUE;
        double big = Integer.MIN_VALUE;

        Scanner scan = new Scanner(System.in);
        System.out.println("enter size of the array1: ");
        do {
            arraySize1 = scan.nextInt();
        } while (arraySize1 < 3);

        double[] array1 = new double[arraySize1];
        double[] array2 = new double[arraySize1];

        for (index1 = 0; index1 < array1.length; index1++) {
            System.out.println("Enter index " + (index1 + 1) + " of array1: ");
            array1[index1] = scan.nextDouble();
            array2[index1] = array1[index1];
        }
        for (index2 = 0; index2 < array2.length; index2++) {
            if (array2[index2] < 0) {
                array2[index2] = array2[index2] * (-1);
            }
        }
        double sum = 0;
        double biggestSum = 0;

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                for (int k = 0; k < array2.length; k++) {
                    if (i != j && i != k && j != k) {
                        sum = array2[i] + array2[j] + array2[k];
                        if (biggestSum < sum) {
                            biggestSum = sum;
                            big = array2[i];
                            bigger = array2[j];
                            biggest = array2[k];
                        }
                    }
                }
            }
        }
        System.out.println("най-големите числа в абсолютна стойност са : " + big + " , " + bigger + " , " + biggest);
    }
}