package lesson10.hometask7_1;

public class Task1 {

    public int pow(int number, int pow){
        int result = 1;
        for (int i = 0; i < pow; i++) {
            result = result * number;
            System.out.println(result);
        }
        return result;
    }

    public double average(int[] numbers){
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return  sum / numbers.length;
    }
}
