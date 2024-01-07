package example.array.findrepeatnumber;

public class FindDemo {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 1, 2, 1, 2, 1, 2, 3, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1};

        Methods methods = new Methods();
        int result = methods.findCountRepeatNumber(myArray,1);
        System.out.println(result);


    }
}
