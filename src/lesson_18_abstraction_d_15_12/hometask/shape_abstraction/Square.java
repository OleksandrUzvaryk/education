package lesson_18_abstraction_d_15_12.hometask.shape_abstraction;

public class Square extends Shape {
    private  double sideA;

    public Square(String title, double sideA) {
        super(title);
        this.sideA = sideA;
    }


    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double calculatorArea() {
        return sideA * sideA;
    }

    @Override
    public double calculatorPerimetr() {
        return 4 * sideA;
    }

    @Override
    public String toString() {
        return "Square{" +
                "sideA=" + sideA +
                '}';
    }
}
