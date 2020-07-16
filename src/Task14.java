public class Task14 {
    public static void main(String[] args) {

        double[] array1 = {7.1, 8.5, 0.2, 3.7, 0.99, 1.4, -3.5, -110, 212, 341, 1.2};
        double[] masivZaPylnene = new double[array1.length];

        for (int i = 0; i < array1.length; i++) {
            if ((array1[i] > -2.99) && (array1[i] < 2.99)) {
                masivZaPylnene[i] = array1[i];
            }
        }
        for (int i = 0; i < masivZaPylnene.length; i++) {
            if (masivZaPylnene[i] != 0) {
                System.out.print(masivZaPylnene[i] + " , ");
            }
        }
    }
}