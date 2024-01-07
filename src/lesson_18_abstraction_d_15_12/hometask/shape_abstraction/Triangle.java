package lesson_18_abstraction_d_15_12.hometask.shape_abstraction;

public class Triangle extends Shape {

    private  double sideA;
    private  double sideBase;
    private  double sideC;
    private  double height;

    public Triangle(String title, double sideA, double sideB, double sideC, double height) {
        super(title);
        this.sideA = sideA;
        this.sideBase = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideBase() {
        return sideBase;
    }

    public void setSideBase(double sideBase) {
        this.sideBase = sideBase;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    double calculatorArea() {
        return sideBase*height/2;
    }

    @Override
    double calculatorPerimetr() {
        return sideA + sideBase + sideC;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideBase=" + sideBase +
                ", sideC=" + sideC +
                ", height=" + height +
                '}';
    }
}
