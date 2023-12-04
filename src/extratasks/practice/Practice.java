package extratasks.practice;


    import java.util.Arrays;
    import java.util.Random;
    import java.util.Scanner;
    import java.util.Random;
public class Practice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Put array size: ");
        int n = scanner.nextInt();
        int [] A = new int[n];

        int i, j;

        for ( i = 0; i < n ; i++) {
            System.out.println("Input i");
            A [i] = scanner.nextInt();}

        boolean b = true;
       /* i = 0;*/

       /* while (b && i < n / 2) {
            if (A[i] == A[n - i - 1])
                i++;
            else b = false;
        }
        System.out.println(b);*/

        for ( i = 0; i < n ; i++){
            for ( j = 0; j < n; j++) {
                if (A[i]  == A[j] && i != j){
                    b = false;
                    break;
                }
                }
            }

        System.out.println(b);




        }
    }









