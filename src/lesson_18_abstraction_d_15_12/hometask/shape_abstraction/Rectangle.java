package lesson_18_abstraction_d_15_12.hometask.shape_abstraction;

public class Rectangle extends Shape {
    private  double sideA;
    private  double sideB;

    public Rectangle(String title, double sideA, double sideB) {
        super(title);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
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

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
