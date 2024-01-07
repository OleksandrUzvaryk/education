package lesson_17_incapsulation_inheritance_d_13_12.code.lessoncode.oop.inheritance.onemore.dog;

public class App {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.voice();

        SmallDog small = new SmallDog("Chapa");
        small.voice();
        small.eat();


        BigDog big = new BigDog("Polkan");
        big.voice();

        Dog smallDog = new SmallDog("Chapa2");
        smallDog.voice();



        //SmallDog smallDog2 = new Dog(); родитель не может наследовать ребенка






    }
}
