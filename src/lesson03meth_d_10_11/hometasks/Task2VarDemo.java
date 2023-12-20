package lesson03meth_d_10_11.hometasks;

public class Task2VarDemo {
    public static void main(String[] args) {

        // реализация через метод без возврата результата
        Task2Var number = new Task2Var();
        number.a = 0;
        number.b = 1;
        number.c = 2;
        number.d = 3;
        number.e = 4;
        number.f = 5;
        number.g = 6;
        number.h = 7;
        number.i = 8;
        number.j = 9;
        number.findMidNum1();
        number.findMidNum2();
        System.out.println("------------------------------------------");

        // реализация через метод с возвртом результата
        int result = number.findMidNum3(0,1,2,3,4,5,6,7,8,9);
        System.out.println("Result = " + result);

        double result2 = number.findMidNum4(0,1,2,3,4,5,6,7,8,9);
        System.out.println("Real result = " + result2);

    }
}
