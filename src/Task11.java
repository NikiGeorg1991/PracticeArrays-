import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array1 = new int[7];
        int index1;
        int[] masivZaDelitelNaPet = new int[array1.length];
        int counter = 0;

        for (index1 = 0; index1 < array1.length; index1++) {
            System.out.println("Enter " + (index1 + 1) + " index of array1: ");
            array1[index1] = scan.nextInt();
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 5 == 0 && array1[i] > 5) {
                masivZaDelitelNaPet[i] = array1[i];
                counter++;
            }
        }
        for (int j = 0; j < masivZaDelitelNaPet.length; j++) {
            if (masivZaDelitelNaPet[j] > 0) {
                System.out.println(" elementite koito se delqt na 5 sa : " + masivZaDelitelNaPet[j] + " , ");
            }
        }
        System.out.println("chislata sa : " + counter);
    }
}
