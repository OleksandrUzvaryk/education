package lesson_18_abstraction_d_15_12.hometask.shape_abstraction;

public class Rectangle extends Shape {
    private  double sideA;
    private  double sideB;

    public Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double calculatorArea() {
        return sideA*sideB;
    }

    @Override
    double calculatorPerimetr() {
        return (sideA + sideB) * 2;
    }
}
