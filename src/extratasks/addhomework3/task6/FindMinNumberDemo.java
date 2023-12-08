package extratasks.addhomework3.task6;

public class FindMinNumberDemo {
    public static void main(String[] args) {

        FindMinNumber myNumber = new FindMinNumber(); // через класс FindMaxNumber создаем его екземпляр

        System.out.println("Please enter 1 number: ");
        int myFirstNumber = myNumber.userInput();// создаем переменную -  вызывая  метод ввода с консоли, помещаем туда результат ввода

        System.out.println("Please enter 2 number: ");
        int mySecondNumber = myNumber.userInput();

        myNumber.findMin(myFirstNumber, mySecondNumber);// через переменную класса  myNumber, вызываем public void findMaximum - поиска наибольшего и печатаем

        System.out.println("-----------second methods------------");

        System.out.println("Please enter 1 number: ");
        myFirstNumber = myNumber.userInput();
        System.out.println("Please enter 2 number: ");
        mySecondNumber = myNumber.userInput();

        int resultCompare = Math.min(myFirstNumber,mySecondNumber);
        System.out.println("Min is " + resultCompare);

     }
    }

