package lesson06Ifelse_d_17_11.practice.practice_onemore;

public class MethodSort {


    public void makeSort (int n1, int n2, int n3, boolean isGrow) {

        int min = Math.min(n1, Math.min(n2, n3));
        int max = Math.max(n1, Math.max(n2, n3));
        int mid = (n1 + n2 + n3) - min - max;

        if (isGrow) {
            System.out.println(min + " " + mid + " " + max);}
        else {
            System.out.println(max + " " + mid + " " + min);
        }

    }

}
