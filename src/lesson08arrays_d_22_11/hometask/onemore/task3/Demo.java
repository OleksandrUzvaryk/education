package lesson08arrays_d_22_11.hometask.onemore.task3;

public class Demo {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 1, 2, 1, 2, 1, 2, 3, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1};

        Task3 service = new Task3();
        int result = service.findCountNumber(myArray,1);
        System.out.println(result);

    }
}
