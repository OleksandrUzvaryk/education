package lesson_17_incapsulation_inheritance_d_13_12.code.lessoncode.oop.inheritance.onemore.box;

public class ColorBox extends Box{
    private String color;

    public ColorBox(double width, double height, double depth, String color) {
        super(width, height, depth);
        this.color = color;
    }

}
