package example.array.make_matrix;

public class Matrix {
    public static void main(String[] args) {

        int size = 4;

        int [][] array = new int[size][size];

        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                array[i][j]=size*i +j;
            }
        }
        //print

        for (int i = 0; i <size ; i++) {
            for (int j = 0; j <size ; j++) {
                System.out.print(" " + array[i][j]);
            }System.out.println();
        }



    }
}
