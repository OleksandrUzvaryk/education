package example.methods;

public class Fill_Array_Loop {

    public static void main(String[] args) {

        // часть 1 - создаем матрицу n на n
        int n = 3;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = n*i + j;
            }
        }

        System.out.println("Начальная матрица");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" | " + a[i][j]);
            }
            System.out.println();
        }

        // часть 3 - транспонирование матрицы
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        System.out.println("Новая матрица");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" | " + a[i][j]);
            }
            System.out.println();
        }

    }


}
