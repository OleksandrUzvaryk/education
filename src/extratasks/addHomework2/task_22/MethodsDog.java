package extratasks.addHomework2.task_22;

public class MethodsDog {
    String name;
    int age;
    String gaf;
    String color;
    String newColor;
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

    public void changeColor(String newColor){
         color = newColor;
        System.out.println("But now my color is " + newColor);
    }
}
/*void HappyBirthday(){
        System.out.println("У меня день рождения!");
        System.out.println("Мне  было " + age);
        age = age + 1;
        //age++;
        System.out.println( gaf + "А теперь мне " + age);}
   */