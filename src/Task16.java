public class Task16 {
    public static void main(String[] args) {

        double[] array = { -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4};
        double[] novMasiv = new double[array.length];

        for (int index = 0; index < array.length; index++) {
            if(array[index]< -0.231){
                novMasiv[index]=((index + 1)*(index + 1)) + 41.25;
            }else{
                novMasiv[index]=array[index]*(index+1);
            }
        }
        for (int i = 0; i <novMasiv.length ; i++) {
            System.out.print(novMasiv[i] + " , ");
        }
    }
}
