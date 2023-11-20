package extratasks.addHomework2.task_20;

public class MethodsDog {
    String name;
    int age;
    String gaf;
    MethodsDog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void voice(){
        String gaf = "Gaffff!!!";
        this.gaf = gaf;
        System.out.println(gaf);
    }
    void HappyBirthday(){
        System.out.println("У меня день рождения!");
        System.out.println("Мне  было " + age);
        age = age + 1;
        //age++;
        System.out.println( gaf + "А теперь мне " + age);
    }
}
