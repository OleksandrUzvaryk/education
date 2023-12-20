package example.methods;

public class Find_Awerage {

    public double average(int[] numbers){
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return  sum / numbers.length;
    }

}
