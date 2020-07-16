public class Task2 {
    public static void main(String[] args) {
        int[] array = {2, 6, 5, 11, 1, 8};
        int[] masiv = new int[6];

        for (int i = 0; i < array.length / 2; i++) {
            masiv[i] = array[i];
            System.out.print(masiv[i] + " , ");
        }
        for (int j = array.length - 1; j >= array.length / 2; j--) {
            masiv[j] = array[j];
            System.out.print(masiv[j] + " , ");
        }

    }
}
