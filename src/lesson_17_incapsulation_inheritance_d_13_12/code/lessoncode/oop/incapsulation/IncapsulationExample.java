package lesson_17_incapsulation_inheritance_d_13_12.code.lessoncode.oop.incapsulation;

import lesson_17_incapsulation_inheritance_d_13_12.code.lessoncode.oop.incapsulation.twoLevel.Person;

public class IncapsulationExample {
    public static void main(String[] args) {
        Person person = new Person(1,"Olga", "Smith", "New-York");

//        person.id = 10;
//        person.secondName = "Paterson";

        System.out.println(person.getId());

    }
}
