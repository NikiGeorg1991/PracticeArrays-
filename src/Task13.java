import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number : ");
        int chislo = scan.nextInt();
        int delimo = chislo;
        int count = 0;

        while (delimo!=0) {
            delimo=delimo/2;
            count++;
        }
        if (count==0){
            count=1;
        }
        int[] array = new int [count];
        for (int i = array.length-1 ; i>=0 ; i--) {
            int counter=chislo%2;
            array[i]=counter;
            chislo=chislo/2;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
