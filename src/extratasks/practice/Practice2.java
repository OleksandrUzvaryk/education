package extratasks.practice;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;
public class Practice2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Put array size: ");
        int n = scanner.nextInt();

        /*int i, j;*/

    int [][] a = new int[n][n];

    Random random = new Random();

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++){
                a [i][j] = random.nextInt(100);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < n-1 ; i++) {
            for (int j = i+1; j < n; j++){
                int t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = t;
            }}
        System.out.println("Output matrix");
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++){

                System.out.print(a[i][j] + " ");
            }
            System.out.println();



        }
}}
