import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first index of the array: ");
        int firstIndexOfArray = scan.nextInt();
        int[] array = new int[10];

        System.out.print("[");
        array[0] = firstIndexOfArray;
        array[1] = firstIndexOfArray;
        for (int i = 2; i<array.length ; i++){
            array[i]=array[i-1]+array[i-2];
        }
        for(int k =0 ; k<array.length; k++){
            System.out.print(array[k] + " , " );
        }
        System.out.print("]");
    }
}
