package extratasks.addHomework2.task_21;

public class MethodsDog {
    String name;
    int age;
    String gaf;
    String color;
    MethodsDog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void voice(){
        String gaf = "Gaffff!!!";
        this.gaf = gaf;
        System.out.println(gaf +  "\nMy age: " + age + " years." + "\nMy color is " +  color + ".");
    }

}
/*void HappyBirthday(){
        System.out.println("У меня день рождения!");
        System.out.println("Мне  было " + age);
        age = age + 1;
        //age++;
        System.out.println( gaf + "А теперь мне " + age);}
   */