package example.array.doubleprint;

public class DoublePrint {
    public static void main(String[] args) {

        int [][] array = {{1,2,3,4} , {5,6} , {7,8,9,10,11,12}};

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.println("Строка " + i + " Столбик " + j + " елемент " + array[i][j]);
            }

        }


    }
}
