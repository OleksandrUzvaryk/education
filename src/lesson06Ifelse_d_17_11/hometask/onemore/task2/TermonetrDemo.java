package lesson06Ifelse_d_17_11.hometask.onemore.task2;

public class TermonetrDemo {

    public static void main(String[] args) {
        Termometr service = new Termometr();
        boolean conditionT1 = service.checkDevice(150,93);
        System.out.println("My device is working - " + conditionT1);

        boolean conditionT2 = service.checkDevice(50,193);
        System.out.println("My device is working - " + conditionT2);


    }


}
