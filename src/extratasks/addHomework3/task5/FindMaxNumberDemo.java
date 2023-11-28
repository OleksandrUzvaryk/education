package extratasks.addHomework3.task5;

public class FindMaxNumberDemo {
    public static void main(String[] args) {

        FindMaxNumber myNumber = new FindMaxNumber(); // через класс FindMaxNumber создаем его екземпляр

        System.out.println("Please enter 1 number: ");
        int myFirstNumber = myNumber.userInput();// создаем переменную -  вызывая  метод ввода с консоли, помещаем туда результат ввода

        System.out.println("Please enter 2 number: ");
        int mySecondNumber = myNumber.userInput();

        myNumber.findMaximum(myFirstNumber, mySecondNumber);// через переменную класса  myNumber, вызываем public void findMaximum - поиска наибольшего и печатаем




    }
}
