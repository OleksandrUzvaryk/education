package extratasks.addHomework3.task_1;

public class PcDemo {

    public static void main(String[] args) {

        Pc myPc = new Pc("HP", "Zbook - 3", 788);
        System.out.println(myPc);

        myPc.on();
        String message = myPc.inputPass("dgsdg54");
        System.out.println("Your pass: " + message);
    }
}
