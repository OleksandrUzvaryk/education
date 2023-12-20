package lesson_18_abstraction_d_15_12.hometask.shape_abstraction;

public class Circle extends Shape {
    private double radius;

    public Circle(String title, double radius) {
        super(title);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double calculatorArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatorPerimetr() {
        return 2 * Math.PI * radius;
    }
}
