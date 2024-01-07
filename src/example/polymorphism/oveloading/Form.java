package example.polymorphism.oveloading;

public class Form {
    double areaForm;

    public double getAreaForm() {
        return areaForm;
    }
    public void area (int radius){
        areaForm = Math.PI*radius*radius;

    }

    public void area (double sideA){
        areaForm = sideA*sideA;

    }

    public void area (double sideA, double sideB){
        areaForm = sideA*sideB;

    }



}
