package lesson03.hometasks;

public class Task1InfoAboutMeDemo {
    public static void main(String[] args) {

        Task1InfoAboutMe myStory = new Task1InfoAboutMe();
        myStory.name= "Aleks";
        myStory.age = 30;
        myStory.city = "Baden";
        myStory.printStory();

        System.out.println("------------------------------------------");
    // 2 вариант

        String name2 = "Aleks";
        int age2 = 30;
        String city2 = "Baden";

        System.out.println("Меня зовут " + name2);
        System.out.println("Мне " + age2 + " лет");
        System.out.println("Я из " + city2);


    }



}
