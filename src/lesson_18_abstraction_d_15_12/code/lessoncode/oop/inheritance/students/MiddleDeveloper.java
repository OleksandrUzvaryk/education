package lesson_18_abstraction_d_15_12.code.lessoncode.oop.inheritance.students;

class MiddleDeveloper extends JuniorDeveloper {

    void debug() {
        System.out.println("Debugging");
    }

    @Override
    void code() {
        System.out.println("Coding like a middle dev.");
    }

}
