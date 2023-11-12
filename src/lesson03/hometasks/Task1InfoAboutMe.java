package lesson03.hometasks;

public class Task1InfoAboutMe {
    public String name;
    public int age;
    public String city;

    // реализация через метод без возврата значений
   public void printStory(){
       System.out.println("Меня зовут " + name);
       System.out.println("Мне " + age + " лет ");
       System.out.println("Я из " + city);
   }

    // реализация через конструктор
    public Task1InfoAboutMe(){}
    public Task1InfoAboutMe(String name, String city, int age){
       this.name = name;
       this.city = city;
       this.age = age;
    }
}
