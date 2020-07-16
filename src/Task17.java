public class Task17 {
    public static void main(String[] args) {

        int[] array = {1,3,2,4,3,7,5};

        for (int i = 0; i <array.length; i++) {
            if(i%2==1){
                if((array[i]>array[i-1])&&(array[i]>array[i+1])){
                }else{
                    System.out.println("redicata NE e zigzagoobrazna");
                }
            }
        }
        System.out.print("redicata e zigzagoobrazna");
    }
}
