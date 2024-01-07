package lesson05methstring_d_15_11.hometask.oneMore.task4;

public class DemoName {
    public static void main(String[] args) {

        Name service = new Name();

        String myName = service.putName("Please put your name here !");
        System.out.println("Hi your name is " + myName);

        String myName2= service.putName("What is your name&");
        System.out.println("Hello UserName  " + myName2);




    }
}
