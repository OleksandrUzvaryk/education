package lesson05methstring.publicAndPrivat.moto;

public class MotoDemo {
    public static void main(String[] args) {

        Moto bmw = new Moto("silver", "1200G", "BMW");
        System.out.println(bmw);

        System.out.println("Производитель мотоцикла: " + bmw.getProducer());
        System.out.println("Модель мотоцикла: " + bmw.getModel());
        System.out.println("Цвет мотоцикла: " + bmw.getColor());

        bmw.setColor("silver black");

        System.out.println("Цвет мотоцикла: " + bmw.getColor());


    }



}
