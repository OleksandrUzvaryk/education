package lesson_17_incapsulation_inheritance_d_13_12.code.lessoncode.oop.inheritance.onemore.box;

public class App {
    public static void main(String[] args) {

    Box box = new Box(5,10,13);

        box.getVolume();
        System.out.println( box.getVolume());

        ColorBox colorBox = new ColorBox(10,2,3,"Black");
        colorBox.setDepth(12);
        System.out.println(colorBox.getDepth());

        HeawyBox heawyBox = new HeawyBox(1,5,47,125);










    }
}
