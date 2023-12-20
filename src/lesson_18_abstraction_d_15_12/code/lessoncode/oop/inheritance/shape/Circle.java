package lesson_18_abstraction_d_15_12.code.lessoncode.oop.inheritance.shape;

public class Circle extends Shape{

    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    @Override
    public double calculatorArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatorPerimeter() {
        return 2 * Math.PI * radius;
    }
}
