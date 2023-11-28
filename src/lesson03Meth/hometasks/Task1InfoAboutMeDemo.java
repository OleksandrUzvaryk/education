package lesson03Meth.hometasks;

public class Task1InfoAboutMeDemo {
    public static void main(String[] args) {

        // реализация через метод без возврата значений
       Task1InfoAboutMe myStory = new Task1InfoAboutMe();
       myStory.name= "Aleks";
       myStory.age = 30;
       myStory.city = "Baden";
       myStory.printStory();
       System.out.println("------------------------------------------");

       // реализация через конструктор
        Task1InfoAboutMe formular = new Task1InfoAboutMe("Aleks", "Baden",30);
        System.out.println("Меня зовут " + formular.name);
        System.out.println("Мне " + formular.age + " лет");
        System.out.println("Я из " + formular.city);
        System.out.println("------------------------------------------");

        // реализация через String
        String name2 = "Aleks";
        int age2 = 30;
        String city2 = "Baden";
        System.out.println("Меня зовут " + name2);
        System.out.println("Мне " + age2 + " лет");
        System.out.println("Я из " + city2);
    }
}
