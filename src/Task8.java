import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter size of the array1: ");
        int arraySize1;

        do {
            arraySize1 = scan.nextInt();
        } while (arraySize1 < 0);

        int[] array1 = new int[arraySize1];
        int index1;
        int length = 1;
        int maxlength = 0;


        for (index1 = 0; index1 < array1.length; index1++) {
            System.out.println("Enter " + (index1 + 1) + " index of array1: ");
            array1[index1] = scan.nextInt();
        }
        int momentum=array1[0];
        for (int i = 1; i < array1.length; i++) {
            length = 1;
            while(array1[i] == array1[i-1]){
                length++;
                i++;
                if(i == array1.length)
                    break;
            }
            if(maxlength < length){
                maxlength = length;
                momentum = array1[i - 1];
            }
        }
        for (int i = 0; i < maxlength - 1; i++) {
            System.out.print(momentum + ", ");
        }
    }
}
