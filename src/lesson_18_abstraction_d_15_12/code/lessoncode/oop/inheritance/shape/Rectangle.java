package lesson_18_abstraction_d_15_12.code.lessoncode.oop.inheritance.shape;

public class Rectangle extends Shape{
    private double sideA;
    private double sideB;

    public Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculatorArea() {
        return sideA * sideB;
    }

    @Override
    public double calculatorPerimeter() {
        return 2 * (sideA + sideB);
    }
}
