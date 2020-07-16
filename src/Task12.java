
public class Task12 {
    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5,6,7};
        int dopPromenliva =0;
        int sybirane=0;
        int umnojenie=1;

        dopPromenliva=array1[1];
        array1[1]=array1[0];
        array1[0]=dopPromenliva;

        sybirane=array1[2]+array1[3];
        array1[2]=sybirane-array1[2];
        array1[3]=sybirane-array1[3];

        umnojenie=array1[4]*array1[5];
        array1[4]=umnojenie/array1[4];
        array1[5]=umnojenie/array1[5];

        for (int i = 0; i <array1.length ; i++) {
            System.out.print(array1[i] + " , ");
        }
    }
}
