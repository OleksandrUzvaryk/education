package example.polymorphism.oveloading;

public class Demo {
    public static void main(String[] args) {

        Form form = new Form();
        form.area(5);
        System.out.println("Round area is - " + form.getAreaForm());
        form.area(2);
        System.out.println("Square area is - " + form.getAreaForm());
        form.area(2,5);
        System.out.println("Rectangle area is - " + form.getAreaForm());





    }
}
