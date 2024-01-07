package lesson_17_incapsulation_inheritance_d_13_12.code.lessoncode.oop.inheritance.onemore.box;

public class HeawyBox extends  Box{

    private double weight;

    public HeawyBox(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }
}
