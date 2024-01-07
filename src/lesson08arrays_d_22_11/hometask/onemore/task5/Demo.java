package lesson08arrays_d_22_11.hometask.onemore.task5;

public class Demo {
    public static void main(String[] args) {

        int [] myArray = new int[5];
        int [] myArray2 = {2,4,10,20};
        Task5 service = new Task5();
        int result = service.averageValue(myArray2);
        System.out.println(result);
    }
}
