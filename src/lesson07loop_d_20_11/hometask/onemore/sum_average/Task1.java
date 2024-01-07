package lesson07loop_d_20_11.hometask.onemore.sum_average;

public class Task1 {

    public int pow (int number, int pow){
        int result = 1;
        for (int i = 0; i < pow ; i++) {
        result = result*number;
            System.out.println(result);
        }return result;
    }

    public double awerage (double number){
        double result = 0;
        for (int i = 0; i <number ; i++) {
            result = result + i;
            System.out.println(result);
        }return result/number;
    }

}
