package lesson_19_polymorphism_interfaces_d_18_12.code.lessoncode.oop.polimorfizm;

public class Form {

    Double areaForm;

// ПЕРЕГРУЗКА МЕТОДА -  Overloading -
// в нашем классе может быть несколько методов с одним и тем же названием, но с разными параметрами
    public Double getAreaForm() {
        return areaForm;
    }

    public void area(int radius){
        areaForm = Math.PI * radius * radius;
    }

    public void area(double sideA){
        areaForm = sideA * sideA;
    }

    public void area(double sideA, double sideB){
        areaForm = sideA * sideB;
    }
}
