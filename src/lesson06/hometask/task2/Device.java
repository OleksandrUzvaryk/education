package lesson06.hometask.task2;

public class Device {

    public void chekDevice(double temperature1, double temperature2) {

        if (temperature1 > 100 && temperature2 < 100) {
            System.out.println("TRUE");
        } else {
            System.out.println("False!!!");
        }
    }
}
