package lesson_18_abstraction_d_15_12.code.lessoncode.oop.inheritance.shape;

public class Square extends Shape{

    private double sideA;

    public Square(String title, double sideA) {
        super(title);
        this.sideA = sideA;
    }

    @Override
    public double calculatorArea() {
        return sideA * sideA;
    }

    @Override
    public double calculatorPerimeter() {
        return 4 * sideA;
    }
}
