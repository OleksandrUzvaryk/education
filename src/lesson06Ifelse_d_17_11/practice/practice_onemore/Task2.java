package lesson06Ifelse_d_17_11.practice.practice_onemore;

public class Task2 {
    public static void main(String[] args) {

      UserInput userInput = new UserInput();
      MethodSort meth = new MethodSort();
      int first = userInput.uiInt("Put 1 number");
      int second = userInput.uiInt("Put 2 number");
      int third = userInput.uiInt("Put 3 number");

      System.out.println("Rise sort");
      meth.makeSort(first,second,third,true);

      System.out.println("Recession sort");
      meth.makeSort(first,second,third,false);

    }

}
