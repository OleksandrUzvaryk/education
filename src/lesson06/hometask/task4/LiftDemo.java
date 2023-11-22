package lesson06.hometask.task4;

public class LiftDemo {

    public static void main(String[] args) {
        Lift result = new Lift();
       int solution = result.numberOfLifts(60,59,2);
        System.out.println( "Количество подьемов лифта составит: " + solution);

    }
}
