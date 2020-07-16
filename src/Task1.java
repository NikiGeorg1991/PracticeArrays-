public class Task1 {
    public static void main(String[] args) {

        int min=11;
        int[] arr = {10, 3, 5, 8, 6, -3, 7};
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 3 == 0) && (min > arr[i])) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}

