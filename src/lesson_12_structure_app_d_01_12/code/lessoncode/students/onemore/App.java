package lesson_12_structure_app_d_01_12.code.lessoncode.students.onemore;

import java.util.Arrays;
import java.util.Date;

public class App {
    public static void main(String[] args) {

       /* Address address1 = new Address(1001,"Koln", "Friedrichstr", 98);
        Person person1 = new Person(1,"Paul", address1, new Date(80,12,7));
        Student student1 = new Student(1,person1,"39.2",4.4,true);
        System.out.println(student1);
        */

        Address [] address = new Address[3];
        Person [] person = new Person[3];
        Student [] student = new Student[3];

        for (int i = 0; i < address.length ; i++) {
            address[i]= new Address(i,"Houston", "Bush", i +12);
        }
        for (int i = 0; i < person.length ; i++) {
            person[i] = new Person(i,"Pers" + i, address[i],new Date());
        }
        for (int i = 0; i < student.length ; i++) {
            student[i] = new Student(i, person[i],"39.2", 3*i,true);
            System.out.println(student[i]);
        }
        System.out.println(Arrays.toString(student));


    }

}
