import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array1 = new int[7];
        int index1;
        double sum = 0;
        double average = 0;
        double razlika = 0;
        double[] masivZaRazlikite = new double[array1.length];


        for (index1 = 0; index1 < array1.length; index1++) {
            System.out.println("Enter " + (index1 + 1) + " index of array1: ");
            array1[index1] = scan.nextInt();
        }
        for (int i = 0; i < array1.length; i++) {
            sum = sum + array1[i];
        }
        average = sum / array1.length;
        System.out.println("srednata stoinost e : " + average);

        for (int i = 0; i < masivZaRazlikite.length; i++) {
            razlika = average - array1[i];
            if (razlika < 0) {
                razlika = razlika * (-1);
            }
            masivZaRazlikite[i] = razlika;
            System.out.println(masivZaRazlikite[i] + " , ");
        }
        double minRazlika=masivZaRazlikite[0];
        int minIndex=0;

        for (int i = 0; i <masivZaRazlikite.length ; i++) {
            if(minRazlika>masivZaRazlikite[i]){
                minRazlika=masivZaRazlikite[i];
                minIndex=i;
            }
        }
        System.out.println("най-близкият елемент до средната стойност е : " + array1[minIndex]);
    }
}