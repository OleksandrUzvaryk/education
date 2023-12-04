package lesson_11SearchandSort.homekode;

import lesson_11SearchandSort.code.lessoncode.ArraySortStudent;
import lesson_11SearchandSort.code.lessoncode.Student;

import java.util.Arrays;

public class StudentDemo {

    public static void main(String[] args) {

        lesson_11SearchandSort.code.lessoncode.Student student1 = new lesson_11SearchandSort.code.lessoncode.Student(1,"Sergey","39.2");
        lesson_11SearchandSort.code.lessoncode.Student student2 = new lesson_11SearchandSort.code.lessoncode.Student(2,"Vladimir","39.2");
        lesson_11SearchandSort.code.lessoncode.Student student3 = new lesson_11SearchandSort.code.lessoncode.Student(3,"Andrii","39.2");
        lesson_11SearchandSort.code.lessoncode.Student student4 = new lesson_11SearchandSort.code.lessoncode.Student(4,"Anastasiia","39.2");
        lesson_11SearchandSort.code.lessoncode.Student student5 = new lesson_11SearchandSort.code.lessoncode.Student(5,"Ruslan","40");
        lesson_11SearchandSort.code.lessoncode.Student student6 = new lesson_11SearchandSort.code.lessoncode.Student(6,"Viktor","40");
        lesson_11SearchandSort.code.lessoncode.Student student7 = new lesson_11SearchandSort.code.lessoncode.Student(7,"John","40");

        Student[] students = {student1,student2,student3,student4,student5,student6,student7};

        System.out.println(Arrays.toString(students));

        ArraySortStudent sortStudent = new ArraySortStudent();

        sortStudent.bubbleSortName(students);

        System.out.println(Arrays.toString(students));

        sortStudent.bubbleSortGroup(students);

        System.out.println(Arrays.toString(students));

        sortStudent.bubbleSortById(students);

        System.out.println(Arrays.toString(students));


    }

}
