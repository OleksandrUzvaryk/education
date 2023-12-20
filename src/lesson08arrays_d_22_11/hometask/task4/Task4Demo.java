package lesson08arrays_d_22_11.hometask.task4;

public class Task4Demo {

    public static void main(String[] args) {

        Task4 service = new Task4();
        int [] arrayS = {15656,27,38683,84};

        int max = service.maxElement(arrayS);
        int min = service.minElement(arrayS);
        int difference = service.calcDifference(max,min);
        System.out.println(max);
        System.out.println(min);
        System.out.println(difference);
    }

}
