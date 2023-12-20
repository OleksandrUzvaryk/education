package example.methods;

public class Number_In_Pow {

    public int pow (int number, int pow){
        int result = 1;
        for (int i = 0; i < pow; i++) {
            result = result * number;
            System.out.println(result);
        }
        return result;
    }


}
