package lesson03.hometasks;

public class Task2Demo {
    public static void main(String[] args) {

        Task2 number = new Task2();

        int result = number.findMidNum(0,1,2,3,4,5,6,7,8,9);
        System.out.println("Our result : " + result);

        double result2 = number.findMidNum2(0,1,2,3,4,5,6,7,8,9);
        System.out.println("Our right result : " + result2);

    }
}
