public class Task18 {
    public static void main(String[] args) {

        int[] array1 = {18,19,32,1,3, 4, 5, 6, 7, 8};
        int[] array2 = {1, 2, 3,4,5,16,17,18,27,11};
        int[] array3 = new int[array1.length];

        for (int i = 0; i < array1.length ; i++) {
            if(array1[i]>=array2[i]){
                    array3[i]=array1[i];
            }else{
                array3[i]=array2[i];
            }
        }
        for (int j = 0; j < array3.length; j++) {
            System.out.print(array3[j] + " , ");
        }
    }
}
