package lesson_18_abstraction_d_15_12.code.lessoncode.oop.inheritance.shape2;

public class ShapeDemoInheritance {

    public static void main(String[] args) {


        Circle circle1 = new Circle("Circle1", 5);
        Circle circle2 = new Circle("Circle2", 9);
        Circle circle3 = new Circle("Circle3", 15);

        Square square1 = new Square("Square1", 3);
        Square square2 = new Square("Square2", 10);
        Square square3 = new Square("Square3", 20);


        Rectangle rectangle1 = new Rectangle("Rectangle1", 3, 4);
        Rectangle rectangle2 = new Rectangle("Rectangle2", 10, 12);
        Rectangle rectangle3 = new Rectangle("Rectangle3", 20, 25);


        Shape [] shapes = {circle1, circle2, circle3,square1, square2, square3,rectangle1, rectangle2, rectangle3 };
        // посчитаем площадь всех фигур
        double allAreas = 0;

        for (int i = 0; i <shapes.length ; i++) {
            allAreas = allAreas + shapes[i].calculatorArea();
        }

        System.out.println("Сумма площадей всех фигур равга - " + allAreas);
    }

}
